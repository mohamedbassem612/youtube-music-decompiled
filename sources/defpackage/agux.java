package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agux extends AbstractSet {
    final int a;
    public final /* synthetic */ aguy b;

    public agux(aguy aguyVar, int i) {
        this.b = aguyVar;
        this.a = i;
    }

    final int a() {
        return this.b.c[this.a + 1];
    }

    public final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    final Object c(int i) {
        return this.b.b[b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.b, b(), a(), obj, this.a == -1 ? aguy.a : agva.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aumg(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
