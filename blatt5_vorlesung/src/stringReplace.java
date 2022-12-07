

public class stringReplace {
    private char[] geheim;

    public char[] getArray() { // getter-Methode
        return geheim;
    }
    public void setArray(char[] geheim) { // setter-Methode
        this.geheim = geheim;
    }

    public stringReplace () {
        int zahl = 0;
        geheim = new char [((int)'z')];
        for(char i ='a';i<'z';i++) {
            geheim[i] = "DEFGHIJKLMNOPQRSTUVWXYZABC".charAt(zahl);
            zahl++;
        }
    }

    public stringReplace (String geheimniss) {
        int zahl = 0;
        geheim = new char [((int)'z')];
        for(char i ='a';i<'z';i++) {
            geheim[i] = geheimniss.charAt(zahl);
            zahl++;
        }
    }

    public String verschluesseln(String klartext) {
        klartext = klartext.toLowerCase();
        for(char i ='a';i<'z';i++) {
            klartext = klartext.replace(i,geheim[i]); // hier wird das "ursprüngliche" Alphabet durch Geheimalphabet das im [i] gespeichert ist ersetzt

        }
        return klartext;

    }

    public String entschluesseln(String geheimtext) {
        geheimtext = geheimtext.toUpperCase();
        for(char i ='a';i<'z';i++) {
            geheimtext = geheimtext.replace(geheim[i],i); // hier wird das Geheimalphabet  durch das "ursprüngliche" Aplhabet ersetzt

        }
        return geheimtext;

    }

}