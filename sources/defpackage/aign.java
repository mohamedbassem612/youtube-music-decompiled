package defpackage;

import androidx.car.app.model.Alert;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aign {
    public final aigm a;
    public int b;
    public int c = 0;
    private int d;

    public aign(aigm aigmVar) {
        aigmVar.getClass();
        this.a = aigmVar;
        aigmVar.k = this;
    }

    private final void P(Object obj, aijg aijgVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aigm aigmVar = this.a;
        aigmVar.P();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        aigmVar.h++;
        try {
            aijgVar.i(obj, this, extensionRegistryLite);
            if (this.b != this.d) {
                throw new aiik("Failed to parse the message.");
            }
            this.a.h--;
            this.d = i;
        } catch (Throwable th) {
            this.a.h--;
            this.d = i;
            throw th;
        }
    }

    private final void Q(Object obj, aijg aijgVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aigm aigmVar = this.a;
        int iK = aigmVar.K();
        aijgVar.i(obj, this, extensionRegistryLite);
        aigmVar.R(iK);
    }

    private final void R(int i) throws aiik {
        if (this.a.e() != i) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void S(int i) throws aiik {
        if ((i & 3) != 0) {
            throw new aiik("Failed to parse the message.");
        }
    }

    private static final void T(int i) throws aiik {
        if ((i & 7) != 0) {
            throw new aiik("Failed to parse the message.");
        }
    }

    public final void A(List list) throws aiik {
        int iN;
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            int i = this.b & 7;
            if (i == 2) {
                aigm aigmVar = this.a;
                int iO = aigmVar.o();
                S(iO);
                int iE = aigmVar.e() + iO;
                while (aigmVar.e() < iE) {
                    aihoVar.h(aigmVar.h());
                }
                R(iE);
                return;
            }
            if (i != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            do {
                aigm aigmVar2 = this.a;
                aihoVar.h(aigmVar2.h());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN = aigmVar2.n();
                }
            } while (iN == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                aigm aigmVar3 = this.a;
                int iO2 = aigmVar3.o();
                S(iO2);
                int iE2 = aigmVar3.e() + iO2;
                while (aigmVar3.e() < iE2) {
                    list.add(Integer.valueOf(aigmVar3.h()));
                }
                R(iE2);
                return;
            }
            if (i2 != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Integer.valueOf(aigmVar4.h()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
        }
        this.c = iN;
    }

    public final void B(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iO = aigmVar.o();
                T(iO);
                int iE = aigmVar.e() + iO;
                while (aigmVar.e() < iE) {
                    aiioVar.g(aigmVar.p());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aiioVar.g(aigmVar2.p());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iO2 = aigmVar3.o();
                T(iO2);
                int iE2 = aigmVar3.e() + iO2;
                while (aigmVar3.e() < iE2) {
                    list.add(Long.valueOf(aigmVar3.p()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Long.valueOf(aigmVar4.p()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void C(List list) throws aiik {
        int iN;
        if (list instanceof aihc) {
            aihc aihcVar = (aihc) list;
            int i = this.b & 7;
            if (i == 2) {
                aigm aigmVar = this.a;
                int iO = aigmVar.o();
                S(iO);
                int iE = aigmVar.e() + iO;
                while (aigmVar.e() < iE) {
                    aihcVar.h(aigmVar.c());
                }
                R(iE);
                return;
            }
            if (i != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            do {
                aigm aigmVar2 = this.a;
                aihcVar.h(aigmVar2.c());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN = aigmVar2.n();
                }
            } while (iN == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                aigm aigmVar3 = this.a;
                int iO2 = aigmVar3.o();
                S(iO2);
                int iE2 = aigmVar3.e() + iO2;
                while (aigmVar3.e() < iE2) {
                    list.add(Float.valueOf(aigmVar3.c()));
                }
                R(iE2);
                return;
            }
            if (i2 != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Float.valueOf(aigmVar4.c()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
        }
        this.c = iN;
    }

    public final void D(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aihoVar.h(aigmVar.i());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aihoVar.h(aigmVar2.i());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Integer.valueOf(aigmVar3.i()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Integer.valueOf(aigmVar4.i()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void E(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aiioVar.g(aigmVar.q());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aiioVar.g(aigmVar2.q());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Long.valueOf(aigmVar3.q()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Long.valueOf(aigmVar4.q()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void F(List list) throws aiik {
        int iN;
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            int i = this.b & 7;
            if (i == 2) {
                aigm aigmVar = this.a;
                int iO = aigmVar.o();
                S(iO);
                int iE = aigmVar.e() + iO;
                while (aigmVar.e() < iE) {
                    aihoVar.h(aigmVar.l());
                }
                R(iE);
                return;
            }
            if (i != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            do {
                aigm aigmVar2 = this.a;
                aihoVar.h(aigmVar2.l());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN = aigmVar2.n();
                }
            } while (iN == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                aigm aigmVar3 = this.a;
                int iO2 = aigmVar3.o();
                S(iO2);
                int iE2 = aigmVar3.e() + iO2;
                while (aigmVar3.e() < iE2) {
                    list.add(Integer.valueOf(aigmVar3.l()));
                }
                R(iE2);
                return;
            }
            if (i2 != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Integer.valueOf(aigmVar4.l()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
        }
        this.c = iN;
    }

    public final void G(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iO = aigmVar.o();
                T(iO);
                int iE = aigmVar.e() + iO;
                while (aigmVar.e() < iE) {
                    aiioVar.g(aigmVar.t());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aiioVar.g(aigmVar2.t());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iO2 = aigmVar3.o();
                T(iO2);
                int iE2 = aigmVar3.e() + iO2;
                while (aigmVar3.e() < iE2) {
                    list.add(Long.valueOf(aigmVar3.t()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Long.valueOf(aigmVar4.t()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void H(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aihoVar.h(aigmVar.m());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aihoVar.h(aigmVar2.m());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Integer.valueOf(aigmVar3.m()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Integer.valueOf(aigmVar4.m()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void I(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aiioVar.g(aigmVar.u());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aiioVar.g(aigmVar2.u());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Long.valueOf(aigmVar3.u()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Long.valueOf(aigmVar4.u()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void J(List list, boolean z) throws aiij {
        int iN;
        int iN2;
        if ((this.b & 7) != 2) {
            throw new aiij("Protocol message tag had invalid wire type.");
        }
        if (!(list instanceof aiin) || z) {
            do {
                list.add(z ? u() : t());
                aigm aigmVar = this.a;
                if (aigmVar.D()) {
                    return;
                } else {
                    iN = aigmVar.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        } else {
            aiin aiinVar = (aiin) list;
            do {
                o();
                aiinVar.b();
                aigm aigmVar2 = this.a;
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        }
        this.c = iN2;
    }

    public final void K(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aihoVar.h(aigmVar.o());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aihoVar.h(aigmVar2.o());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Integer.valueOf(aigmVar3.o()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Integer.valueOf(aigmVar4.o()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void L(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiio) {
            aiio aiioVar = (aiio) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aiioVar.g(aigmVar.v());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aiioVar.g(aigmVar2.v());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Long.valueOf(aigmVar3.v()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Long.valueOf(aigmVar4.v()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void M(int i) throws aiij {
        if ((this.b & 7) != i) {
            throw new aiij("Protocol message tag had invalid wire type.");
        }
    }

    public final boolean N() throws aiij {
        M(0);
        return this.a.E();
    }

    public final boolean O() {
        int i;
        aigm aigmVar = this.a;
        if (aigmVar.D() || (i = this.b) == this.d) {
            return false;
        }
        return aigmVar.F(i);
    }

    public final double a() throws aiij {
        M(1);
        return this.a.b();
    }

    public final float b() throws aiij {
        M(5);
        return this.a.c();
    }

    public final int c() {
        int iN = this.c;
        if (iN != 0) {
            this.b = iN;
            this.c = 0;
        } else {
            iN = this.a.n();
            this.b = iN;
        }
        return (iN == 0 || iN == this.d) ? Alert.DURATION_SHOW_INDEFINITELY : iN >>> 3;
    }

    public final int d() throws aiij {
        M(0);
        return this.a.g();
    }

    public final int e() throws aiij {
        M(5);
        return this.a.h();
    }

    public final int f() throws aiij {
        M(0);
        return this.a.i();
    }

    public final int g() throws aiij {
        M(5);
        return this.a.l();
    }

    public final int h() throws aiij {
        M(0);
        return this.a.m();
    }

    public final int i() throws aiij {
        M(0);
        return this.a.o();
    }

    public final long j() throws aiij {
        M(1);
        return this.a.p();
    }

    public final long k() throws aiij {
        M(0);
        return this.a.q();
    }

    public final long l() throws aiij {
        M(1);
        return this.a.t();
    }

    public final long m() throws aiij {
        M(0);
        return this.a.u();
    }

    public final long n() throws aiij {
        M(0);
        return this.a.v();
    }

    public final aigj o() throws aiij {
        M(2);
        return this.a.w();
    }

    public final Object p(aika aikaVar, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        aika aikaVar2 = aika.DOUBLE;
        switch (aikaVar) {
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
                return Boolean.valueOf(N());
            case STRING:
                return u();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return s(cls, extensionRegistryLite);
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

    public final Object q(aijg aijgVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        Object objE = aijgVar.e();
        P(objE, aijgVar, extensionRegistryLite);
        aijgVar.g(objE);
        return objE;
    }

    public final Object r(aijg aijgVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        Object objE = aijgVar.e();
        Q(objE, aijgVar, extensionRegistryLite);
        aijgVar.g(objE);
        return objE;
    }

    public final Object s(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        M(2);
        return r(aiiz.a.b(cls), extensionRegistryLite);
    }

    public final String t() throws aiij {
        M(2);
        return this.a.x();
    }

    public final String u() throws aiij {
        M(2);
        return this.a.y();
    }

    public final void v(Object obj, aijg aijgVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        M(3);
        P(obj, aijgVar, extensionRegistryLite);
    }

    public final void w(Object obj, aijg aijgVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        M(2);
        Q(obj, aijgVar, extensionRegistryLite);
    }

    public final void x(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiga) {
            aiga aigaVar = (aiga) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aigaVar.f(aigmVar.E());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aigaVar.f(aigmVar2.E());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Boolean.valueOf(aigmVar3.E()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Boolean.valueOf(aigmVar4.E()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void y(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aigt) {
            aigt aigtVar = (aigt) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iO = aigmVar.o();
                T(iO);
                int iE = aigmVar.e() + iO;
                while (aigmVar.e() < iE) {
                    aigtVar.g(aigmVar.b());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aigtVar.g(aigmVar2.b());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iO2 = aigmVar3.o();
                T(iO2);
                int iE2 = aigmVar3.e() + iO2;
                while (aigmVar3.e() < iE2) {
                    list.add(Double.valueOf(aigmVar3.b()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Double.valueOf(aigmVar4.b()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void z(List list) throws aiik {
        int iN;
        int iN2;
        if (list instanceof aiho) {
            aiho aihoVar = (aiho) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar = this.a;
                int iE = aigmVar.e() + aigmVar.o();
                while (aigmVar.e() < iE) {
                    aihoVar.h(aigmVar.g());
                }
                R(iE);
                return;
            }
            do {
                aigm aigmVar2 = this.a;
                aihoVar.h(aigmVar2.g());
                if (aigmVar2.D()) {
                    return;
                } else {
                    iN2 = aigmVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new aiij("Protocol message tag had invalid wire type.");
                }
                aigm aigmVar3 = this.a;
                int iE2 = aigmVar3.e() + aigmVar3.o();
                while (aigmVar3.e() < iE2) {
                    list.add(Integer.valueOf(aigmVar3.g()));
                }
                R(iE2);
                return;
            }
            do {
                aigm aigmVar4 = this.a;
                list.add(Integer.valueOf(aigmVar4.g()));
                if (aigmVar4.D()) {
                    return;
                } else {
                    iN = aigmVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }
}
