# java-example1

This is the example using remote container running on remote host connected by SSH.  On the client VSCode, need to create a SSH context for connection to the host.

Here is the normal procedures to setup the keys, copy to the host before you setup the context or to establish new ssh client through the command line ssh username@host-ip


1.  Generate the public/private keys
ssh-keygen -t rsa -b 4096

2.  Save as id_rsa.pub  to the current home directory (under the users/yourname)

3.  Copy to the server:

- Change the file mode on the server:  chmod 600 ~/.ssh/authorized_keys
- Open the text editor:  sudo gedit /etc/ssh/sshd_config  and change the this line:

PasswordAuthentication no
to
PasswordAuthentication yes
Restart daemon:
sudo systemctl restart sshd

4.  copy the public key to server from windows box:

ssh-copy-id -i  id_rsa.pub nguyen@192.168.1.39:~/.ssh   (username@host_ip_address)

Server will prompt for password

5. cd to .ssh and cat id_rsa.pub >> authorized_keys
