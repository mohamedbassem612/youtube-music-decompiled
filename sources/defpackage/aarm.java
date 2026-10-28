package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aarm implements aary {
    private final boolean a;
    private final awmd b;
    private final awmd c;

    public aarm(awmd awmdVar, awmd awmdVar2, vxz vxzVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.a = vxzVar.l(76, 45420336L, false);
    }

    @Override // defpackage.aary
    public final agev b(String str) {
        agev agevVarB = ((aarl) this.c.io()).b(str);
        return (agevVarB.g() || !this.a) ? agevVarB : ((aart) this.b.io()).b(str);
    }

    @Override // defpackage.aary
    public final String c() {
        g();
        return ((aart) this.b.io()).c();
    }

    @Override // defpackage.aary
    public final List d(zwa zwaVar) {
        if (!this.a) {
            return ((aart) this.b.io()).d(zwaVar);
        }
        ArrayList arrayList = new ArrayList(((aarl) this.c.io()).d(zwaVar));
        Collection.EL.stream(((aart) this.b.io()).d(zwaVar)).filter(new aajl((agkz) Collection.EL.stream(arrayList).map(new aalr(6)).collect(aghu.b), 9)).forEach(new aaer(arrayList, 9));
        return arrayList;
    }

    @Override // defpackage.aary
    public final void e(aaro aaroVar) {
        if (aaroVar.m) {
            ((aarl) this.c.io()).j(aaroVar);
        } else {
            ((aart) this.b.io()).h(aaroVar);
        }
    }

    @Override // defpackage.aary
    public final void f(aaro aaroVar) {
        if (aaroVar.m) {
            return;
        }
        ((aart) this.b.io()).f(aaroVar);
    }

    @Override // defpackage.aary
    public final void g() {
        ((aart) this.b.io()).g();
    }

    @Override // defpackage.aary
    public final void h(aaro aaroVar) {
        ((aart) this.b.io()).h(aaroVar);
    }

    @Override // defpackage.aary
    public final void i(String str) {
        ((aart) this.b.io()).i(str);
    }

    @Override // defpackage.aary
    public final void j(aaro aaroVar) {
        if (aaroVar.m) {
            ((aarl) this.c.io()).j(aaroVar);
        } else {
            ((aart) this.b.io()).j(aaroVar);
        }
    }
}
