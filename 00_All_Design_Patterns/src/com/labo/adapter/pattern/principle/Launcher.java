package com.labo.adapter.pattern.principle;

public class Launcher {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Fear of the dark.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "War Pigs.vlc");
		audioPlayer.play("avi", "memory of summer 1998.avi");
		
	}

}
