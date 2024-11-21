package learn.spring.autowireAnotation;

import learn.spring.autowireAnotation.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int  id;
    private String name;
    private int age;
   
   // @Autowired
    private Address adr;
    
  //  @Autowired
    private Subject sub;
    
    
	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
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
                ", sub=" + sub +
                '}';
    }

	
}

