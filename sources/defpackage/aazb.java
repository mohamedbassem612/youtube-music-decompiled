package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aazb {
    public final String a;
    public final acca b;
    public final aazh c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public aazb(acca accaVar, aazh aazhVar, int i, String str) {
        this.b = accaVar;
        this.c = aazhVar;
        this.d = i;
        this.a = str;
        this.e = aazhVar.equals(aazh.c);
        this.f = !aazhVar.equals(aazh.a);
    }

    public final String a() {
        acca accaVar = this.b;
        return accaVar != null ? accaVar.k : "-";
    }

    public aazb(acca accaVar, String str) {
        this(accaVar, aazh.b, 0, str);
    }
}
