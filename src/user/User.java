package user;

import soal.Soal;
import static soal.Soal.level;

public class User {
    
    
    // Attribut 
    private String nama;
    private int skor;
    private int lives;
    private static int level;
    
    // Konstruktor
    public User() {
        nama = "Kelompok 4";
        skor = 0;
        lives = 3;
        
    }
    
    // Method
    public void setNama(String inputNama){
        nama = inputNama;
    }
    
    public String getNama(){
        return nama;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
    
        public static int getLevel() {
        return level;
    }

    public static void setLevel(int skor) {
        if (skor <= 100) {
            level = 1;
        }
        
        else if ((skor >= 101) && (skor <= 200)) {
            Soal.level = 2;
        }

        else if ((skor >= 201) && (skor <= 300)) {
            Soal.level = 3;
        }
    }
    
}
