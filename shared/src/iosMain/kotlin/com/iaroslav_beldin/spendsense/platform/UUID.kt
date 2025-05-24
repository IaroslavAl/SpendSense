package com.iaroslav_beldin.spendsense.platform

import platform.Foundation.NSUUID

actual fun randomUUID() = NSUUID().UUIDString()