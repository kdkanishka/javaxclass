package entities;

import java.io.Serializable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: kanishka Date: 1/7/14 Time: 12:13 PM To
 * change this template use File | Settings | File Templates.
 */
public class Student implements Serializable {

    private long id;
    private String name;
    private Address address;
    private Map<String, Integer> marks;
    private transient String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID : ").append(this.id).append("\n");
        stringBuilder.append("Name : ").append(this.name).append("\n");
        stringBuilder.append("Password : ").append(this.password).append("\n");
        stringBuilder.append("Address : ").append(this.address.toString()).append("\n");

        if (this.marks != null) {
            stringBuilder.append("Subjects & Marks").append("\n");
            for (Map.Entry<String, Integer> entry : marks.entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();
                stringBuilder.append("\t").append("Subject : ").append(key).append("\n");
                stringBuilder.append("\t").append("Marks : ").append(val).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
