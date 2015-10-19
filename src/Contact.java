import java.util.Comparator;

/**
 * Created by holdenhughes on 10/7/15.
 */
public class Contact implements Comparable {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() {

    }

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        int result = name.compareTo(c.name);
        if (result == 0) {
            return age - c.age;
        } else {
            return result;
        }
    }
}