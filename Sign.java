public class Sign
  {
    private String message; //is also the length
    private int width;
    public Sign(String m, int w)
    {
      message = m;
      width = w;
    }

    public int numberOfLines()
    {
      int lines = message.length() / width;
      if(message.length() % width == 0) return lines;
      return lines + 1;
    }

    public String getLines()
    {
      if(message.length() == 0) return null;
      String s = "";
      int i = 0;
      while(i < message.length())
      {
        s += message.substring(i, i + 1);
        i++;
        if(i % width == 0 && i != message.length()) s += ";";    //semiclon is for the break or border of the sign (the width)
      }
      return s;
    }
  }
