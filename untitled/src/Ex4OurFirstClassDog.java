public class Ex4OurFirstClassDog {


        public String name;
        public String breed;
        public int ageInYears;
        public String owner;
        public String note;

        public Ex4OurFirstClassDog(String name, String breed, int ageInYears, String owner, String note){

                this.name = name;
                this.breed = breed;
                if(this.breed == null || this.breed.isEmpty()){
                        this.breed = "none";
                }
                this.ageInYears = ageInYears;

                this.owner = owner;
                if(this.owner==null || this.owner.isEmpty()){
                        this.owner = "none";
                }
                this.note = note;
                if(this.note == null || this.note.isEmpty()){
                        this.note = "none";
                }
        }


//|| owner == null ||  owner.isEmpty() || note == null  || note.isEmpty() ){


        public void print(){
                IO.println("My name is " + name +". My breed is "+ breed +". My age is "+  ageInYears +". My owner is " + owner + ". I am a "+ note);
        }
        public void  incrementAge(int age){
                this.ageInYears = this.ageInYears+1;
        }
        public void setOwner(String owner){
                this.owner=owner;
        }
        public  void setName(String name){
                this.name=name;
        }



}
