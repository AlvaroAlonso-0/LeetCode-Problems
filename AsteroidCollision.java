/*
 * We are given an array asteroids of integers representing asteroids in a row.
 * 
 * For each asteroid, the absolute value represents its size, and the sign represents 
 * its direction (positive meaning right, negative meaning left). Each asteroid moves 
 * at the same speed.
 * 
 * Find out the state of the asteroids after all collisions. If two asteroids meet, 
 * the smaller one will explode. If both are the same size, both will explode. Two 
 * asteroids moving in the same direction will never meet.
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int j = 0;
        for(int i=0; i<asteroids.length;i++){
            int asteroid = asteroids[i];
            while(j>0 && asteroids[j-1]>0 && asteroid<0 && asteroids[j-1]<Math.abs(asteroid)){
                j--;
            }
            if(j==0 || asteroid>0 || asteroids[j-1]<0){
                asteroids[j++] = asteroid;
            }else if(asteroids[j-1]==Math.abs(asteroid)){
                j--;
            }
        }     
        int[] result = new int[j];
        System.arraycopy(asteroids, 0, result, 0, j);
        return result;
    }
}