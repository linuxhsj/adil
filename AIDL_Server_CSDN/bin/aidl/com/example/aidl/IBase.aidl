package com.example.aidl;
import com.example.aidl.UserInfo;
import com.example.aidl.UserData;
interface IBase
{
     int    add(int i,int j);
     String getUserInfo(in UserInfo userinfo);
     void   getaList(out String[] list);  
     void   setaList(in String[] list);
     void   gettList(inout String[] list);
     
     UserData foo(in boolean login);
     
     byte[] foo2(in boolean login);
}