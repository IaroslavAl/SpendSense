package com.iaroslav_beldin.spendsense.platform

import java.util.UUID

actual fun randomUUID(): String = UUID.randomUUID().toString()