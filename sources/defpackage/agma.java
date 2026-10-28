package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agma extends AbstractList implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object[] b;

    public agma(Object obj, Object[] objArr) {
        this.a = obj;
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ahno.W(i, size());
        return i == 0 ? this.a : this.b[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ahng.Y(this.b.length, 1);
    }
}
