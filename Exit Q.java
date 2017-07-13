# Exit-Q
import java.io.*;
import java.util.*;
public class Exit Q
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Letter:");
String s=br.readLine();
if(s.equals(!('q')) || !(s.equals('Q')))
{
//System.continue;
}
else
{
System.exit(0);
System.out.println("The Letter is : "+s);
}
}
}
