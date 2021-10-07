import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

@Getter
@Setter
@NoArgsConstructor

public class CountingModule {
    private String message;
    private String[] words;
    TreeMap<String, Integer> sortedWords;

    public CountingModule(String message) {
        this.message = message;
    }

    public void run() {
        if (!validation()) {
            System.out.println("Invalid Input");
        } else {
            this.message = this.message.trim();
            this.words = this.message.split(" ");
            HashMap<String, Integer> result = new HashMap<>();
            for (String word : words) {
                result.put(word, result.getOrDefault(word, 0) + 1);
            }
            this.sortedWords = new TreeMap<>(result);
            Set<Entry<String, Integer>> mappings = sortedWords.entrySet();
            for (Entry<String, Integer> mapping : mappings) {
                System.out.println(mapping.getKey() + " -> " + mapping.getValue());
            }
        }
    }

    public boolean validation() {
        if (message == null || message.isEmpty()) return false;
        //Placeholder for further validators.
        return true;
    }
}
