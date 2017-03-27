package ftp;

public class FTPClientCommonFactory {
	public static FTPClientCommon getFtpClientCommon(String ftpType, String server, int port){
		FTPClientCommon ftpClientCommon = null;
		
		if((ftpType != null)&&(server != null)){
			if(ftpType.equalsIgnoreCase("ftp")){
				ftpClientCommon = new FTPClientConnector(server, port);
			}else if(ftpType.equalsIgnoreCase("sftp")){
				ftpClientCommon = new SFTPClientConnector(server, port);
			}
		}						
		return ftpClientCommon;
	}
}
