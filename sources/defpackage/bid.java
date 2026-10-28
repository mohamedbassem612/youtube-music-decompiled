package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bid {
    public final bic a;
    public int b;
    public int c = 0;
    private int d;

    public bid(bic bicVar) {
        byte[] bArr = bix.a;
        this.a = bicVar;
        bicVar.d = this;
    }

    private final void O(Object obj, bjs bjsVar, bil bilVar) throws bja {
        bic bicVar = this.a;
        int iN = bicVar.n();
        bicVar.F();
        int iE = bicVar.e(iN);
        bicVar.a++;
        bjsVar.f(obj, this, bilVar);
        bicVar.x(0);
        bicVar.a--;
        bicVar.y(iE);
    }

    private final void P(int i) throws bja {
        if (this.a.d() != i) {
            throw new bja("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void Q(int i) throws bja {
        if ((i & 3) != 0) {
            throw new bja("Failed to parse the message.");
        }
    }

    private static final void R(int i) throws bja {
        if ((i & 7) != 0) {
            throw new bja("Failed to parse the message.");
        }
    }

    public final void A(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iN = bicVar.n();
                R(iN);
                int iD = bicVar.d() + iN;
                do {
                    bjeVar.f(bicVar.o());
                } while (bicVar.d() < iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bjeVar.f(bicVar2.o());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iN2 = bicVar3.n();
                R(iN2);
                int iD2 = bicVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(bicVar3.o()));
                } while (bicVar3.d() < iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Long.valueOf(bicVar4.o()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bip) {
            bip bipVar = (bip) list;
            int i = this.b & 7;
            if (i == 2) {
                bic bicVar = this.a;
                int iN = bicVar.n();
                Q(iN);
                int iD = bicVar.d() + iN;
                do {
                    bipVar.f(bicVar.c());
                } while (bicVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new biz();
            }
            do {
                bic bicVar2 = this.a;
                bipVar.f(bicVar2.c());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                bic bicVar3 = this.a;
                int iN2 = bicVar3.n();
                Q(iN2);
                int iD2 = bicVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(bicVar3.c()));
                } while (bicVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new biz();
            }
            do {
                bic bicVar4 = this.a;
                list.add(Float.valueOf(bicVar4.c()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bitVar.f(bicVar.h());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bitVar.f(bicVar2.h());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Integer.valueOf(bicVar3.h()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Integer.valueOf(bicVar4.h()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bjeVar.f(bicVar.p());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bjeVar.f(bicVar2.p());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Long.valueOf(bicVar3.p()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Long.valueOf(bicVar4.p()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            int i = this.b & 7;
            if (i == 2) {
                bic bicVar = this.a;
                int iN = bicVar.n();
                Q(iN);
                int iD = bicVar.d() + iN;
                do {
                    bitVar.f(bicVar.k());
                } while (bicVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new biz();
            }
            do {
                bic bicVar2 = this.a;
                bitVar.f(bicVar2.k());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                bic bicVar3 = this.a;
                int iN2 = bicVar3.n();
                Q(iN2);
                int iD2 = bicVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(bicVar3.k()));
                } while (bicVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new biz();
            }
            do {
                bic bicVar4 = this.a;
                list.add(Integer.valueOf(bicVar4.k()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iN = bicVar.n();
                R(iN);
                int iD = bicVar.d() + iN;
                do {
                    bjeVar.f(bicVar.r());
                } while (bicVar.d() < iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bjeVar.f(bicVar2.r());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iN2 = bicVar3.n();
                R(iN2);
                int iD2 = bicVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(bicVar3.r()));
                } while (bicVar3.d() < iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Long.valueOf(bicVar4.r()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bitVar.f(bicVar.l());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bitVar.f(bicVar2.l());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Integer.valueOf(bicVar3.l()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Integer.valueOf(bicVar4.l()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bjeVar.f(bicVar.s());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bjeVar.f(bicVar2.s());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Long.valueOf(bicVar3.s()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Long.valueOf(bicVar4.s()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(List list, boolean z) throws biz {
        int iM;
        int iM2;
        if ((this.b & 7) != 2) {
            throw new biz();
        }
        if (!(list instanceof bjd) || z) {
            do {
                list.add(z ? s() : r());
                bic bicVar = this.a;
                if (bicVar.A()) {
                    return;
                } else {
                    iM = bicVar.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        } else {
            bjd bjdVar = (bjd) list;
            do {
                o();
                bjdVar.b();
                bic bicVar2 = this.a;
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        }
        this.c = iM2;
    }

    public final void J(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bitVar.f(bicVar.n());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bitVar.f(bicVar2.n());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Integer.valueOf(bicVar3.n()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Integer.valueOf(bicVar4.n()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bje) {
            bje bjeVar = (bje) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bjeVar.f(bicVar.t());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bjeVar.f(bicVar2.t());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Long.valueOf(bicVar3.t()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Long.valueOf(bicVar4.t()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(int i) throws biz {
        if ((this.b & 7) != i) {
            throw new biz();
        }
    }

    public final boolean M() throws biz {
        L(0);
        return this.a.B();
    }

    public final boolean N() {
        int i;
        bic bicVar = this.a;
        if (bicVar.A() || (i = this.b) == this.d) {
            return false;
        }
        return bicVar.C(i);
    }

    public final double a() throws biz {
        L(1);
        return this.a.b();
    }

    public final float b() throws biz {
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

    public final int d() throws biz {
        L(0);
        return this.a.f();
    }

    public final int e() throws biz {
        L(5);
        return this.a.g();
    }

    public final int f() throws biz {
        L(0);
        return this.a.h();
    }

    public final int g() throws biz {
        L(5);
        return this.a.k();
    }

    public final int h() throws biz {
        L(0);
        return this.a.l();
    }

    public final int i() throws biz {
        L(0);
        return this.a.n();
    }

    public final long j() throws biz {
        L(1);
        return this.a.o();
    }

    public final long k() throws biz {
        L(0);
        return this.a.p();
    }

    public final long l() throws biz {
        L(1);
        return this.a.r();
    }

    public final long m() throws biz {
        L(0);
        return this.a.s();
    }

    public final long n() throws biz {
        L(0);
        return this.a.t();
    }

    public final bhy o() throws biz {
        L(2);
        return this.a.u();
    }

    public final Object p(bkl bklVar, Class cls, bil bilVar) throws biz {
        bkl bklVar2 = bkl.DOUBLE;
        switch (bklVar) {
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
                return s();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                L(2);
                return q(bjp.a.b(cls), bilVar);
            case BYTES:
                return o();
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

    public final Object q(bjs bjsVar, bil bilVar) throws bja {
        Object objC = bjsVar.c();
        O(objC, bjsVar, bilVar);
        bjsVar.d(objC);
        return objC;
    }

    public final String r() throws biz {
        L(2);
        return this.a.v();
    }

    public final String s() throws biz {
        L(2);
        return this.a.w();
    }

    public final void t(Object obj, bjs bjsVar, bil bilVar) throws bja {
        L(3);
        u(obj, bjsVar, bilVar);
    }

    public final void u(Object obj, bjs bjsVar, bil bilVar) throws bja {
        bic bicVar = this.a;
        bicVar.F();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        bicVar.b++;
        try {
            bjsVar.f(obj, this, bilVar);
            if (this.b != this.d) {
                throw new bja("Failed to parse the message.");
            }
            this.a.b--;
            this.d = i;
        } catch (Throwable th) {
            this.a.b--;
            this.d = i;
            throw th;
        }
    }

    public final void v(Object obj, bjs bjsVar, bil bilVar) throws bja {
        L(2);
        O(obj, bjsVar, bilVar);
    }

    public final void w(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bhq) {
            bhq bhqVar = (bhq) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bhqVar.e(bicVar.B());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bhqVar.e(bicVar2.B());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Boolean.valueOf(bicVar3.B()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Boolean.valueOf(bicVar4.B()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void x(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bii) {
            bii biiVar = (bii) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iN = bicVar.n();
                R(iN);
                int iD = bicVar.d() + iN;
                do {
                    biiVar.f(bicVar.b());
                } while (bicVar.d() < iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                biiVar.f(bicVar2.b());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iN2 = bicVar3.n();
                R(iN2);
                int iD2 = bicVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(bicVar3.b()));
                } while (bicVar3.d() < iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Double.valueOf(bicVar4.b()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void y(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new biz();
                }
                bic bicVar = this.a;
                int iD = bicVar.d() + bicVar.n();
                do {
                    bitVar.f(bicVar.f());
                } while (bicVar.d() < iD);
                P(iD);
                return;
            }
            do {
                bic bicVar2 = this.a;
                bitVar.f(bicVar2.f());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new biz();
                }
                bic bicVar3 = this.a;
                int iD2 = bicVar3.d() + bicVar3.n();
                do {
                    list.add(Integer.valueOf(bicVar3.f()));
                } while (bicVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                bic bicVar4 = this.a;
                list.add(Integer.valueOf(bicVar4.f()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(List list) throws bja {
        int iM;
        int iM2;
        if (list instanceof bit) {
            bit bitVar = (bit) list;
            int i = this.b & 7;
            if (i == 2) {
                bic bicVar = this.a;
                int iN = bicVar.n();
                Q(iN);
                int iD = bicVar.d() + iN;
                do {
                    bitVar.f(bicVar.g());
                } while (bicVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new biz();
            }
            do {
                bic bicVar2 = this.a;
                bitVar.f(bicVar2.g());
                if (bicVar2.A()) {
                    return;
                } else {
                    iM2 = bicVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                bic bicVar3 = this.a;
                int iN2 = bicVar3.n();
                Q(iN2);
                int iD2 = bicVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(bicVar3.g()));
                } while (bicVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new biz();
            }
            do {
                bic bicVar4 = this.a;
                list.add(Integer.valueOf(bicVar4.g()));
                if (bicVar4.A()) {
                    return;
                } else {
                    iM = bicVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}
