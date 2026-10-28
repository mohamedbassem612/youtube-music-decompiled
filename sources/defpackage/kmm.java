package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmm {
    private static kmm b;
    private static volatile HashSet c;
    private static volatile HashSet d;
    public final Object a;
    private volatile Object e;

    public kmm(Context context) {
        this.a = context.getApplicationContext();
    }

    public static kmm a(Context context) {
        kmm kmmVar;
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        synchronized (kmm.class) {
            kmmVar = b;
            if (kmmVar == null) {
                kme.a(context);
                kmmVar = new kmm(context);
                b = kmmVar;
            }
        }
        return kmmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final boolean c(PackageInfo packageInfo, boolean z) {
        agke agkeVarG;
        int i;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            agke agkeVar = z ? kmd.b : kmd.a;
            int i2 = ksq.a;
            if (Build.VERSION.SDK_INT < 28) {
                byte[] byteArray = null;
                if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                    byteArray = packageInfo.signatures[0].toByteArray();
                }
                if (byteArray != null) {
                    Object[] objArr = {byteArray};
                    aguu.j(objArr, 1);
                    agkeVarG = new agpi(objArr, 1);
                } else {
                    agkeVarG = agpi.a;
                }
            } else {
                if (Build.VERSION.SDK_INT < 28) {
                    throw new IllegalStateException();
                }
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    agkeVarG = agpi.a;
                } else {
                    agjz agjzVar = new agjz(4);
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        agjzVar.h(signature.toByteArray());
                    }
                    agkeVarG = agjzVar.g();
                }
            }
            if (agkeVarG.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            agke agkeVarA = agkeVarG.a();
            int size = agkeVarA.size();
            int i3 = 0;
            while (i3 < size) {
                byte[] bArr = (byte[]) agkeVarA.get(i3);
                agqs agqsVarListIterator = agkeVar.listIterator(0);
                while (true) {
                    i = i3 + 1;
                    if (agqsVarListIterator.hasNext()) {
                        if (Arrays.equals(bArr, (byte[]) agqsVarListIterator.next())) {
                            return true;
                        }
                    }
                }
                i3 = i;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            if ((z ? f(packageInfo, kmd.c) : f(packageInfo, kmd.c[0])) == null) {
                return false;
            }
        }
    }

    private static krd f(PackageInfo packageInfo, krd... krdVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        kmb kmbVar = new kmb(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < krdVarArr.length; i++) {
            if (krdVarArr[i].equals(kmbVar)) {
                return krdVarArr[i];
            }
        }
        return null;
    }

    public final boolean b(String str) {
        return d(str).b;
    }

    public final kmi d(String str) {
        kmi kmiVar;
        if (str != null) {
            HashSet hashSet = c;
            HashSet hashSet2 = d;
            int i = kso.a;
            if (str.equals(this.e)) {
                return kmi.a;
            }
            Context context = kme.c;
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    kme.b();
                    krh krhVar = kme.d;
                    Parcel parcelD = krhVar.d(7, krhVar.c());
                    boolean zF = gdc.f(parcelD);
                    parcelD.recycle();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (zF) {
                        boolean zE = kml.e((Context) this.a);
                        Boolean boolValueOf = Boolean.valueOf(zE);
                        Boolean bool = Boolean.TRUE;
                        boolValueOf.getClass();
                        bool.booleanValue();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            kro.l(kme.c);
                            try {
                                kme.b();
                                kro.l(kme.c);
                                str = str;
                                kmf kmfVar = new kmf(str, zE, false, new kun(kme.c), false, true, false);
                                try {
                                    krh krhVar2 = kme.d;
                                    Parcel parcelC = krhVar2.c();
                                    gdc.c(parcelC, kmfVar);
                                    Parcel parcelD2 = krhVar2.d(6, parcelC);
                                    kmg kmgVar = (kmg) gdc.a(parcelD2, kmg.CREATOR);
                                    parcelD2.recycle();
                                    if (kmgVar.a) {
                                        kmgVar.b();
                                        long j = kmgVar.e;
                                        kmiVar = new kmi(true);
                                    } else {
                                        String str2 = kmgVar.b;
                                        if (kmgVar.a() == 4) {
                                            new PackageManager.NameNotFoundException();
                                        }
                                        kmgVar.b();
                                        kmgVar.a();
                                        kmiVar = new kmi(false);
                                    }
                                } catch (RemoteException e) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                    kmiVar = new kmi(false);
                                }
                            } catch (kuy e2) {
                                str = str;
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                e2.getMessage();
                                kmiVar = new kmi(false);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.a).getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                            boolean zE2 = kml.e((Context) this.a);
                            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                                kmiVar = new kmi(false);
                            } else {
                                kmb kmbVar = new kmb(packageInfo.signatures[0].toByteArray());
                                String str3 = packageInfo.packageName;
                                kmi kmiVarC = kme.c(str3, kmbVar, zE2, false);
                                kmiVar = (!kmiVarC.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !kme.c(str3, kmbVar, false, true).b) ? kmiVarC : new kmi(false);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            } catch (RemoteException | kuy e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
            if (kmiVar.b) {
                this.e = str;
            }
            return kmiVar;
        }
        return new kmi(false);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [exd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [exe, java.lang.Object] */
    public final exe e() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = this.a.a();
                }
                if (this.e == null) {
                    this.e = new exg();
                }
            }
        }
        return this.e;
    }

    public kmm(exd exdVar) {
        this.a = exdVar;
    }
}
