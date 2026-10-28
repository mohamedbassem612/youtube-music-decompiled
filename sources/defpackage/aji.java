package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aji extends ajh {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new ajb(objArr[i], objArr[i + 1]);
    }
}
