package defpackage;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kga {
    private static final khn a = new khn("MediaSessionUtils", (String) null);

    public static int a(keu keuVar, long j) {
        if (j == 10000) {
            return keuVar.m;
        }
        return j != 30000 ? keuVar.l : keuVar.n;
    }

    public static int b(keu keuVar, long j) {
        if (j == 10000) {
            return keuVar.A;
        }
        return j != 30000 ? keuVar.z : keuVar.B;
    }

    public static int c(keu keuVar, long j) {
        if (j == 10000) {
            return keuVar.p;
        }
        return j != 30000 ? keuVar.o : keuVar.q;
    }

    public static int d(keu keuVar, long j) {
        if (j == 10000) {
            return keuVar.D;
        }
        return j != 30000 ? keuVar.C : keuVar.E;
    }

    public static List e(kel kelVar) {
        try {
            return kelVar.a();
        } catch (RemoteException e) {
            a.c(e, "Unable to call %s on %s.", "getNotificationActions", "kel");
            return null;
        }
    }

    public static int[] f(kel kelVar) {
        try {
            return kelVar.b();
        } catch (RemoteException e) {
            a.c(e, "Unable to call %s on %s.", "getCompactViewActionIndices", "kel");
            return null;
        }
    }
}
