title GIT�ύ��������С��������
color 13

set /p declation=�����ύ��Ϣ��������ֱ�ӻس�Ĭ���ύ��Ϣ-����GIT�ύ�������س�ȷ���ύ,����رմ���:

if not "%declation%"=="" set "declation=%declation%-"
set "declation=%declation%����GIT�ύ������"

echo ��ʼ�ύ���뵽���زֿ�
echo ��ǰĿ¼�ǣ�%cd%

echo ��ʼ��ӱ��
echo ++++++++++++++++++++++++++++++
git add -A .
echo add ִ�н�����
echo ++++++++++++++++++++++++++++++

echo;
echo �ύ��������زֿ�
echo ++++++++++++++++++++++++++++++
git commit -m "%declation%"
echo commit ִ�н�����
echo ++++++++++++++++++++++++++++++

echo;
echo ���������ύ��Զ��git������
echo ++++++++++++++++++++++++++++++
git push origin master
echo push ִ�н�����
echo ++++++++++++++++++++++++++++++

echo;
echo ������ִ����ϣ�
echo;

pause