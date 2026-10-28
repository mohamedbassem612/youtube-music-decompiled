package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqa implements eqr {
    private int a = 2500;
    private int b;

    @Override // defpackage.eqr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eqr
    public final int b() {
        return this.a;
    }

    @Override // defpackage.eqr
    public final void c(equ equVar) throws equ {
        int i = this.b + 1;
        this.b = i;
        int i2 = this.a;
        this.a = i2 + i2;
        if (i > 1) {
            throw equVar;
        }
    }
}
