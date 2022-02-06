-- https://www.hackerrank.com/challenges/population-density-difference/problem?isFullScreen=false
select
    (max(population) - MIN(population))
from
    city;