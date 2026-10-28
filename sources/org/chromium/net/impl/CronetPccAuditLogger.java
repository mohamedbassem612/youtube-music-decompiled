package org.chromium.net.impl;

import android.app.privatecompute.PccSandboxManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.axjt;
import org.chromium.net.AndroidNetworkLibrary;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CronetPccAuditLogger {
    public static Boolean a;
    public static volatile AndroidNetworkLibrary b = new AndroidNetworkLibrary();

    CronetPccAuditLogger() {
    }

    public static void maybeWrite(String str) {
        if (Build.VERSION.SDK_INT >= 37) {
            Boolean bool = a;
            if (bool == null) {
                throw new IllegalStateException("CronetPccAuditLogger not initialized");
            }
            if (bool.booleanValue()) {
                try {
                    new axjt("CronetPccAuditLogger#maybeWrite", 0);
                    try {
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putLong("timestamp", System.currentTimeMillis());
                        persistableBundle.putString("url", str);
                        AndroidNetworkLibrary androidNetworkLibrary = b;
                        PccSandboxManager pccSandboxManagerG = AndroidNetworkLibrary.g();
                        if (pccSandboxManagerG != null) {
                            pccSandboxManagerG.writeToAuditLog(persistableBundle);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (RuntimeException e) {
                    Log.e("cn_CronetPccAuditLogger", "Failed to write to PCC audit log", e);
                }
                Log.e("cn_CronetPccAuditLogger", "Failed to write to PCC audit log", e);
            }
        }
    }
}
