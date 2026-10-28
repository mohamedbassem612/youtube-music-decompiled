package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ruw {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public Optional b = Optional.empty();
    public final rst c;
    public final awmd d;
    public final abmt e;
    private final ryr f;

    public ruw(avlh avlhVar, sbt sbtVar, ryr ryrVar, awmd awmdVar, awmd awmdVar2, abmt abmtVar) {
        this.c = sbtVar;
        this.f = ryrVar;
        this.d = awmdVar2;
        this.e = abmtVar;
        avlhVar.p().W(new rtq(4)).ak(new rlb(this, 12));
        avlhVar.p().W(new rtq(5)).ak(new rlb(this, 13));
    }

    public final void a(rst rstVar) {
        this.a.add(rstVar);
    }

    public final void b(rst rstVar) {
        this.a.remove(rstVar);
    }

    public final void c(aaza aazaVar, long j) {
        String str = aazaVar.a;
        this.f.P(j, str);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rst) it.next()).P(j, str);
        }
    }
}
