package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doj implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public doj(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        doj dojVar = (doj) obj;
        dojVar.getClass();
        int i = this.a - dojVar.a;
        return i == 0 ? this.d - dojVar.d : i;
    }
}
