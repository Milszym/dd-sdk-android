/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache License Version 2.0.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2016-Present Datadog, Inc.
 */

package com.datadog.android.core.internal.time

/**
 * An implementation of [TimeProvider] which always returns the system time.
 */
internal class SystemTimeProvider : TimeProvider {

    // region TimeProvider

    override fun getDeviceTimestamp(): Long {
        return System.currentTimeMillis()
    }

    override fun getServerTimestamp(): Long {
        return System.currentTimeMillis()
    }

    override fun getServerOffsetNanos(): Long {
        return 0
    }

    // endregion
}