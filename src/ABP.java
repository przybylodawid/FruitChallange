public class ABP {

    public static void main(String[] args) {
        int scopeMin =-15;
        int scopeMax =10;

        int numberOfSolutions = 0;
        for (double apple = scopeMin; apple <= scopeMax; apple++){
            for (double banana = scopeMin; banana <= scopeMax; banana++){
                for (double pinaple = scopeMin; pinaple <= scopeMax; pinaple++){
                    if (banana !=0 && apple!=0 && pinaple !=0 && ((apple/(banana+pinaple)) + (banana/(apple+pinaple)) + (pinaple/(apple+banana))) ==4){
                        System.out.println("apple= " + apple + " banana= " + banana + " pinaple= "+pinaple);
                        System.out.println("equasion: "+ ((apple/(banana+pinaple)) + (banana/(apple+pinaple)) + (pinaple/(apple+banana))));
                        numberOfSolutions++;
                    }
                }
            }
        }
        if(numberOfSolutions>0){
            System.out.println("I found: " + numberOfSolutions + " solutions in scope between " + scopeMin + " : "+ scopeMax);
        }
        else {
            System.out.println("No solution in integer numbers in scope: " + scopeMin + " : " + scopeMax);
        }
    }
}
