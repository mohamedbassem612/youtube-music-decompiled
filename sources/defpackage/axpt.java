package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpt {
    public final axps a;
    public int b;
    public int c = 0;
    private int d;

    public axpt(axps axpsVar) {
        byte[] bArr = axqj.a;
        this.a = axpsVar;
        axpsVar.d = this;
    }

    private final void O(Object obj, axre axreVar, axpy axpyVar) throws axqm {
        axps axpsVar = this.a;
        int iN = axpsVar.n();
        axpsVar.F();
        int iE = axpsVar.e(iN);
        axpsVar.a++;
        axreVar.f(obj, this, axpyVar);
        axpsVar.x(0);
        axpsVar.a--;
        axpsVar.y(iE);
    }

    private final void P(int i) throws axqm {
        if (this.a.d() != i) {
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void Q(int i) throws axqm {
        if ((i & 3) != 0) {
            throw new axqm("Failed to parse the message.");
        }
    }

    private static final void R(int i) throws axqm {
        if ((i & 7) != 0) {
            throw new axqm("Failed to parse the message.");
        }
    }

    public final void A(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iN = axpsVar.n();
                R(iN);
                int iD = axpsVar.d() + iN;
                do {
                    axqqVar.f(axpsVar.o());
                } while (axpsVar.d() < iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqqVar.f(axpsVar2.o());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iN2 = axpsVar3.n();
                R(iN2);
                int iD2 = axpsVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(axpsVar3.o()));
                } while (axpsVar3.d() < iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Long.valueOf(axpsVar4.o()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqc) {
            axqc axqcVar = (axqc) list;
            int i = this.b & 7;
            if (i == 2) {
                axps axpsVar = this.a;
                int iN = axpsVar.n();
                Q(iN);
                int iD = axpsVar.d() + iN;
                do {
                    axqcVar.f(axpsVar.c());
                } while (axpsVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new axql();
            }
            do {
                axps axpsVar2 = this.a;
                axqcVar.f(axpsVar2.c());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                axps axpsVar3 = this.a;
                int iN2 = axpsVar3.n();
                Q(iN2);
                int iD2 = axpsVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(axpsVar3.c()));
                } while (axpsVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new axql();
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Float.valueOf(axpsVar4.c()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqgVar.f(axpsVar.h());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqgVar.f(axpsVar2.h());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Integer.valueOf(axpsVar3.h()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Integer.valueOf(axpsVar4.h()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqqVar.f(axpsVar.p());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqqVar.f(axpsVar2.p());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Long.valueOf(axpsVar3.p()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Long.valueOf(axpsVar4.p()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            int i = this.b & 7;
            if (i == 2) {
                axps axpsVar = this.a;
                int iN = axpsVar.n();
                Q(iN);
                int iD = axpsVar.d() + iN;
                do {
                    axqgVar.f(axpsVar.k());
                } while (axpsVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new axql();
            }
            do {
                axps axpsVar2 = this.a;
                axqgVar.f(axpsVar2.k());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                axps axpsVar3 = this.a;
                int iN2 = axpsVar3.n();
                Q(iN2);
                int iD2 = axpsVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(axpsVar3.k()));
                } while (axpsVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new axql();
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Integer.valueOf(axpsVar4.k()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iN = axpsVar.n();
                R(iN);
                int iD = axpsVar.d() + iN;
                do {
                    axqqVar.f(axpsVar.r());
                } while (axpsVar.d() < iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqqVar.f(axpsVar2.r());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iN2 = axpsVar3.n();
                R(iN2);
                int iD2 = axpsVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(axpsVar3.r()));
                } while (axpsVar3.d() < iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Long.valueOf(axpsVar4.r()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqgVar.f(axpsVar.l());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqgVar.f(axpsVar2.l());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Integer.valueOf(axpsVar3.l()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Integer.valueOf(axpsVar4.l()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqqVar.f(axpsVar.s());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqqVar.f(axpsVar2.s());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Long.valueOf(axpsVar3.s()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Long.valueOf(axpsVar4.s()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(List list, boolean z) throws axql {
        int iM;
        int iM2;
        if ((this.b & 7) != 2) {
            throw new axql();
        }
        if (!(list instanceof axqp) || z) {
            do {
                list.add(z ? r() : q());
                axps axpsVar = this.a;
                if (axpsVar.A()) {
                    return;
                } else {
                    iM = axpsVar.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        } else {
            axqp axqpVar = (axqp) list;
            do {
                s();
                axqpVar.a();
                axps axpsVar2 = this.a;
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        }
        this.c = iM2;
    }

    public final void J(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqgVar.f(axpsVar.n());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqgVar.f(axpsVar2.n());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Integer.valueOf(axpsVar3.n()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Integer.valueOf(axpsVar4.n()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqq) {
            axqq axqqVar = (axqq) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqqVar.f(axpsVar.t());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqqVar.f(axpsVar2.t());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Long.valueOf(axpsVar3.t()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Long.valueOf(axpsVar4.t()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(int i) throws axql {
        if ((this.b & 7) != i) {
            throw new axql();
        }
    }

    public final boolean M() throws axql {
        L(0);
        return this.a.B();
    }

    public final boolean N() {
        int i;
        axps axpsVar = this.a;
        if (axpsVar.A() || (i = this.b) == this.d) {
            return false;
        }
        return axpsVar.C(i);
    }

    public final double a() throws axql {
        L(1);
        return this.a.b();
    }

    public final float b() throws axql {
        L(5);
        return this.a.c();
    }

    public final int c() {
        int iM = this.c;
        if (iM != 0) {
            this.b = iM;
            this.c = 0;
        } else {
            iM = this.a.m();
            this.b = iM;
        }
        return (iM == 0 || iM == this.d) ? Alert.DURATION_SHOW_INDEFINITELY : iM >>> 3;
    }

    public final int d() throws axql {
        L(0);
        return this.a.f();
    }

    public final int e() throws axql {
        L(5);
        return this.a.g();
    }

    public final int f() throws axql {
        L(0);
        return this.a.h();
    }

    public final int g() throws axql {
        L(5);
        return this.a.k();
    }

    public final int h() throws axql {
        L(0);
        return this.a.l();
    }

    public final int i() throws axql {
        L(0);
        return this.a.n();
    }

    public final long j() throws axql {
        L(1);
        return this.a.o();
    }

    public final long k() throws axql {
        L(0);
        return this.a.p();
    }

    public final long l() throws axql {
        L(1);
        return this.a.r();
    }

    public final long m() throws axql {
        L(0);
        return this.a.s();
    }

    public final long n() throws axql {
        L(0);
        return this.a.t();
    }

    public final Object o(axrt axrtVar, Class cls, axpy axpyVar) throws axql {
        axrt axrtVar2 = axrt.DOUBLE;
        switch (axrtVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(M());
            case STRING:
                return r();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                L(2);
                return p(axrb.a.a(cls), axpyVar);
            case BYTES:
                return s();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object p(axre axreVar, axpy axpyVar) throws axqm {
        Object objC = axreVar.c();
        O(objC, axreVar, axpyVar);
        axreVar.d(objC);
        return objC;
    }

    public final String q() throws axql {
        L(2);
        return this.a.u();
    }

    public final String r() throws axql {
        L(2);
        return this.a.v();
    }

    public final axpo s() throws axql {
        L(2);
        return this.a.w();
    }

    public final void t(Object obj, axre axreVar, axpy axpyVar) throws axqm {
        L(3);
        u(obj, axreVar, axpyVar);
    }

    public final void u(Object obj, axre axreVar, axpy axpyVar) throws axqm {
        axps axpsVar = this.a;
        axpsVar.F();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        axpsVar.b++;
        try {
            axreVar.f(obj, this, axpyVar);
            if (this.b != this.d) {
                throw new axqm("Failed to parse the message.");
            }
            this.a.b--;
            this.d = i;
        } catch (Throwable th) {
            this.a.b--;
            this.d = i;
            throw th;
        }
    }

    public final void v(Object obj, axre axreVar, axpy axpyVar) throws axqm {
        L(2);
        O(obj, axreVar, axpyVar);
    }

    public final void w(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axpj) {
            axpj axpjVar = (axpj) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axpjVar.e(axpsVar.B());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axpjVar.e(axpsVar2.B());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Boolean.valueOf(axpsVar3.B()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Boolean.valueOf(axpsVar4.B()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void x(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axpv) {
            axpv axpvVar = (axpv) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iN = axpsVar.n();
                R(iN);
                int iD = axpsVar.d() + iN;
                do {
                    axpvVar.f(axpsVar.b());
                } while (axpsVar.d() < iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axpvVar.f(axpsVar2.b());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iN2 = axpsVar3.n();
                R(iN2);
                int iD2 = axpsVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(axpsVar3.b()));
                } while (axpsVar3.d() < iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Double.valueOf(axpsVar4.b()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void y(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new axql();
                }
                axps axpsVar = this.a;
                int iD = axpsVar.d() + axpsVar.n();
                do {
                    axqgVar.f(axpsVar.f());
                } while (axpsVar.d() < iD);
                P(iD);
                return;
            }
            do {
                axps axpsVar2 = this.a;
                axqgVar.f(axpsVar2.f());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new axql();
                }
                axps axpsVar3 = this.a;
                int iD2 = axpsVar3.d() + axpsVar3.n();
                do {
                    list.add(Integer.valueOf(axpsVar3.f()));
                } while (axpsVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Integer.valueOf(axpsVar4.f()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(List list) throws axqm {
        int iM;
        int iM2;
        if (list instanceof axqg) {
            axqg axqgVar = (axqg) list;
            int i = this.b & 7;
            if (i == 2) {
                axps axpsVar = this.a;
                int iN = axpsVar.n();
                Q(iN);
                int iD = axpsVar.d() + iN;
                do {
                    axqgVar.f(axpsVar.g());
                } while (axpsVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new axql();
            }
            do {
                axps axpsVar2 = this.a;
                axqgVar.f(axpsVar2.g());
                if (axpsVar2.A()) {
                    return;
                } else {
                    iM2 = axpsVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                axps axpsVar3 = this.a;
                int iN2 = axpsVar3.n();
                Q(iN2);
                int iD2 = axpsVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(axpsVar3.g()));
                } while (axpsVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new axql();
            }
            do {
                axps axpsVar4 = this.a;
                list.add(Integer.valueOf(axpsVar4.g()));
                if (axpsVar4.A()) {
                    return;
                } else {
                    iM = axpsVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}
