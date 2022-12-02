import java.util.*;

class NotebookStore {

    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new LinkedHashMap<>();
        notebooks.put("B590", new Notebook("Lenovo", "590"));
        notebooks.put("Inspirion0211A", new Notebook("Dell", "Inspirion0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell ", "XPS0091V"));
        notebooks.put("B590", new Notebook("Apple", "590"));
        
        // notebook = notebooks.get(key);
        //System.out.println(notebook);

        //notebooks.remove("B590");
        System.out.println(notebooks);

        Set<String> keys = notebooks.keySet();

        for (String key : keys) {
            System.out.println(key + " : " + notebooks.get(key));
        }

       // System.out.println(keys);

        //Collection<Notebook> values = notebooks.values();
        //System.out.println(values);

        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet();
        for (Map.Entry<String, Notebook> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

}
