package com.java.groom.array;

public class RunLength {
	public static void main(String[] args) {
		RunLength encode = new RunLength();
		System.out.println(encode.encode("aaaabbbcccdefggg"));
	}
	
	private String encode (String inPut) {
		if (inPut == null || inPut.trim().length() == 0) return "";
		String outPut = "";
		int counter = 0;
		char prev = ' ';
		for (char c: inPut.trim().toCharArray()) {
			if (c != prev && counter > 0) {
				outPut = outPut+" "+counter+prev+" ";
				counter = 0;
			}
			prev = c;
			counter++;
		}
		if (counter > 0) {
			outPut = outPut+" "+counter+prev+" ";
		}
		return(outPut);
	}
}
