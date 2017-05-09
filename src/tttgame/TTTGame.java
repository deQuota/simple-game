/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tttgame;

import java.io.FileInputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Nisal Waduge
 */
public class TTTGame {

    /**
     * @param args the command line arguments
     */
    static AudioStream as;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();

        MainFrame2 mf2 = new MainFrame2();
        for (int i = 0; i < 9; i++) {
            mf2.mem[i] = Character.lowSurrogate(i);
        }
        mf.setVisible(true);
        try {
            for (int i = 0;; i++) {
                FileInputStream fi = new FileInputStream("C:\\Users\\Nisal Waduge\\Desktop\\TTTGame\\smw_castle_clear.wav");
                as = new AudioStream(fi);
                AudioPlayer.player.start(as);
                Thread.sleep(8000);
            }

        } catch (Exception e) {

        }

       // mf2.setVisible(true);
    }

}
