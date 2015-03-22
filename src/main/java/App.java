import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        winToLinux("E:\\01MyFile\\CScience\\Java\\idea\\ideaWP\\webssm");
    }

    public static String winToLinux(String str){
        char[] chs=str.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(chs[i]==':'){
                chs[i]=chs[i-1];
                chs[0]='/';
            }
            if(chs[i]=='\\'){
                chs[i]='/';
            }
        }
        System.out.println(chs);
        return  chs.toString();
    }
}
