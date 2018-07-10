--https://www.hackerrank.com/challenges/weather-observation-station-7/problem?h_r=next-challenge&h_v=zen

/*
* Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
*/

SELECT DISTINCT city
FROM STATION
WHERE LOWER(SUBSTR(city,-1,1)) IN ('a','e','i','o','u');