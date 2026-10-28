package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aai {
    public int a;
    public Object b;
    public Object c;

    public aai(qcg qcgVar) {
        this.c = qcgVar.a;
        this.a = qcgVar.c;
        this.b = qcgVar.b;
    }

    public final qcg a() {
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: exitStatus");
        }
        return new qcg((byte[]) this.c, i, (String) this.b);
    }

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null exitStatus");
        }
        this.a = i;
    }

    public aai() {
    }
}
