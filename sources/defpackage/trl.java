package defpackage;

import j$.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trl {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    private final long e;
    private final long f;

    public trl(tqj tqjVar) {
        int i = tqr.a;
        long jC = tqjVar.c(1077936256);
        long jC2 = tqjVar.c(1077936768);
        long jNextLong = ThreadLocalRandom.current().nextLong();
        jC = jC == 0 ? ((((68719484352L | ((19 & 31) << 14)) & (-66584577)) | ((9 & 127) << 19)) & (-8522825729L)) | ((19 & 127) << 26) : jC;
        jC2 = jC2 == 0 ? 32768 | (((19 & 31) | ((7 & 31) << 5)) & (-523265)) : jC2;
        this.e = jC;
        this.f = jC2;
        int iF = f(192);
        int iF2 = f(225);
        if (iF != 0 && !g(262, jNextLong)) {
            iF = 7;
        }
        this.a = iF;
        if (iF2 != 0 && !g(164, jNextLong)) {
            iF2 = 7;
        }
        this.b = iF2;
        this.c = ((jC >> 38) & 1) == 1;
        long jB = b(469);
        this.d = jB > 0 && ((jNextLong >> 21) & 127) <= jB;
    }

    public static long d(aqiz aqizVar) {
        aqim aqimVar = aqizVar.k;
        if (aqimVar == null) {
            aqimVar = aqim.a;
        }
        aqix aqixVar = aqizVar.m;
        if (aqixVar == null) {
            aqixVar = aqix.a;
        }
        aqip aqipVar = aqizVar.l;
        if (aqipVar == null) {
            aqipVar = aqip.a;
        }
        long jMax = Math.max(0L, Math.min(aqimVar.g, 7L));
        long jMax2 = Math.max(0L, Math.min(aqixVar.b, 7L)) & 7;
        long jMax3 = Math.max(0L, Math.min(aqipVar.b, 7L)) & 7;
        long jMax4 = Math.max(0L, Math.min(aqimVar.h, 15L)) & 15;
        long jMax5 = Math.max(0L, Math.min(aqixVar.c, 15L)) & 15;
        long jMax6 = Math.max(0L, Math.min(aqipVar.c, 3L)) & 3;
        long j = jMax4 << 6;
        long j2 = jMax3 << 33;
        long j3 = jMax2 << 3;
        long j4 = jMax & 7;
        long j5 = jMax6 << 36;
        return ((((((((((((((((((((((((j4 | j3) & (-60129542145L)) | j2) & (-961)) | j) & (-15361)) | (jMax5 << 10)) & (-206158430209L)) | j5) & (-7696581394433L)) | ((Math.max(0L, Math.min(aqimVar.i, 7L)) & 7) << 40)) & (-272678883688449L)) | ((Math.max(0L, Math.min(aqimVar.j, 31L)) & 31) << 43)) & (-274877906945L)) | ((Math.max(0L, Math.min(true == aqipVar.e ? 1L : 0L, 1L)) & 1) << 38)) & (-549755813889L)) | ((Math.max(0L, Math.min(true != aqipVar.d ? 0L : 1L, 1L)) & 1) << 39) | ((Math.max(0L, Math.min(aqimVar.l, 7L)) & 7) << 61)) & (-507905)) | ((Math.max(0L, Math.min((Math.max(250L, Math.min(aqimVar.b, 8000L)) - 250) / 250, 31L)) & 31) << 14)) & (-66584577)) | ((Math.max(0L, Math.min((Math.max(50L, Math.min(aqimVar.e, 6400L)) - 50) / 50, 127L)) & 127) << 19)) & (-8522825729L)) | ((Math.max(0L, Math.min((Math.max(50L, Math.min(aqimVar.f, 6400L)) - 50) / 50, 127L)) & 127) << 26)) & (-2161727821137838081L)) | ((Math.max(0L, Math.min(Math.max(0L, Math.min(aqimVar.k, 3000L)) / 200, 15L)) & 15) << 57);
    }

    public static long e(aqiz aqizVar) {
        aqim aqimVar = aqizVar.k;
        if (aqimVar == null) {
            aqimVar = aqim.a;
        }
        aqip aqipVar = aqizVar.l;
        if (aqipVar == null) {
            aqipVar = aqip.a;
        }
        aqix aqixVar = aqizVar.m;
        if (aqixVar == null) {
            aqixVar = aqix.a;
        }
        long jMax = Math.max(0L, Math.min((Math.max(250L, Math.min(aqimVar.n, 8000L)) - 250) / 250, 31L));
        long jMax2 = Math.max(0L, Math.min((Math.max(250L, Math.min(aqimVar.o, 8000L)) - 250) / 250, 31L)) & 31;
        long jMax3 = Math.max(0L, Math.min(Math.max(0L, Math.min(aqimVar.s, 310L)) / 10, 31L)) & 31;
        long jMax4 = Math.max(0L, Math.min(Math.max(0L, Math.min(aqimVar.t, 310L)) / 10, 31L)) & 31;
        long j = jMax2 << 5;
        long j2 = jMax & 31;
        long j3 = jMax4 << 34;
        return ((((((((((((((j2 | j) & (-16642998273L)) | (jMax3 << 29)) & (-532575944705L)) | j3) & (-31745)) | ((Math.max(0L, Math.min(Math.max(0L, Math.min(aqimVar.p, 155L)) / 5, 31L)) & 31) << 10)) & (-491521)) | ((Math.max(0L, Math.min(aqimVar.q, 15L)) & 15) << 15)) & (-524289)) | ((Math.max(0L, Math.min(true != aqipVar.f ? 0L : 1L, 1L)) & 1) << 19)) & (-1048577)) | ((Math.max(0L, Math.min(true != aqixVar.d ? 0L : 1L, 1L)) & 1) << 20)) & (-266338305)) | ((Math.max(0L, Math.min(aqimVar.r, 127L)) & 127) << 21);
    }

    private final int f(int i) {
        return (int) ((this.e >> (i & 63)) & ((1 << (i >> 6)) - 1));
    }

    private final boolean g(int i, long j) {
        long jF = f(i);
        return jF > 0 && ((j >> (i & 63)) & ((1 << (i >> 6)) + (-1))) <= jF;
    }

    public final int a(int i, int i2, int i3) {
        return (int) ((((this.e >> (i & 63)) & ((1 << (i >> 6)) - 1)) * ((long) i3)) + ((long) i2));
    }

    public final int b(int i) {
        return (int) ((this.f >> (i & 63)) & ((1 << (i >> 6)) - 1));
    }

    public final int c(int i, int i2, int i3) {
        return (int) ((((this.f >> (i & 63)) & 31) * ((long) i3)) + ((long) i2));
    }
}
