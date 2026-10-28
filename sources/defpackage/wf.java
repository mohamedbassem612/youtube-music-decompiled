package defpackage;

import android.database.SQLException;
import android.hardware.biometrics.BiometricPrompt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class wf {
    public static wf a;

    static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(true);
    }

    static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }

    public static boolean c(int i) {
        return (i & 32768) != 0;
    }

    public static boolean d(int i) {
        int i2 = i & (-65537);
        return i2 == 15 || i2 == 255 || i2 == 0;
    }

    public static boolean e(int i) {
        return (i & 255) == 255;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    public static final void g(int i, String str) {
        throw new SQLException(a.bR(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final void h(afv afvVar, awqg awqgVar) {
        afv afvVar2 = new afv(999);
        int i = afvVar.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            afvVar2.put(afvVar.d(i2), afvVar.g(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                awqgVar.invoke(afvVar2);
                afvVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            awqgVar.invoke(afvVar2);
        }
    }
}
