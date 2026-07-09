CREATE TABLE Employee (
    emp_id NUMBER,
    emp_name VARCHAR2(50),
    salary NUMBER
);
INSERT INTO Employee VALUES (101,'Rahul',45000);
INSERT INTO Employee VALUES (102,'Priya',55000);
INSERT INTO Employee VALUES (103,'Amit',60000);

COMMIT;
SET SERVEROUTPUT ON;

DECLARE

    CURSOR emp_cursor IS
        SELECT emp_name, salary FROM Employee;

    v_name Employee.emp_name%TYPE;
    v_salary Employee.salary%TYPE;

BEGIN

    OPEN emp_cursor;

    LOOP

        FETCH emp_cursor INTO v_name, v_salary;

        EXIT WHEN emp_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(v_name || ' - ' || v_salary);

    END LOOP;

    CLOSE emp_cursor;

END;
/