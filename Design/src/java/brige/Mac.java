package brige;

public class Mac extends OperatingSystemVersion{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        //调用VideoFile对象的解码操作
        videoFile.decode(fileName);
    }
}
