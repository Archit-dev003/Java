import java.util.Scanner;

class Character
{
    private int health;
    private int attack;
    private int Sattack;
    private String name;
    private Enemy enemy;

    Character(int health, int attack, int Sattack, Enemy enemy)
    {
        this.health = health;
        this.attack = attack;
        this.Sattack = Sattack;
        this.enemy = enemy;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSattack() {
        return Sattack;
    }

    public int getAttack() {
        return attack;
    }

    public void moveA()
    {

    }

    public void moveSA()
    {

    }

    public void diplayDetails()
    {

    }
}

class Enemy
{
    private int gHealth = 110;
    private int gattack = 25;

    public void setgHealth(int gHealth) {
        this.gHealth = gHealth;
    }

    public void setGattack(int gattack) {
        this.gattack = gattack;
    }

    public int getEHealth() {
        return gHealth;
    }

    public int getGattack() {
        return gattack;
    }

    public int getEnemy(){
        return gattack;
    }
}
class Warrior extends Character
{
    Warrior(int health, int attack, int Sattack, Enemy enemy)
    {
        super(health, attack, Sattack, enemy);
    }
    
    @Override 
    public void moveA()
    {
        if(getEnemy().getEHealth()>=getAttack())
        {
        getEnemy().setgHealth(getEnemy().getEHealth()-getAttack());
        System.out.println(getName()+ " attack Goblin!");
        System.out.println();
        System.out.println("Damage Dealt: "+getAttack());
        System.out.println("Goblin HP: "+getEnemy().getEHealth());
        }

        else{
            getEnemy().setgHealth(0);
        }
        System.out.println();

        if(getHealth()>=getEnemy().getGattack())
        {
        setHealth(getHealth()-getEnemy().getGattack());
        System.out.println("Goblin attack "+getName()+"!");
        System.out.println();
        System.out.println("Damage Dealt: "+getEnemy().getGattack());
        System.out.println(getName()+" HP: "+getHealth());
        }

        else{
            setHealth(0);
        }
    }

    @Override 
    public void moveSA()
    {
        if(getEnemy().getEHealth()>=getSattack())
        {
        getEnemy().setgHealth(getEnemy().getEHealth()-getSattack());
        System.out.println(getName()+ " used SPECIAL ATTACK!");
        System.out.println();
        System.out.println("Damage Dealt: "+getSattack());
        System.out.println("Goblin HP: "+getEnemy().getEHealth());
        }

        else{
            getEnemy().setgHealth(0);
        }
        System.out.println();
        
        if(getHealth()>=getEnemy().getGattack())
        {
        setHealth(getHealth()-getEnemy().getGattack());
        System.out.println("Goblin attack "+getName()+"!");
        System.out.println();
        System.out.println("Damage Dealt: "+getEnemy().getGattack());
        System.out.println(getName()+" HP: "+getHealth());
        }

        else{
            setHealth(0);
        }
    }

    @Override 
    public void diplayDetails()
    {
        
        System.out.println("Player: "+getName());
        System.out.println("Class: Warrior");
        System.out.println("HP: "+getHealth());
        System.out.println();
        System.out.println("Enemy: Goblin");
        System.out.println("HP: "+getEnemy().getEHealth());
        System.out.println();
    }
}

class Mage extends Character
{
    Mage(int health, int attack, int Sattack, Enemy enemy)
    {
        super(health, attack, Sattack, enemy);
    }

    @Override 
    public void moveA()
    {
        if(getEnemy().getEHealth()>=getAttack())
        {
        getEnemy().setgHealth(getEnemy().getEHealth()-getAttack());
        System.out.println(getName()+ " attack Goblin!");
        System.out.println();
        System.out.println("Damage Dealt: "+getAttack());
        System.out.println("Goblin HP: "+getEnemy().getEHealth());
        }

        else{
            getEnemy().setgHealth(0);
        }
        System.out.println();

        if(getHealth()>=getEnemy().getGattack())
        {
        setHealth(getHealth()-getEnemy().getGattack());
        System.out.println("Goblin attack "+getName()+"!");
        System.out.println();
        System.out.println("Damage Dealt: "+getEnemy().getGattack());
        System.out.println(getName()+" HP: "+getHealth());
        }

        else{
            setHealth(0);
        }
    }
    
    @Override 
    public void moveSA()
    {
        if(getEnemy().getEHealth()>=getSattack())
        {
        getEnemy().setgHealth(getEnemy().getEHealth()-getSattack());
        System.out.println(getName()+ " used SPECIAL ATTACK!");
        System.out.println();
        System.out.println("Damage Dealt: "+getSattack());
        System.out.println("Goblin HP: "+getEnemy().getEHealth());
        }

        else{
            getEnemy().setgHealth(0);
        }
        System.out.println();
        
        if(getHealth()>=getEnemy().getGattack())
        {
        setHealth(getHealth()-getEnemy().getGattack());
        System.out.println("Goblin attack "+getName()+"!");
        System.out.println();
        System.out.println("Damage Dealt: "+getEnemy().getGattack());
        System.out.println(getName()+" HP: "+getHealth());
        }

        else{
            setHealth(0);
        }
    }

    @Override 
    public void diplayDetails()
    {
        
        System.out.println("Player: "+getName());
        System.out.println("Class: Mage");
        System.out.println("HP: "+getHealth());
        System.out.println();
        System.out.println("Enemy: Goblin");
        System.out.println("HP: "+getEnemy().getEHealth());
        System.out.println();
    }
}

class Archer extends Character
{
    Archer(int health, int attack, int Sattack, Enemy enemy)
    {
        super(health, attack, Sattack,enemy);
    }

    @Override 
    public void moveA()
    {
        if(getEnemy().getEHealth()>=getAttack())
        {
        getEnemy().setgHealth(getEnemy().getEHealth()-getAttack());
        System.out.println(getName()+ " attack Goblin!");
        System.out.println();
        System.out.println("Damage Dealt: "+getAttack());
        System.out.println("Goblin HP: "+getEnemy().getEHealth());
        }

        else{
            getEnemy().setgHealth(0);
        }
        System.out.println();

        if(getHealth()>=getEnemy().getGattack())
        {
        setHealth(getHealth()-getEnemy().getGattack());
        System.out.println("Goblin attack "+getName()+"!");
        System.out.println();
        System.out.println("Damage Dealt: "+getEnemy().getGattack());
        System.out.println(getName()+" HP: "+getHealth());
        }

        else{
            setHealth(0);
        }
    }
    
    @Override 
    public void moveSA()
    {
        if(getEnemy().getEHealth()>=getSattack())
        {
        getEnemy().setgHealth(getEnemy().getEHealth()-getSattack());
        System.out.println(getName()+ " used SPECIAL ATTACK!");
        System.out.println();
        System.out.println("Damage Dealt: "+getSattack());
        System.out.println("Goblin HP: "+getEnemy().getEHealth());
        }

        else{
            getEnemy().setgHealth(0);
        }
        System.out.println();
        
        if(getHealth()>=getEnemy().getGattack())
        {
        setHealth(getHealth()-getEnemy().getGattack());
        System.out.println("Goblin attack "+getName()+"!");
        System.out.println();
        System.out.println("Damage Dealt: "+getEnemy().getGattack());
        System.out.println(getName()+" HP: "+getHealth());
        }

        else{
            setHealth(0);
        }
    }

    @Override 
    public void diplayDetails()
    {
        
        System.out.println("Player: "+getName());
        System.out.println("Class: Archer");
        System.out.println("HP: "+getHealth());
        System.out.println();
        System.out.println("Enemy: Goblin");
        System.out.println("HP: "+getEnemy().getEHealth());
        System.out.println();
    }
}
public class P38_RPGBattleGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Enemy E =  new Enemy();
        System.out.println("===== RPG BATTLE GAME =====");
        System.out.println();
        System.out.println("Choose your character: ");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");

        System.out.println();
        int input = sc.nextInt();
        System.out.println();

        if(input<1 || input>3)
        {
            sc.close();
            return;
        }

        System.out.print("Enter the Character name: ");
        String name = sc.next();
        System.out.println();
        System.out.println("===== BATTLE START =====");
        System.out.println();

        Character C = null;
        switch (input) {
            case 1:
                C = new Warrior(130, 35, 40,E);
                C.setName(name);
                break;
                
            case 2:
                C = new Mage(110, 30, 35,E);
                C.setName(name);
                break;

            case 3:
                C = new Archer(110, 30, 35,E);
                C.setName(name);
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
        
        int action = 1;
        C.diplayDetails();
        while(action!=4)
            {
            System.out.println("----------------------------");
            System.out.println("1. Attack");
            System.out.println("2. Special Attack");
            System.out.println("3. View Status");
            System.out.println("4. Run");
            System.out.println("----------------------------");

            System.out.println();
            System.out.print("Enter choice: ");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    if(C.getHealth()>0 && C.getEnemy().getEHealth()>0)
                    {
                        C.moveA();
                    }
                    if(C.getHealth()==0)
                    {
                        System.out.println();
                        System.out.println("================================");
                        System.out.println("You Lose!");
                        System.out.println("================================");
                        action = 4;
                    }
                    else if(C.getEnemy().getEHealth()==0)
                    {
                        System.out.println();
                        System.out.println("================================");
                        System.out.println("You Won!");
                        System.out.println("================================");
                        action = 4;
                    }
                    System.out.println();
                    break;

                case 2:
                    if(C.getHealth()>0 && C.getEnemy().getEHealth()>0)
                    {
                        C.moveSA();
                    }
                    if(C.getHealth()==0)
                    {
                        System.out.println();
                        System.out.println("================================");
                        System.out.println("You Lose!");
                        System.out.println("================================");
                        action = 4;
                    }
                    else if(C.getEnemy().getEHealth()==0)
                    {
                        System.out.println();
                        System.out.println("================================");
                        System.out.println("You Won!");
                        System.out.println("================================");
                        action = 4;
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("========== STATUS ==========");
                    System.out.println();
                    C.diplayDetails();
                    break;
            
                case 4:
                    action=4;
                    break;
            
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        sc.close();
        
    }
}
