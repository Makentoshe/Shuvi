package com.makentoshe.shuvi.repository

import com.makentoshe.shuvi.entity.Device

interface DeviceRepository {

    fun getDevices(): List<Device>
}