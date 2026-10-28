package org.chromium.net;

import defpackage.axji;
import defpackage.axjj;
import defpackage.axjt;
import defpackage.axkm;
import internal.J.N;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private int mCurrentConnectionCost = 0;
    private final ArrayList mNativeChangeNotifiers = new ArrayList();
    private final axjj mConnectionTypeObservers = new axjj();

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    protected NetworkChangeNotifier() {
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.d(connectionTypeObserver);
    }

    private void destroyAutoDetector() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    public static void fakeConnectionCostChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionCostChange(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i);
    }

    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j, i);
    }

    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z);
    }

    private void forceConnectivityStateInternal(boolean z) {
        if ((this.mCurrentConnectionType != 6) != z) {
            updateCurrentConnectionType(true != z ? 6 : 0);
            notifyObserversOfConnectionSubtypeChange(!z ? 1 : 0);
        }
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    public static NetworkChangeNotifier init() {
        NetworkChangeNotifier networkChangeNotifier = sInstance;
        if (networkChangeNotifier != null) {
            return networkChangeNotifier;
        }
        NetworkChangeNotifier networkChangeNotifier2 = new NetworkChangeNotifier();
        sInstance = networkChangeNotifier2;
        return networkChangeNotifier2;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }

    private void notifyObserversOfConnectionTypeChange(int i, long j) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.MbPIImnU(((Long) arrayList.get(i2)).longValue(), i, j);
        }
        axji axjiVar = new axji(this.mConnectionTypeObservers);
        while (axjiVar.hasNext()) {
            ((ConnectionTypeObserver) axjiVar.next()).onConnectionTypeChanged(i);
        }
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.c(connectionTypeObserver);
    }

    public static void resetInstanceForTests() {
        sInstance = new NetworkChangeNotifier();
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        new axjt("NetworkChangeNotifier.setAutoDetectConnectivityStateInternal", 0);
        if (!z) {
            destroyAutoDetector();
            return;
        }
        if (this.mAutoDetector == null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new axkm(this), registrationPolicy);
            this.mAutoDetector = networkChangeNotifierAutoDetect;
            ConnectivityManagerWrapper.NetworkState currentNetworkState = networkChangeNotifierAutoDetect.getCurrentNetworkState();
            updateCurrentConnectionType(currentNetworkState.getConnectionType());
            updateCurrentConnectionCost(currentNetworkState.getConnectionCost());
            notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
        }
    }

    public static void setDeriveConnectionTypeFromCapabilities(boolean z) {
        ConnectivityManagerWrapper.setDeriveConnectionTypeFromCapabilities(z);
    }

    private void updateCurrentConnectionCost(int i) {
        this.mCurrentConnectionCost = i;
        notifyObserversOfConnectionCostChange(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int i) {
        this.mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    public void addNativeObserver(long j) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j));
    }

    public int getCurrentConnectionCost() {
        return this.mCurrentConnectionCost;
    }

    public int getCurrentConnectionSubtype(boolean z) {
        new axjt("NetworkChangeNotifier.getCurrentConnectionSubtype", 0);
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        if (z) {
            networkChangeNotifierAutoDetect.updateCurrentNetworkState();
        }
        return this.mAutoDetector.getCurrentNetworkState().getConnectionSubtype();
    }

    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    public long[] getCurrentNetworksAndTypes() {
        new axjt("NetworkChangeNotifierAutoDetect.getCurrentNetworksAndTypes", 0);
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        return networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
    }

    public void notifyObserversOfConnectionCostChange(int i) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.Mg0W7eRL(((Long) arrayList.get(i2)).longValue(), i);
        }
    }

    public void notifyObserversOfConnectionSubtypeChange(int i) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.MCEqyWQ0(((Long) arrayList.get(i2)).longValue(), i);
        }
    }

    public void notifyObserversOfNetworkConnect(long j, int i) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.MBT1i5cd(((Long) arrayList.get(i2)).longValue(), j, i);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.MDpuHJTB(((Long) arrayList.get(i)).longValue(), j);
        }
    }

    public void notifyObserversOfNetworkSoonToDisconnect(long j) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.MiJIMrTb(((Long) arrayList.get(i)).longValue(), j);
        }
    }

    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.MpF$179U(((Long) arrayList.get(i)).longValue(), jArr);
        }
    }

    public boolean registerDefaultNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerDefaultNetworkCallbackFailed();
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    public void removeNativeObserver(long j) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j));
    }

    public static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }

    public void notifyObserversOfConnectionTypeChange(int i) {
        notifyObserversOfConnectionTypeChange(i, getCurrentDefaultNetId());
    }
}
