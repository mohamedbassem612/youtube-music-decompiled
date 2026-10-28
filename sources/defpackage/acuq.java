package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuq implements zza {
    final /* synthetic */ ajwo a;
    final /* synthetic */ aqi b;
    final /* synthetic */ acur c;

    public acuq(acur acurVar, ajwo ajwoVar, aqi aqiVar) {
        this.a = ajwoVar;
        this.b = aqiVar;
        this.c = acurVar;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        acrx acrxVar = (acrx) obj;
        Object obj2 = acrxVar.b;
        boolean z = acrxVar.a;
        this.c.b.A(this.a, (alqc) obj2, z);
        this.b.b(null);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.b.D("", toeVar, this.a);
        Throwable cause = toeVar.getCause();
        if (cause == null) {
            cause = new Throwable("ReelNonVideoItem prefetch volley error");
        }
        this.b.d(cause);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
