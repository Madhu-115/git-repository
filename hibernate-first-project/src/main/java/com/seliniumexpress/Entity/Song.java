package com.seliniumexpress.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Song")
public class Song {
	
	 //SongId, SongName, Singer
 @Id
 @Column(name="SongId")
 //session.save(obj)help pusing the object to the db.
 //db generates a primary key and assigns it to the record to the pushed.
 //once the record has been inserted @GeneratedValue(Strategy = Identity) helps mapping the assigned pk from db to the java object
 //FYI  @GeneratedValue(strategy = GenerationType.IDENTITY)doesn't  generate 
 //doesn't generate the pk,it's only helps mapping the pk from db to java object after the save() called.
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int SongId;
 
 @Column(name="SongName")
 private String SongName;

 @Column(name="Singer")
 private String Artist;
 
public int getSongId() {
	return SongId;
}
public void setSongId(int songId) {
	SongId = songId;
}
public String getSongName() {
	return SongName;
}
public void setSongName(String songName) {
	SongName = songName;
}
public String getArtist() {
	return Artist;
}
public void setArtist(String artist) {
	Artist = artist;
}
public Song() {
	// TODO Auto-generated constructor stub
}
public Song(int songId, String songName, String artist) {
	super();
	SongId = songId;
	SongName = songName;
	Artist = artist;
}
@Override
public String toString() {
	return "Song [SongId=" + SongId + ", SongName=" + SongName + ", Artist=" + Artist + "]";
}
 
}
