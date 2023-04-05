import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sq = MidiSystem.getSequencer();
            System.out.println("Sucessfully initialized the sequencer");
        } catch (MidiUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
