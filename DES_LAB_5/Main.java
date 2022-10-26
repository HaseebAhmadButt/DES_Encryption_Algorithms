package NS_Labs.DES_LAB_5;

import java.nio.file.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path_text = Paths.get("E:\\IntelliJ Project Space\\spring.core\\src\\main\\resources\\input.txt");
        Path path_keys = Paths.get("E:\\IntelliJ Project Space\\spring.core\\src\\main\\resources\\keys.txt");
        DES des = new DES();
        ArrayList<String> InitialPermutationsStrings = new ArrayList<>();
        ArrayList<String> plain_bits = des.desPlaintextBlock(path_text);
        for(String string: plain_bits){
            InitialPermutationsStrings.add(des.desInitialPermutation(string));
        }
        ArrayList<String> keys = des.desPlaintextBlock(path_keys);
        int i = keys.size() / 2;
        System.out.println("Key: "+keys.get(i));
        ArrayList<String> DES_Encryption =  des.desEncryption(InitialPermutationsStrings, keys.get(i));
        System.out.println("----------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tEncrypted Data: ");
        System.out.println("----------------------------------------------------------------");
        for(String DES: DES_Encryption){
            System.out.println(DES);
        }
    }
}
