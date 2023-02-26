n = int(input());
i=int(((n+5)-1)/2);
print(i*"_"+"^"+i*"_");
i-=1;
print(i*"_"+"/|\\"+i*"_");
i-=1;
point = 0;
while(i>=0):
    print(i*"_"+"/"+point*"."+"|||"+point*"."+"\\"+i*"_");
    i-=1;
    point+=1;
 
point=(int((n-2)/2));   
print("_/"+point*"."+"|||"+point*"."+"\\_");

down = int((n+2)/2);
for j in range(0, n):
    print(down*"_"+"|||"+down*"_");

print(down*"_"+"~~~"+down*"_");

down=int(n/2);
point = 0;
for j in range(0, int(n/2)):
    print(down*"_"+"//"+point*"."+"!"+point*"."+"\\\\"+down*"_");
    point+=1;
    down-=1;