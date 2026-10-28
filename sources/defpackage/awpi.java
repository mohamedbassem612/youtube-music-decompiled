package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awpi extends awpe {
    public awpi(awoq awoqVar) {
        super(awoqVar);
        if (awoqVar != null && awoqVar.getContext() != awov.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.awoq
    public awou getContext() {
        return awov.a;
    }
}
