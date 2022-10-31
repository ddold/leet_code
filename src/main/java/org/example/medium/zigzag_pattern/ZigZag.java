package org.example.medium.zigzag_pattern;

public class ZigZag {
    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        String solution = zigZag.convert("PAYPALISHIRING", 4);

        System.out.println("Converted value is \n" + solution);
    }

    public String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        int stringLength = charArray.length;
        StringBuffer[] stringBuffers = new StringBuffer[numRows];
        for (int i = 0; i < stringBuffers.length; i++) {
            stringBuffers[i] = new StringBuffer();
        }

        int i = 0;
        while (i < stringLength) {
            for (int idx = 0; idx < numRows && i < stringLength; idx++) { // vertically down
                stringBuffers[idx].append(charArray[i++]);
                stringBuffers[idx].append(" ");

                if (idx == 0 || idx == numRows - 1) {
                    stringBuffers[idx].append(" ");
                    stringBuffers[idx].append(" ");
                }
            }
            for (int idx = numRows-2; idx >= 1 && i < stringLength; idx--) { // obliquely up
                stringBuffers[idx].append(charArray[i++]);
                stringBuffers[idx].append(" ");
            }
        }
        for (int idx = 1; idx < stringBuffers.length; idx++){
            stringBuffers[0].append("\n");
            stringBuffers[0].append(stringBuffers[idx]);
        }

        return stringBuffers[0].toString();
    }
}
