package learning;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableStudent {

    private final String name;

    private final int regNo;

    private final Map<String,String> metadata;

    public ImmutableStudent(String name,int regNo,Map<String,String> metadata){
        this.name=name;
        this.regNo=regNo;

        Map<String,String> tempMap = new HashMap<>();

        for (Map.Entry<String,String> entry:metadata.entrySet()){
            tempMap.put(entry.getKey(),entry.getValue());
        }
        this.metadata=tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {
        Map<String,String> tempMap = new HashMap<>();

        for (Map.Entry<String,String> entry:metadata.entrySet()){
            tempMap.put(entry.getKey(),entry.getValue());
        }
        return tempMap;
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1","first");
        map.put("2","second");

        ImmutableStudent student = new ImmutableStudent("ABC",101,map);

        System.out.println(student.getName());
        System.out.println(student.getRegNo());
        System.out.println(student.getMetadata());

        map.put("3","Third");
        System.out.println(student.getMetadata());


    }
}
