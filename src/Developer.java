import java.util.ArrayList;

public class Developer extends Skill{

String proffesion =new String();
    public Developer(String str, String str2) {
        super(str);
        proffesion=str2;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "proffesion='" + proffesion + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }

    public void creationOfDevCollection(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Developer("Back-end","Java developer"));
        arrayList.add(new Developer("Front-end","JavaScript developer"));
        arrayList.add(new Developer("Data base","MySQL developer"));
        arrayList.add(new Developer("Back-end","PHP developer"));

//        Object[] o=arrayList.toArray();
//        for (int i = 0; i <o.length ; i++) {
//            System.out.println(o[i]);
//        }

        for (Object o:arrayList
             ) {
            System.out.println(o);
        }
    }
}
