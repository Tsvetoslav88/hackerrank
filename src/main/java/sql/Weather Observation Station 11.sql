--https://www.hackerrank.com/challenges/weather-observation-station-11/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

/**
 * Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates
 */

SELECT DISTINCT city
FROM STATION
WHERE LOWER(SUBSTR(city,-1,1)) NOT IN ('a','e','i','o','u')
OR LOWER(SUBSTR(city,1,1)) NOT IN ('a','e','i','o','u');