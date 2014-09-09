public class HeroClass{
	private String name, charClass, race;
	private int level, dex, str, intl, health, armor;
	public HeroClass(String n, String c,String r,int l,int d,int s,int i,int h,int a){
		name = n;
		charClass = c;
		race = r;
		level = l;
		dex = d;
		str = s;
		intl = i;
		health = h;
		armor = a;
	}
	public HeroClass(){
		name = "";
		charClass = "";
		race = "";
		level = 1;
		dex = 0;
		str = 0;
		intl = 0;
		health = 0;
		armor = 0;
	}
	public String toString(){
		return name + ", the " + race + ", a " + charClass + " in their season of " + level + ".";
	}
	public String getName(){
		return name;
	}
	public String getCharClass(){
		return charClass;
	}
	public String getRace(){
		return race;
	}
	public int getLevel(){
		return level;
	}
	public int getDex(){
		return dex;
	}
	public int getStr(){
		return str;
	}
	public int getIntl(){
		return intl;
	}
	public int getHealth(){
		return health;
	}
	public int getArmor(){
		return armor;
	}
	public void setName(String n){
		name = n;
	}
	public void setClass(String c){
		charClass = c;
	}
	public void setRace(String r){
		race = r;
	}
	public void setLevel(int l){
		level = l;
	}
	public void setDex(int d){
		dex = d;
	}
	public void setStr(int s){
		str = s;
	}
	public void setIntl(int i){
		intl = i;
	}
	public void setHealth(int h){
		health = h;
	}
	public void setArmor(int a){
		armor = a;
	}
}