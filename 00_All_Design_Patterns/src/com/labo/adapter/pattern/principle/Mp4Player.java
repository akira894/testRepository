package com.labo.adapter.pattern.principle;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// DO NOTHING
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

}
