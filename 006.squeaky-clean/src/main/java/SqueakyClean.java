class SqueakyClean {
    public static String clean(String input) {
        StringBuilder newStr = new StringBuilder();
        boolean toUpperCase = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                newStr.append('_');
            } else if(c == '-') {
                toUpperCase = true;
            } else if(c == '4'){
                newStr.append("a");
            }  else if ( c == '3'){
                newStr.append("e");
            } else if (c == '1'){
                newStr.append("l");
            } else if (c == '0'){
                newStr.append("o");
            } else if (c == '7'){
                newStr.append("t");
            }
            else if (Character.isLetter(c)) {
                  if (toUpperCase) {
                    newStr.append(Character.toUpperCase(c)); 
                    toUpperCase = false; 
                } else {
                    newStr.append(c);
                }
            }
        }

        return newStr.toString();
    }
}
