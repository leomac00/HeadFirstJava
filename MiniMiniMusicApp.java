import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4); // Defines "Jukebox" to play

            Track track = seq.createTrack(); // Define track to be played
            
            ShortMessage msg1 = new ShortMessage(NOTE_ON, 1, 44, 100); // Defines what note to start playing (msg type (on/off), channel to play, note to play, velocity)
            MidiEvent noteOn = new MidiEvent(msg1, 1); // Define what msg to play to start playing at the provided beat
            track.add(noteOn);

            ShortMessage msg2 = new ShortMessage(NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);

            player.setSequence(seq); // Inserts sequence at the sequencer
            player.start(); // Start playing it
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
