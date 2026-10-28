package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eir implements eia, eis {
    public final boolean a;
    public final eix b;
    public final eix c;
    public final eix d;
    public final int e;
    private final List f = new ArrayList();

    public eir(ele eleVar, elc elcVar) {
        this.a = elcVar.d;
        this.e = elcVar.e;
        eix eixVarA = elcVar.a.a();
        this.b = eixVarA;
        eix eixVarA2 = elcVar.b.a();
        this.c = eixVarA2;
        eix eixVarA3 = elcVar.c.a();
        this.d = eixVarA3;
        eleVar.i(eixVarA);
        eleVar.i(eixVarA2);
        eleVar.i(eixVarA3);
        eixVarA.h(this);
        eixVarA2.h(this);
        eixVarA3.h(this);
    }

    final void a(eis eisVar) {
        this.f.add(eisVar);
    }

    @Override // defpackage.eis
    public final void d() {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return;
            }
            ((eis) list.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.eia
    public final String g() {
        throw null;
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
    }
}
