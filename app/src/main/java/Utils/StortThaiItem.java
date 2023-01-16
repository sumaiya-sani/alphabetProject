package Utils;

public class StortThaiItem {
    public int mAudioResource;
    public int mImageResource;
    public int title;
    private  final static int NO_IMAGE_PROVIDE=-1;

    public StortThaiItem(int mImageResource, int title) {
        this.mImageResource = mImageResource;
        this.title = title;
    }

    public StortThaiItem() {

    }

    public int getmAudioResource() {
        return mAudioResource;
    }

    public void setmAudioResource(int mAudioResource) {
        this.mAudioResource = mAudioResource;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public Boolean hasImage(){
        return  mImageResource !=NO_IMAGE_PROVIDE;
    }
}
