import java.util.LinkedHashMap;
import java.util.Map;

public class dz2 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Obama");
        map.put("country", "USA");
        map.put("city", "NY");
        map.put("age", null);
        System.out.println("\nSELECT * FROM students WHERE " + getQuery(map) + "\n");
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder WHERE = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                WHERE.append(pair.getKey() + " = " + "'" + pair.getValue() + "'" + " and ");
            }
        }
        WHERE.delete(WHERE.length() - 4, WHERE.length());
        return WHERE.toString();
    }
}
