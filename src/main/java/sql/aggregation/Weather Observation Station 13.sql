--https://www.hackerrank.com/challenges/weather-observation-station-13/problem

/**
 *Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than  and less than . Truncate your answer to  decimal places. 
 */
SELECT ROUND(SUM(Lat_N), 4)
FROM STATION
WHERE Lat_N > 38.7880 AND Lat_N < 137.2345;