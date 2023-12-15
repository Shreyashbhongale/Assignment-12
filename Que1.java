import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre the code of Staff = ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre the Name = ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("Entre the subject = ");
        String subject = sc.nextLine();
        sc.nextLine();
        System.out.print("Entre the speed = ");
        int speed = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre the grade = ");
        String grade = sc.nextLine();
        sc.nextLine();
        System.out.print("Entre the salary = ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre the dailywages = ");
        int dailywages = sc.nextInt();
        


        Teacher te = new Teacher(code,name,subject);
        Typist ty = new Typist(code,name,speed);
        Officer of = new Officer(code,name,grade);
        Regular ra = new Regular(code,name,speed,salary);
        Casual ca = new Casual(code,name,speed,dailywages);
        
        System.out.println(te);
        System.out.println(ty);
        System.out.println(of);
        System.out.println(ra);
        System.out.println(ca);
    }
}

class Staff {
    protected int code;
    protected String name;
    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public String toString() {
            return "\n" + "Code = " + this.code + "\n" + "Name = " + this.name ;
        }
}

    class Teacher extends Staff {
        private String subject;
        public Teacher(int code, String name,String subject) {
        super(code,name);    
        this.subject = subject;
    }
    public String toString() {
            return super.toString() + "\n" + "Subject = " + this.subject ;
        }
}

    class Typist extends Staff {
        private int speed;
        public Typist(int code, String name,int speed) {
        super(code,name);    
        this.speed = speed;
    }
    public String toString() {
            return super.toString() + "\n" + "Speed = " + this.speed ;
        }
}

    class Officer extends Staff {
        private String grade;
        public Officer(int code, String name,String grade) {
        super(code,name);    
        this.grade = grade;
    }
    public String toString() {
            return super.toString() + "\n" + "Grade = " + this.grade ;
        }
}

    class Regular extends Typist {
        private int salary;
        public Regular(int code, String name,int speed,int salary) {
        super(code,name,speed);    
        this.salary = salary;
    }
    public String toString() {
            return super.toString() + "\n" + "Salary = " + this.salary ;
        }
}

    class Casual extends Typist {
        private int dailywages;
        public Casual(int code, String name,int speed,int dailywages) {
        super(code,name,speed);    
        this.dailywages = dailywages;
    }
    public String toString() {
            return super.toString() + "\n" + "Daily wages = " + this.dailywages ;
        }
}

