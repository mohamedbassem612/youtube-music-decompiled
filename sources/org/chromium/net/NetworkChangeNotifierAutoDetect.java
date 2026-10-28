package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.avgv;
import defpackage.axjt;
import defpackage.axju;
import defpackage.axkl;
import defpackage.axkn;
import defpackage.axko;
import defpackage.axkr;
import defpackage.axks;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private ConnectivityManagerWrapper mConnectivityManagerWrapper;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private boolean mDefaultNetworkCallbackRegistered;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private final axkr mNetworkCallback;
    private boolean mNetworkCallbackRegistered;
    private final NetworkRequest mNetworkRequest;
    private ConnectivityManagerWrapper.NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterDefaultNetworkCallbackFailed;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private axks mWifiManagerDelegate;

    /* JADX INFO: compiled from: PG */
    class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface Observer {
        void onConnectionCostChanged(int i);

        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RegisterResult {
        public static final int COUNT = 8;
        public static final int FAILURE_ILLEGAL_ARGUMENT = 6;
        public static final int FAILURE_OTHER_RUNTIME_EXCEPTION = 7;
        public static final int FAILURE_SECURITY_EXCEPTION = 4;
        public static final int FAILURE_TOO_MANY_REQUESTS = 5;
        public static final int SUCCESS_INITIAL = 0;
        public static final int SUCCESS_INITIAL_SECURITY_RETRY = 1;
        public static final int SUCCESS_SELF_HEAL = 2;
        public static final int SUCCESS_SELF_HEAL_SECURITY_RETRY = 3;
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RegistrationExceptionCategory {
        public static final int COUNT = 5;
        public static final int ILLEGAL_ARGUMENT_EXCEPTION = 2;
        public static final int ILLEGAL_STATE_EXCEPTION = 3;
        public static final int OTHER_RUNTIME_EXCEPTION = 4;
        public static final int SECURITY_EXCEPTION = 0;
        public static final int TOO_MANY_REQUESTS_EXCEPTION = 1;
    }

    /* JADX INFO: compiled from: PG */
    public abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        protected abstract void destroy();

        protected void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        protected final boolean isRegistrationFailed() {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mNotifier;
            if (networkChangeNotifierAutoDetect != null) {
                return networkChangeNotifierAutoDetect.registerDefaultNetworkCallbackFailed() || this.mNotifier.registerNetworkCallbackFailed();
            }
            return false;
        }

        protected final void register() {
            this.mNotifier.register();
        }

        protected final void unregister() {
            this.mNotifier.unregister();
        }
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SelfHealResult {
        public static final int COUNT = 2;
        public static final int FAILED = 1;
        public static final int RECOVERED = 0;
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        new axjt("NetworkChangeNotifierAutoDetect.constructor", 0);
        Looper looperMyLooper = Looper.myLooper();
        this.mLooper = looperMyLooper;
        this.mHandler = new Handler(looperMyLooper);
        this.mObserver = observer;
        this.mConnectivityManagerWrapper = new ConnectivityManagerWrapper(JniAndroid.a);
        this.mNetworkCallback = new axkr(this);
        this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        this.mDefaultNetworkCallback = createDefaultNetworkCallback();
        updateCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        new axjt("NetworkChangeNotifierAutoDetect.connectionTypeChanged", 0);
        connectionTypeChangedTo(this.mConnectivityManagerWrapper.getNetworkState(this.mWifiManagerDelegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(ConnectivityManagerWrapper.NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    private ConnectivityManager.NetworkCallback createDefaultNetworkCallback() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new axkn(this);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return new axko(this);
        }
        return null;
    }

    public static Network[] getAllNetworksFiltered(ConnectivityManagerWrapper connectivityManagerWrapper, Network network) {
        axkl networkCapabilities;
        Network[] allNetworksUnfiltered = connectivityManagerWrapper.getAllNetworksUnfiltered();
        int i = 0;
        for (Network network2 : allNetworksUnfiltered) {
            if (!network2.equals(network) && (networkCapabilities = connectivityManagerWrapper.getNetworkCapabilities(network2)) != null && networkCapabilities.b(12)) {
                if (!networkCapabilities.c(4)) {
                    allNetworksUnfiltered[i] = network2;
                    i++;
                } else if (connectivityManagerWrapper.vpnAccessible(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworksUnfiltered, i);
    }

    private static int getFailureResult(RuntimeException runtimeException) {
        if (runtimeException instanceof SecurityException) {
            return 4;
        }
        if (isTooManyRequestsException(runtimeException)) {
            return 5;
        }
        return runtimeException instanceof IllegalArgumentException ? 6 : 7;
    }

    private static int getSuccessResult(boolean z, int i) {
        if (z) {
            return i == 0 ? 2 : 3;
        }
        return i == 0 ? 0 : 1;
    }

    private static boolean isTooManyRequestsException(RuntimeException runtimeException) {
        if (runtimeException.getClass().getSimpleName().equals("TooManyRequestsException")) {
            return true;
        }
        String message = runtimeException.getMessage();
        return message != null && message.contains("used up all available NetworkRequests");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConnectivityManagerWrapperForTests$0(ConnectivityManagerWrapper connectivityManagerWrapper) {
        this.mConnectivityManagerWrapper = connectivityManagerWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWifiManagerDelegateForTests$0(axks axksVar) {
        this.mWifiManagerDelegate = axksVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$simulatePreAndroid28ForTesting$0(ConnectivityManager.NetworkCallback networkCallback) {
        this.mDefaultNetworkCallback = networkCallback;
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    private void purgeActiveNetworkList() {
        if (this.mShouldSignalObserver) {
            Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerWrapper, null);
            long[] jArr = new long[allNetworksFiltered.length];
            for (int i = 0; i < allNetworksFiltered.length; i++) {
                jArr[i] = ConnectivityManagerWrapper.networkToNetId(allNetworksFiltered[i]);
            }
            this.mObserver.purgeActiveNetworkList(jArr);
        }
    }

    private static void recordRegistrationException(RuntimeException runtimeException) {
        int i;
        if (runtimeException instanceof SecurityException) {
            i = 0;
        } else if (isTooManyRequestsException(runtimeException)) {
            i = 1;
        } else if (runtimeException instanceof IllegalArgumentException) {
            i = 2;
        } else {
            i = runtimeException instanceof IllegalStateException ? 3 : 4;
        }
        AndroidNetworkLibrary.d("Net.Android.NetworkChangeNotifier.RegistrationException", i);
    }

    private static void recordRegistrationFailure(String str, RuntimeException runtimeException) {
        AndroidNetworkLibrary.d(str, getFailureResult(runtimeException));
        recordRegistrationException(runtimeException);
    }

    private boolean registerDefaultNetworkCallback(boolean z) {
        if (this.mDefaultNetworkCallback == null) {
            this.mRegisterDefaultNetworkCallbackFailed = false;
            return false;
        }
        int i = 0;
        while (true) {
            try {
                this.mConnectivityManagerWrapper.registerDefaultNetworkCallback(this.mDefaultNetworkCallback, this.mHandler);
                axju.a.u("Net.Android.NetworkChangeNotifier.RegisterDefaultNetworkCallbackResult", getSuccessResult(z, i));
                this.mRegisterDefaultNetworkCallbackFailed = false;
                return true;
            } catch (SecurityException e) {
                String str = TAG;
                if (i != 0) {
                    Log.w("cn_".concat(String.valueOf(str)), "Retry failed to register default network callback", e);
                    e = e;
                    this.mRegisterDefaultNetworkCallbackFailed = true;
                    recordRegistrationFailure("Net.Android.NetworkChangeNotifier.RegisterDefaultNetworkCallbackResult", e);
                    return false;
                }
                Log.w("cn_".concat(String.valueOf(str)), "Failed to register default network callback, retrying once", e);
                i = 1;
            } catch (RuntimeException e2) {
                e = e2;
                Log.w("cn_".concat(String.valueOf(TAG)), "Failed to register default network callback", e);
                this.mRegisterDefaultNetworkCallbackFailed = true;
                recordRegistrationFailure("Net.Android.NetworkChangeNotifier.RegisterDefaultNetworkCallbackResult", e);
                return false;
            }
        }
    }

    private boolean registerNetworkCallback(boolean z) {
        boolean z2;
        axkl networkCapabilities;
        axkr axkrVar = this.mNetworkCallback;
        if (axkrVar == null) {
            this.mRegisterNetworkCallbackFailed = false;
            return false;
        }
        new axjt("NetworkChangeNotifierAutoDetect.initializeVpnInPlace", 0);
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = axkrVar.b;
        RuntimeException runtimeException = null;
        Network[] allNetworksFiltered = getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerWrapper, null);
        axkrVar.a = null;
        if (allNetworksFiltered.length == 1 && (networkCapabilities = networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkCapabilities(allNetworksFiltered[0])) != null && networkCapabilities.c(4)) {
            axkrVar.a = allNetworksFiltered[0];
        }
        int i = 0;
        while (true) {
            try {
                this.mConnectivityManagerWrapper.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
                axju.a.u("Net.Android.NetworkChangeNotifier.RegisterNetworkCallbackResult", getSuccessResult(z, i));
                this.mRegisterNetworkCallbackFailed = false;
                z2 = true;
                break;
            } catch (SecurityException e) {
                runtimeException = e;
                String str = TAG;
                if (i != 0) {
                    Log.w("cn_".concat(String.valueOf(str)), "Retry failed to register network callback", runtimeException);
                    z2 = false;
                    break;
                }
                Log.w("cn_".concat(String.valueOf(str)), "Failed to register network callback, retrying once", runtimeException);
                i = 1;
            } catch (RuntimeException e2) {
                runtimeException = e2;
                Log.w("cn_".concat(String.valueOf(TAG)), "Failed to register network callback", runtimeException);
                z2 = false;
                break;
            }
        }
        if (z2) {
            purgeActiveNetworkList();
            return true;
        }
        this.mRegisterNetworkCallbackFailed = true;
        recordRegistrationFailure("Net.Android.NetworkChangeNotifier.RegisterNetworkCallbackResult", runtimeException);
        return false;
    }

    private void retryFailedRegistrations() {
        if (registerDefaultNetworkCallbackFailed()) {
            boolean zRegisterDefaultNetworkCallback = registerDefaultNetworkCallback(true);
            this.mDefaultNetworkCallbackRegistered = zRegisterDefaultNetworkCallback;
            if (zRegisterDefaultNetworkCallback) {
                JniAndroid.a.unregisterReceiver(this);
            }
            AndroidNetworkLibrary.d("Net.Android.NetworkChangeNotifier.SelfHealDefaultNetworkResult", !this.mDefaultNetworkCallbackRegistered ? 1 : 0);
        }
        if (registerNetworkCallbackFailed()) {
            boolean zRegisterNetworkCallback = registerNetworkCallback(true);
            this.mNetworkCallbackRegistered = zRegisterNetworkCallback;
            AndroidNetworkLibrary.d("Net.Android.NetworkChangeNotifier.SelfHealNetworkResult", !zRegisterNetworkCallback ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$runOnThread$0(runnable);
                }
            });
        }
    }

    public void destroy() {
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public ConnectivityManagerWrapper.NetworkState getCurrentNetworkState() {
        new axjt("NetworkChangeNotifierAutoDetect.getCurrentNetworkState", 0);
        return this.mNetworkState;
    }

    public long getDefaultNetId() {
        Network defaultNetwork = getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return ConnectivityManagerWrapper.networkToNetId(defaultNetwork);
    }

    public Network getDefaultNetwork() {
        return this.mConnectivityManagerWrapper.getDefaultNetwork();
    }

    public long[] getNetworksAndTypes() {
        new axjt("NetworkChangeNotifierAutoDetect.getNetworksAndTypes", 0);
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerWrapper, null);
        long[] jArr = new long[allNetworksFiltered.length << 1];
        int i = 0;
        for (Network network : allNetworksFiltered) {
            int i2 = i + 1;
            jArr[i] = ConnectivityManagerWrapper.networkToNetId(network);
            i += 2;
            jArr[i2] = this.mConnectivityManagerWrapper.getConnectionType(network);
        }
        return jArr;
    }

    public Network[] getNetworksForTesting() {
        return getAllNetworksFiltered(this.mConnectivityManagerWrapper, null);
    }

    RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runOnThread(new avgv(this, 18));
    }

    public void register() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect;
        new axjt("NetworkChangeNotifierAutoDetect.register", 0);
        if (this.mRegistered) {
            retryFailedRegistrations();
            connectionTypeChanged();
            return;
        }
        if (this.mShouldSignalObserver) {
            connectionTypeChanged();
        }
        boolean zRegisterDefaultNetworkCallback = registerDefaultNetworkCallback(false);
        this.mDefaultNetworkCallbackRegistered = zRegisterDefaultNetworkCallback;
        if (zRegisterDefaultNetworkCallback) {
            networkChangeNotifierAutoDetect = this;
        } else {
            networkChangeNotifierAutoDetect = this;
            networkChangeNotifierAutoDetect.mIgnoreNextBroadcast = JniAndroid.a.registerReceiver(networkChangeNotifierAutoDetect, this.mIntentFilter, null, null, 0) != null;
        }
        networkChangeNotifierAutoDetect.mRegistered = true;
        networkChangeNotifierAutoDetect.mNetworkCallbackRegistered = networkChangeNotifierAutoDetect.registerNetworkCallback(false);
    }

    public boolean registerDefaultNetworkCallbackFailed() {
        return this.mDefaultNetworkCallback != null && this.mRegisterDefaultNetworkCallbackFailed;
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mNetworkCallback != null && this.mRegisterNetworkCallbackFailed;
    }

    void setConnectivityManagerWrapperForTests(ConnectivityManagerWrapper connectivityManagerWrapper) {
        this.mConnectivityManagerWrapper = connectivityManagerWrapper;
    }

    void setWifiManagerDelegateForTests(axks axksVar) {
        this.mWifiManagerDelegate = axksVar;
    }

    void simulatePreAndroid28ForTesting() {
        this.mDefaultNetworkCallback = null;
    }

    public void unregister() {
        if (this.mRegistered) {
            this.mRegistered = false;
            if (this.mNetworkCallbackRegistered) {
                this.mConnectivityManagerWrapper.unregisterNetworkCallback(this.mNetworkCallback);
                this.mNetworkCallbackRegistered = false;
            }
            if (!this.mDefaultNetworkCallbackRegistered) {
                JniAndroid.a.unregisterReceiver(this);
            } else {
                this.mConnectivityManagerWrapper.unregisterNetworkCallback(this.mDefaultNetworkCallback);
                this.mDefaultNetworkCallbackRegistered = false;
            }
        }
    }

    public void updateCurrentNetworkState() {
        new axjt("NetworkChangeNotifierAutoDetect.updateCurrentNetworkState", 0);
        this.mNetworkState = this.mConnectivityManagerWrapper.getNetworkState(this.mWifiManagerDelegate);
    }

    private void assertOnThread() {
    }
}
