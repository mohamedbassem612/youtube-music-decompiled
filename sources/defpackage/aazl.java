package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aazl {
    public final acca a;
    public final String b;
    public final int c;
    public final boolean d;
    private final String e;

    public aazl(acca accaVar, String str, String str2, int i, boolean z) {
        this.a = accaVar;
        this.b = str;
        this.e = str2;
        this.c = i;
        this.d = z;
    }

    public final String a() {
        String str = this.e;
        return str == null ? "-" : str;
    }

    public final String b() {
        acca accaVar = this.a;
        return accaVar != null ? accaVar.k : "-";
    }
}
