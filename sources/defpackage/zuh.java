package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zuh {
    public final ReentrantLock a;
    private final zwb b;
    private final szn c;
    private final tbt d;
    private String e;
    private String f;
    private boolean g;
    private final ci h;

    public zuh(zwb zwbVar, ci ciVar, szn sznVar, tbt tbtVar) {
        zwbVar.getClass();
        ciVar.getClass();
        tbtVar.getClass();
        this.b = zwbVar;
        this.h = ciVar;
        this.c = sznVar;
        this.d = tbtVar;
        c(a());
        tbtVar.a(this, zwt.class, new gla(this, 6));
        tbtVar.a(this, zwu.class, new gla(this, 7));
        this.a = sznVar == null ? new ReentrantLock() : null;
    }

    public final zuk a() {
        ci ciVar = this.h;
        zwa zwaVarE = this.b.e();
        return new zuk(zwaVarE.k(), ciVar.aD(zwaVarE), zwaVarE.m());
    }

    public final void b() {
        this.d.l(this);
    }

    public final void c(zuk zukVar) {
        ReentrantLock reentrantLock = this.a;
        if (reentrantLock != null) {
            reentrantLock.isLocked();
        }
        this.f = zukVar.e;
        this.e = zukVar.f;
        this.g = zukVar.g;
    }

    public final void d() {
        szn sznVar = this.c;
        zuk zukVarA = a();
        if (sznVar != null) {
            sznVar.c(zukVarA, sznVar.b.b());
            return;
        }
        ReentrantLock reentrantLock = this.a;
        reentrantLock.getClass();
        reentrantLock.lock();
        try {
            c(zukVarA);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean e(zug zugVar) {
        String str;
        ReentrantLock reentrantLock = this.a;
        if (reentrantLock != null) {
            reentrantLock.isLocked();
        }
        String str2 = zugVar.n;
        boolean z = str2 != null;
        String str3 = zugVar.o;
        boolean z2 = str3 != null;
        if (!z || !z2) {
            zui zuiVar = zugVar.k.f.j;
            if (z == z2) {
                if (this.e != null && (str = this.f) != null) {
                    zugVar.a(str).b(this.e).e(this.g);
                    aihf aihfVar = zuiVar.f;
                    int i = ((akkq) aihfVar.instance).aM + 1;
                    aihfVar.copyOnWrite();
                    akkq akkqVar = (akkq) aihfVar.instance;
                    akkqVar.e |= 67108864;
                    akkqVar.aM = i;
                }
                return false;
            }
            if (!z) {
                if (awrc.c(str3, this.e)) {
                    String str4 = this.f;
                    if (str4 == null) {
                        zugVar.a(null).b(null).e(false);
                        aihf aihfVar2 = zuiVar.f;
                        int i2 = ((akkq) aihfVar2.instance).aT + 1;
                        aihfVar2.copyOnWrite();
                        akkq akkqVar2 = (akkq) aihfVar2.instance;
                        akkqVar2.f |= 16;
                        akkqVar2.aT = i2;
                    } else {
                        zugVar.a(str4).e(this.g);
                        aihf aihfVar3 = zuiVar.f;
                        int i3 = ((akkq) aihfVar3.instance).aQ + 1;
                        aihfVar3.copyOnWrite();
                        akkq akkqVar3 = (akkq) aihfVar3.instance;
                        akkqVar3.e |= 1073741824;
                        akkqVar3.aQ = i3;
                    }
                } else {
                    zugVar.a(null).b(null).e(false);
                    aihf aihfVar4 = zuiVar.f;
                    int i4 = ((akkq) aihfVar4.instance).aS + 1;
                    aihfVar4.copyOnWrite();
                    akkq akkqVar4 = (akkq) aihfVar4.instance;
                    akkqVar4.f |= 1;
                    akkqVar4.aS = i4;
                }
                return false;
            }
            if (awrc.c(str2, this.f)) {
                String str5 = this.e;
                if (str5 == null) {
                    zugVar.a(null).b(null).e(false);
                    aihf aihfVar5 = zuiVar.f;
                    int i5 = ((akkq) aihfVar5.instance).aU + 1;
                    aihfVar5.copyOnWrite();
                    akkq akkqVar5 = (akkq) aihfVar5.instance;
                    akkqVar5.f |= 32;
                    akkqVar5.aU = i5;
                    return false;
                }
                zugVar.b(str5).e(this.g);
                aihf aihfVar6 = zuiVar.f;
                int i6 = ((akkq) aihfVar6.instance).aN + 1;
                aihfVar6.copyOnWrite();
                akkq akkqVar6 = (akkq) aihfVar6.instance;
                akkqVar6.e |= 134217728;
                akkqVar6.aN = i6;
            } else {
                zwa zwaVarF = this.b.f(str2);
                if (zwaVarF == null) {
                    zugVar.a(null).b(null).e(false);
                    aihf aihfVar7 = zuiVar.f;
                    int i7 = ((akkq) aihfVar7.instance).aO + 1;
                    aihfVar7.copyOnWrite();
                    akkq akkqVar7 = (akkq) aihfVar7.instance;
                    akkqVar7.e |= 268435456;
                    akkqVar7.aO = i7;
                    return false;
                }
                String strAD = this.h.aD(zwaVarF);
                if (strAD == null) {
                    zugVar.a(null).b(null).e(false);
                    aihf aihfVar8 = zuiVar.f;
                    int i8 = ((akkq) aihfVar8.instance).aP + 1;
                    aihfVar8.copyOnWrite();
                    akkq akkqVar8 = (akkq) aihfVar8.instance;
                    akkqVar8.e |= 536870912;
                    akkqVar8.aP = i8;
                    return false;
                }
                aihf aihfVar9 = zuiVar.f;
                int i9 = ((akkq) aihfVar9.instance).aR + 1;
                aihfVar9.copyOnWrite();
                akkq akkqVar9 = (akkq) aihfVar9.instance;
                akkqVar9.e |= Integer.MIN_VALUE;
                akkqVar9.aR = i9;
                zugVar.b(strAD).e(zwaVarF.m());
            }
        }
        return true;
    }
}
