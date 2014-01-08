
import entities.Address;
import entities.Student;
import util.Base64FileSerializer;
import util.Serializer;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import util.DefaultFileSerializer;

/**
 * Created with IntelliJ IDEA. User: kanishka Date: 1/7/14 Time: 11:36 AM To
 * change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stud1 = new Student();
        stud1.setId(1232L);
        stud1.setName("Kanishka Dilshan");
        stud1.setAddress(new Address("postbox 123/c", "Railway Avenue", "Galle", "SL"));
        Map<String, Integer> subjectMarksMap = new HashMap<String, Integer>();
        subjectMarksMap.put("ITA", 80);
        subjectMarksMap.put("STII", 90);
        subjectMarksMap.put("PC", 72);
        subjectMarksMap.put("DCCN", 60);
        stud1.setMarks(subjectMarksMap);

        serializeDefault(stud1);
        deserializeDefault(new File("data/stud_serialized_default"));
        
        serializeBase64(stud1);
        deserialzieBase64(new File("data/stud_serialized_base64"));
    }

    private static void serializeDefault(Serializable serializable) throws IOException {
        Serializer serializer = new DefaultFileSerializer();
        serializer.serialize(serializable, new File("data/stud_serialized_default"));
        System.out.println("Serialized.");
    }

    private static void deserializeDefault(File path) throws IOException, ClassNotFoundException {
        Serializer serializer = new DefaultFileSerializer();
        Student stud = (Student) serializer.deSerialize(path);
        System.out.println(stud.toString());
    }

    private static void serializeBase64(Serializable serializable) throws IOException {
        Serializer base64Serializer = new Base64FileSerializer();
        base64Serializer.serialize(serializable, new File("data/stud_serialized_base64"));
    }

    private static void deserialzieBase64(File path) throws IOException, ClassNotFoundException {
        Serializer serializer = new Base64FileSerializer();
        Student stud = (Student) serializer.deSerialize(path);
        System.out.println(stud.toString());
    }
}
