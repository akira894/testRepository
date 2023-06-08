package com.labo.adapter.pattern.principle;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {

		switch (audioType.trim().toLowerCase()) {
			case "mp3":
				System.out.println("Playing VLC");
				break;
			case "mp4":
			case "vlc":
				mediaAdapter = new MediaAdapter(audioType);
				mediaAdapter.play(audioType, fileName);
				break;
			default:
				throw new IllegalArgumentException("Invalid media. '" + audioType + "' format is not supported");
		}

	}

}
