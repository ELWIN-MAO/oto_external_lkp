#!/system/xbin/sh
am start -n  com.tencent.mm.ui/com.tencent.mm.ui.LauncherUI
for i in `seq 1 100`
do
echo $i
date
sleep 1
done
