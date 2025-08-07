-- 1. 부서코드가 노옹철 사원과 같은 소속의 직원 명단 조회하세요.
SELECT 
	   EMP_NAME
  from EMPLOYEE
 where DEPT_CODE = 'D9'; 
-- 2. 전 직원의 평균 급여보다 많은 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
select
	   EMP_ID
	 , EMP_NAME
     , JOB_CODE
     , SALARY
  FROM EMPLOYEE
 WHERE SALARY > (select avg(SALARY) from employee);
-- 3. 노옹철 사원의 급여보다 많이 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여를 조회하세요.
select
	   EMP_ID
	 , EMP_NAME
     , DEPT_CODE
     , JOB_CODE
     , SALARY
  FROM EMPLOYEE
 WHERE SALARY > (select SALARY from employee where EMP_NAME = '노옹철');
-- 4. 가장 적은 급여를 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여, 입사일을 조회하세요.
select
	   EMP_ID
	 , EMP_NAME
     , JOB_CODE
     , SALARY
     , HIRE_DATE
  FROM EMPLOYEE
 order by salary asc
 limit 1;
-- *** 서브쿼리는 SELECT, FROM, WHERE, HAVING, ORDER BY절에도 사용할 수 있다.

-- 5. 부서별 최고 급여를 받는 직원의 이름, 직급코드, 부서코드, 급여 조회하세요.
SELECT 
	   EMP_NAME
	 , JOB_CODE
     , DEPT_code
     , salary
  FROM employee e
 WHERE salary = (
				SELECT MAX(salary)
				  FROM employee
				 WHERE ((dept_code = e.dept_code) or (dept_code is null and e.dept_code is null)))
 ORDER BY salary DESC;

-- *** 여기서부터 난이도 극상

-- 6. 관리자에 해당하는 직원에 대한 정보와 관리자가 아닌 직원의 정보를 추출하여 조회하세요.
-- 사번, 이름, 부서명, 직급, '관리자' AS 구분 / '직원' AS 구분
-- HINT!! is not null, union(혹은 then, else), distinct
SELECT DISTINCT manager_id
    FROM employee
    WHERE manager_id IS NOT NULL;
 
SELECT 
    a.EMP_ID AS 사번,
    a.EMP_NAME AS 이름,
    b.dept_title AS 부서명,
    c.job_name AS 직급,
    '관리자' AS 구분
FROM employee a
JOIN department b ON a.dept_code = b.dept_id
JOIN job c USING (job_code)
WHERE a.EMP_ID IN (
    SELECT DISTINCT manager_id
    FROM employee
    WHERE manager_id IS NOT NULL)

UNION

SELECT 
    a.EMP_ID AS 사번,
    a.EMP_NAME AS 이름,
    b.dept_title AS 부서명,
    c.job_name AS 직급,
    '직원' AS 구분
FROM employee a
JOIN department b ON a.dept_code = b.dept_id
JOIN job c USING (job_code)
WHERE a.EMP_ID NOT IN (
    SELECT DISTINCT manager_id
    FROM employee
    WHERE manager_id IS NOT NULL)
 order by 구분 asc, 사번;

-- 7. 자기 직급의 평균 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
-- 단, 급여와 급여 평균은 만원단위로 계산하세요.
-- HINT!! round(컬럼명, -5)
SELECT 
    a.EMP_ID,
    a.EMP_NAME,
    a.JOB_CODE,
    a.SALARY
FROM employee a
JOIN (
    SELECT 
        JOB_CODE, 
        ROUND(AVG(SALARY), -5) AS avg_salary
    FROM employee
    GROUP BY JOB_CODE
) avg_table
ON a.JOB_CODE = avg_table.JOB_CODE
WHERE ROUND(a.SALARY, -5) = avg_table.avg_salary;


-- 8. 퇴사한 여직원과 같은 부서, 같은 직급에 해당하는 직원의 이름, 직급코드, 부서코드, 입사일을 조회하세요.
SELECT 
    a.EMP_NAME,
    a.JOB_CODE,
    a.DEPT_CODE,
    a.HIRE_DATE
FROM EMPLOYEE a
WHERE a.ENT_YN = 'N'  -- 재직자
  AND (a.DEPT_CODE, a.JOB_CODE) IN (
    SELECT DISTINCT DEPT_CODE, JOB_CODE
    FROM EMPLOYEE
    WHERE ENT_YN = 'Y'
      AND SUBSTRING(EMP_NO, 8, 1) IN ('2', '4')
  );


-- 9. 급여 평균 3위 안에 드는 부서의 부서 코드와 부서명, 평균급여를 조회하세요.
-- HINT!! limit
SELECT 
    b.DEPT_ID,
    b.DEPT_TITLE,
    ROUND(AVG(a.SALARY), 4) AS 평균급여
FROM EMPLOYEE a
JOIN DEPARTMENT b ON a.DEPT_CODE = b.DEPT_ID
GROUP BY b.DEPT_ID, b.DEPT_TITLE
ORDER BY 평균급여 DESC
LIMIT 3;


-- 10. 부서별 급여 합계가 전체 급여의 총 합의 20%보다 많은 부서의 부서명과, 부서별 급여 합계를 조회하세요.
SELECT 
    b.DEPT_TITLE AS 부서명,
    SUM(a.SALARY) AS 부서별_급여_합계
FROM EMPLOYEE a
JOIN DEPARTMENT b ON a.DEPT_CODE = b.DEPT_ID
GROUP BY b.DEPT_TITLE
HAVING SUM(a.SALARY) > (
    SELECT SUM(SALARY) * 0.20
    FROM EMPLOYEE
);
