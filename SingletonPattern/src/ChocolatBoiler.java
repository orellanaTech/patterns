public class ChocolatBoiler {

    private boolean empty;

    private  boolean boiled;

    private static ChocolatBoiler singletonBoiler;

    //If the singleton is always create in the application instantiate it in attribute
    //also being static is thread secure
//    private static ChocolatBoiler alwaysCreatedSingleton = new ChocolatBoiler();
//
//    public ChocolatBoiler getInstance(){
//        return alwaysCreatedSingleton;
//    }

    private ChocolatBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolatBoiler getInstance(){

        if (singletonBoiler == null){
            singletonBoiler = new ChocolatBoiler();
        }
        return singletonBoiler;
    }

    //Multithreading security (performance is expensive, only use synchronized when having problems)
//    public synchronized ChocolatBoiler getInstance(){
//
//        if (singletonBoiler == null){
//            this.singletonBoiler = new ChocolatBoiler();
//        }
//        return singletonBoiler;
//    }

    public void fill(){
        if (isEmpty()){
            System.out.println("filling...");
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            System.out.println("darining...");
            empty = true;
            boiled = false;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            System.out.println("boiling...");
            empty = false;
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
