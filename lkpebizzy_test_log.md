##ebizyy 简单测试日志：从这里可以了解测试过程。
···
root@elwin-virtual-machine:~/oto_lkp/lkpebizzy# ./fortest.sh 
+ adb connect 192.168.2.27
already connected to 192.168.2.27:5555
+ ./lkpebizzy.sh 192.168.2.27 5555 ebizzy_result
+ androidIP=192.168.2.27
+ port=5555
+ foldName=ebizzy_result
++ dirname ./lkpebizzy.sh
+ cd .
+ mkdir ebizzy_result
++ basename ./lkpebizzy.sh
+ filename=lkpebizzy.sh
+ filename=ebizzy.sh
+ '[' -d ebizzy_result ']'
+ rm -rf 'ebizzy_result/*'
+ adb -s 192.168.2.27:5555 shell rm -rf /data/lkp_test
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
+ adb -s 192.168.2.27:5555 shell mkdir /data/lkp_test
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
+ adb -s 192.168.2.27:5555 push ./lkp_test /data/lkp_test/
push: ./lkp_test/ubuntu_lkp_test.sh -> /data/lkp_test/ubuntu_lkp_test.sh
push: ./lkp_test/mount-static -> /data/lkp_test/mount-static
push: ./lkp_test/chroot_run.sh -> /data/lkp_test/chroot_run.sh
3 files pushed. 0 files skipped.
2419 KB/s (2974675 bytes in 1.200s)
+ adb -s 192.168.2.27:5555 shell busybox chmod +x /data/lkp_test/chroot_run.sh
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
+ adb -s 192.168.2.27:5555 shell /data/lkp_test/chroot_run.sh ebizzy.sh
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
failed: Device or resource busy
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
mount: Device or resource busy
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
mount: Device or resource busy
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
mount: Device or resource busy
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
WARNING: linker: [vdso]: unused DT entry: type 0x6ffffef5 arg 0x160
+ testjob=ebizzy.sh
+ echo 'i am in ubuntu'
i am in ubuntu
+ pwd
/root
+ rm -rf ./oto_lkp
+ git clone https://github.com/openthos/oto_lkp.git
Cloning into 'oto_lkp'...
remote: Counting objects: 2455, done.        
remote: Compressing objects: 100% (1627/1627), done.        
remote: Total 2455 (delta 460), reused 2427 (delta 439), pack-reused 0        
Receiving objects: 100% (2455/2455), 5.10 MiB | 946.00 KiB/s, done.
Resolving deltas: 100% (460/460), done.
Checking connectivity... done.
+ cd ./oto_lkp/lkp-tests-master
+ export LKP_SRC=/root/oto_lkp/lkp-tests-master
+ LKP_SRC=/root/oto_lkp/lkp-tests-master
+ export PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/root/oto_lkp/lkp-tests-master/bin
+ PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/root/oto_lkp/lkp-tests-master/bin
+ source ../joblist/ebizzy.sh
++ lkp install lkp install /root/oto_lkp/lkp-tests-master/jobs/ebizzy.yaml
make -C /root/oto_lkp/lkp-tests-master/monitors/event
make: Entering directory '/root/oto_lkp/lkp-tests-master/monitors/event'
gcc    -c -o wakeup.o wakeup.c
gcc   wakeup.o   -o wakeup
make: Leaving directory '/root/oto_lkp/lkp-tests-master/monitors/event'
Creating testbox configuration file: /root/oto_lkp/lkp-tests-master/hosts/localhost.
Use: /root/oto_lkp/lkp-tests-master/distro/installer/ubuntu install bc gawk linux-tools-generic ruby ruby-gnuplot ruby-git sysstat time kmod gzip xz-utils make automake gcc libtool patch git cpio wget 
Reading package lists... Done
Building dependency tree       
Reading state information... Done
automake is already the newest version.
bc is already the newest version.
gawk is already the newest version.
gcc is already the newest version.
gzip is already the newest version.
kmod is already the newest version.
libtool is already the newest version.
make is already the newest version.
patch is already the newest version.
ruby is already the newest version.
sysstat is already the newest version.
time is already the newest version.
xz-utils is already the newest version.
ruby-git is already the newest version.
ruby-gnuplot is already the newest version.
cpio is already the newest version.
git is already the newest version.
linux-tools-generic is already the newest version.
wget is already the newest version.
0 upgraded, 0 newly installed, 0 to remove and 1 not upgraded.
/root/oto_lkp/lkp-tests-master/lkp-exec/install: skip unknown parameter lkp
/root/oto_lkp/lkp-tests-master/lkp-exec/install: skip unknown parameter install
Making ebizzy benchmark for ubuntu
--2016-11-02 00:00:17--  https://github.com/openthos/oto_lkp/raw/master/benchmark_mirror/ebizzy-0.3.tar.gz
Resolving github.com (github.com)... 192.30.253.113, 192.30.253.112
Connecting to github.com (github.com)|192.30.253.113|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://raw.githubusercontent.com/openthos/oto_lkp/master/benchmark_mirror/ebizzy-0.3.tar.gz [following]
--2016-11-02 00:00:18--  https://raw.githubusercontent.com/openthos/oto_lkp/master/benchmark_mirror/ebizzy-0.3.tar.gz
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 151.101.100.133
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|151.101.100.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 12438 (12K) [application/octet-stream]
Saving to: ‘ebizzy-0.3.tar.gz’

ebizzy-0.3.tar.gz   100%[=====================>]  12.15K  --.-KB/s   in 0.007s 

2016-11-02 00:00:19 (1.71 MB/s) - ‘ebizzy-0.3.tar.gz’ saved [12438/12438]

patching file configure
Hunk #1 succeeded at 16 with fuzz 1.
patching file ebizzy.c
Type 'make' to compile
gcc -Wall -Wshadow -pthread  -o ebizzy ebizzy.c
ebizzy.c: In function ‘search_mem’:
ebizzy.c:393:9: warning: ‘state’ may be used uninitialized in this function [-Wmaybe-uninitialized]
   chunk = rand_num(chunks, state);
         ^
dpkg-deb: building package 'ebizzy-lkp' in 'ebizzy-LKP.deb'.
Installing ebizzy-LKP
(Reading database ... 211363 files and directories currently installed.)
Preparing to unpack /tmp/ebizzy-LKP.deb ...
Unpacking ebizzy-lkp (2016-11-02) over (2016-11-01) ...
Setting up ebizzy-lkp (2016-11-02) ...
++ lkp split /root/oto_lkp/lkp-tests-master/jobs/ebizzy.yaml
/root/oto_lkp/lkp-tests-master/jobs/ebizzy.yaml => ./ebizzy-200%-100x-10s.yaml
/root/oto_lkp/lkp-tests-master/jobs/ebizzy.yaml => ./ebizzy-200%-100x-5s.yaml
/root/oto_lkp/lkp-tests-master/jobs/ebizzy.yaml => ./ebizzy-200%-5x-10s.yaml
/root/oto_lkp/lkp-tests-master/jobs/ebizzy.yaml => ./ebizzy-200%-5x-5s.yaml
++ lkp run /root/oto_lkp/lkp-tests-master/ebizzy-200%-5x-5s.yaml
/root/oto_lkp/lkp-tests-master/monitors/turbostat: line 10: cd: /lkp/benchmarks/turbostat: No such file or directory
Iteration: 1
2016-11-02 00:00:21 ./ebizzy -t 16 -S 5
66821 records/s 4127 4119 4148 4210 4131 4126 4292 4120 4242 4173 4218 4153 4160 4161 4193 4241
real  5.00 s
user  9.35 s
sys  30.43 s
Iteration: 2
2016-11-02 00:00:26 ./ebizzy -t 16 -S 5
66349 records/s 4358 4150 4057 4180 4139 4057 3983 4020 4119 4068 4128 4158 4301 4177 4332 4117
real  5.00 s
user  9.38 s
sys  30.41 s
Iteration: 3
2016-11-02 00:00:31 ./ebizzy -t 16 -S 5
66390 records/s 4393 4039 4444 4024 4402 3988 4328 3999 4144 4069 3961 4065 4110 4375 4060 3982
real  5.00 s
user  9.39 s
sys  30.42 s
Iteration: 4
2016-11-02 00:00:36 ./ebizzy -t 16 -S 5
66571 records/s 4095 4353 4183 3965 4142 3968 3912 3976 4039 4011 4308 4763 4008 4126 3950 4766
real  5.00 s
user  9.42 s
sys  30.36 s
Iteration: 5
2016-11-02 00:00:41 ./ebizzy -t 16 -S 5
66189 records/s 4176 4026 4084 4085 4206 4008 4509 4204 4026 4106 4012 4124 4130 4074 3947 4464
real  5.00 s
user  9.46 s
sys  30.34 s
wait for background monitors: uptime proc-vmstat proc-stat meminfo slabinfo interrupts softirqs diskstats cpuidle sched_debug
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/kmsg /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/kmsg < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/kmsg  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/uptime /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/uptime < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/uptime  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/vmstat /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/vmstat < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/vmstat  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/proc-vmstat /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-vmstat < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-vmstat  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/meminfo /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/meminfo < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/meminfo  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/slabinfo /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/slabinfo < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/slabinfo  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/interrupts /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/interrupts < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/interrupts  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/softirqs /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/softirqs < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/softirqs  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/diskstats /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/diskstats < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/diskstats  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/cpuidle /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/cpuidle < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/cpuidle  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/sched_debug /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/sched_debug < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/sched_debug  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/ebizzy /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/time /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy.time < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy.time  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/time /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/time < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/time  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 75: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/dmesg < /dev/null  exit code 1, check 
mktemp: failed to create file via template ‘/dev/shm/lkp-stats.XXXXXXXX’: No such file or directory
/root/oto_lkp/lkp-tests-master/stats/wrapper: line 73: $tmpfile: ambiguous redirect
/root/oto_lkp/lkp-tests-master/stats/kmsg /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/kmsg < /result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/kmsg  exit code 1, check 
+ echo 'lkp test over, leave ubuntu'
lkp test over, leave ubuntu
chroot error faild
+ adb -s 192.168.2.27:5555 pull /data/ubuntu/result/ ebizzy_result/result
pull: building file list...
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/job.sh -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/job.sh
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/meminfo.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/meminfo.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/stats.json -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/stats.json
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/time -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/time
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/vmstat -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/vmstat
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/cpufreq-stats -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/cpufreq-stats
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/meminfo -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/meminfo
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/interrupts -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/interrupts
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/softirqs -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/softirqs
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/uptime -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/uptime
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/matrix.json.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/matrix.json.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/sched_debug -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/sched_debug
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/interrupts.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/interrupts.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/ebizzy.time -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/ebizzy.time
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/cpuidle -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/cpuidle
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/bdi_dev_mapping -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/bdi_dev_mapping
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/pmeter -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/pmeter
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/sched_debug.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/sched_debug.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/ebizzy -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/ebizzy
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/slabinfo.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/slabinfo.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/job.yaml -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/job.yaml
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/diskstats.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/diskstats.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/slabinfo -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/slabinfo
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/reproduce.sh -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/reproduce.sh
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/env.yaml -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/env.yaml
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/proc-vmstat.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/proc-vmstat.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/proc-vmstat -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/proc-vmstat
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/kmsg -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/kmsg
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/diskstats -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/diskstats
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/softirqs.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/softirqs.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/proc-stat.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/0/proc-stat.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/job.sh -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/job.sh
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/meminfo.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/meminfo.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/stats.json -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/stats.json
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/time -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/time
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/vmstat -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/vmstat
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/cpufreq-stats -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/cpufreq-stats
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/meminfo -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/meminfo
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/interrupts -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/interrupts
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/softirqs -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/softirqs
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/uptime -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/uptime
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/matrix.json.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/matrix.json.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/sched_debug -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/sched_debug
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/interrupts.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/interrupts.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy.time -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy.time
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/cpuidle -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/cpuidle
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/bdi_dev_mapping -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/bdi_dev_mapping
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/pmeter -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/pmeter
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/sched_debug.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/sched_debug.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/ebizzy
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/slabinfo.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/slabinfo.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/job.yaml -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/job.yaml
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/diskstats.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/diskstats.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/slabinfo -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/slabinfo
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/reproduce.sh -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/reproduce.sh
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/env.yaml -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/env.yaml
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-vmstat.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-vmstat.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-vmstat -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-vmstat
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/kmsg -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/kmsg
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/diskstats -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/diskstats
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/softirqs.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/softirqs.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-stat.gz -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/1/proc-stat.gz
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/stddev.json -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/stddev.json
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/matrix.json -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/matrix.json
pull: /data/ubuntu/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/avg.json -> ebizzy_result/result/ebizzy/200%-5x-5s/localhost/ubuntu/defconfig/gcc-5/4.4.10-android-x86_64/avg.json
pull: /data/ubuntu/result/ebizzy/params.yaml -> ebizzy_result/result/ebizzy/params.yaml
66 files pulled. 0 files skipped.
293 KB/s (1373135 bytes in 4.573s)
root@elwin-virtual-machine:~/oto_lkp/lkpebizzy# 
···