package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agkr extends agjv {
    agpc a;
    boolean b = false;

    public agkr(int i) {
        this.a = new agpc(i);
    }

    public final agku a() {
        agpc agpcVar = this.a;
        agpcVar.getClass();
        if (agpcVar.c == 0) {
            return agpq.a;
        }
        this.b = true;
        return new agpq(this.a);
    }

    public final void b(Iterable iterable) {
        agpc agpcVar = this.a;
        agpcVar.getClass();
        if (!(iterable instanceof agow)) {
            super.e(iterable);
            return;
        }
        agow agowVar = (agow) iterable;
        agpc agpcVar2 = agowVar instanceof agpq ? ((agpq) agowVar).b : agowVar instanceof aghd ? ((aghd) agowVar).a : null;
        if (agpcVar2 != null) {
            agpcVar.h(Math.max(agpcVar.c, agpcVar2.c));
            for (int iA = agpcVar2.a(); iA >= 0; iA = agpcVar2.e(iA)) {
                d(agpcVar2.g(iA), agpcVar2.c(iA));
            }
            return;
        }
        Set setJ = agowVar.j();
        agpc agpcVar3 = this.a;
        agpcVar3.h(Math.max(agpcVar3.c, setJ.size()));
        for (agox agoxVar : agowVar.j()) {
            d(agoxVar.a, agoxVar.a());
        }
    }

    @Override // defpackage.agjv
    public final /* synthetic */ void c(Object obj) {
        d(obj, 1);
    }

    public final void d(Object obj, int i) {
        agpc agpcVar = this.a;
        agpcVar.getClass();
        if (i != 0) {
            if (this.b) {
                this.a = new agpc(agpcVar);
            }
            this.b = false;
            obj.getClass();
            agpc agpcVar2 = this.a;
            agpcVar2.l(obj, i + agpcVar2.b(obj));
        }
    }
}
