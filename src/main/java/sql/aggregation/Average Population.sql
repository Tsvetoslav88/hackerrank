--https://www.hackerrank.com/challenges/average-population/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

/*
 * Query the average population for all cities in CITY, rounded down to the nearest integer.
 */

SELECT FLOOR(AVG(population))
FROM city;