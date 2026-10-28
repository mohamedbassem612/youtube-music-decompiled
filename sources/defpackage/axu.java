package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class axu extends awns {
    final /* synthetic */ SparseBooleanArray a;
    private int b;

    public axu(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    @Override // defpackage.awns
    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.keyAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }
}
