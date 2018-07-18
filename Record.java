public class Record {

    private String name;
    private int experiencePoints;
    private String id;

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int newExpPoints){
        this.experiencePoints = newExpPoints;
    }

}
