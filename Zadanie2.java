import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String DNA = scan.nextLine();
        String slowo = Dopelnienie(DNA);
        System.out.print(slowo);
    }
    public static String Dopelnienie(String DNA){

        String slowo2 = "";
        for( int i=0; i<DNA.length(); i++){

            if(DNA.charAt(i) == 'A'){
                slowo2 = slowo2 + "T";
            }else if(DNA.charAt(i) == 'T'){
                slowo2 = slowo2 + "A";
            }else if(DNA.charAt(i) == 'G'){
                slowo2 = slowo2 + "C";
            }else if(DNA.charAt(i) == 'C'){
                slowo2 = slowo2 + "G";
            }
        }
        char slowo3;
        String slowo4 = "";
        for(int j=0; j<DNA.length(); j++){
            slowo3 = slowo2.charAt(slowo2.length()-1-j);
            slowo4 = slowo4 + slowo3;
        }

        return slowo4;
    }
}
