public class SnackDispenser {
    private SnackDispenser nextDispenser;
    private Snack snack;

    public SnackDispenser(Snack snack){
        this.snack=snack;
        nextDispenser = null;
    }
    public SnackDispenser(Snack snack, SnackDispenser nextDispenser){
        this.snack=snack;
        this.nextDispenser=nextDispenser;
    }

    public Snack handleRequest(String snackName){
        if(snackName==snack.getName()){
            return snack;
        }

            if(nextDispenser!=null){
                return nextDispenser.handleRequest(snackName);
            }
        System.out.println("Snack not found.");
        return null;
    }
    public void setNext(SnackDispenser nextDispenser){
        this.nextDispenser=nextDispenser;
    }

}
