package com.example.grenndao30;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 上官若枫 on 2017/8/1.
 */
@Entity
public class SmallFax {
   @Id
    private String msgId;
    private String str;
    private byte[] temp;
   public byte[] getTemp() {
      return this.temp;
   }
   public void setTemp(byte[] temp) {
      this.temp = temp;
   }
   public String getStr() {
      return this.str;
   }
   public void setStr(String str) {
      this.str = str;
   }
   public String getMsgId() {
      return this.msgId;
   }
   public void setMsgId(String msgId) {
      this.msgId = msgId;
   }
   @Generated(hash = 415901613)
   public SmallFax(String msgId, String str, byte[] temp) {
      this.msgId = msgId;
      this.str = str;
      this.temp = temp;
   }
   @Generated(hash = 1028766770)
   public SmallFax() {
   }



}
