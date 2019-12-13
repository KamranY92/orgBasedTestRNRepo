package com.orgbasedtestrnrepo

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

import com.orgbasedtestrnrepo.passbasemodule.PassbaseModule
import com.orgbasedtestrnrepo.passbasecomponent.PassbaseComponentManager

class OrgBasedTestRnRepoPackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
    return listOf(
      PassbaseModule(reactContext)
    )
  }

  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
    return listOf(
      PassbaseComponentManager()
    )
  }
}
