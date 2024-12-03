import java.util.LinkedList;
import java.util.ListIterator;

public class FlappyBird {
  
  private static Bird flappyBird;
  private static LinkedList<GameObject> pipes = new LinkedList();
  
  public static void main(String[] args) {
    
    flappyBird = new Bird(0.25, 0.5);
    
    PennDraw.enableAnimation(30);
    
    while(true) {
      
      PennDraw.clear();

      // draw bird and all game objects
      PennDraw.setPenColor(0, 180, 0);
      PennDraw.filledRectangle(0.5, Game.GROUND_Y/2, 1, Game.GROUND_Y/2);
      flappyBird.draw();
      for(GameObject obj : pipes) {
        if (obj != null) 
          obj.draw();
      }
      
      // move bird and all game objects
      flappyBird.move();
      for(GameObject obj : pipes) {
        if (obj != null) 
          obj.move();
      }
      
      // handle user input
      if (PennDraw.hasNextKeyTyped()) {
        PennDraw.nextKeyTyped();
        flappyBird.flap();
      }
      
//    detect collisions and handle them
      if (flappyBird.getY() <= Game.GROUND_Y) {
        break;
      }
      boolean birdCollidedWithPipe = false;
      for (GameObject obj : pipes) {
        if (obj != null && obj.detectCollision(flappyBird)) {
          birdCollidedWithPipe = true;
          break;
        }
      }
      if (birdCollidedWithPipe) {
          break;
      }
      
//    score
      
      // generate new game objects
      GameObject[] newObjs = WorldGenerator.generate();
      if (newObjs != null) {
        for (GameObject obj : newObjs) {
          pipes.add(obj);
        }
      }
      
      // retire offscreen objects
      ListIterator<GameObject> iter = pipes.listIterator(0);
      while (iter.hasNext()) {
        GameObject obj = iter.next();
        if (obj != null && obj.isOffScreen()) {
          iter.remove();
        }
      }
      
      PennDraw.advance();
    }
    
    PennDraw.clear(PennDraw.RED);
    PennDraw.advance();
    
  }
}

class Bird {
  private double x;
  private double y;
  private double vx = 0;
  private double vy = 0;
  private double size = 0.04;
  
  public Bird(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
  public double getX() { return x; }
  public double getY() { return y; }
  
  
  public void flap() {
    vy = -0.01;
  }

  public void draw() {
    // main body
    PennDraw.setPenColor(255, 255, 0);
    PennDraw.filledCircle(x,y,size);
    PennDraw.setPenColor(0, 0, 0);
    PennDraw.circle(x,y,size);
    // eyes
    PennDraw.setPenColor(0, 0, 0);
    PennDraw.filledCircle(x+0.5*size, y+0.5*size,size/5);
    // TODO add wings, beak, etc.
  }
  
  public void move() {
    x += vx;
    y -= vy;
    vy += Game.GRAVITY;
  }
}

interface GameObject{
  public void draw();
  public void move();
  public boolean detectCollision(Bird b);
  public boolean isOffScreen();
}

enum Direction { UP, DOWN }

class Pipe implements GameObject {
  
  private double x;
  private double y;
  private double width;
  private Direction direction;
  
  public Pipe(double x, double y, Direction d) {
    this(x,y,0.1,d);
  }
  
  public Pipe(double x, double y, double width, Direction d) {
    if (width <= 0) 
      throw new IllegalArgumentException("width must be > 0");
    
    this.x = x;
    this.y = y;
    this.width = width;
    this.direction = d;
  }
  
  public void draw() {
    PennDraw.setPenColor(0,150,0);
    double rectX = x + width/2;
    double rectY,rectHeight;
    if (direction == Direction.UP) {
      rectHeight = 1 - y;
      rectY = y + rectHeight/2;
    } else {
      rectHeight = y;
      rectY = rectHeight/2;
    }
    PennDraw.filledRectangle(rectX, rectY, width/2, rectHeight/2);
  }
  
  public void move() {
    x -= Game.OBJECT_SPEED;
  }
  public boolean detectCollision(Bird b) {
    return b.getX() >= x &&
           b.getX() <= (x + width) &&
           ((b.getY() >= y && direction == Direction.UP) ||
             (b.getY() <= y && direction == Direction.DOWN));
  }
  
  public boolean isOffScreen() {
    return (x + width < 0);
  }
}
  
//PowerUp
//  
//Score
//  

 
class WorldGenerator {
  
  private static double probabilityOfPipe = 0.05;
  private static int timeToNextPipe = 0;
  
  public static GameObject[] generate() {
    timeToNextPipe--;
    if (timeToNextPipe <= 0 && Math.random() < probabilityOfPipe) {
      GameObject[] genObjs = new GameObject[2];
      double startY = Math.random()/2+0.2;
      double endY = startY + Game.GAP_HEIGHT;
      genObjs[0] = new Pipe(1, endY, Direction.UP);
      genObjs[1] = new Pipe(1, startY, Direction.DOWN);
      timeToNextPipe = 50;
      return genObjs;
    } else {
      return null;
    }
  }
}
  
class Game {
    public static final double GROUND_Y = 0.2;
    public static final double GRAVITY = 0.001;
    public static final double OBJECT_SPEED = 0.01;
    public static final double GAP_HEIGHT = 0.3;
}