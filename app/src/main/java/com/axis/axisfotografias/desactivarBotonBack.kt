package com.axis.axisfotografias

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class desactivarBotonBack : ViewModel(){

    @Composable
    fun DisiableBackButtonBehaivor(
        onBackPressed: () -> Unit,
        content: @Composable () -> Unit,
    ) {

        val onBackPressedDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
        val backCallback = remember {
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    onBackPressed
                }
            }
        }
        DisposableEffect(onBackPressedDispatcher) {
            onBackPressedDispatcher?.addCallback(backCallback)
            onDispose {
                backCallback.remove()
            }
        }
        content()
    }
}