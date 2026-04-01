Start anagrams project 
//Start of anagram project 
import java.io*;
import java.util*;

public class anagrams{
    public static String signature(String word){
    char[]letters=word.toCharArray();
     Arrays.sort(letters);
    return new String(letters);
    }
    public static void main(String []args){
                                                
    String inputFile ="joyce1922_ulysses.text";
    File file=new File(inputFile);

     // check if file exists 
    if(!file.exists()){
    System.out.println("ERROR:File not found ->" + inputFile);
    return; 
    }

    }  Map<String, Integer> wordCount = new TreeMap<>();
 // Map storing anagram groups
        Map<String, ArrayList> anagramGroups = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String w : words) {
                     // clean word but keep apostrophes
                    String clean = w.replaceAll("^[^a-zA-Z']+"+,"")";
                    clean = clean.replaceAll("[^a-zA-Z']+$", "");
                    clean = clean.toLowerCase();
                    

                    if (clean.length() == 0) {
                        continue;

                        wordCount.put(clean, wordCount.getOrDefault(clean, 0) + 1);
                        }
            }
            } catch (Exception e) {
            e.printStackTrace();

        }

        for (String word: wordCount.keySet()) {
          String sig = signature(word);
          if(!anagramGroups.containsKey(sig))
           anagramGroups.put(sig, new ArrayList<>());

           anagramGroups.get(sig)
            if (list.size() {

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
}


     

      
                                               
                                    