package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpy extends kpp {
    final /* synthetic */ kpz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpy(kpz kpzVar, int i, Bundle bundle, int i2) {
        super(kpzVar, i, bundle, i2);
        this.h = kpzVar;
    }

    @Override // defpackage.kpp
    protected final void a(klo kloVar) {
        kpz kpzVar = this.h;
        kpzVar.t.a(kloVar);
        kpzVar.q();
    }

    @Override // defpackage.kpp
    protected final boolean b() {
        this.h.t.a(klo.a);
        return true;
    }
}
