package Utils;

public class StoryItem {
    public int mAudioResource;
    public int mImageResource;
    public int title;
    public int mainStory;
    private  final static int NO_IMAGE_PROVIDE=-1;

    public StoryItem() {

    }

    public StoryItem(int mAudioResource, int mImageResource, int title, int mainStory) {
        this.mAudioResource = mAudioResource;
        this.mImageResource = mImageResource;
        this.title = title;
        this.mainStory = mainStory;
    }

    public StoryItem(int mImageResource, int title,int mainStory) {
        this.mImageResource = mImageResource;
        this.title = title;
        this.mainStory=mainStory;

    }

    public int getMainStory() {
        return mainStory;
    }

    public void setMainStory(int mainStory) {
        this.mainStory = mainStory;
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
    public Boolean hasImage(){
        return  mImageResource !=NO_IMAGE_PROVIDE;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }
}
