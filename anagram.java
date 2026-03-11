Start anagrams project 
//Start of anagram project 
import java.io*;
import java.util*;

public class anagrams{
    public static String signature(String word){
    char[]letters=word.toCharArray();
     Arrays.sort(letters);
    return new string(letters);
    }
    public static void main(String []args){
                                                
    String inputFile =("joyce1922_ulysses.text");
    File file=new File(inputFile);

     // check if file exisits 
    if(!file.exisits()){
    System.out.println("ERROR:File not found ->" + inputFile);
    return; 
    }

    }  Map<String, Integer> wordCount = new TreeMap<>();

        // Map storing anagram groups
        Map<String, ArrayList<String>> anagramGroups = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String w : words) {
                     // clean word but keep apostrophes
                    String clean = w.replaceAll("^[^a-zA-Z']+", "");
                    clean = clean.replaceAll("[^a-zA-Z']+$", "");
                    clean = clean.toLowerCase();String[] words = line.split("\\s+");

                    for (String w : words) {

                    if (clean.length() == 0) {
                        continue;
                    }

                    // update word count
                    wordCount.put(clean, wordCount.getOrDefault(clean, 0) + 1);

                }
            }
            } catch (IOException e) {
            e.printStackTrace();

        }List<String> lines = new ArrayList<>();

        for (List<String> list : anagramGroups.values()) {

            if (list.size() > 1) {

                Collections.sort(list);
                String base = String.join(" ", list);

                lines.add(base + "\\\\");
                String rotated = base;

                for (int i = 0; i < list.size() - 1; i++) {
                    int space = rotated.indexOf(" ");
                    rotated = rotated.substring(space + 1) + " " +
                              rotated.substring(0, space);
                    lines.add(rotated + "\\\\");
                }
            }
        }
        new File("latex").mkdirs();

        try (PrintWriter out = new PrintWriter("latex/anagrams.tex")) {
            char currentLetter= "X";
            for(String lemma : lines){
                char initial =Charecter.toUpperCase(lemma.charAt(0));
                if(initial != currentLetter){
                    currentLetter =initial;
                    tex.println();
                    tex.println("\\vspace{14pt}");
                    tex.println("\\noindnet\\textbf{\\Large" +initial +  "}\\\\ *[+12pt]");

                }tex.println(lemma);
            }System.out.println("Anagram dictionary created.");
            Sytem.out.println("Output file: latex/theAnagrams.tex");

        }catch (Exception e){
            e.printStackTrace();
        }
        }
}


     

      
                                               
                                    