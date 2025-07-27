import java.util.Objects;

public class FooImproved {

   public int compress(char[] chars) {
    var compressedChars = new StringBuilder();
    int compressedCharsLength = 0;

    if(chars.length == 0) return compressedCharsLength;

    Character lastChar = chars[0];
    int repeatCount = 1;

    for(int i = 0; i < chars.length; i++){
        if(i == 0) continue;

        boolean isSamePreviousChar = 
          Objects.nonNull(lastChar) && lastChar.charValue() == chars[i];
        
        if(isSamePreviousChar) {
          repeatCount++;
        } else {
          compressedChars.append(lastChar.charValue());
          
          if(repeatCount > 1) { 
            compressedChars.append(String.valueOf(repeatCount));
            repeatCount = 1;
          }
        }

        lastChar = chars[i];
    }

    compressedChars.append(lastChar.charValue());
    if(repeatCount > 1) {
      compressedChars.append(String.valueOf(repeatCount));
    }

    compressedCharsLength = compressedChars.length();
    for(int i = 0; i < compressedCharsLength; i++) {
      chars[i] = compressedChars.charAt(i);
    }
    return compressedCharsLength;
   }
  
}
