package brige;

public abstract class OperatingSystemVersion {
    //聚合另一个维度的对象
    protected VideoFile videoFile;

    public OperatingSystemVersion(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
