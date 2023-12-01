package includes;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private int money;
    private int role;

    public User(int id, String name, String email, String password, int money , int role){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.money = money;
        this.role = role;
    }

    public User(){

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }
    public int getMoney(){
        return money;
    }

    public int getRole(){
        return role;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void setRole(int role){
        this.role = role;
    }

}


