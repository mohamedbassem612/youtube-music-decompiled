package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvs extends mff implements ndn {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private agev i;
    private agev j;
    private agev k;
    private agev l;
    private final aunk m;

    public mvs(aunk aunkVar) {
        this.m = aunkVar;
    }

    private final void O() {
        if (this.k == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(34);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.k = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    private final void P() {
        if (this.l == null) {
            aunk aunkVar = this.m;
            ahuj ahujVar = new ahuj();
            int iB = aunkVar.b(46);
            if (iB != 0) {
                ahujVar.f(aunkVar.a(iB + aunkVar.a), aunkVar.b);
            } else {
                ahujVar = null;
            }
            this.l = ahujVar == null ? agdf.a : agev.i(new muz(ahujVar));
        }
    }

    private final void Q() {
        if (this.c == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(6);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.c = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    private final void S() {
        if (this.i == null) {
            aunk aunkVar = this.m;
            ahuj ahujVar = new ahuj();
            int iB = aunkVar.b(18);
            if (iB != 0) {
                ahujVar.f(aunkVar.a(iB + aunkVar.a), aunkVar.b);
            } else {
                ahujVar = null;
            }
            this.i = ahujVar == null ? agdf.a : agev.i(new muo(ahujVar));
        }
    }

    private final void T() {
        if (this.h == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(16);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.h = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    private final void U() {
        if (this.g == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(14);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.g = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    private final void V() {
        if (this.f == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(12);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.f = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    private final void W() {
        if (this.e == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(10);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.e = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    private final void X() {
        if (this.j == null) {
            aunk aunkVar = this.m;
            ahuj ahujVar = new ahuj();
            int iB = aunkVar.b(20);
            if (iB != 0) {
                ahujVar.f(aunkVar.a(iB + aunkVar.a), aunkVar.b);
            } else {
                ahujVar = null;
            }
            this.j = ahujVar == null ? agdf.a : agev.i(new muo(ahujVar));
        }
    }

    private final void Y() {
        if (this.b == null) {
            aunk aunkVar = this.m;
            ahuj ahujVar = new ahuj();
            int iB = aunkVar.b(4);
            if (iB != 0) {
                ahujVar.f(aunkVar.a(iB + aunkVar.a), aunkVar.b);
            } else {
                ahujVar = null;
            }
            this.b = ahujVar == null ? agdf.a : agev.i(new muo(ahujVar));
        }
    }

    private final void Z() {
        if (this.d == null) {
            aunk aunkVar = this.m;
            zh zhVar = new zh((byte[]) null);
            int iB = aunkVar.b(8);
            if (iB != 0) {
                zhVar.i(iB + aunkVar.a, aunkVar.b);
            } else {
                zhVar = null;
            }
            this.d = zhVar == null ? agdf.a : agev.i(new mup(zhVar));
        }
    }

    @Override // defpackage.ndn
    public final boolean A() {
        T();
        return this.h.g();
    }

    @Override // defpackage.ndn
    public final boolean B() {
        U();
        return this.g.g();
    }

    @Override // defpackage.ndn
    public final boolean C() {
        V();
        return this.f.g();
    }

    @Override // defpackage.ndn
    public final boolean D() {
        W();
        return this.e.g();
    }

    @Override // defpackage.ndn
    public final boolean E() {
        X();
        return this.j.g();
    }

    @Override // defpackage.ndn
    public final boolean F() {
        Y();
        return this.b.g();
    }

    @Override // defpackage.ndn
    public final int G() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(26);
        int iBg = a.bg(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        return iBg == 0 ? a.bg(0) : iBg;
    }

    @Override // defpackage.ndn
    public final int H() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(28);
        int iBg = a.bg(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iBg == 0) {
            return 1;
        }
        return iBg;
    }

    @Override // defpackage.ndn
    public final int I() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(36);
        int iBg = a.bg(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iBg == 0) {
            return 1;
        }
        return iBg;
    }

    @Override // defpackage.ndn
    public final int J() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(22);
        int iBc = a.bc(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.ndn
    public final int K() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(44);
        int iAV = a.aV(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    @Override // defpackage.ndn
    public final int L() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(24);
        int iAX = a.aX(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iAX == 0) {
            return 1;
        }
        return iAX;
    }

    @Override // defpackage.ndn
    public final int M() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(38);
        int iAS = a.aS(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.ndn
    public final int N() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(42);
        int iBc = a.bc(iB != 0 ? aunkVar.b.getInt(iB + aunkVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.ndn
    public final boolean cm() {
        Z();
        return this.d.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aunk aunkVar = this.m;
            aunk aunkVar2 = ((mvs) obj).m;
            if (aunkVar == aunkVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aunkVar.b;
            ByteBuffer byteBuffer2 = aunkVar2.b;
            if (byteBuffer == null) {
                if (byteBuffer2 == null) {
                    return true;
                }
            } else if (byteBuffer2 != null) {
                if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.array() == byteBuffer2.array() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining()) {
                    return true;
                }
                return byteBuffer.equals(byteBuffer2);
            }
        }
        return false;
    }

    @Override // defpackage.ndn
    public final float g() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(40);
        if (iB != 0) {
            return aunkVar.b.getFloat(iB + aunkVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.ndn
    public final float h() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(30);
        if (iB != 0) {
            return aunkVar.b.getFloat(iB + aunkVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.m.b.hashCode();
    }

    @Override // defpackage.ndn
    public final float i() {
        aunk aunkVar = this.m;
        int iB = aunkVar.b(32);
        if (iB != 0) {
            return aunkVar.b.getFloat(iB + aunkVar.a);
        }
        return 1.0f;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nak] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nak j() {
        S();
        if (this.i.g()) {
            return this.i.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nak] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nak k() {
        X();
        if (this.j.g()) {
            return this.j.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nak] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nak l() {
        Y();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal m() {
        O();
        if (this.k.g()) {
            return this.k.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal n() {
        Q();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal o() {
        T();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal p() {
        U();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal q() {
        V();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal r() {
        W();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nal] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nal s() {
        Z();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nbo] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nbo t() {
        P();
        if (this.l.g()) {
            return this.l.c();
        }
        return null;
    }

    @Override // defpackage.ndn
    public final boolean u() {
        O();
        return this.k.g();
    }

    @Override // defpackage.ndn
    public final boolean v() {
        P();
        return this.l.g();
    }

    @Override // defpackage.ndn
    public final boolean w() {
        return aewo.al(this.m, 30);
    }

    @Override // defpackage.ndn
    public final boolean x() {
        return aewo.al(this.m, 32);
    }

    @Override // defpackage.ndn
    public final boolean y() {
        Q();
        return this.c.g();
    }

    @Override // defpackage.ndn
    public final boolean z() {
        S();
        return this.i.g();
    }
}
