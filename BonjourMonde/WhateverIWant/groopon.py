'''
Created on Sep 10, 2015

@author: Kent
'''
'''
def alist():
    Mylist=[5,7,9,"Bob","apple",11,15.0]
    Mylist.insert(4,"tomato")
    Mylist.pop(5)
    for a in Mylist:
        print (a)     
        
    b=Mylist.index(11)
    print(b)
 
alist()
'''
'''
def exceptioncontrol():
    try:
        a=int (input('Tell me your age as an integer'))
        print('You were born in the year', 2015-a)
    except:
        print('You gave me a string')
exceptioncontrol()
'''



def exceptioncontrol():
    youresmart=False
    while (youresmart==False):
        try:
            a=int (input('Tell me your age as an integer'))
            print('You were born in the year', 2015-a)
            youresmart=True
        except:
            print('You gave me a string')
exceptioncontrol()