/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {

    }

    public CaesarCipher(int num){
        shift = num;
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shifted = new char[];
    }

    public String encrypt(String message){

    }

    public String decrypt(String message){

    }

    public void shifter(int num){

    }


}
