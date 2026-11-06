public  class Main{
    public  static void main(String[] arg){


        Ex4OurFirstClassDog eddy = new Ex4OurFirstClassDog("Eddy", "", 10, "", "Cute dog");
        eddy.print();
        IO.println(eddy.name + " is a " + eddy.note + "!");

        eddy.setOwner("Late");
        IO.println(eddy.name + " is a " + eddy.note + "!" + " as "+eddy.owner + " said" );
        eddy.incrementAge(3);
        eddy.print();

    }
    }
