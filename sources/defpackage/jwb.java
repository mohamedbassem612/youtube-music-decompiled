package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwb {
    private static final Object g = new Object();
    private static volatile jwb h;
    kln a;
    boolean b;
    final Object c = new Object();
    jvz d;
    final long e;
    jwd f;
    private final Context i;

    public jwb(Context context) {
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        this.i = context.getApplicationContext();
        this.b = false;
        this.e = 30000L;
    }

    public static jwa e(Context context) {
        jwa jwaVar;
        jwb jwbVar = h;
        if (jwbVar == null) {
            synchronized (g) {
                jwbVar = h;
                if (jwbVar == null) {
                    jwbVar = new jwb(context);
                    h = jwbVar;
                }
            }
        }
        jwb jwbVar2 = jwbVar;
        if (jwc.a == null) {
            synchronized (jwc.b) {
                if (jwc.a == null) {
                    jwc.a = new jwc(context);
                }
            }
        }
        jwc jwcVar = jwc.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 1;
        try {
            kro.g("Calling this from your main thread can lead to deadlock");
            synchronized (jwbVar2) {
                jwbVar2.d();
                if (jwbVar2.a == null) {
                    throw new NullPointerException("null reference");
                }
                jwd jwdVar = jwbVar2.f;
                if (jwdVar == null) {
                    throw new NullPointerException("null reference");
                }
                try {
                    Parcel parcelD = jwdVar.d(1, jwdVar.c());
                    String string = parcelD.readString();
                    parcelD.recycle();
                    jwd jwdVar2 = jwbVar2.f;
                    Parcel parcelC = jwdVar2.c();
                    ClassLoader classLoader = gdc.a;
                    parcelC.writeInt(1);
                    Parcel parcelD2 = jwdVar2.d(2, parcelC);
                    int i2 = parcelD2.readInt();
                    parcelD2.recycle();
                    jwaVar = new jwa(string, i2 != 0);
                } catch (RemoteException e) {
                    throw new IOException("Remote exception", e);
                }
            }
            jwbVar2.b();
            f(jwaVar, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            jwcVar.a(0, jElapsedRealtime, SystemClock.elapsedRealtime(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            return jwaVar;
        } catch (Throwable th) {
            f(null, -1L, th);
            if (!(th instanceof IOException)) {
                if (th instanceof kmj) {
                    i = 9;
                } else if (th instanceof kmk) {
                    i = 16;
                } else {
                    i = th instanceof IllegalStateException ? 8 : -1;
                }
            }
            jwcVar.a(i, jElapsedRealtime, SystemClock.elapsedRealtime(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            throw th;
        }
    }

    static final void f(jwa jwaVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (jwaVar != null) {
                map.put("limit_ad_tracking", true != jwaVar.b ? "0" : "1");
                String str = jwaVar.a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new jvy(map).start();
        }
    }

    public final void a() {
        kro.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.i;
            if (context == null || this.a == null) {
                return;
            }
            try {
                if (this.b) {
                    ksp.a().b(context, this.a);
                }
            } catch (Throwable unused) {
            }
            this.b = false;
            this.f = null;
            this.a = null;
        }
    }

    final void b() {
        synchronized (this.c) {
            jvz jvzVar = this.d;
            if (jvzVar != null) {
                jvzVar.a.countDown();
                try {
                    this.d.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.e;
            if (j > 0) {
                this.d = new jvz(this, j);
            }
        }
    }

    public final void c(boolean z) {
        kro.g("Calling this from your main thread can lead to deadlock");
        if (z) {
            b();
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            Context context = this.i;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iM = klu.d.m(context, 12451000);
                if (iM != 0 && iM != 2) {
                    throw new IOException("Google Play services not available");
                }
                kln klnVar = new kln();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!ksp.a().c(context, intent, klnVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.a = klnVar;
                    try {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        kro.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                        if (klnVar.a) {
                            throw new IllegalStateException("Cannot call get on this connection more than once");
                        }
                        klnVar.a = true;
                        IBinder iBinder = (IBinder) klnVar.b.poll(10000L, timeUnit);
                        if (iBinder == null) {
                            throw new TimeoutException("Timed out waiting for the service connection");
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.f = iInterfaceQueryLocalInterface instanceof jwd ? (jwd) iInterfaceQueryLocalInterface : new jwd(iBinder);
                        this.b = true;
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } catch (Throwable th2) {
                    throw new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new kmj(9);
            }
        }
    }

    final synchronized void d() {
        if (!this.b) {
            try {
                c(false);
                if (!this.b) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                }
            } catch (Exception e) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e);
            }
        }
    }

    protected final void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
