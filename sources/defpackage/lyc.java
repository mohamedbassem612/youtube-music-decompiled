package defpackage;

import java.util.AbstractList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lyc extends AbstractList {
    private final lya a;
    private final lyb b;

    public lyc(lya lyaVar, lyb lybVar) {
        this.a = lyaVar;
        this.b = lybVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
