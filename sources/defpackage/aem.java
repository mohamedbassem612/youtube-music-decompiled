package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aem {
    public final Object a;
    private final String b;

    public aem(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    final String a() {
        return "[" + this.b + ", " + aep.d(this.a.getClass()) + ']';
    }

    public final String toString() {
        return a();
    }
}
