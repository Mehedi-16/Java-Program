public class Main {
    public static void main(String[] args) {
        Employe e1=new Employe();
        e1.name="Mehedi";
        e1.address="Kurigram";
        e1.age=21;
        e1.phn=012222;
        e1.salary=21000;

        Manager m=new Manager();
        m.name="Mamun";
        m.address="kurigram,Rajarhat";
        m.age=21;
        m.depertmant="CSE";
        m.phn=01310-990177;
        m.salary=2111;

    System.out.println();
    System.out.println();

    System.out.println("Name= "+e1.name);
    System.out.println("Address= "+e1.address);
    System.out.println("Age= "+e1.age);
    System.out.println("phn= "+e1.phn);
    System.out.println("salary= "+e1.salary);

    System.out.println();
    System.out.println();

    System.out.println("Name= "+m.name);
    System.out.println("Address= "+m.address);
    System.out.println("Age= "+m.age);
    System.out.println("phn= "+m.phn);
    System.out.println("salary= "+m.salary);
    System.out.println("Depertment= "+m.depertmant);

    System.out.println();
    System.out.println();

    }
}
