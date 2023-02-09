package Arrays;

public class reverseString {
    public static void main(String args[]){

        String a="I love testing";
        var words= a.split(" ");

        for (int i= words.length-1; i>=0; i--)
        System.out.print(words[i]);
    }


}
