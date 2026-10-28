package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anq {
    private static final anp j = new anp();
    private static final wf l = new wf();
    public ane a;
    public apf b;
    public apj c;
    public final anz d;
    public final ans e;
    public boolean f;
    public int g;
    public ajm h;
    public eol i;
    private final zs k;

    public /* synthetic */ anq(byte[] bArr) {
        aov.a.addAndGet(1);
        this.k = new zs(new aiz(new anq[16]));
        this.a = j;
        this.b = anr.a;
        this.c = apj.a;
        this.h = ahn.a;
        this.g = 3;
        this.d = new anz(this);
        this.e = new ans(this);
        this.f = true;
    }

    public final aiz a() {
        return (aiz) this.k.a;
    }

    public final anw b() {
        return this.e.i;
    }

    public final aoa c() {
        return this.d.b;
    }

    public final aoa d() {
        return this.d.c;
    }

    public final List e() {
        anw anwVarB = b();
        if (!anwVarB.l) {
            return anwVarB.k.d();
        }
        anq anqVarL = anwVarB.l();
        aiz aizVar = anwVarB.k;
        aiz aizVarA = anqVarL.a();
        Object[] objArr = aizVarA.a;
        int i = aizVarA.b;
        for (int i2 = 0; i2 < i; i2++) {
            anq anqVar = (anq) objArr[i2];
            if (aizVar.b <= i2) {
                aizVar.i(anqVar.e.i);
            } else {
                aizVar.c(i2, anqVar.e.i);
            }
        }
        int size = anqVarL.f().size();
        int i3 = aizVar.b;
        if (i3 > size) {
            int i4 = i3 - 1;
            int i5 = i3 - (i3 - size);
            if (i5 <= i4) {
                int i6 = i5;
                while (true) {
                    aizVar.a[i6] = null;
                    if (i6 == i4) {
                        break;
                    }
                    i6++;
                }
            }
            aizVar.b = i5;
        }
        anwVarB.l = false;
        return aizVar.d();
    }

    public final List f() {
        return a().d();
    }

    public final void g() {
        this.g = 3;
        aiz aizVarA = a();
        Object[] objArr = aizVarA.a;
        int i = aizVarA.b;
        for (int i2 = 0; i2 < i; i2++) {
            anq anqVar = (anq) objArr[i2];
            if (anqVar.g != 3) {
                anqVar.g();
            }
        }
    }

    public final void h() {
        if (this.f) {
            d();
            for (aoa aoaVarC = c(); !awrc.c(aoaVarC, null); aoaVarC = null) {
            }
            this.f = false;
        }
    }

    public final void i(apf apfVar) {
        if (awrc.c(this.b, apfVar)) {
            return;
        }
        this.b = apfVar;
        aoa aoaVarC = c();
        for (aoa aoaVarD = d(); aoaVarD != aoaVarC; aoaVarD = null) {
            aoaVarD.getClass();
        }
        c();
        for (akp akpVar = this.d.e; akpVar != null; akpVar = null) {
        }
    }

    public final boolean j() {
        return b().h;
    }

    public final void k(Throwable th) throws Throwable {
        if (((akh) this.h.d(aki.a)) == null) {
            throw th;
        }
        throw null;
    }

    public final int l() {
        return this.e.k;
    }

    public final void m() {
        this.e.b();
    }

    public final void n() {
        boolean z = this.e.i.i;
    }

    public final eol o() {
        eol eolVar = this.i;
        if (eolVar != null) {
            return eolVar;
        }
        eol eolVar2 = new eol(this, this.a);
        this.i = eolVar2;
        return eolVar2;
    }

    public final String toString() {
        String name = getClass().isAnonymousClass() ? getClass().getName() : getClass().getSimpleName();
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(this))}, 1));
        str.getClass();
        return a.cl(str, (byte) 64, name) + " children: " + f().size() + " measurePolicy: " + this.a + " deactivated: false isVirtual: false isPlaced: " + j();
    }

    public anq() {
        this(null);
    }
}
