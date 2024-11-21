package learn.spring.AnnotationBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("555")
    private int  id;
	
	@Value("Krushna")
    private String name;
	
	@Value("65")
    private int age;
	
	@Autowired
    private Address adr;

    public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("Getter Called");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter Called");
        this.name = name;
    }

    public int getAge() {
        return age;
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

