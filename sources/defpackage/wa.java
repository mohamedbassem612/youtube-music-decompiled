package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wa {
    private final BiometricManager a;
    private Boolean b = null;
    private final zf c;
    private final ek d;

    public wa(zf zfVar) {
        this.c = zfVar;
        this.a = Build.VERSION.SDK_INT >= 29 ? vy.b((Context) zfVar.a) : null;
        this.d = Build.VERSION.SDK_INT <= 29 ? new ek((Context) zfVar.a, null) : null;
    }

    public static wa a(Context context) {
        return new wa(new zf(context));
    }

    private final int d() {
        ek ekVar = this.d;
        if (ekVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (ekVar.h()) {
            return !ekVar.g() ? 11 : 0;
        }
        return 12;
    }

    private final int e() {
        if (this.c.a()) {
            return d() == 0 ? 0 : -1;
        }
        return d();
    }

    private final int f() {
        BiometricManager biometricManager = this.a;
        if (biometricManager != null) {
            return vy.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final boolean b() {
        Boolean bool;
        BiometricManager biometricManager;
        Boolean bool2 = this.b;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (Build.VERSION.SDK_INT < 35 || (biometricManager = this.a) == null) {
            bool = Boolean.FALSE;
            this.b = bool;
        } else {
            try {
                vz.a(biometricManager, 65536);
                bool = Boolean.TRUE;
                this.b = bool;
            } catch (SecurityException unused) {
                bool = Boolean.FALSE;
                this.b = bool;
            }
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r8 != 21) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa.c():int");
    }
}
