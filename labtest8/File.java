package labtest8;

public class File {

public File(String str) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {

String str = "C:\\Users\\test\\Documents\\";

File file = new File(str);

String[] files = file.list();

for (String f : files) {

System.out.println(f);

}

}

private String[] list() {
	// TODO Auto-generated method stub
	return null;
}

}


