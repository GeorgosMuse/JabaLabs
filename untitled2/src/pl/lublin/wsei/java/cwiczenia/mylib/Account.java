package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;

    private static String ukrAlphabet[] = {"а","б","в","г","д","е","є","ж","з","и","і","ї","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ь","ю","я","А","Б","В","Г","Д","Е","Є","Ж","З","И","І","Ї","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ь","Ю","Я"};

    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j", "k","l","m","n","o","p","r","s","t","u","f","h","c", "ch","sh","shh","'","ju","ja", "A","B","V","G","D","E","Je","Zh","Z","Y","I","Ji", "J", "K","L","M","N","O","P","R","S","T","U","F","H","C", "Ch","Sh","Shh","'","Ju","Ja"};

    public static String translit(String text){

        return StringUtils.replaceEach(text, ukrAlphabet, translitRepl);
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }

    public void setName(String name) {
        String[] tokens = StringUtils.split(name);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        this.name = StringUtils.join(tokens,' ');
    }



    public String getName() {
        return name;
    }

}
