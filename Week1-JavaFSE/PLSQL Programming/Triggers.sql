CREATE TABLE Employee_Audit (
    message VARCHAR2(100)
);
CREATE OR REPLACE TRIGGER employee_trigger

AFTER INSERT ON Employee

FOR EACH ROW

BEGIN

    INSERT INTO Employee_Audit
    VALUES('Employee Added Successfully');

END;
/
INSERT INTO Employee
VALUES (104,'Arun',50000);

COMMIT;
SELECT * FROM Employee_Audit;