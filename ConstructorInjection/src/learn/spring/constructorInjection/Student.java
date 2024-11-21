package learn.spring.constructorInjection;

public class Student {
    private int  id;
    private String name;
    private int age;
    private Address adr;

	
    public Student(int id, String name, int age, Address adr) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.adr = adr;
	}


	@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adr=" + adr +
                '}';
    }
}

