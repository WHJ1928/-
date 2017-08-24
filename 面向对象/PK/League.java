package PK;

import 类.LOL;

public class League {

	public static void main(String[] args){
    	LOL Trickster = new LOL();
    	Trickster.name= "菲兹";
    	Trickster.price = 6300;
    	Trickster.situation ="mid";
    	Trickster.type="刺客";
    	Trickster.weapon ="海神三戟叉";
    	
    	LOL Luminosity = new LOL();
    	Luminosity.name= "拉克丝";
    	Luminosity.price = 4800;
    	Luminosity.situation ="mid";
    	Luminosity.type="法师";
    	Luminosity.weapon ="魔法杖";	
    	
    	LOL Shadow = new LOL();
    	Shadow.name= "泰隆";
    	Shadow.price = 6300;
    	Shadow.situation ="mid";
    	Shadow.type="刺客";
    	Shadow.weapon ="刀";	
    	
    	LOL Noxus = new LOL();
    	Noxus.name= "德莱厄斯";
    	Noxus.price = 6300;
    	Noxus.situation ="top";
    	Noxus.type="战士";
    	Noxus.weapon ="斧";	
    	
    	LOL Rouser = new LOL();
    	Rouser.name= "古拉加斯";
    	Rouser.price = 6300;
    	Rouser.situation ="jun";
    	Rouser.type="战士";
    	Rouser.weapon ="酒桶";	
    	
    	LOL Dawn = new LOL();
    	Dawn.name= "蕾欧娜";
    	Dawn.price = 6300;
    	Dawn.situation ="sup";
    	Dawn.type="战士";
    	Dawn.weapon ="刀盾";
    	
    	LOL Executioner = new LOL();
    	Executioner.name= "德莱文";
    	Executioner.price = 6300;
    	Executioner.situation ="AC";
    	Executioner.type="战士";
    	Executioner.weapon ="斧子";
    	
//    	System.out.println(Noxus.name);
    	Trickster.语音(" 一跳就到你前面去啦!");
    	
    }
}
