package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kme {
    static final kmc a;
    static final kmc b;
    public static Context c;
    static volatile krh d;
    private static final Object e;

    static {
        new klv(krd.e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new klw(krd.e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new klx(krd.e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new kly(krd.e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new klz(krd.e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new kma(krd.e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new Object();
    }

    static synchronized void a(Context context) {
        if (c == null) {
            c = context.getApplicationContext();
        } else {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    static void b() {
        krh krhVar;
        if (d == null) {
            kro.l(c);
            synchronized (e) {
                if (d == null) {
                    IBinder iBinderC = kvc.d(c, kvc.d, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl");
                    if (iBinderC == null) {
                        krhVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        krhVar = iInterfaceQueryLocalInterface instanceof krh ? (krh) iInterfaceQueryLocalInterface : new krh(iBinderC);
                    }
                    d = krhVar;
                }
            }
        }
    }

    @Deprecated
    static kmi c(String str, krd krdVar, boolean z, boolean z2) {
        kmi kmiVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                b();
                kro.l(c);
                kmh kmhVar = new kmh(str, krdVar, z, z2);
                try {
                    krh krhVar = d;
                    kun kunVar = new kun(c.getPackageManager());
                    Parcel parcelC = krhVar.c();
                    gdc.c(parcelC, kmhVar);
                    gdc.e(parcelC, kunVar);
                    Parcel parcelD = krhVar.d(5, parcelC);
                    boolean zF = gdc.f(parcelD);
                    parcelD.recycle();
                    kmiVar = zF ? kmi.a : new kmi(false);
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    kmiVar = new kmi(false);
                }
            } catch (kuy e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                e3.getMessage();
                kmiVar = new kmi(false);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return kmiVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
