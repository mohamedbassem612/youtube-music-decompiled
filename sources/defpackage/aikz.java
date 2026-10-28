package defpackage;

import java.lang.reflect.Method;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aikz {
    public static final aijp a;
    public static final Method b;
    public static final Method c;
    public static final Method d;

    static {
        Logger.getLogger(aikz.class.getName());
        aihf aihfVarCreateBuilder = aijp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).b = -62135596800L;
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).c = 0;
        aihf aihfVarCreateBuilder2 = aijp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((aijp) aihfVarCreateBuilder2.instance).b = 253402300799L;
        aihfVarCreateBuilder2.copyOnWrite();
        ((aijp) aihfVarCreateBuilder2.instance).c = 999999999;
        aihf aihfVarCreateBuilder3 = aijp.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ((aijp) aihfVarCreateBuilder3.instance).b = 0L;
        aihfVarCreateBuilder3.copyOnWrite();
        ((aijp) aihfVarCreateBuilder3.instance).c = 0;
        a = (aijp) aihfVarCreateBuilder3.build();
        b = e("now");
        c = e("getEpochSecond");
        d = e("getNano");
    }

    private aikz() {
    }

    public static long a(aijp aijpVar) {
        d(aijpVar);
        return a.d(aext.w(aijpVar.b, 1000L), aijpVar.c / 1000000);
    }

    public static aijp b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aijp c(long j, int i) {
        if (!f(j)) {
            throw new IllegalArgumentException(a.cf(j, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = a.d(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            long j2 = (-1) + j;
            if (((((1 ^ j) > 0L ? 1 : ((1 ^ j) == 0L ? 0 : -1)) ^ (-1)) | (((j ^ j2) > 0L ? 1 : ((j ^ j2) == 0L ? 0 : -1)) ^ (-1))) >= 0) {
                throw new ArithmeticException();
            }
            j = j2;
        }
        aihf aihfVarCreateBuilder = aijp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).b = j;
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).c = i;
        aijp aijpVar = (aijp) aihfVarCreateBuilder.build();
        d(aijpVar);
        return aijpVar;
    }

    public static void d(aijp aijpVar) {
        long j = aijpVar.b;
        boolean zF = f(j);
        int i = aijpVar.c;
        if (!zF || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + i + ") must be in range [0, +999,999,999].");
        }
    }

    private static Method e(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean f(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
