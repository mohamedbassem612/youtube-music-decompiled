package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axfh implements awuc, awxo {
    public final awud a;
    final /* synthetic */ axfi b;

    public axfh(axfi axfiVar, awud awudVar) {
        this.b = axfiVar;
        this.a = awudVar;
    }

    @Override // defpackage.awxo
    public final void B(axcv axcvVar, int i) {
        this.a.B(axcvVar, i);
    }

    @Override // defpackage.awuc
    public final void a(Object obj) throws awve {
        this.a.a(obj);
    }

    @Override // defpackage.awuc
    public final void b(awqg awqgVar) {
        throw null;
    }

    @Override // defpackage.awuc
    public final /* bridge */ /* synthetic */ void c(Object obj, awqg awqgVar) throws awve {
        this.a.c((awmy) obj, awqgVar);
    }

    @Override // defpackage.awuc
    public final /* bridge */ /* synthetic */ void d(Object obj, awql awqlVar) throws awve {
        boolean z = awuv.a;
        axfi axfiVar = this.b;
        axfiVar.a.c(null);
        this.a.c(obj, new rri(axfiVar, 14));
    }

    @Override // defpackage.awuc
    public final /* bridge */ /* synthetic */ void e(awuq awuqVar, Object obj) {
        throw null;
    }

    @Override // defpackage.awuc
    public final boolean f(Throwable th) {
        return this.a.f(th);
    }

    @Override // defpackage.awuc
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.a.b;
    }

    @Override // defpackage.awuc
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.awuc
    public final /* bridge */ /* synthetic */ Object i(Object obj, awql awqlVar) {
        boolean z = awuv.a;
        axfi axfiVar = this.b;
        axfg axfgVar = new axfg(axfiVar, 0);
        axdy axdyVarD = this.a.D((awmy) obj, axfgVar);
        if (axdyVarD != null) {
            axfiVar.a.c(null);
        }
        return axdyVarD;
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) throws awve {
        this.a.resumeWith(obj);
    }
}
