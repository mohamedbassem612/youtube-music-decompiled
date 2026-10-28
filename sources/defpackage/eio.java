package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eio implements eis, eia {
    public final eix a;
    public ekx b;
    private final ehm c;

    public eio(ehm ehmVar, ele eleVar, ekw ekwVar) {
        this.c = ehmVar;
        eix eixVarA = ekwVar.a.a();
        this.a = eixVarA;
        eleVar.i(eixVarA);
        eixVarA.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @Override // defpackage.eis
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.eia
    public final String g() {
        throw null;
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
    }
}
