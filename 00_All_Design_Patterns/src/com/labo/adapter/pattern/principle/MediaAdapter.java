package com.labo.adapter.pattern.principle;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		switch (audioType.trim().toLowerCase()) {
			case "vlc": 
				advancedMediaPlayer = new VlcPlayer();
				break;
			case "mp4": 
				advancedMediaPlayer = new Mp4Player();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + audioType);
		}
		
	}
	
	
	@Override
	public void play(String audioType, String fileName) {
		switch (audioType.trim().toLowerCase()) {
			case "vlc": 
				advancedMediaPlayer.playVlc(fileName);
				break;
			case "mp4": 
				advancedMediaPlayer.playMp4(fileName);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + audioType);
		}
	}

}
