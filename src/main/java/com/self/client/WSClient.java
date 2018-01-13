package com.self.client;

import com.self.study.WebServiceImpl;
import com.self.study.WebServiceImplService;


/**
 * @author: lxb.
 * @time: 2018/1/10.
 * @gmail: liuxiaobo170601@gmail.com
 * @extend： 目标：
 */
public class WSClient {
//    public static String GetUnicodeString( String sValue ) {
//        Encoding def = Encoding.Default;
//        Encoding unicode = Encoding.UTF8;
//
//        if( def == unicode ) return sValue;
//
//        if( sValue == null || sValue.length()== 0 ) return sValue;
//
//        byte[] defBytes = def.GetBytes( sValue );
//
//        byte[] unicodeBytes = Encoding.Convert( def, unicode, defBytes);
//        char[] uniChars = new char[ unicodeBytes.length] ;
//        for( int i = 0; i < unicodeBytes.length; i++ )
//            uniChars[i] = (char)(unicodeBytes[i]);
//        return new String( uniChars );
//
//    }

    public static void main(String[] args) {
        WebServiceImplService factory=new WebServiceImplService();
        WebServiceImpl service=factory.getWebServiceImplPort();

        System.out.println(service.say("刘奸夫"));

    }
}
