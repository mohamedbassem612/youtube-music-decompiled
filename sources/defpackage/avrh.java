package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avrh implements Iterable {
    final axso a;

    public avrh(axso axsoVar) {
        this.a = axsoVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        avrg avrgVar = new avrg();
        avuz avuzVar = new avuz(avlh.C(this.a));
        avnn avnnVar = atqp.j;
        avuzVar.ap(avrgVar);
        return avrgVar;
    }
}
