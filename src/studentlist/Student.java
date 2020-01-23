
package studentlist;


public class Student
{

    /**
     * @return the partime
     */
    public int getPartime() {
        return partime;
    }

    /**
     * @param partime the partime to set
     */
    public void setPartime(int partime) {
        this.partime = partime;
    }
    private String name;
    private int age;
    private int partime;

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

  
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
