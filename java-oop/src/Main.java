public class Main {
    private class Cars{
        private String color;
        private int numDoors;

        protected Cars(String color, int numDoors){
            this.color = color;
            this.numDoors = numDoors;
        }

        public String describe(){
            return "color: " + color + "; number of doors: " + numDoors;
        }
    }

    public class Sedan extends Cars{
        private String sedanColor;
        private int numOfDoors;
        public Sedan(String sedanColor, int numOfDoors){
            super(sedanColor, numOfDoors);
        }

        @Override
        public String describe(){
            return "Sedan " + super.describe();
        }
    }

    public static void main(String[] args){

        Main main = new Main();
        Cars sedan = main.new Sedan("black", 4);
        System.out.println(sedan.describe());

    }


}
