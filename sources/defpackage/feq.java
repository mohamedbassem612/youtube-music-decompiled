package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class feq implements few {
    private final int a;
    private final boolean b;
    private fer c;

    protected feq(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.few
    public final fev a(int i, boolean z) {
        if (i == 5) {
            return fet.a;
        }
        fer ferVar = this.c;
        if (ferVar != null) {
            return ferVar;
        }
        fer ferVar2 = new fer(this.a, this.b);
        this.c = ferVar2;
        return ferVar2;
    }
}
