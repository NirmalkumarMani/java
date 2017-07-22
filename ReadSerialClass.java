public class SerialClass implements Serializable {
    private Date currentTime;

    public SerialClass() {
        currentTime = Calendar.getInstance().getTime();
    }

    public Date getCurrentTime() {
        return currentTime;
    }
}
public class PersistSerialClass {

    public static void main(String [] args) {
        String filename = "time.ser";

        if(args.length > 0){
            filename = args[0];
        }
		
        PersistSerialClass time = new PersistSerialClass();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try{
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
     }
 }


//Class to read the time from a flat file time.ser
public class ReadSerialClass {

    public static void main(String [] args) {
        String filename = "time.ser";

        if(args.length > 0){
            filename = args[0];
        }
		
        PersistSerialClass time = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try{
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            time = (PersistSerialClass)in.readObject();
            in.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }

        // print out restored time
        System.out.println("Restored time: " + time.getTime());

        // print out the current time
        System.out.println("Current time: " 
			+ Calendar.getInstance().getTime());

     }
 }