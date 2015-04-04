package ie.dit.backupapp.dao;

import ie.dit.backupapp.entities.Playlist;
import ie.dit.backupapp.entities.Track;
import ie.dit.backupapp.entities.UserLibrary;
import java.util.Collection;

public interface UserLibraryDAO {

	public UserLibrary getUserLibrary(String username);

	public void addUserLibrary(UserLibrary userLibrary);
	
	public void updateUserLibrary(UserLibrary userLibrary);
	
	public Collection<String> getAllPlaylistNames(String username);

	public Collection <Track> getTracksByPlaylistName(String username, String playlistName);

	public Collection <Playlist> getAllPlaylists(String username);

	public boolean updateTrack(Track track);

	public boolean deleteTrack(String username, int trackId);

	public boolean updatePlaylist(Playlist playlist);

	public boolean deletePlaylist(String username, int playlistId);

	public boolean addTrackToPlaylist(String username, String playlistName, String trackName);

	public boolean removeTrackFromPlaylist(String username, String playlistName, String trackName);
}
