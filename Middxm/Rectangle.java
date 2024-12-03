public class Rectangle {
    int length;
    int weight;
    Rectangle(int length,int weight)
    {
        this.length=length;
        this.weight=weight;
    }
    int getArea()
    {
        return length*weight;
    }
   int getPerameter()
    {
       return 2*(length+weight);
    }
}
