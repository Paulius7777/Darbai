/**
 * Created by Paulius on 2017.02.07.
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    public String change(String characterString){
        String wordnew = "";
        for(int i = 0; i < characterString.length(); i++){
            if(characterString.charAt(i) == fromCharacter){
                wordnew += toCharacter;
            }else{
                wordnew += characterString.charAt(i);
            }
        }
        return wordnew;
    }
}
