#!/bin/bash -x
androidIP=$1
port=$2
foldName=$3
cd "$(dirname "$0")"
if  [ -z "$foldName"  ] ; then
 echo "foldName is empty !"
 exit
fi
mkdir $foldName
#adb -s $androidIP:$port push ebizzy /data/local/tmp
#adb -s $androidIP:$port shell /data/local/tmp/ebizzy > $foldName/testResult

filename=$(basename $0)
filename=${filename#lkp}
if  [  -d $foldName  ];then
      trash=$RANDOM  
      mkdir /tmp/$trash 
      mv   $foldName/* /tmp/$trash
fi

adb -s $androidIP:$port  shell  rm -rf  /data/lkp_test
adb -s $androidIP:$port  shell  mkdir /data/lkp_test

adb -s $androidIP:$port   push ./lkp_test /data/lkp_test/

adb -s $androidIP:$port   shell busybox chmod +x /data/lkp_test/chroot_run.sh

adb -s $androidIP:$port   shell /data/lkp_test/chroot_run.sh $filename

adb -s $androidIP:$port pull  /data/ubuntu/result/  $foldName/result

echo "test over! all done!"
