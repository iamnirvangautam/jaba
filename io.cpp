#include<iostream>
using namespace std;
class cars
{
public:
    string name;
    cars *next;
    cars(string str)
    {
        name = str;
        next = NULL;
    }
};
int main()
{
    cars* c1 = new cars("lambo");
    cars* c2 = new cars("lexus");
    c1->nextcar=&c2;
    return 0;
}