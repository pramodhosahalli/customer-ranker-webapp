package com.rank.customerranker.controller;

import com.rank.customerranker.entity.Content;
import com.rank.customerranker.util.ContentType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.*;

@RestController
public class ContentController {

    private List<Content> music_contents = Arrays.asList(new Content(1L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(1L, ContentType.SONG, 4, "TAKE YOU DANCING", "Mike", Timestamp.valueOf("2022-08-01 09:10:15")),
            new Content(2L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(3L, ContentType.SONG, 4, "BUTTER", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(4L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(5L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")), new Content(5L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(5L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(5L, ContentType.SONG, 4, "STAY", "Mike", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(6L, ContentType.SONG, 4, "AS IT WAS", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(7L, ContentType.SONG, 4, "STAY", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(8L, ContentType.SONG, 4, "AS IT WAS", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(9L, ContentType.SONG, 4, "STAY", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(10L, ContentType.SONG, 4, "STAY", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(11L, ContentType.SONG, 4, "AS IT WAS", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(12L, ContentType.SONG, 4, "STAY", "Ross", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(13L, ContentType.SONG, 4, "STAY", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(14L, ContentType.SONG, 4, "BUTTER", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(15L, ContentType.SONG, 4, "STAY", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(16L, ContentType.SONG, 4, "STAY", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(17L, ContentType.SONG, 4, "BUTTER", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(18L, ContentType.SONG, 4, "STAY", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(19L, ContentType.SONG, 4, "STAY", "Harvey", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(20L, ContentType.SONG, 4, "AS IT WAS", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(21L, ContentType.SONG, 4, "STAY", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(22L, ContentType.SONG, 4, "STAY", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(23L, ContentType.SONG, 4, "STAY", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(24L, ContentType.SONG, 4, "THE DRUM", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(25L, ContentType.SONG, 4, "AS IT WAS", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(26L, ContentType.SONG, 4, "STAY", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(27L, ContentType.SONG, 4, "STAY", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(28L, ContentType.SONG, 4, "THE DRUM", "Spectre", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(29L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(30L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(31L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(32L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(33L, ContentType.SONG, 4, "AS IT WAS", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(34L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(35L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(36L, ContentType.SONG, 4, "AS IT WAS", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(37L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(38L, ContentType.SONG, 4, "AS IT WAS", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(39L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(40L, ContentType.SONG, 4, "AS IT WAS", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(41L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(42L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(43L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(44L, ContentType.SONG, 4, "AS IT WAS", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(45L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(46L, ContentType.SONG, 4, "INDUSTRY BABY", "Walter", Timestamp.valueOf("2022-08-01 09:01:15")),
            new Content(47L, ContentType.SONG, 4, "STAY", "Dustin", Timestamp.valueOf("2022-08-01 09:01:15")));


    private HashMap<String, Integer> userSongsMap = new HashMap<>();
    private HashMap<String, Integer> songsPlayedMap = new HashMap<>();

    @GetMapping("/getAllSongs")
    public ResponseEntity<List<Content>> getAllSongs() {
        return ResponseEntity.ok(music_contents);
    }

    @GetMapping("/getAllUsersByRank")
    public ResponseEntity<Map<String, Integer>> getAllUserByRank() {
        computeUserSongsMap();
        return ResponseEntity.ok(sortBySongsListened(userSongsMap));
    }

    @GetMapping("/getAllSongsByRank")
    public ResponseEntity<Map<String, Integer>> getAllSongsByRank() {
        computeSongsPlayedMap();
        return ResponseEntity.ok(sortBySongsListened(songsPlayedMap));
    }

    @GetMapping("/getUserRank/{userId}")
    public ResponseEntity<Integer> getUserRank(@PathVariable String userId) {
        int rank = 1;
        computeUserSongsMap();
        rank = getUserRank(userId, rank);
        return ResponseEntity.ok(rank);
    }

    private int getUserRank(String userId, int rank) {
        HashMap<String, Integer> userRankedMap = sortBySongsListened(userSongsMap);
        for (Map.Entry<String, Integer> mapElement : userRankedMap.entrySet()) {
            if (mapElement.getKey().equals(userId)) {
                break;
            }
            rank++;
        }
        return rank;
    }

    private void computeUserSongsMap() {
        music_contents.forEach(music -> userSongsMap.merge(music.getUser_id(), 1, Integer::sum));
    }

    private void computeSongsPlayedMap() {
        music_contents.forEach(music -> songsPlayedMap.merge(music.getContentName(), 1, Integer::sum));
    }

    private HashMap<String, Integer> sortBySongsListened(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> m : list) {
            temp.put(m.getKey(), m.getValue());
        }
        return temp;
    }

}
