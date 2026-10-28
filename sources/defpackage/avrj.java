package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avrj implements Iterable {
    final avlh a;
    final Object b;

    public avrj(avlh avlhVar, Object obj) {
        this.a = avlhVar;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        awlz awlzVar = new awlz(this.b);
        this.a.ap(awlzVar);
        return new avri(awlzVar);
    }
}
