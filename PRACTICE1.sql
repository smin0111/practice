-- 모든 행 모든 컬럼 조회
-- 1. EMPLOYEE테이블에서 모든 정보를 조회하세요
select * from EMPLOYEE;

-- 원하는 컬럼 조회
-- 2. EMPLOYEE 테이블의 사번, 이름을 조회하세요
select
	   EMP_ID
	 , EMP_NAME
  from EMPLOYEE;

-- 원하는 행 조회
-- 3. EMPLOYEE 테이블에서 부서코드가 D9인 사원을 조회하세요
select
	   EMP_ID
	 , EMP_NAME
     , DEPT_CODE
  from EMPLOYEE
 where DEPT_CODE = 'D9';

-- 원하는 행과 컬럼 조회
-- 4. EMPLOYEE 테이블에서 급여가 300만원 이상인 직원의 사번, 이름, 부서코드, 급여를 조회하세요
select
	    EMP_ID
	 , EMP_NAME
     , DEPT_CODE
     , SALARY
  from EMPLOYEE
 where SALARY >= 3000000;


-- 5. 부서코드가 D6이고 급여를 200만원보다 많이 받는 직원의 이름, 부서코드, 급여를 조회하세요
select
	   EMP_NAME
     , DEPT_CODE
     , SALARY
  from EMPLOYEE
 where SALARY >= 2000000
   and DEPT_CODE = 'D6';

-- NULL값 조회
-- 6. 보너스를 지급받지 않는 직원의 사번, 이름, 급여, 보너스를 조회하세요
select
	    EMP_ID
	 , EMP_NAME
     , SALARY
     , BONUS
  from EMPLOYEE
 where BONUS is null;

-- 7. EMPLOYEE테이블에서 급여를 350만원 이상, 550만원 이하를 받는 직원의 사번, 이름, 급여, 부서코드, 직급코드를 조회하세요
select
	    EMP_ID
	 , EMP_NAME
     , SALARY
     , DEPT_CODE
     , JOB_CODE
  from EMPLOYEE
 where SALARY between 3500000 and 5500000;

-- 8. EMPLOYEE테이블에서 성이 김씨인 직원의 사번, 이름, 입사일을 조회하세요
select
	    EMP_ID
	 , EMP_NAME
     , HIRE_DATE
  from EMPLOYEE
 where EMP_NAME like '김%';
 
-- 9. EMPLOYEE 테이블에서 '하'가 이름에 포함된 직원의 이름, 주민번호, 부서코드를 조회하세요
select
	   EMP_NAME
	 , EMP_NO
     , DEPT_CODE
  from EMPLOYEE
 where EMP_NAME like '%하%';

-- 10. EMPLOYEE테이블에서 전화번호 국번이 9로 시작하는 직원의 사번, 이름, 전화번호를 조회하세요
-- HINT!! 와일드 카드 사용 : _(글자 한자리), %(0개 이상의 글자)
select
	    EMP_ID
	 , EMP_NAME
     , PHONE
  from EMPLOYEE
 where PHONE like '___9%';

-- 11. EMPLOYEE테이블에서 전화번호 국번이 4자리 이면서 9로 시작하는 직원의 사번, 이름, 전화번호를 조회하세요
select
	   EMP_ID
	 , EMP_NAME
     , PHONE
  from EMPLOYEE
 where PHONE like '___9_______';

-- 12. 부서코드가 'D6' 이거나 'D8'인 직원의 이름, 부서, 급여를 조회하세요
-- HINT!! IN 연산자 : 비교하려는 값 목록에 일치하는 값이 있는지 확인
select
	   EMP_NAME
	 , DEPT_CODE
     , SALARY
  from EMPLOYEE
 where DEPT_CODE in ('D6','D8');
-- 13. 이씨성이 아닌 직원의 사번, 이름, 이메일주소를 조회하세요
select
	   EMP_ID
	 , EMP_NAME
     , EMAIL
  from EMPLOYEE
 where EMP_NAME not like ('이__') 
 order by EMP_NAME;

-- 14. J2직급의 급여 200만원 이상 받는 직원이거나 J7 직급인 직원의 이름, 급여, 직급코드를 조회하세요
select
	   EMP_NAME
	 , SALARY
     , JOB_CODE
  from EMPLOYEE
 where (JOB_CODE = 'J2' and SALARY >= 2000000)
	or (JOB_CODE = 'J7');
