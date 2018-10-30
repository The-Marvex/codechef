import java.io.*;

class Main{
	public static void main(String args[])throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int TestCase = Integer.parseInt(read.readLine());
		while(TestCase--!=0){
			long T = Integer.parseInt(read.readLine());
			long b=1,n=0,by=0;
			long i = 0;
			long c = 0;
			while(i<T)
			{
			if(c==0 && (i+2)<T)
			{
				i+=2;
				c++;c%=3;
				n=b;
				b=0;
			}
			else if(c==1 && (i+8)<T)
			{
				i+=8;
				c++;c%=3;
				by=n;
				n=0;
			}
			else if(c==2 && (i+16)<T)
			{
				i+=16;
				c++;c%=3;
				b=2*by;
				by=0;
			}
			else
	        	break;
			}
		System.out.println(b+" "+n+" "+by);
		}
	}
}
