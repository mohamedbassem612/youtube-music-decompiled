package defpackage;

import j$.util.Optional;
import java.security.SecureRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class idh extends twv {
    final /* synthetic */ awmd a;
    final /* synthetic */ awmd b;
    final /* synthetic */ txp c;
    final /* synthetic */ tbt d;
    final /* synthetic */ xla e;
    final /* synthetic */ abmt f;
    final /* synthetic */ awku g;
    final /* synthetic */ SecureRandom h;
    final /* synthetic */ ycp i;
    final /* synthetic */ aboi j;
    final /* synthetic */ vxz k;
    final /* synthetic */ hfn l;
    final /* synthetic */ jnm m;

    public idh(ycp ycpVar, jnm jnmVar, awmd awmdVar, awmd awmdVar2, hfn hfnVar, aboi aboiVar, txp txpVar, tbt tbtVar, xla xlaVar, vxz vxzVar, abmt abmtVar, awku awkuVar, SecureRandom secureRandom) {
        this.i = ycpVar;
        this.m = jnmVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.l = hfnVar;
        this.j = aboiVar;
        this.c = txpVar;
        this.d = tbtVar;
        this.e = xlaVar;
        this.k = vxzVar;
        this.f = abmtVar;
        this.g = awkuVar;
        this.h = secureRandom;
    }

    @Override // defpackage.twv
    protected final /* bridge */ /* synthetic */ Object b() {
        return new xxx(this.i, this.m, this.a, this.b, this.l, this.j, this.c, this.d, this.e, this.k, this.f, Optional.of(this.g), this.h);
    }
}
