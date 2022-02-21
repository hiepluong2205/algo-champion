package io.github.hiepluong2205.fhda.cis35a.a3;

// https://deanza.instructure.com/courses/23660/assignments/678804
// https://docs.google.com/document/d/1lcMdu6xp0oPytE6U30y-qYpzx7jOJbclRg7J6i1QVGY/edit?usp=sharing
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO("C:\\Users\\hiepl\\GitHub\\hiepluong2205\\algo-champion\\src\\main\\java\\io\\github\\hiepluong2205\\fhda\\cis35a\\a3\\Salesdat.txt");
		Franchise f = a1.readData();
	}

}
