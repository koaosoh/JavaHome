'''
Created on Sep 11, 2015

@author: Kent
'''
'''
for i in range(10):
    if i==1:
        print(i, " apple\t" , end=""),
    else:
        print(i, " apples\t" , end=""),
        
# Using if statement to single out a quantity statement in a loop
'''
'''
i=0
while i**3 < 500:
    print(i, "\t" , end=" ")
    print(i**2, "\t" , end=" ")
    print(i**3, end=" ")
    i = i + 1
'''
'''
def main():
    x=input("Input the first integer")
    y=input("Input the second integer")
    print ("The GCD of ", x, " and ", y, " is ", end=" ")
    while y != 0:
        x_prime = y
        y_prime = x%y
        x = x_prime
        y = y_prime
    print(x)
    
main()
'''
'''
#Declared the expressions as variables
a=5.0/9.0
b=5.0/9
c=5/9.0
d=5/9
e=9.0/5.0
f=9.0/5
g=9/5.0
h=9/5
#Placed variables inside a tuple and executed a for loop
alpha=(a,b,c,d,e,f,g,h)
for x in alpha:
    print(x, "\t", end="")
    
#All were set as floats
'''
               
def main():
    n=int(input("Input the number of days in the month (28-31): "))
    d=int(input("Input the reaping day: "))
    for j in range(d):
        print("  ",end=" ")
    i=1
    while i <= n:
        if i < 10:
            print(" "+str(i), end=" ")
        else:
            print (i,end=" ")
        if (i+d) % 8 == 0:
            print(" ")
        i=i+1
    
main()
            
   
