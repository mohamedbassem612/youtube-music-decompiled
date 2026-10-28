package defpackage;

import android.app.Service;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkf implements xus, afvt, aupg {
    public final Service a;
    public final ght b;
    public final aupr c;
    public final aupr d;
    public final aupr e;
    public final aupr f;

    public gkf(ght ghtVar, Service service) {
        this.b = ghtVar;
        this.a = service;
        this.c = aupu.b(new giv(ghtVar, 0));
        this.d = aupu.b(new giv(ghtVar, 1));
        this.e = aupu.b(new giv(ghtVar, 2));
        this.f = new giv(ghtVar, 3);
    }

    @Override // defpackage.xus
    public final xur a() {
        ght ghtVar = this.b;
        return new xur(ghtVar.pm, (vxz) ghtVar.dd.io());
    }

    @Override // defpackage.afvv
    public final afvq as() {
        return (afvq) this.b.mK.io();
    }

    @Override // defpackage.afvv
    public final Set bo() {
        return agpr.a;
    }
}
