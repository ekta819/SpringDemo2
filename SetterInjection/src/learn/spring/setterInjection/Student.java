package learn.spring.setterInjection;

public class Student {
    private int  id;
    private String name;
    private int age;
    private Address adr;

	public void setAdr(Address adr) {
		this.adr = adr;
	}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("Setter Called");
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
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

