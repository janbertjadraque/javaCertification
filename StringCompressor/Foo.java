public class Foo{
  public int compress(char[] chars) {
    char lastChar = chars[0];
    int repeatCount = 1;
    int length = 0;
    int index = 0;
    for(int i = 0; i < chars.length; i++){
      if(i == 0) {
        index++;
        continue;
      }
            
      if(lastChar != chars[i]) {
        if(repeatCount > 1) {
            char[] rcount = String.valueOf(repeatCount).toCharArray();
            for(int j = 0; j < rcount.length; j++){
              chars[index] = rcount[j];
              index++;
            }
            length += (rcount.length+1);
        } else {
            length += 1;
        } 
        lastChar = chars[i];
        chars[index] = chars[i];
        repeatCount = 0;
        index++;
      } 
      repeatCount++;
    }

   if(repeatCount > 1) {
    char[] rcount = String.valueOf(repeatCount).toCharArray();
    for(int j = 0; j < rcount.length; j++){
      chars[index] = rcount[j];
      index++;
    }
    length += (rcount.length+1);
  } else {
    length += 1;
  }
    return length;
  }
}