package devoxx.handsonlab.tasks

import jdk.nashorn.internal.objects.Global
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
Implement [blockingSendDelayedMessage] function, which should do the same thing as [sendDelayedMessage], but
use [runBlocking] so that the function should not finish until the message has been sent. Do not use [launch].
 */

fun blockingSendDelayedMessage(msg: String): Unit =
        runBlocking {
            delay(2_000)
            sendMessage(msg)
        }

