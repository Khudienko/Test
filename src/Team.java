import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Team extends Developer{
    public Team(String str, String str2) {
        super(str, str2);
    }

    @Override
    public String toString() {
        return "Team{" +
                "proffesion='" + proffesion + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void CreateOfTeamCol (){
        Map map = new TreeMap();
        //creationOfDevCollection();
        map.put("1",new Developer("Smart","Java"));
        map.put("2",new Developer("Fast",".Net"));
        map.put("5",new Developer("Lazy","C#"));
        map.put("4",new Developer("Fullish","C"));
        map.put("7",new Developer("Clever","C++"));

        map.forEach((key, value) -> {
            System.out.println(map.get(key));
        });
    }

}
