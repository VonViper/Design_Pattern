package Design_Pattern.F1.src.main;

public class VoitureFactory {

    public static VoitureDuChampionnatDeFormuleUn getVoitureDuChampionnatDeFormuleUn (VoitureType type) {
        if (VoitureType.mercedes.equals(type))
            return new Mercedes();
        else if (VoitureType.ferrari.equals(type))
            return new Ferrari();
        else if (VoitureType.renault.equals(type))
            return new Renault();
        else
            throw new IllegalArgumentException();
    }
}