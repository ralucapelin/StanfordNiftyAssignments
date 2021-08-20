import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int player = 0;
        int pc = 0;
        char g1 = 'c';
        char g2 = 'p';
        char g3 = 'c';
        char g4 = 'p';
        Hashtable<String,Integer> ht = new Hashtable<>();
        Hashtable<String,Integer> ht1 = new Hashtable<>();
        ht.put("cpcp", 0);
        ht.put("cccc", 0);
        ht.put("cpcc", 0);
        ht.put("cppp", 0);
        ht.put("ccpc", 0);
        ht.put("pcpp", 0);
        ht.put("ccpp", 0);
        ht.put("cppc", 0);
        ht.put("pcpc", 0);
        ht.put("pccc", 0);
        ht.put("pccp", 0);
        ht.put("ppcp", 0);
        ht.put("ppcc", 0);
        ht.put("pppp", 0);
        ht.put("cccp", 0);
        ht.put("pppc", 0);
        ht1.put("cpcp", 0);
        ht1.put("cccc", 0);
        ht1.put("cpcc", 0);
        ht1.put("cppp", 0);
        ht1.put("ccpc", 0);
        ht1.put("pcpp", 0);
        ht1.put("ccpp", 0);
        ht1.put("cppc", 0);
        ht1.put("pcpc", 0);
        ht1.put("pccc", 0);
        ht1.put("pccp", 0);
        ht1.put("ppcp", 0);
        ht1.put("ppcc", 0);
        ht1.put("pppp", 0);
        ht1.put("cccp", 0);
        ht1.put("pppc", 0);
        Scanner scanner = new Scanner(System.in);
        String ch = null;
for(int i=0; i<4; i++){
    ch = scanner.next();
    g1=g2;
    g2=g3;
    g3=g4;
    g4=ch.charAt(0);
    System.out.println("I predicted c");
}
        while(pc<25 && player <25){
            System.out.println("What is your guess?[c/p]");
            StringBuilder sb = new StringBuilder();
            sb.append(g1);
            sb.append(g2);
            sb.append(g3);
            sb.append(g4);
            String str = sb.toString();
            ch = scanner.next();
            int val = ht.get(str);
            int val2 = ht1.get(str);
            String prediction = null;
            if(val>val2){
                prediction = "c";
            }
            else {
                prediction = "p";
            }

            if(ch.equals("c")){

                ht.replace(str,val+1);
            }
            else {

                ht1.replace(str,val2+1);
            }
            g1=g2;
            g2=g3;
            g3=g4;
            g4=ch.charAt(0);
            if(ch.equals(prediction)){
                pc++;
                System.out.println("Yes! I predicted "+ prediction);
            }
            else {
                player++;
                System.out.println("No. I predicted "+ prediction);
            }
            System.out.println("Score : "+ player + " | "+ pc);

        }
            scanner.close();
    }
}
