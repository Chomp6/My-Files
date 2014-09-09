import java.util.Scanner;
public class GameTest{
	public static void main(String[] args){
		HeroClass ourHero = new HeroClass();
		String tempString;
		char tempChar;
		int tempInt;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name adventurer?\n");
		tempString = input.next();
		ourHero.setName(tempString);
		System.out.println(ourHero.getName() + " is a real name?\n");
		while(ourHero.getCharClass() == ""){
			System.out.println("Which of the following are you?\n[W]arrior\n[R]ogue\n[M]agician");
			tempChar = input.next().charAt(0);
			if(tempChar == 'W' || tempChar == 'w'){
				ourHero.setClass("Warrior");
				ourHero.setStr(20);
				ourHero.setDex(10);
				ourHero.setIntl(5);
				ourHero.setHealth(30);
				ourHero.setArmor(20);
				System.out.println("You choose a " + ourHero.getCharClass() + "? Really?");
			}
			else if(tempChar == 'R' || tempChar == 'r'){
				ourHero.setClass("Rogue");
				ourHero.setStr(15);
				ourHero.setDex(20);
				ourHero.setIntl(5);
				ourHero.setHealth(20);
				ourHero.setArmor(15);
				System.out.println("You choose a " + ourHero.getCharClass() + "? Really?");
			}
			else if(tempChar == 'M' || tempChar == 'm'){
				ourHero.setClass("Magician");
				ourHero.setStr(5);
				ourHero.setDex(10);
				ourHero.setIntl(20);
				ourHero.setHealth(10);
				ourHero.setArmor(10);
				System.out.println("You choose a " + ourHero.getCharClass() + "? Is this correct?");
			}	
			else{
				System.out.println("Please pick correctly...");
			}
		}
		while(ourHero.getRace() == ""){
			System.out.println("Of what race do you belong?\n[H]uman\n[E]lf\n[D]warf\n[O]rc\n[G]nome");
			tempChar = input.next().charAt(0);
			if(tempChar == 'H' || tempChar == 'h'){
				System.out.println("You have selected human. Is this correct?\n [Y]es or [N]o?");
				tempChar = input.next().charAt(0);
				if(tempChar == 'Y' || tempChar == 'y'){
					ourHero.setRace("Human");
					ourHero.setStr(ourHero.getStr() + 2);
					ourHero.setDex(ourHero.getDex() + 2);
					ourHero.setIntl(ourHero.getIntl() + 2);
				}
			}
			else if(tempChar == 'E' || tempChar == 'e'){
				System.out.println("You have selected elf. Is this correct?\n [Y]es or [N]o?");
				tempChar = input.next().charAt(0);
				if(tempChar == 'Y' || tempChar == 'y'){
					ourHero.setRace("Elf");
					ourHero.setDex(ourHero.getDex() + 2);
					ourHero.setIntl(ourHero.getIntl() + 4);
				}
			}
			else if(tempChar == 'D' || tempChar == 'd'){
				System.out.println("You have selected dwarf. Is this correct?\n [Y]es or [N]o?");
				tempChar = input.next().charAt(0);
				if(tempChar == 'Y' || tempChar == 'y'){
					ourHero.setRace("Dwarf");
					ourHero.setStr(ourHero.getStr() + 3);
					ourHero.setDex(ourHero.getDex() + 3);
				}
			}
			else if(tempChar == 'O' || tempChar == 'o'){
				System.out.println("You have selected half-orc. Is this correct?\n [Y]es or [N]o?");
				tempChar = input.next().charAt(0);
				if(tempChar == 'Y' || tempChar == 'y'){
					ourHero.setRace("Half-orc");
					ourHero.setStr(ourHero.getStr() + 5);
					ourHero.setDex(ourHero.getDex() + 1);
				}
			}
			else if(tempChar == 'G' || tempChar == 'g'){
				System.out.println("You have selected gnome. Is this correct?\n [Y]es or [N]o?");
				tempChar = input.next().charAt(0);
				if(tempChar == 'Y' || tempChar == 'y'){
					ourHero.setRace("Gnome");
					ourHero.setDex(ourHero.getDex() + 3);
					ourHero.setIntl(ourHero.getIntl() + 3);
				}
			}
			else
				System.out.println("Please pick correctly...");
		}
		System.out.println("You shall be known as " + ourHero.toString());
	}
}