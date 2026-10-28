package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zuf extends zug {
    private final Supplier e;

    public zuf(Supplier supplier, zup zupVar, zta ztaVar) {
        super(zupVar, ztaVar);
        this.e = supplier;
    }

    @Override // defpackage.zug
    protected final aigj c() {
        return (aigj) this.e.get();
    }
}
