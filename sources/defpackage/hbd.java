package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hbd implements tdh {
    private final aunn a;

    public hbd(cf cfVar, aunn aunnVar) {
        cfVar.getClass();
        aunnVar.getClass();
        this.a = aunnVar;
    }

    @Override // defpackage.tdh
    public final void a() {
        Object objIo = this.a.io();
        objIo.getClass();
        hbe hbeVar = (hbe) ((Optional) objIo).orElse(null);
        if (hbeVar == null || !hbeVar.a()) {
            return;
        }
        hbeVar.b();
    }

    @Override // defpackage.tdh
    public final void gY() {
    }
}
