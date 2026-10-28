package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpb implements qpc {
    private static final String a = "qpc";

    @Override // defpackage.qpc
    public final void a(aero aeroVar) throws IOException {
        Context context;
        try {
            Object obj = aeroVar.b;
            Object obj2 = lny.a;
            kro.m(obj, "Context must not be null");
            kml.d((Context) obj, 11925000);
            long jUptimeMillis = SystemClock.uptimeMillis();
            synchronized (lny.a) {
                try {
                    Context context2 = null;
                    if (!lny.b) {
                        try {
                            context = kvc.d((Context) obj, kvc.d, "com.google.android.gms.providerinstaller.dynamite").f;
                        } catch (kuy e) {
                            Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                            context = null;
                        }
                        if (context != null) {
                            lny.a(context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                            return;
                        }
                    }
                    boolean z = lny.b;
                    Context contextC = kml.c((Context) obj);
                    if (contextC != null) {
                        lny.b = true;
                        if (!z) {
                            try {
                                lqd.f(contextC.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new kyr(Context.class, obj), kyr.a(jUptimeMillis), kyr.a(SystemClock.uptimeMillis()));
                            } catch (Exception e2) {
                                Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                            }
                        }
                        context2 = contextC;
                    }
                    if (context2 != null) {
                        lny.a(context2, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    } else {
                        Log.e("ProviderInstaller", "Failed to get remote context");
                        throw new kmj(8);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (kmj e3) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e3);
            klt.a.j((Context) aeroVar.b, e3.a);
            int i = aeroVar.a;
            throw new IOException("Blocked unpatched use of SSL stack.", e3);
        } catch (kmk e4) {
            klt.a.j((Context) aeroVar.b, e4.a);
            int i2 = aeroVar.a;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e4);
        }
    }
}
