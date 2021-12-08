import java.io.Serializable;



public class Sportsman implements Serializable
{
    protected int age;
    protected  int height;
    protected  int weight;
    protected  String sport;
    protected  String qualification;
    protected String firstname;
    protected String lastname;

    public int getAge()
    {
        return age;
    }

    public int getHeight()
    {
        return height;
    }

    public float getWeight()
    {
        return weight;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public String getQualification()
    {
        return qualification;
    }

    public String getSport()
    {
        return sport;
    }




    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString()
    {
        return "lastname\t" + lastname + "\t firstname\t" + firstname + "\tage\t" + age + "\theight\t" + height + "\tweight\t" +
                weight + "\tsport\t" + sport + "\tqualification\t" + qualification;
    }

    @Override
    public int hashCode()
    {
        return 31 * age + 31 * height + 31 * weight + firstname.hashCode() + lastname.hashCode() + sport.hashCode() + qualification.hashCode() ;
    }

    @Override
    public boolean equals(Object obj)
    {
        Sportsman man = (Sportsman)obj;
        if(this.firstname != man.firstname || this.lastname != man.lastname || this.sport != man.sport
                || this.qualification != man.qualification || this.age != man.age || this.height != man.height || this.weight != man.weight)
        {
            return false;
        }
        return true;

    }

    public static class Builder
    {
        private Sportsman newSportsman;

        public Builder()
        {
            newSportsman = new Sportsman();
        }

        public Builder SetAge(int age)
        {
            newSportsman.age = age;
            return this;
        }

        public Builder SetHeight(int height)
        {
            newSportsman.height = height;
            return this;
        }

        public Builder SetWeight(int weight)
        {
            newSportsman.weight = weight;
            return this;
        }

        public Builder SetSport(String sport)
        {
            newSportsman.sport = sport;
            return  this;
        }

        public Builder SetQualification(String qualification)
        {
            newSportsman.qualification = qualification;
            return this;
        }

        public  Builder SetLastname(String lastname)
        {
            newSportsman.lastname = lastname;
            return  this;
        }

        public Builder SetFirstname(String firstname)
        {
            newSportsman.firstname = firstname;
            return this;
        }

        public Sportsman build()
        {
            return newSportsman;
        }

    }


}

