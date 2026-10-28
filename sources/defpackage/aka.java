package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aka {
    public static final Object a;
    public static ajz b;
    public static final ajx c;
    public static final List d;
    public static final aju e;
    public static final ahto f = new ahto((byte[]) null, (byte[]) null);
    public static final ahto g = new ahto((byte[]) null, (byte[]) null);
    private static long h;

    static {
        new ahto((byte[]) null, (byte[]) null);
        a = new Object();
        b = ajz.a;
        h = 2L;
        c = new ajx();
        d = awno.a;
        long j = h;
        h = 1 + j;
        e = new aju(j, ajz.a);
        new ajl();
    }

    public static final ajw a() {
        ajw ajwVar = (ajw) f.s();
        return ajwVar == null ? e : ajwVar;
    }

    public static final akd b(akd akdVar, akb akbVar) {
        akd akdVarF;
        ajw ajwVarA = a();
        akd akdVarF2 = f(akdVar, ajwVarA.m(), ajwVarA.n());
        if (akdVarF2 != null) {
            return akdVarF2;
        }
        synchronized (a) {
            ajw ajwVarA2 = a();
            akd akdVarG = akbVar.g();
            akdVarG.getClass();
            akdVarF = f(akdVarG, ajwVarA2.m(), ajwVarA2.n());
        }
        if (akdVarF != null) {
            return akdVarF;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final akd c(akd akdVar, akb akbVar, ajw ajwVar, akd akdVar2) {
        akd akdVarA;
        ajwVar.k();
        long jM = ajwVar.m();
        if (akdVar2.b == jM) {
            return akdVar2;
        }
        synchronized (a) {
            ajx ajxVar = c;
            long j = h;
            if (ajxVar.a > 0) {
                j = ajxVar.b[0];
            }
            ajz ajzVar = ajz.a;
            akd akdVar3 = null;
            akd akdVar4 = null;
            for (akd akdVarG = akbVar.g(); akdVarG != null; akdVarG = akdVarG.c) {
                long j2 = akdVarG.b;
                if (j2 != 0) {
                    if (g((-1) + j, j2, ajzVar)) {
                        if (akdVar4 == null) {
                            akdVar4 = akdVarG;
                        } else if (awrc.a(akdVarG.b, akdVar4.b) >= 0) {
                            akdVar3 = akdVar4;
                            break;
                        }
                    }
                }
                akdVar3 = akdVarG;
                break;
            }
            if (akdVar3 != null) {
                akdVar3.b = Long.MAX_VALUE;
                akdVarA = akdVar3;
            } else {
                akdVarA = akdVar.a();
                akdVarA.c = akbVar.g();
                akbVar.h(akdVarA);
            }
        }
        akdVarA.b = jM;
        ajwVar.f(akbVar);
        return akdVarA;
    }

    public static final akd d(akd akdVar, akb akbVar) {
        akd akdVarF;
        ajw ajwVarA = a();
        ajwVarA.l();
        akd akdVarF2 = f(akdVar, ajwVarA.m(), ajwVarA.n());
        if (akdVarF2 != null) {
            return akdVarF2;
        }
        synchronized (a) {
            ajw ajwVarA2 = a();
            akd akdVarG = akbVar.g();
            akdVarG.getClass();
            akdVarF = f(akdVarG, ajwVarA2.m(), ajwVarA2.n());
            if (akdVarF == null) {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return akdVarF;
    }

    public static final void e(ajw ajwVar, akb akbVar) {
        ajwVar.h(ajwVar.c() + 1);
        awqg awqgVarD = ajwVar.d();
        if (awqgVarD != null) {
            awqgVarD.invoke(akbVar);
        }
    }

    private static final akd f(akd akdVar, long j, ajz ajzVar) {
        akd akdVar2 = null;
        while (akdVar != null) {
            if (g(j, akdVar.b, ajzVar) && (akdVar2 == null || awrc.a(akdVar2.b, akdVar.b) < 0)) {
                akdVar2 = akdVar;
            }
            akdVar = akdVar.c;
        }
        if (akdVar2 != null) {
            return akdVar2;
        }
        return null;
    }

    private static final boolean g(long j, long j2, ajz ajzVar) {
        long[] jArr;
        return j2 != 0 && awrc.a(j2, j) <= 0 && (awrc.a(j2, 0L) < 0 || awrc.a(j2, 64L) >= 0 ? awrc.a(j2, 64L) < 0 || awrc.a(j2, 128L) >= 0 ? awrc.a(j2, 0L) > 0 || (jArr = ajzVar.d) == null || ahs.h(jArr, j2) < 0 : ((1 << (((int) j2) + (-64))) & ajzVar.b) == 0 : ((1 << ((int) j2)) & ajzVar.c) == 0);
    }
}
