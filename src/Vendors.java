public class Vendors {
    private int id, turnId;
    private String name, password, icon;

    public Vendors(int id, int turnId, String name, String password, String icon){
        this.id = id;
        this.turnId = turnId;
        this.name = name;
        this.name = name;
        this.password = password;
        this.icon = icon;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getTurnId(){
        return turnId;
    }

    public void setTurnId(int turnId){
        this.turnId = turnId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getIcon(){
        return icon;
    }

    public void setIcon(String icon){
        this.icon = icon;
    }

}
