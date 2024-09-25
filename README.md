
Linux-Amazon:
1. To run java application in background
You can use nohup:
nohup java -jar jarfile &

Later you can use:
ps aux // to get the $PID of your process
kill -9 $PID // to kill the process

2. installation of jre and devtool
sudo dnf install java-17-amazon-corretto
sudo dnf install java-17-amazon-corretto-devel

3. installation of tomcat
wget https://downloads.apache.org/tomcat/tomcat-10/v10.1.30/bin/apache-tomcat-10.1.30.tar.gz.sha512

to unzip tar file:
tar -xvzf apache-tomcat-10.1.30.tar.gz

starting tomcat server:
cd apache-tomcat-10.1.30
cd bin
./startup.sh

4.Installation of MySQL
sudo wget https://dev.mysql.com/get/mysql80-community-release-el9-1.noarch.rpm
sudo dnf install mysql80-community-release-el9-1.noarch.rpm -y
sudo dnf install mysql-community-server -y : here you will get GPG key error

you need to install it manually:
sudo rpm --import https://repo.mysql.com/RPM-GPG-KEY-mysql-2023

starting MySQL server:
sudo systemctl start mysqld
systemctl status mysqld.service : to check status
sudo grep 'temporary password' /var/log/mysqld.log : to get first temporary password
To login:
mysql -uroot -p
To change password:
ALTER USER 'root'@'localhost' IDENTIFIED BY 'MyNewPass4!';

5.Connecting mysql server to workbench
we can connect mysql to workbench using public IPv4 address, SSH username(ec2-user for linux), SSH keyfile,
username and password.

#Others command
rm filename: to remove file
