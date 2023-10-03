/*
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked 
 * except for room 0. Your goal is to visit all the rooms. However, you 
 * cannot enter a locked room without having its key.
 * 
 * When you visit a room, you may find a set of distinct keys in it. Each 
 * key has a number on it, denoting which room it unlocks, and you can 
 * take all of them with you to unlock the other rooms.
 * 
 * Given an array rooms where rooms[i] is the set of keys that you can obtain 
 * if you visited room i, return true if you can visit all the rooms, or 
 * false otherwise.
 */

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] keys = new boolean[rooms.size()];
        dfs(rooms.get(0), 0, rooms, keys);
        for (int i = 0; i < keys.length; i++) {
            if (!keys[i])
                return false;
        }
        return true;
    }

    private void dfs(List<Integer> keysInRoom, int room, List<List<Integer>> rooms, boolean[] keys) {
        keys[room] = true;
        for (Integer i : keysInRoom) {
            if (!keys[i]) {
                dfs(rooms.get(i), i, rooms, keys);
            }
        }
    }
}