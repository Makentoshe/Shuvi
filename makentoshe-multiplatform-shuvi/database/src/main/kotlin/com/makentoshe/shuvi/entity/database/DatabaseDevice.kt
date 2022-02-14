package com.makentoshe.shuvi.entity.database

import com.makentoshe.shuvi.entity.Device
import com.makentoshe.shuvi.entity.DeviceId

data class DatabaseDevice(val id: String) {
    val _id: String = id

    constructor(device: Device) : this(device.id.string)

    fun toDevice() = Device(DeviceId(id))
}