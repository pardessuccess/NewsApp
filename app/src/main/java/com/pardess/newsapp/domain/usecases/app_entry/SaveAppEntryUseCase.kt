package com.pardess.newsapp.domain.usecases.app_entry

import com.pardess.newsapp.data.manger.LocalUserManager
import javax.inject.Inject

class SaveAppEntryUseCase @Inject constructor(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }

}