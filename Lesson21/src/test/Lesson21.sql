/*1) найдите наиболее успешного\неуспевающего студента*/
select *
from student
where rating = (
    SELECT max(rating)
    FROM student);

select *
from student
where rating = (
    SELECT min(rating)
    FROM student);

/*2) сгруппируйте студентов по группам и посчитайте средний балл гпуппы,
выведите на экран название группы, количество студентов и средний балл*/
SELECT a.group_ID, b.name, COUNT(student_ID), AVG(rating) as avg
FROM student AS a, `groups` AS b
GROUP BY group_ID
ORDER BY group_ID asc;

/*3) найдите студентов у которых рейтинг выше среднего по группе\ по курсу*/
SELECT *
FROM student
WHERE rating > (SELECT AVG(rating) FROM student);

SELECT *
FROM student A
WHERE rating > (SELECT AVG(rating) FROM student WHERE group_ID = A.group_ID GROUP BY group_ID);

/*4) найдите студентов которые посещали только один курс*/
SELECT A.student_ID, A.`name`
FROM student A
         INNER JOIN studentscources B ON A.student_ID = B.student_ID
GROUP BY A.student_ID
HAVING COUNT(*) = 1;

/*5) выведите наиболее посещаемый курс*/
SELECT course_ID
FROM studentscources
GROUP BY course_ID
ORDER BY COUNT(course_ID) DESC;

/*6) найдите пожалуйста наиболее часто используемую оценку*/
SELECT rating, COUNT(rating)
FROM student S
GROUP BY rating
ORDER BY COUNT(rating) DESC limit 1;