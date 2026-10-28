package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qok {
    public static final qok a;
    public static final qok b;
    public final boolean c;
    public final boolean d;
    public final agke e;
    public final agke f;

    static {
        vbq vbqVar = new vbq();
        vbqVar.f();
        a = vbqVar.d();
        vbq vbqVar2 = new vbq();
        vbqVar2.f();
        vbqVar2.e(new qoj());
        vbqVar2.d();
        vbq vbqVar3 = new vbq();
        ahno.P(vbqVar3.d == null, "A SourcePolicy can only set internal() or external() once.");
        vbqVar3.d = Boolean.TRUE;
        b = vbqVar3.d();
    }

    public qok(boolean z, boolean z2, agke agkeVar, agke agkeVar2) {
        this.c = z;
        this.d = z2;
        this.e = agkeVar;
        this.f = agkeVar2;
    }
}
