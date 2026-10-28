package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agiw extends agix {
    final /* synthetic */ Iterable[] a;

    public agiw(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aglv(new agiv(this.a));
    }
}
