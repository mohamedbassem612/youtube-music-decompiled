package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import defpackage.axju;
import defpackage.axkt;
import defpackage.axku;
import defpackage.jij;
import internal.J.N;
import java.util.Locale;
import org.chromium.base.JniAndroid;
import org.chromium.base.TraceEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes5.dex */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* JADX INFO: compiled from: PG */
    class ProxyReceiver extends BroadcastReceiver {
        public ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            TraceEvent traceEventC = TraceEvent.c("ProxyChangeListener.ProxyReceiver#onReceive");
            try {
                AndroidNetworkLibrary.c("Net.ProxyChangeListener.ReflectedCall", false);
                if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                    ProxyChangeListener.this.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProxyChangeListener.this.proxySettingsChanged(ProxyChangeListener.extractNewProxy(intent));
                        }
                    });
                }
                if (traceEventC != null) {
                    TraceEvent.b(0L);
                }
            } catch (Throwable th) {
                if (traceEventC != null) {
                    try {
                        TraceEvent.b(0L);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private ProxyChangeListener() {
        Looper looperMyLooper = Looper.myLooper();
        this.mLooper = looperMyLooper;
        this.mHandler = new Handler(looperMyLooper);
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static axku extractNewProxy(Intent intent) {
        TraceEvent traceEventC = TraceEvent.c("ProxyChangeListener#extractNewProxy");
        try {
            Bundle extras = intent.getExtras();
            axku axkuVarA = extras == null ? null : axku.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
            return axkuVarA;
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private axku getProxyConfig(Intent intent) {
        TraceEvent traceEventC = TraceEvent.c("ProxyChangeListener#getProxyConfig");
        try {
            axku axkuVarA = axku.a(((ConnectivityManager) JniAndroid.a.getSystemService("connectivity")).getDefaultProxy());
            if (axkuVarA == null) {
                axkuVarA = axku.a;
            } else if (Build.VERSION.SDK_INT >= 29 && axkuVarA.b.equals("localhost") && axkuVarA.c == -1) {
                axku axkuVarExtractNewProxy = extractNewProxy(intent);
                String.format(Locale.US, "configFromConnectivityManager = %s, configFromIntent = %s", axkuVarA, axkuVarExtractNewProxy);
                axkuVarA = axkuVarExtractNewProxy == null ? null : new axku(axkuVarExtractNewProxy.b, axkuVarExtractNewProxy.c, axkuVarA.d, axkuVarA.e);
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
            return axkuVarA;
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDelegateForTesting$0(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$0(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(axku axkuVar) {
        TraceEvent traceEventC = TraceEvent.c("ProxyChangeListener#proxySettingsChanged");
        try {
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            long j = this.mNativePtr;
            if (j != 0) {
                if (axkuVar != null) {
                    N.MyoFZt$2(j, axkuVar.b, axkuVar.c, axkuVar.d, axkuVar.e);
                } else {
                    N.MCIk73GZ(j);
                }
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC == null) {
                throw th;
            }
            try {
                TraceEvent.b(0L);
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private void registerBroadcastReceiver() {
        int i;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (!JniAndroid.a()) {
            JniAndroid.a.registerReceiver(this.mProxyReceiver, new IntentFilter(), null, null, 4);
        }
        this.mRealProxyReceiver = new axkt(this);
        JniAndroid.a.registerReceiver(this.mRealProxyReceiver, intentFilter, null, null, 0);
        long jElapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000;
        jij jijVar = axju.a;
        if (jElapsedRealtimeNanos2 > 2147483647L) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            i = jElapsedRealtimeNanos2 < -2147483648L ? Integer.MIN_VALUE : (int) jElapsedRealtimeNanos2;
        }
        jijVar.u("Net.ProxyChangeListener.RegistrationTime", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    private void unregisterBroadcastReceiver() {
        JniAndroid.a.unregisterReceiver(this.mProxyReceiver);
        BroadcastReceiver broadcastReceiver = this.mRealProxyReceiver;
        if (broadcastReceiver != null) {
            JniAndroid.a.unregisterReceiver(broadcastReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public void start(long j) {
        TraceEvent traceEventC = TraceEvent.c("ProxyChangeListener.start");
        try {
            this.mNativePtr = j;
            registerBroadcastReceiver();
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void stop() {
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$updateProxyConfigFromConnectivityManager$0(intent);
            }
        });
    }

    private void assertOnThread() {
    }
}
