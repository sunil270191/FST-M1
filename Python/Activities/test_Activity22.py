import pytest

def test_Addition():
    num1= 15
    num2= 20
    sum=num1+num2
    assert sum==35

def test_multiplication():
    num1=10
    num2=20
    multi=num1*num2
    assert multi==200
@pytest.mark.activity
def test_subtraction():
    num1=25
    num2=10
    subt=num1-num2
    assert subt==15
@pytest.mark.activity
def test_division():
    num1=100
    num2=4
    div=num1/num2
    assert div==25
