package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zil implements zgy {
    final /* synthetic */ zin a;
    final /* synthetic */ xeu b;
    final /* synthetic */ boolean c;
    final /* synthetic */ agfr d;
    final /* synthetic */ agfr e;
    final /* synthetic */ int f;

    public zil(zin zinVar, xeu xeuVar, boolean z, agfr agfrVar, int i, agfr agfrVar2) {
        this.a = zinVar;
        this.b = xeuVar;
        this.c = z;
        this.d = agfrVar;
        this.f = i;
        this.e = agfrVar2;
    }

    @Override // defpackage.byd
    public final bye a() {
        return c(zha.c);
    }

    @Override // defpackage.zgy
    public final bye b(wiu wiuVar) {
        if (wiuVar == null) {
            return c(zha.c);
        }
        zin zinVar = this.a;
        xeu xeuVar = this.b;
        boolean z = this.c;
        agfr agfrVar = this.d;
        ywn ywnVar = ywn.b;
        zjd zjdVar = zjd.a;
        Optional optionalEmpty = Optional.empty();
        return zinVar.a(new zim(null, xeuVar, wiuVar, zjdVar, (jsk) agfrVar.io(), z, zha.c, optionalEmpty, ywnVar, null), this.f).a();
    }

    @Override // defpackage.zgy
    public final bye c(zha zhaVar) {
        wiu wiuVar = (wiu) this.e.io();
        ywn ywnVar = ywn.b;
        zjd zjdVar = zjd.a;
        Optional optionalEmpty = Optional.empty();
        return this.a.a(new zim(null, this.b, wiuVar, zjdVar, (jsk) this.d.io(), this.c, zhaVar, optionalEmpty, ywnVar, null), this.f).a();
    }

    @Override // defpackage.zgy
    public final bye d(wiu wiuVar, String str, Optional optional) {
        if (wiuVar == null) {
            return e(zha.c, str, optional);
        }
        zin zinVar = this.a;
        xeu xeuVar = this.b;
        ywn ywnVar = ywn.b;
        zjd zjdVar = zjd.a;
        Optional.empty();
        boolean z = this.c;
        agfr agfrVar = this.d;
        return zinVar.a(new zim(str, xeuVar, wiuVar, zjdVar, (jsk) agfrVar.io(), z, zha.c, optional, ywnVar, null), this.f).a();
    }

    @Override // defpackage.zgy
    public final bye e(zha zhaVar, String str, Optional optional) {
        wiu wiuVar = (wiu) this.e.io();
        ywn ywnVar = ywn.b;
        zjd zjdVar = zjd.a;
        Optional.empty();
        return this.a.a(new zim(str, this.b, wiuVar, zjdVar, (jsk) this.d.io(), this.c, zhaVar, optional, ywnVar, null), this.f).a();
    }
}
