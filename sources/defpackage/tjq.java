package defpackage;

import java.util.function.IntSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tjq implements IntSupplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ tnm a;

    public /* synthetic */ tjq(tnm tnmVar, int i) {
        this.$cid = i;
        this.a = tnmVar;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.a();
        }
        tnm tnmVar = this.a;
        return i != 1 ? tnmVar.a() : tnmVar.a();
    }
}
