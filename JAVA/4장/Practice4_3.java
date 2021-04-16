class Song{
	String title, artist, country;
	int year;
	public Song() {}
	public Song(String t, String a, int y, String c) {title = t; artist = a; year = y; country = c;}
	void show() {System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);}
}

public class Main {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
	}

}
