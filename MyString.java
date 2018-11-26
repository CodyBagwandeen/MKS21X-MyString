public class  MyString implements CharSequence, Comparable<CharSequence {
  private char[] data;
  public MyString( CharSequence s) {
    data = new char[s.length()];
    for ( int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  private int length() {

  }

  private String toString() {
    String output = "";
    for ( int i =0; i < length(); i++) {
      output += charAt(i);
    }
    return output;
  }

  private char charAt( int index) {
    if ( index >= length() || index < 0)
    throw new IndexOutOfBoundsException ;
    return data[index];
  }

  private CharSequence subsequence( int start, int end) {
    if ( start > end || start < 0 || end < 0)
    throw new IndexOutOfBoundsException;
    new
    for( int i= start; i < end; i++) {

    }
  }

}
