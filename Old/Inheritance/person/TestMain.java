package superclass_person;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student("Ha ha ha", "Ha Noi", "PRO1234", 2021, 300);
        System.out.println(s1);
        s1.setAddress("Quang Binh");
        System.out.println(s1);
        s1.setFee(300);
        s1.setProgram("MAD101");
        s1.setYear(2022);
        System.out.println("Name is " + s1.getName());
        System.out.println("Adress is " + s1.getAddress());
        System.out.println("Fee is " + s1.getFee());
        System.out.println("Program is " + s1.getProgram());
        System.out.println("Year is " + s1.getYear());

        Staff sf1 = new Staff("Nam Le", "Viet Nam", "Hai Phong", 250);
        System.out.println(sf1);

        sf1.setAddress("Vietnam");
        System.out.println(sf1);
        sf1.setPay(300);
        sf1.setSchool("HaNoi Universe");
        System.out.println("Name is " + sf1.getName());
        System.out.println("Adress is " + sf1.getAddress());
        System.out.println("Pay is " + sf1.getPay());
        System.out.println("School is " + sf1.getSchool());
    }
}
