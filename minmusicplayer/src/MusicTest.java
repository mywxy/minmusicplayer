import javax.sound.midi.*;

public class MusicTest {
    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();//这个对象用来将MIDI信息组合成“乐曲”
            System.out.println("We got a sequencer");
        }catch(MidiUnavailableException ex){
            System.out.println("Bummer");
        }
    }

    public static void main(String[] args) {
        MusicTest mt = new MusicTest();
        mt.play();
    }

}
