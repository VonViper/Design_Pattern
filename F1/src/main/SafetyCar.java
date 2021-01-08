package Design_Pattern.F1.src.main;

public class SafetyCar implements VoitureDuChampionnatDeFormuleUn {

    private SafetyCar(){}
 
    private static SafetyCar instance = new SafetyCar();
     
    public static SafetyCar getInstance()
    {
        return instance;
    }

    @Override
    public void accelerer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void freiner() {
        // TODO Auto-generated method stub

    }

    @Override
    public void tourner() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return "";
    }
}