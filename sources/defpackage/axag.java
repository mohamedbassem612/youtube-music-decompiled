package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axag implements axat, awzc, axbx {
    private final /* synthetic */ axat a;
    private final awwd job;

    public axag(axat axatVar, awwd awwdVar) {
        this.a = axatVar;
        this.job = awwdVar;
    }

    @Override // defpackage.axat
    public final Object c() {
        return this.a.c();
    }

    @Override // defpackage.axah, defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) {
        return this.a.collect(awzdVar, awoqVar);
    }

    @Override // defpackage.axbx
    public final awzc kK(awou awouVar, int i, int i2) {
        return axaw.b(this, awouVar, i, i2);
    }
}
