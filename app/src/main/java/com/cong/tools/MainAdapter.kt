package com.cong.tools

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import com.blankj.utilcode.util.DeviceUtils
import com.blankj.utilcode.util.PhoneUtils
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class  MainAdapter(data:MutableList<Int>):BaseQuickAdapter<Int, BaseViewHolder>(R.layout.item,data){

    @SuppressLint("MissingPermission")
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun convert(helper: BaseViewHolder, item: Int) {
        when (item){
            0 -> {
                if(context is MainActivity){
                    helper.setText(R.id.textview,"手机屏幕刷新率:${(context as MainActivity).windowManager.defaultDisplay.refreshRate}")
                }else{
                    helper.setText(R.id.textview,"手机屏幕刷新率:获取失败")
                }
            }
            1 ->{
                helper.setText(R.id.textview,"手机是否获取root:${DeviceUtils.isDeviceRooted()}")
            }
            2 ->{
                helper.setText(R.id.textview,"手机adb是否可用:是${DeviceUtils.isAdbEnabled()}")
            }
            3 ->{
                helper.setText(R.id.textview,"手机设备系统版本名称:${DeviceUtils.getSDKVersionName()}")
            }
            4 ->{
                helper.setText(R.id.textview,"手机设备系统版本号:${DeviceUtils.getSDKVersionCode()}")
            }
            5 ->{
                helper.setText(R.id.textview,"手机设备AndroidID:${DeviceUtils.getAndroidID()}")
            }
            6 ->{
                helper.setText(R.id.textview,"手机设备Mac地址:${DeviceUtils.getMacAddress()}")
            }
            7 ->{
                helper.setText(R.id.textview,"手机设备厂商:${DeviceUtils.getManufacturer()}")
            }
            8 ->{
                helper.setText(R.id.textview,"手机型号:${DeviceUtils.getModel()}")
            }
            9 ->{
                val abis=StringBuilder()
                for ((index,value) in DeviceUtils.getABIs().withIndex()){
                    if(index!=0){
                        abis.append("*")
                    }
                    abis.append(value)
                }
                helper.setText(R.id.textview,"手机ABIs:$abis")
            }
            10 ->{
                helper.setText(R.id.textview,"设备是否手机:${PhoneUtils.isPhone()}")
            }
            11 ->{
                try {
                    helper.setText(R.id.textview,"设备码:${PhoneUtils.getDeviceId()}")
                }catch (e: Exception){
                    helper.setText(R.id.textview,"设备码:获取异常")
                }
            }
            12 ->{
                try {
                    helper.setText(R.id.textview,"设备序列号:${PhoneUtils.getSerial()}")
                }catch (e: Exception){
                    helper.setText(R.id.textview,"设备序列号:获取异常")
                }
            }
            13 ->{
                try {
                    helper.setText(R.id.textview,"设备IMEI号:${PhoneUtils.getIMEI()}")
                }catch (e: Exception){
                    helper.setText(R.id.textview,"设备IMEI号:获取异常")
                }
            }
            14 ->{
                try {
                    helper.setText(R.id.textview,"设备MEID号:${PhoneUtils.getMEID()}")
                }catch (e: Exception){
                    helper.setText(R.id.textview,"设备MEID号:获取异常")
                }
            }
            15 ->{
                try {
                    helper.setText(R.id.textview,"设备IMSI号:${PhoneUtils.getIMSI()}")
                }catch (e: Exception){
                    helper.setText(R.id.textview,"设备IMSI号:获取异常")
                }
            }
            16 ->{
                helper.setText(R.id.textview,"设备移动终端类型:${PhoneUtils.getPhoneType()}")
            }
            17 ->{
                helper.setText(R.id.textview,"设备sim卡是否准备就绪:${PhoneUtils.isSimCardReady()}")
            }
            18 ->{
                helper.setText(R.id.textview,"设备sim卡运营商名称:${PhoneUtils.getSimOperatorName()}")
            }
            19 ->{
                try {
                    helper.setText(R.id.textview,"设备状态信息:${PhoneUtils.getPhoneType()}")
                }catch (e: Exception){
                    helper.setText(R.id.textview,"设备状态信息:获取异常")
                }
            }
        }
    }
}