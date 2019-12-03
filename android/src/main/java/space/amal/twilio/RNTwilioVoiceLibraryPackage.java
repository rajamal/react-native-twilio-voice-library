package space.amal.twilio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;


public class RNTwilioVoiceLibraryPackage implements ReactPackage {
    private boolean mShouldAskForPermission;
    public RNTwilioVoiceLibraryPackage() {
        mShouldAskForPermission = true;
    }

    public RNTwilioVoiceLibraryPackage(boolean shouldAskForPermissions) {
        mShouldAskForPermission = shouldAskForPermissions;
    }

    // Deprecated in RN 0.47.0
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(new RNTwilioVoiceLibraryModule(reactContext, mShouldAskForPermission));
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}



