#include<iostream>
using namespace std;
class pointer
{
public:
    int data;
    pointer *next;
    pointer()
    {
        next = NULL;
    }
};
int main()
{
    pointer *po1,*po2;
    po1->data = 7;
    
    return 0;
}