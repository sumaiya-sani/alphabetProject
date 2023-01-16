package Utils;

public class Listitem {
    public int alphabetImage;
    public int audioRes;
    public int alphaName;

    public Listitem() {

    }
    public Listitem(int alphabetImage) {
        this.alphabetImage = alphabetImage;

    }

    public Listitem(int alphabetImage, int audioRes, int alphaName) {
        this.alphabetImage = alphabetImage;
        this.audioRes = audioRes;
        this.alphaName = alphaName;
    }

    public int getAlphabetImage() {
        return alphabetImage;
    }

    public void setAlphabetImage(int alphabetImage) {
        this.alphabetImage = alphabetImage;
    }

    public int getAudioRes() {
        return audioRes;
    }

    public void setAudioRes(int audioRes) {
        this.audioRes = audioRes;
    }

    public int getAlphaName() {
        return alphaName;
    }

    public void setAlphaName(int alphaName) {
        this.alphaName = alphaName;
    }
}
