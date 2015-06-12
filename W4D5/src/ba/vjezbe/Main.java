package ba.vjezbe;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Singer a1 = new Singer("Dino Merlin", false, 1980, "Pop");
		System.out.println("Artist name: " + a1.name);
		System.out.println("Is it a band: " + a1.isBand);
		System.out.println("When did he start do sing: " + a1.activationYear);
		System.out.println("Music genre: " + a1.genre);

		Singer a2 = new Singer("Oliver Dragojevic", false, 1970, "Pop");
		System.out.println("Artist name: " + a2.name);
		System.out.println("Is it a band: " + a2.isBand);
		System.out.println("When did he start do sing: " + a2.activationYear);
		System.out.println("Music genre: " + a2.genre);

		Song song1 = new Song(a1, "Ruza", 2014, "Pop");
		System.out.println("Artist name: " + a1.name);
		System.out.println("Song name: " + song1.songName);
		System.out.println("Year of release: " + song1.yearOfRelease);
		System.out.println("Music genre: " + song1.genre);

		Song song3 = new Song(a1, "Rane", 2014, "Pop");
		System.out.println("Artist name: " + a1.name);
		System.out.println("Song name: " + song3.songName);
		System.out.println("Year of release: " + song3.yearOfRelease);
		System.out.println("Music genre: " + song3.genre);

		Song song2 = new Song(a2, "Cesarica", 1995, "Pop");
		System.out.println("Artist name: " + a2.name);
		System.out.println("Song name: " + song2.songName);
		System.out.println("Year of release: " + song2.yearOfRelease);
		System.out.println("Music genre: " + song2.genre);

		Song[] albumSongs = new Song[2];
		albumSongs[0] = new Song(a1, "Ruza", 2014, "Pop");
		albumSongs[1] = new Song(a1, "Rane", 2014, "Pop");

		Song[] albumSongs2 = new Song[2];
		albumSongs2[0] = new Song(a2, "Cesarica", 1995, "Pop");
		albumSongs2[1] = new Song(a2, "Kad mi dodjes ti", 2005, "Pop");

		Album alb1 = new Album("Hotel Nacional", a1, albumSongs, "Pop");
		Album alb2 = new Album("Cesarica", a2, albumSongs2, "Pop");

		Album[] albums = new Album[2];
		albums[0] = new Album("Hotel Nacional", a1, albumSongs, "Pop");
		albums[1] = new Album("Cesarica", a2, albumSongs2, "Pop");

		System.out.println("Same authors comparing songs: " + song1.songName
				+ " and " + song2.songName + ": " + isSameAuthor(song1, song2));

		System.out.println("Is this song made by Band: "
				+ ifFromSoloAuthor(song1));

		System.out.println("The older song is: "
				+ getOlderSong(song1, song2).songName);

		System.out.println("There is " + countGenreNumber(alb1, "Pop")
				+ " songs of that genre in this album");

		printAlbumInformation(albums, albumSongs2[1]);
	}

	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.musicArtist.name.equals(s2.musicArtist.name)) {
			return true;
		}
		return false;
	}

	public static boolean ifFromSoloAuthor(Song s1) {
		if (s1.musicArtist.isBand == true) {
			return true;
		} else
			return false;
	}

	public static Song getOlderSong(Song s1, Song s2) {
		return (s1.yearOfRelease > s2.yearOfRelease) ? s2 : s1;
	}

	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;

		for (int i = 0; i < a.artistSongs.length; i++) {
			if (genre.equals(a.artistSongs[i].genre)) {
				counter++;
			}
		}
		return counter;

	}

	public static void printAlbumInformation(Album[] a, Song s) {
		Album al1=null;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].artistSongs.length; j++) {
				
				if (s.songName.equals(a[i].artistSongs[i].songName)) {
					
					al1=a[i];
				}
			}
		}System.out.println(al1.nameAlbum);
	}

}
