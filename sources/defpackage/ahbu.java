package defpackage;

import j$.time.Instant;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahbu {
    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        d(Long.MAX_VALUE);
        d(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    public static double a(Instant instant) {
        return instant.getEpochSecond() + (((double) instant.getNano()) / 1.0E9d);
    }

    public static long b(Instant instant) {
        return instant.getEpochSecond() < -9223372036854L ? a.d(afxw.F(instant.getEpochSecond() + 1), (instant.getNano() / 1000) - 1000000) : a.d(afxw.F(instant.getEpochSecond()), instant.getNano() / 1000);
    }

    public static void c(long j) {
        Instant.ofEpochSecond(afxw.U(j, 1000000L, RoundingMode.FLOOR), afxw.T(j, 1000000) * 1000);
    }

    public static void d(long j) {
        Instant.ofEpochSecond(afxw.U(j, 1000000000L, RoundingMode.FLOOR), afxw.T(j, 1000000000));
    }
}
