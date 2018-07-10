--https://www.hackerrank.com/challenges/weather-observation-station-6/problem

/**
* Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
*/

SELECT DISTINCT city
FROM station
WHERE LOWER(SUBSTR(city,1,1)) IN ('a','e','i','o','u');