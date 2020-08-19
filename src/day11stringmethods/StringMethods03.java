package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat () method is another method of concatenation,
		// that is, combining two strings.
		String str1 = "Ali";
		String str2 = "Veli";
		System.out.println(str1 + str2); // AliVeli
		System.out.println(str1.concat(str2));// AliVeli
		System.out.println(str1.concat(str2).concat(str1));
		// contact we can use as much as we want.
		System.out.println(str1.concat("==> ").concat(str2));

		// replace () method is used to substitute another character for the appearance
		// of all characters ex: ata ==> ana
		// replace 1. versiyon
		String str3 = "ata";
		System.out.println(str3.replace("t", "n")); // ana
		System.out.println(str3.replace("a", "u")); // utu
		System.out.println(str3.replace("a", "o"));
		System.out.println(str3.replace("x", "y"));
		// gives "ata" no change. Since there is no x, there is no change.
		System.out.println(str3.replace("", "/"));
		// puts nothing between the two double quats and / puts it in / between all the
		// letters.
		System.out.println(str3.replace("t", ""));
		// t will be destroyed.
		System.out.println(str3.replace("at", "Mustaf"));
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K")); // Karakartal
		System.out.println(str4.replaceFirst("a", "e")); // kerakartal
		System.out.println(str4.replaceFirst("ka", "A")); // Arakartal
		System.out.println(str4.replaceFirst("kar", "")); // akartal
		System.out.println(str4.replaceFirst("kara", "A"));
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));
		// replaceAll () and replace () method do exactly the same thing.
		// replace () method for single characters if you want
		// you can use single quotes. but we cannot use single quots in replaceAll.
	}

}
