package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyf implements bnu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public uyf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture, tuv] */
    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        int i = this.$cid;
        ?? r0 = this.a;
        if (i != 0) {
            r0.cancel(false);
        } else {
            ((uyg) r0).d.L().f(r0);
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
