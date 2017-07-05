package com.example.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public class UserData implements Parcelable{
private boolean login;
private byte[] msg;
@Override
public int describeContents() {
	return 0;
}
@Override
public void writeToParcel(Parcel dest, int flags) {
	dest.writeByte((byte) (login ? 1 : 0));  
	dest.writeInt(msg.length);
	dest.writeByteArray(msg);
}
public boolean isLogin() {
	return login;
}
public void setLogin(boolean login) {
	this.login = login;
}
public byte[] getMsg() {
	return msg;
}
public void setMsg(byte[] msg) {
	this.msg = msg;
}


public static final Parcelable.Creator<UserData> CREATOR=new Creator<UserData>() {

	@Override
	public UserData createFromParcel(Parcel source) {
		UserData userData=new UserData();
		userData.setLogin(source.readByte()!= 0);
		
		byte[] _byte = new byte[source.readInt()]; 
		source.readByteArray(_byte);
		userData.setMsg(_byte);
		return userData;
	}

	@Override
	public UserData[] newArray(int size) {
		return new UserData[size];
	}
};


}
