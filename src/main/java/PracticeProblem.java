import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static String getName(int Line, String file) {
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(file));
			String lineNow = "";
			int numNow = 0;

			while ((lineNow = inputStream.readLine()) != null) {
				numNow++;
				if (numNow == Line) {
					String[] parts = lineNow.split(" ");
					return parts[0] + " " + parts[1];
				}
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			} 
		}
		return "";
	}

	public static int getAge(int text, String file) {
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(file));
			String lineNow = "";
			int numNow = 0;
			while ((lineNow = inputStream.readLine()) != null) {
				numNow++;
				if (numNow == text) {
					String[] parts = lineNow.split(" ");
					return Integer.parseInt(parts[2]);
				}
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
		return -1;
	}

	public static int getNumber(int Line, String file) {
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(file));
			String lineNow = "";
			int numNow = 0;
			while ((lineNow = inputStream.readLine()) != null) {
				numNow++;
				if (numNow == Line) {
					String[] parts = lineNow.split(" ");
					return Integer.parseInt(parts[3]);
				}
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
		return -1;
	}

	public static String fileAppend(String output, String filename) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(filename, true));
			bw.write(output);
		} catch (IOException e) {
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
			}
		}
		return filename;
	}
}