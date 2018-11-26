public class  MyString implements CharSequence, Comparable<CharSequence> {
  private char[] data;
  public MyString( CharSequence s) {
    data = new char[s.length()];
    for ( int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  public int length() {
    return data.length;
  }

  public String toString() {
    String output = "";
    for ( int i =0; i < length(); i++) {
      output += charAt(i);
    }
    return output;
  }

  public char charAt( int index) {
    if ( index >= length() || index < 0)
    throw new IndexOutOfBoundsException() ;
    return data[index];
  }

  public CharSequence subSequence( int start, int end) {
    if ( start > end || start < 0 || end < 0)
    throw new IndexOutOfBoundsException();
    String outputs = "";
    for( int i= start; i < end; i++) {
      outputs += charAt(i);
    }
    CharSequence output = new MyString(outputs);
    return output;
  }

  public int compareTo( CharSequence s) {
    if ( s == null)
    throw new NullPointerException();
    if ( length() > s.length() )
    return 1;
    if ( length() < s.length())
    return -1;

    for ( int i = 0; i < length(); i++) {
      if( charAt(i) > s.charAt(i))
      return 1;
      if ( charAt(i) < s.charAt(i))
      return -1;
    }
    return 0;
  }

}
