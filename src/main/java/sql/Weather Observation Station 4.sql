--https://www.hackerrank.com/challenges/weather-observation-station-4/problem

/**
 * Let N be the number of CITY entries in STATION, and N' let  be the number of distinct CITY names in STATION; query the value of N - N' from STATION. 
 * In other words, find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
*/

SELECT COUNT(city) - COUNT(DISTINCT city)
FROM station;