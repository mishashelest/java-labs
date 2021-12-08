package Lab;

public class BasketballPlayer extends Sportsman
{
    protected String club;
    protected String position;
    protected int speed;
    protected float jump;
    protected int shot;

    @Override
    public String toString()
    {
        return "Lastname\t" + lastname + "\t Firstname\t" + firstname + "\tAge\t" + age + "\tHeight\t" + height + "\tWeight\t" +
                weight  + "\nClub\t" + club + "\tPosition\t" + position + "\tJump\t" + jump + "\tShot\t" + shot + "\tSpeed\t" + speed ;
    }

    @Override
    public int hashCode()
    {
        return 31 * age + 31 * height + 31 * weight + firstname.hashCode() + club.hashCode() + speed * 31 + (int)jump * 31
                + shot * 31 + lastname.hashCode() + sport.hashCode() + qualification.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        BasketballPlayer basketballPlayer = (BasketballPlayer) obj;
        if(this.firstname != basketballPlayer.firstname || this.lastname != basketballPlayer.lastname || this.sport != basketballPlayer.sport
                || this.qualification != basketballPlayer.qualification || this.age != basketballPlayer.age || this.height != basketballPlayer.height
                || this.weight != basketballPlayer.weight || this.speed != basketballPlayer.speed || this.jump != basketballPlayer.jump ||
        this.club != basketballPlayer.club || this.position != basketballPlayer.position || this.shot != basketballPlayer.shot)
        {
            return false;
        }
        return true;
    }

    public String getClub() {
        return club;
    }

    public String getPosition() {
        return position;
    }

    public int getSpeed() {
        return speed;
    }

    public float getJump() {
        return jump;
    }

    public int getShot() {
        return shot;
    }

    public static class Builder
    {
        private BasketballPlayer basketballPlayer;

        public Builder()
        {
            basketballPlayer = new BasketballPlayer();
        }

        public  Builder SetClub(String club)
        {
            basketballPlayer.club = club;
            return this;
        }

        public Builder SetPosition(String position )
        {
            basketballPlayer.position = position;
            return this;
        }

        public Builder SetSpeed(int speed)
        {
            basketballPlayer.speed = speed;
            return  this;
        }

        public  Builder SetJump(float jump)
        {
            basketballPlayer.jump = jump;
            return this;
        }

        public Builder SetShot(int shot)
        {
            basketballPlayer.shot = shot;
            return this;
        }


        public  Builder SetAge(int age)
        {
            basketballPlayer.age = age;
            return this;
        }

        public  Builder SetHeight(int height)
        {
            basketballPlayer.height = height;
            return this;
        }

        public  Builder SetWeight(int weight)
        {
            basketballPlayer.weight = weight;
            return this;
        }

        public  Builder SetSport(String sport)
        {
            basketballPlayer.sport = sport;
            return  this;
        }

        public  Builder SetQualification(String qualification)
        {
            basketballPlayer.qualification = qualification;
            return this;
        }

        public  Builder SetLastname(String lastname)
        {
            basketballPlayer.lastname = lastname;
            return  this;
        }

        public  Builder SetFirstname(String firstname)
        {
            basketballPlayer.firstname = firstname;
            return this;
        }

        public BasketballPlayer build()
        {
            return basketballPlayer;
        }

    }

}

