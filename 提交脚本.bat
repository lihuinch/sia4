title GIT提交批处理——小二三不乌
color 13

set /p declation=输入提交信息（不输入直接回车默认提交信息-来自GIT提交批处理）回车确认提交,否则关闭窗口:

if not "%declation%"=="" set "declation=%declation%-"
set "declation=%declation%来自GIT提交批处理"

echo 开始提交代码到本地仓库
echo 当前目录是：%cd%

echo 开始添加变更
echo ++++++++++++++++++++++++++++++
git add -A .
echo add 执行结束！
echo ++++++++++++++++++++++++++++++

echo;
echo 提交变更到本地仓库
echo ++++++++++++++++++++++++++++++
git commit -m "%declation%"
echo commit 执行结束！
echo ++++++++++++++++++++++++++++++

echo;
echo 将变更情况提交到远程git服务器
echo ++++++++++++++++++++++++++++++
git push origin master
echo push 执行结束！
echo ++++++++++++++++++++++++++++++

echo;
echo 批处理执行完毕！
echo;

pause