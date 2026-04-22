import java.util.*;

public class GM04_P4FindDuplicateFiles {
    public static List<List<String>> findDuplicate(String[] paths) {

        HashMap<String, List<String>> contentToFiles = new HashMap<>();

        for (String path : paths) {

            String[] parts = path.split(" ");
            String root = parts[0];

            for (int i = 1; i < parts.length; i++) {
                String fileInfo = parts[i];

                int openParen = fileInfo.indexOf('(');
                int closeParen = fileInfo.indexOf(')');

                String fileName = fileInfo.substring(0, openParen);
                String content = fileInfo.substring(openParen + 1, closeParen);

                String fullPath = root + "/" + fileName;

                contentToFiles.computeIfAbsent(content, k -> new ArrayList<>()).add(fullPath);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> group : contentToFiles.values()) {
            if (group.size() >= 2) {
                result.add(group);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        String[] paths = {
            "root/a 1.txt(abcd) 2.txt(efgh)",
            "root/c 3.txt(abcd)",
            "root/c/d 4.txt(efgh)",
            "root 4.txt(efgh)"
        };

        List<List<String>> result = findDuplicate(paths);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}