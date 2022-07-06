import pytest
'''
@pytest.fixture()
def num_list():
    #declaring list
    list=[0,1,2,3,4,5,6,7,8,9,10]
    # returning list value
    return list
'''
def test_sum_num_list(num_list):
    sum=0

    for n in num_list:
        sum+=n
#Assertion
    assert sum==55


