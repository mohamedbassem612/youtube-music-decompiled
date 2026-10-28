package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bjm implements bjs {
    private final bji a;
    private final bjy b;
    private final boolean c;

    public bjm(bjy bjyVar, bji bjiVar) {
        this.b = bjyVar;
        this.c = bjiVar instanceof bir;
        this.a = bjiVar;
    }

    @Override // defpackage.bjs
    public final int a(Object obj) {
        bjz bjzVarC = this.b.c(obj);
        int iBq = bjzVarC.e;
        if (iBq == -1) {
            iBq = 0;
            for (int i = 0; i < bjzVarC.b; i++) {
                iBq += 2 + a.bq(2, bjzVarC.c[i] >>> 3) + bih.E(3, (bhy) bjzVarC.d[i]);
            }
            bjzVarC.e = iBq;
        }
        if (this.c) {
            bjv bjvVar = azw.o(obj).b;
            if (bjvVar.size() > 0) {
                lzb lzbVar = (lzb) bjvVar.a(0);
                Object obj2 = lzbVar.c;
                Object obj3 = lzbVar.a;
                throw null;
            }
        }
        return iBq;
    }

    @Override // defpackage.bjs
    public final int b(Object obj) {
        int iHashCode = this.b.c(obj).hashCode();
        return this.c ? (iHashCode * 53) + azw.o(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.bjs
    public final Object c() {
        bji bjiVar = this.a;
        return bjiVar instanceof bis ? ((bis) bjiVar).l() : ((biq) bjiVar.m()).d();
    }

    @Override // defpackage.bjs
    public final void d(Object obj) {
        this.b.e(obj);
        azw.q(obj);
    }

    @Override // defpackage.bjs
    public final void e(Object obj, Object obj2) {
        bjt.i(this.b, obj, obj2);
        if (this.c) {
            bjt.l(obj, obj2);
        }
    }

    @Override // defpackage.bjs
    public final void f(Object obj, bid bidVar, bil bilVar) {
        boolean zN;
        bjy bjyVar = this.b;
        bjz bjzVarB = bjyVar.b(obj);
        azw.p(obj);
        while (bidVar.c() != Integer.MAX_VALUE) {
            try {
                int i = bidVar.b;
                int i2 = 0;
                if (i == 11) {
                    acw acwVarB = null;
                    bhy bhyVarO = null;
                    while (bidVar.c() != Integer.MAX_VALUE) {
                        int i3 = bidVar.b;
                        if (i3 == 16) {
                            i2 = bidVar.i();
                            acwVarB = bilVar.b(this.a, i2);
                        } else if (i3 == 26) {
                            if (acwVarB != null) {
                                throw null;
                            }
                            bhyVarO = bidVar.o();
                        } else if (i3 == 12 || !bidVar.N()) {
                            break;
                        }
                    }
                    if (bidVar.b != 12) {
                        throw new bja("Protocol message end-group tag did not match expected tag.");
                    }
                    if (bhyVarO != null) {
                        if (acwVarB != null) {
                            throw null;
                        }
                        bjzVarB.e((i2 << 3) | 2, bhyVarO);
                    }
                    zN = true;
                } else if ((i & 7) != 2) {
                    zN = bidVar.N();
                } else {
                    if (bilVar.b(this.a, i >>> 3) != null) {
                        throw null;
                    }
                    zN = bjyVar.a(bjzVarB, bidVar, 0);
                }
                if (!zN) {
                    break;
                }
            } catch (Throwable th) {
                bjyVar.f(obj, bjzVarB);
                throw th;
            }
        }
        bjyVar.f(obj, bjzVarB);
    }

    @Override // defpackage.bjs
    public final boolean g(Object obj, Object obj2) {
        bjy bjyVar = this.b;
        if (!bjyVar.c(obj).equals(bjyVar.c(obj2))) {
            return false;
        }
        if (this.c) {
            return azw.o(obj).equals(azw.o(obj2));
        }
        return true;
    }

    @Override // defpackage.bjs
    public final boolean h(Object obj) {
        azw.o(obj).f();
        return true;
    }

    @Override // defpackage.bjs
    public final void i(Object obj, zf zfVar) {
        Iterator itB = azw.o(obj).b();
        if (itB.hasNext()) {
            throw null;
        }
        bjz bjzVarC = this.b.c(obj);
        for (int i = 0; i < bjzVarC.b; i++) {
            int i2 = bjzVarC.c[i] >>> 3;
            Object obj2 = bjzVarC.d[i];
            if (obj2 instanceof bhy) {
                ((bih) zfVar.a).p(i2, (bhy) obj2);
            } else {
                ((bih) zfVar.a).o(i2, (bji) obj2);
            }
        }
    }
}
