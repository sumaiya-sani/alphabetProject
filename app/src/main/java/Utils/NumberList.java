package Utils;

public class NumberList {
    int numberImage;
    int audioRes;
    int numberName;

    public NumberList(int numberImage, int audioRes, int numberName) {
        this.numberImage = numberImage;
        this.audioRes = audioRes;
        this.numberName = numberName;
    }

    public NumberList(int numberImage) {
        this.numberImage = numberImage;
    }
    public NumberList() {

    }


    public int getNumberImage() {
        return numberImage;
    }

    public void setNumberImage(int numberImage) {
        this.numberImage = numberImage;
    }

    public int getAudioRes() {
        return audioRes;
    }

    public void setAudioRes(int audioRes) {
        this.audioRes = audioRes;
    }

    public int getNumberName() {
        return numberName;
    }

    public void setNumberName(int numberName) {
        this.numberName = numberName;
    }
}
