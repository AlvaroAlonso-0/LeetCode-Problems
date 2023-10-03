/*
 * There are n cities. Some of them are connected, while some are not. 
 * If city a is connected directly with city b, and city b is connected 
 * directly with city c, then city a is connected indirectly with city c.
 * 
 * A province is a group of directly or indirectly connected cities 
 * and no other cities outside of the group.
 * 
 * You are given an n x n matrix isConnected where isConnected[i][j] 
 * = 1 if the ith city and the jth city are directly connected, and 
 * isConnected[i][j] = 0 otherwise.
 * 
 * Return the total number of provinces.
 */

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;
        boolean[] visited = new boolean[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(isConnected, i, visited);
                count++;
            }
        }
        return count;
    }
    private void dfs(int[][] isConnected, int city, boolean[] visited) {
        visited[city] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[city][i] == 1 && !visited[i]) {
                dfs(isConnected, i, visited);
            }
        }
    }
}