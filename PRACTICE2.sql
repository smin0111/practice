-- JOIN을 이용하여 여러 테이블을 조회 시에는 모든 컬럼에 테이블 별칭을 사용하는 것이 좋다.

-- 1. 직급이 대리이면서 아시아 지역에 근무하는 직원의 사번, 이름, 직급명, 부서명, 지역명, 급여를 조회하세요
select
	   a.EMP_ID as 사번
     , a.EMP_NAME as 이름
	 , b.JOB_NAME as 직급명
      , d.DEPT_TITLE as 부서명
      , c.LOCAL_NAME  as 지역명
     , a.SALARY as 급여
 from EMPLOYEE a
 inner join JOB b using (JOB_CODE)
 inner join department d on a.DEPT_CODE = d.DEPT_ID
 inner join location c on d.LOCATION_ID = c.LOCAL_CODE
 where a.JOB_CODE = 'J6' and a.DEPT_CODE not in ('D7','D8','D9');

-- 2. 주민번호가 70년대 생이면서 성별이 여자이고, 성이 전씨인 직원의 이름, 주민등록번호, 부서명, 직급명을 조회하세요.
select
	   a.EMP_NAME as 이름
	 , a.EMP_NO as 주민번호
     , c.DEPT_TITLE as 부서명
     , b.JOB_NAME as 직급명
   from EMPLOYEE a
 inner join JOB b using (JOB_CODE)
 inner join department c on a.DEPT_CODE = c.DEPT_ID
 where a.EMP_NO like '7_%-2%' and a.EMP_NAME like '전%';
     

-- 3. 이름에 '형'자가 들어가는 직원의 사번, 이름, 직급명을 조회하세요.
select
	   a.EMP_ID as 사번
	 , a.EMP_NAME as 이름
     , b.JOB_NAME as 직급명
   from EMPLOYEE a
 inner join JOB b using (JOB_CODE)
 where EMP_NAME like '%형%';

-- 4. 해외영업팀에 근무하는 직원의 이름, 직급명, 부서코드, 부서명을 조회하세요.
select
	   a.EMP_NAME as 이름
     , b.JOB_NAME as 직급명
     , a.DEPT_CODE as 부서코드
     , c.DEPT_TITLE as 부서명
   from EMPLOYEE a
 inner join JOB b using (JOB_CODE)
 inner join department c on a.DEPT_CODE = c.DEPT_ID
 where c.DEPT_TITLE like '해외영업%';
 
-- 5. 보너스포인트를 받는 직원의 이름, 보너스, 부서명, 지역명을 조회하세요.
-- 부서코드 null인 하동훈이 하나 더 있음
select
	   a.EMP_NAME as 이름
	 , a.BONUS as 보너스
     , c.DEPT_TITLE as 부서명
     , b.LOCAL_NAME  as 지역명
 from EMPLOYEE a
 inner join department c on a.DEPT_CODE = c.DEPT_ID
 inner join location b on c.LOCATION_ID = b.LOCAL_CODE
 where a.bonus is not null;
-- 6. 부서코드가 D2인 직원의 이름, 직급명, 부서명, 지역명을 조회하세오.
select
	   a.EMP_NAME as 이름
	 , b.JOB_NAME as 직급명
	 , d.DEPT_TITLE as 부서명
     , c.LOCAL_NAME  as 지역명
   from EMPLOYEE a
 inner join JOB b using (JOB_CODE)
 inner join department d on a.DEPT_CODE = d.DEPT_ID
 inner join location c on d.LOCATION_ID = c.LOCAL_CODE
 where a.DEPT_CODE = 'D2';

-- 7. 한국(KO)과 일본(JP)에 근무하는 직원의 이름, 부서명, 지역명, 국가명을 조회하세요.
select
	   a.EMP_NAME as 이름
	 , c.DEPT_TITLE as 부서명
     , b.LOCAL_NAME  as 지역명
     , d.NATIONAL_NAME as 국가명
 from EMPLOYEE a
 inner join department c on a.DEPT_CODE = c.DEPT_ID
 inner join location b on c.LOCATION_ID = b.LOCAL_CODE
 inner join nation d on b.NATIONAL_CODE = d.NATIONAL_CODE
 where d.NATIONAL_NAME IN ('한국', '일본');