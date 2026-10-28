package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aarn implements aary {
    private static final Pattern a = Pattern.compile("^(.*):(.*):(.*)$");
    private final awmd b;
    private final awmd c;

    public aarn(awmd awmdVar, awmd awmdVar2, vxz vxzVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        vxzVar.l(141, 45632204L, false);
    }

    @Override // defpackage.aary
    public final agev b(String str) {
        agev agevVarB = ((aarl) this.c.io()).b(str);
        return !agevVarB.g() ? ((aart) this.b.io()).b(str) : agevVarB;
    }

    @Override // defpackage.aary
    public final String c() {
        g();
        return ((aart) this.b.io()).c();
    }

    @Override // defpackage.aary
    public final List d(zwa zwaVar) {
        agjz agjzVar = new agjz(4);
        agjzVar.j(((aarl) this.c.io()).d(zwaVar));
        agjzVar.j(((aart) this.b.io()).d(zwaVar));
        return agjzVar.g();
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
        if (aaroVar.m) {
            return;
        }
        ((aart) this.b.io()).h(aaroVar);
    }

    @Override // defpackage.aary
    public final void i(String str) {
        if (a.matcher(str).matches()) {
            ((aart) this.b.io()).i(str);
        }
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
