package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aetg implements aeto {
    public volatile boolean a;
    public final avlh b;
    private final List c;
    private final avmm d = new avmm();

    public aetg(List list) {
        this.c = list;
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aeto) it.next()).a());
        }
        acpr acprVar = new acpr(new acsc(this, 11), 14);
        int i = avlh.a;
        avoj.a(i, "bufferSize");
        avrz avrzVar = new avrz(arrayList, acprVar, i);
        avnn avnnVar = atqp.j;
        this.b = avrzVar.U(Boolean.FALSE).p().u(new acym(new acsc(this, 12), 16)).S().ax().b(0, new acym(new acqe((Object) this.d, 2, (char[]) null), 17));
    }

    @Override // defpackage.aeto
    public final avlh a() {
        return this.b;
    }

    @Override // defpackage.aeto
    public final void b() {
        this.d.b();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aeto) it.next()).b();
        }
    }

    public abstract boolean c(Object[] objArr);
}
