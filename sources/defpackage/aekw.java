package defpackage;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aekw extends AbstractList {
    final List a;
    final int b;

    public aekw(List list, int i) {
        ahno.F(i > 0);
        this.a = list;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.b;
        List list = this.a;
        int i3 = i * i2;
        return list.subList(i3, Math.min(i2 + i3, list.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return (int) Math.ceil(((double) this.a.size()) / ((double) this.b));
    }
}
