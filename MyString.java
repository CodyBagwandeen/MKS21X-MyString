public class  MyString implements CharSequence {
  private char[] data;
  public MyString( CharSequence s) {
    for ( int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  private int length() {

  }

  private String toString() {
    String output = "";
    for ( int i =0; i < length(); i++) {
      output += data[i];
    }
    return output;
  }

}
