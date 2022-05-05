package fileHandling;


		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.FileWriter;
		class User1{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			FileWriter fr = null;
			public void readU() throws IOException, InterruptedException {
				System.out.println("Enter the File Name:");
				String loc="E:/Java_Matarial/";
				String fname=br.readLine();
				fname= loc.concat(fname);
				fname=fname.concat(".txt");
				fr = new FileWriter(fname,true);
				System.out.println();
				System.out.println("Enter the data:");
				BufferedWriter bw = new BufferedWriter(fr);
				System.out.println(fr);
				String data =br.readLine();
				for (int i = 0; i <data.length(); i++) {
					bw.write(data.charAt(i));
					System.out.print(data.charAt(i));
				}
				System.out.println("Data was Written.");
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				bw.close();
				
			}
		}
		public class PracticeFile {
			public static void main(String[] args) throws IOException,Exception {
				System.out.println("Main Method:");
				User1 ur = new User1();
				ur.readU();
				
	}
}
