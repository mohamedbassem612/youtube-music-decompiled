package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class hfa implements zza {
    protected final vxe a;
    protected final ttm b;
    public final huf c;
    public final amks d;
    protected final jin e;
    protected final vxz f;
    protected final qcb g;
    private final Executor h;
    private final hpb i;
    private final hpy j;

    public hfa(vxe vxeVar, ttm ttmVar, hpb hpbVar, hpy hpyVar, jin jinVar, huf hufVar, amks amksVar, qcb qcbVar, Executor executor, vxz vxzVar) {
        this.a = vxeVar;
        this.b = ttmVar;
        this.i = hpbVar;
        this.j = hpyVar;
        this.e = jinVar;
        this.c = hufVar;
        this.d = amksVar;
        this.g = qcbVar;
        this.h = executor;
        this.f = vxzVar;
    }

    protected final void d() {
        ahcs.e(this.i.o(this.j, "LM"), afwl.a(new gmv(this, 13)), this.h);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
