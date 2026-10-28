package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class saf extends acii {
    private final awmd a;
    private final Set b;

    public saf(awmd awmdVar, awmd awmdVar2) {
        super(1);
        ((rwt) awmdVar.io()).a();
        this.a = awmdVar2;
        this.b = new HashSet();
    }

    @Override // defpackage.acii
    public final void a() {
        taq.d();
        ((spy) this.a.io()).a();
    }

    @Override // defpackage.acii
    public final void b(String str) {
        taq.d();
        spy spyVar = (spy) this.a.io();
        taq.d();
        spx spxVar = spyVar.d;
        if (spxVar != null) {
            spxVar.t();
            spxVar.k();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rss) it.next()).a();
        }
    }
}
