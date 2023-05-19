package Package;


public class String1 {
    //They wanted it to print a name, so using the return method I added a String 
    //with Hello and ! and the name parameter so that it could be any name they wanted
    //when they run the code helloName("Bob"); 
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    //Just wanted the string to say the words so I used the parameters twice to show them
    //twice in the format wanted
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    //wanted me to create the HTML string with tags around the word, e.g. "<i>Yay</i>"
    //I used string concatenation to do so
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag + ">";
      }
    
}
