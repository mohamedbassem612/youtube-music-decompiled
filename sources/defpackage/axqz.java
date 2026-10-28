package defpackage;

import java.util.Iterator;
import org.chromium.base.AndroidInfo;
import org.chromium.base.version_info.VersionConstantsBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axqz implements axre {
    private final axqv a;
    private final axrl b;
    private final boolean c;

    public axqz(axrl axrlVar, axqv axqvVar) {
        this.b = axrlVar;
        this.c = axqvVar instanceof axqe;
        this.a = axqvVar;
    }

    @Override // defpackage.axre
    public final int a(Object obj) {
        axrm axrmVarC = this.b.c(obj);
        int iBq = axrmVarC.e;
        if (iBq == -1) {
            iBq = 0;
            for (int i = 0; i < axrmVarC.b; i++) {
                iBq += 2 + a.bq(2, axrmVarC.c[i] >>> 3) + axpk.a(3, (axpo) axrmVarC.d[i]);
            }
            axrmVarC.e = iBq;
        }
        if (this.c) {
            axri axriVar = AndroidInfo.e(obj).b;
            if (axriVar.size() > 0) {
                axrg axrgVar = (axrg) axriVar.a(0);
                lxs lxsVar = axrgVar.c;
                Object obj2 = axrgVar.a;
                throw null;
            }
        }
        return iBq;
    }

    @Override // defpackage.axre
    public final int b(Object obj) {
        int iHashCode = this.b.c(obj).hashCode();
        return this.c ? (iHashCode * 53) + AndroidInfo.e(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.axre
    public final Object c() {
        axqv axqvVar = this.a;
        return axqvVar instanceof axqf ? ((axqf) axqvVar).l() : ((axqd) axqvVar.m()).d();
    }

    @Override // defpackage.axre
    public final void d(Object obj) {
        this.b.e(obj);
        AndroidInfo.g(obj);
    }

    @Override // defpackage.axre
    public final void e(Object obj, Object obj2) {
        axrf.h(this.b, obj, obj2);
        if (this.c) {
            axrf.l(obj, obj2);
        }
    }

    @Override // defpackage.axre
    public final void f(Object obj, axpt axptVar, axpy axpyVar) {
        boolean zN;
        axrl axrlVar = this.b;
        axrm axrmVarB = axrlVar.b(obj);
        AndroidInfo.f(obj);
        while (axptVar.c() != Integer.MAX_VALUE) {
            try {
                int i = axptVar.b;
                int i2 = 0;
                if (i == 11) {
                    VersionConstantsBridge versionConstantsBridgeB = null;
                    axpo axpoVarS = null;
                    while (axptVar.c() != Integer.MAX_VALUE) {
                        int i3 = axptVar.b;
                        if (i3 == 16) {
                            i2 = axptVar.i();
                            versionConstantsBridgeB = axpyVar.b(this.a, i2);
                        } else if (i3 == 26) {
                            if (versionConstantsBridgeB != null) {
                                throw null;
                            }
                            axpoVarS = axptVar.s();
                        } else if (i3 == 12 || !axptVar.N()) {
                            break;
                        }
                    }
                    if (axptVar.b != 12) {
                        throw new axqm("Protocol message end-group tag did not match expected tag.");
                    }
                    if (axpoVarS != null) {
                        if (versionConstantsBridgeB != null) {
                            throw null;
                        }
                        axrmVarB.e((i2 << 3) | 2, axpoVarS);
                    }
                    zN = true;
                } else if ((i & 7) != 2) {
                    zN = axptVar.N();
                } else {
                    if (axpyVar.b(this.a, i >>> 3) != null) {
                        throw null;
                    }
                    zN = axrlVar.a(axrmVarB, axptVar, 0);
                }
                if (!zN) {
                    break;
                }
            } catch (Throwable th) {
                axrlVar.f(obj, axrmVarB);
                throw th;
            }
        }
        axrlVar.f(obj, axrmVarB);
    }

    @Override // defpackage.axre
    public final boolean g(Object obj, Object obj2) {
        axrl axrlVar = this.b;
        if (!axrlVar.c(obj).equals(axrlVar.c(obj2))) {
            return false;
        }
        if (this.c) {
            return AndroidInfo.e(obj).equals(AndroidInfo.e(obj2));
        }
        return true;
    }

    @Override // defpackage.axre
    public final boolean h(Object obj) {
        AndroidInfo.e(obj).f();
        return true;
    }

    @Override // defpackage.axre
    public final void i(Object obj, axkl axklVar) throws axpu {
        Iterator itB = AndroidInfo.e(obj).b();
        if (itB.hasNext()) {
            throw null;
        }
        axrm axrmVarC = this.b.c(obj);
        for (int i = 0; i < axrmVarC.b; i++) {
            int i2 = axrmVarC.c[i] >>> 3;
            Object obj2 = axrmVarC.d[i];
            if (obj2 instanceof axpo) {
                axpk axpkVar = (axpk) axklVar.a;
                axpkVar.y(11);
                axpkVar.x(2, i2);
                axpkVar.m(3, (axpo) obj2);
                axpkVar.y(12);
            } else {
                axpk axpkVar2 = (axpk) axklVar.a;
                axpkVar2.y(11);
                axpkVar2.x(2, i2);
                axpkVar2.y(26);
                axpkVar2.u((axqv) obj2);
                axpkVar2.y(12);
            }
        }
    }
}
