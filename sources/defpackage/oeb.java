package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oeb implements aupn {
    private final aupr a;
    private final aupr b;

    public oeb(aupr auprVar, aupr auprVar2) {
        this.a = auprVar;
        this.b = auprVar2;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* bridge */ /* synthetic */ Object io() {
        Object obj = ((aupo) this.a).b;
        kwc kwcVar = (kwc) this.b.io();
        int i = kwj.a;
        return kwj.b((Context) obj, kwcVar);
    }
}
