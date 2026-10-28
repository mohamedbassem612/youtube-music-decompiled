package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetk {
    public final agbq a;
    private final boolean b;
    private final boolean c;
    private final avmb d;
    private final List e;
    private final avmm f;
    private final acwa g;

    public aetk(acwa acwaVar, agbq agbqVar, boolean z, boolean z2, avmb avmbVar) {
        agbqVar.getClass();
        this.g = acwaVar;
        this.a = agbqVar;
        this.b = z;
        this.c = z2;
        this.d = avmbVar;
        this.e = new ArrayList();
        this.f = new avmm();
    }

    public final synchronized void a() {
        List list = this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aetm) it.next()).b();
        }
        list.clear();
        this.f.b();
    }

    public final synchronized void b(List list) {
        avmb avmbVar;
        a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqpq aqpqVar = (aqpq) it.next();
            String str = aqpqVar.b;
            str.getClass();
            aetm aetmVar = new aetm(this.g);
            aetmVar.c(aqpqVar);
            avlh avlhVarA = aetmVar.a();
            int i = 7;
            if (this.b) {
                avlhVarA = avlhVarA.T(new acpq(new actf(5), i));
            }
            if (this.c && (avmbVar = this.d) != null) {
                avlhVarA = avlhVarA.L(avmbVar);
            }
            this.f.c(avlhVarA.ak(new aeti(new acjo(this, str, i, null), 2)));
            this.e.add(aetmVar);
        }
    }
}
