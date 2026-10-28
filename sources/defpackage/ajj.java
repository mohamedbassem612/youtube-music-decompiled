package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajj extends ajh {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 2;
        return this.a[i];
    }
}
