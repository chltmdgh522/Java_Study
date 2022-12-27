package stream.decorator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

    public static void main(String[] args) {
        try(InputStreamReader irs=new InputStreamReader (new FileInputStream("reader.txt"))){//보조스트림
            int i=0;
            while((i=irs.read())!=-1){
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        Socket socket=new Socket();
        try(InputStreamReader ir= new InputStreamReader (socket.getInputStream())){//바이트로 받은걸 문자로변환
//BufferedReader br=new BufferedReader(new InputStreamReader (socket.getInputStream()))
            //br.readLine(); - 한줄 읽어주는거 개빨름
        }catch(IOException e){
            System.out.println(e);

        }    }
}
