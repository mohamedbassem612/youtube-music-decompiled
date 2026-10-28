package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahtm implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ktb("firebase-iid-executor", 0));
    private final long c;
    private final PowerManager.WakeLock d;

    public ahtm(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    final Context a() {
        return this.a.d;
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ahtj.a().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.a;
                firebaseMessaging.e(true);
                if (firebaseMessaging.h.e()) {
                    ahtj ahtjVarA = ahtj.a();
                    Context contextA = a();
                    if (ahtjVarA.b == null) {
                        ahtjVarA.b = Boolean.valueOf(contextA.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
                    }
                    ahtjVarA.a.booleanValue();
                    if (!ahtjVarA.b.booleanValue() || b()) {
                        try {
                            if (firebaseMessaging.l() == null) {
                                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                                this.a.h(this.c);
                            } else {
                                firebaseMessaging.e(false);
                            }
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } else {
                                if (e.getMessage() != null) {
                                    throw e;
                                }
                                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                            }
                        } catch (SecurityException unused) {
                            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                    } else {
                        ahtl ahtlVar = new ahtl(this);
                        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        ahtm ahtmVar = ahtlVar.a;
                        if (ahtmVar != null) {
                            ahtlVar.b = ahtmVar.a();
                            ahtlVar.b.registerReceiver(ahtlVar, intentFilter);
                        }
                    }
                } else {
                    firebaseMessaging.e(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.e(false);
            }
            if (ahtj.a().c(a())) {
                this.d.release();
            }
        } catch (Throwable th) {
            if (ahtj.a().c(a())) {
                this.d.release();
            }
            throw th;
        }
    }
}
