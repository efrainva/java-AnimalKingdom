package Ark;

import java.util.*;

public class Main{
	public static void main(String[] args){

		AnimalT f1 = new AnimalT("Salmon",1869);
		AnimalT f2 = new AnimalT("catAnimalT",1817);
		AnimalT f3 = new AnimalT("perch",1758);

		AnimalT b1 = new AnimalT("Swan",1758);
		AnimalT b2 = new AnimalT("Parrot",1824);
		AnimalT b3 = new AnimalT("Toucan",1758);
		AnimalT b4 = new AnimalT("Peacock",1821);
		AnimalT b5 = new AnimalT("Pigeon",1837);

		AnimalT m1 = new AnimalT("Bigfoot",2021);
		AnimalT m2 = new AnimalT("Raccoon",1758);
		AnimalT m3 = new AnimalT("Armadillo",1758);
		AnimalT m4 = new AnimalT("Sloth",1804);
		AnimalT m5 = new AnimalT("Koala",1816);
		AnimalT m6 = new AnimalT("Zebra",1778);
		AnimalT m7 = new AnimalT("Panda",1869);

		// HashMap<String,Integer> fish = new HashMap<String,Integer>();
		// fish.put(f1);
		// fish.put(f2);
		// fish.put(f3);

		ArrayList<String> birds = new ArrayList<String>();
		birds.add(b1);
		// birds.add(b2.atts());
		// birds.add(b3.atts());
		// birds.add(b4.atts());
		// birds.add(b5.atts());

		// ArrayList<String> mammals = new ArrayList<String>();
		// mammals.add(m1);
		// mammals.add(m2);
		// mammals.add(m3);
		// mammals.add(m4);
		// mammals.add(m5);
		// mammals.add(m6);
		// mammals.add(m7);

		System.out.println("--fish");
		System.out.println(f1.atts());
		System.out.println(f2.atts());
		System.out.println(f3.atts());
		// System.out.println(fish);
		System.out.println("fish--");
		System.out.println("--birds");
		System.out.println(b1.atts());
		System.out.println(b2.atts());
		System.out.println(b3.atts());
		System.out.println(b4.atts());
		System.out.println(b5.atts());
		System.out.println(birds);
		System.out.println("birds--");
		System.out.println("--mammals");
		System.out.println(m1.atts());
		System.out.println(m2.atts());
		System.out.println(m3.atts());
		System.out.println(m4.atts());
		System.out.println(m5.atts());
		System.out.println(m6.atts());
		System.out.println(m7.atts());
		System.out.println("mammals--");
	}
} 