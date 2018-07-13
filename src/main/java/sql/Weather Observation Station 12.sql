--https://www.hackerrank.com/challenges/weather-observation-station-12/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

/**
 * Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
 */

SELECT DISTINCT city
FROM STATION
WHERE LOWER(SUBSTR(city,-1,1)) NOT IN ('a','e','i','o','u')
AND LOWER(SUBSTR(city,1,1)) NOT IN ('a','e','i','o','u');