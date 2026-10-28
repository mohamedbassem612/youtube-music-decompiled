package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvm implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jvm jvmVar = (jvm) obj;
        int i = this.b;
        int i2 = jvmVar.b;
        return i != i2 ? i - i2 : this.a - jvmVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + '}';
    }
}
