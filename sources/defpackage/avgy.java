package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgy extends auyr {
    public final String b;
    final /* synthetic */ avhb c;
    public final AtomicReference a = new AtomicReference(avhb.f);
    private final auyr d = new avgu(this);

    public avgy(avhb avhbVar, String str) {
        this.c = avhbVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.auyr
    public final auyt a(avbh avbhVar, auyq auyqVar) {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        auzx auzxVar = avhb.f;
        if (obj != auzxVar) {
            return c(avbhVar, auyqVar);
        }
        avhb avhbVar = this.c;
        avgv avgvVar = new avgv(this, 3);
        avcj avcjVar = avhbVar.o;
        avcjVar.execute(avgvVar);
        if (atomicReference.get() != auzxVar) {
            return c(avbhVar, auyqVar);
        }
        if (avhbVar.C.get()) {
            return new avgw();
        }
        avgx avgxVar = new avgx(this, auzh.b(), avbhVar, auyqVar);
        avcjVar.execute(new aves(this, avgxVar, 10));
        return avgxVar;
    }

    @Override // defpackage.auyr
    public final String b() {
        return this.b;
    }

    public final auyt c(avbh avbhVar, auyq auyqVar) {
        auzx auzxVar = (auzx) this.a.get();
        if (auzxVar == null) {
            return this.d.a(avbhVar, auyqVar);
        }
        if (!(auzxVar instanceof avhj)) {
            return new avgo(auzxVar, this.d, this.c.m, avbhVar, auyqVar);
        }
        avhi avhiVarB = ((avhj) auzxVar).b.b(avbhVar);
        if (avhiVarB != null) {
            auyqVar = auyqVar.c(avhi.a, avhiVarB);
        }
        return this.d.a(avbhVar, auyqVar);
    }

    final void d(auzx auzxVar) {
        Collection collection;
        AtomicReference atomicReference = this.a;
        auzx auzxVar2 = (auzx) atomicReference.get();
        atomicReference.set(auzxVar);
        auzx auzxVar3 = avhb.f;
        if (auzxVar2 != auzxVar3 || auzxVar == auzxVar3 || (collection = this.c.y) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((avgx) it.next()).l();
        }
    }
}
