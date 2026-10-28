package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actq implements zza {
    public final ajwo a;
    public boolean b;
    public aqi c = null;
    public final hno d;
    private final actv e;

    public actq(ajwo ajwoVar, actv actvVar, hno hnoVar) {
        this.a = ajwoVar;
        this.e = actvVar;
        this.d = hnoVar;
        ape.f(new sdf(this, 12));
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2 = ((acrx) obj).b;
        if (this.b) {
            return;
        }
        aqi aqiVar = this.c;
        if (aqiVar != null) {
            aqiVar.b(Boolean.TRUE);
        }
        this.e.C(this.a, (alqc) obj2);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
    }
}
