package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class abra extends wlu {
    private final Consumer a;
    private final Consumer b;

    /* JADX WARN: Illegal instructions before constructor call */
    public abra(abxv abxvVar, zwa zwaVar, vxu vxuVar, Consumer consumer, Consumer consumer2, abmt abmtVar) {
        boolean z = false;
        if (abmtVar.bh() && abrg.g(vxuVar)) {
            z = true;
        }
        super("get_watch", abxvVar, zwaVar, 1, z, null, null);
        this.a = consumer;
        this.b = consumer2;
    }

    @Override // defpackage.wkf
    public final String Y() {
        return E().D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        alyg alygVar = (alyg) alyh.a.createBuilder();
        this.a.r(alygVar);
        return alygVar;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.b.r(B());
    }
}
