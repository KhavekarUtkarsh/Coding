import java.io.*;
public class BufferedReader{
    public BufferedReader(InputStreamReader inputStreamReader) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String args[]) throws IOException{
        System.out.println("Enter 2 numbers-");
        BufferedReader reader= new BufferedReader(newInputStreamReader(System.in));
        double first=Double.parseDouble(reader.readline());
        double second=Double.parseDouble(reader.readline());
        double result=first+second;
        System.out.println("Addition="+result);
    }

    private String readline() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readline'");
    }

    private static InputStreamReader newInputStreamReader(InputStream in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newInputStreamReader'");
    }

    public String readLine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLine'");
    }

    
}