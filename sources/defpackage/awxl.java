package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxl extends awuq {
    public static final awxl a = new awxl();

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        awxq awxqVar = (awxq) awouVar.get(awxq.a);
        if (awxqVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        awxqVar.b = true;
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.awuq
    public final boolean fX(awou awouVar) {
        return false;
    }

    @Override // defpackage.awuq
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
