package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acsa implements tgs {
    private final /* synthetic */ int $cid;
    private final Object a;

    public acsa(rnj rnjVar, int i) {
        this.$cid = i;
        rnjVar.getClass();
        this.a = rnjVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xir] */
    @Override // defpackage.tgs
    public final void a() {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i == 0) {
            ((rnj) r1).g(235);
            return;
        }
        if (r1 != 0) {
            r1.f(tau.STREAMING_WATCH_SERVICE_NETWORK_REQUESTED);
        }
        tym.ag(tsa.STREAMING_WATCH_SERVICE_NETWORK_REQUESTED);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xir] */
    @Override // defpackage.tgs
    public final void b() {
        if (this.$cid != 0) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.f(tau.STREAMING_WATCH_SERVICE_NETWORK_PARSING_ENDED);
            }
            tym.ag(tsa.STREAMING_WATCH_SERVICE_NETWORK_PARSING_ENDED);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xir] */
    @Override // defpackage.tgs
    public final void c() {
        if (this.$cid != 0) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.f(tau.STREAMING_WATCH_SERVICE_NETWORK_PARSING_STARTED);
            }
            tym.ag(tsa.STREAMING_WATCH_SERVICE_NETWORK_PARSING_STARTED);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xir] */
    @Override // defpackage.tgs
    public final void d() {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i == 0) {
            ((rnj) r1).g(236);
            return;
        }
        if (r1 != 0) {
            r1.f(tau.STREAMING_WATCH_SERVICE_NETWORK_RECEIVED);
        }
        tym.ag(tsa.STREAMING_WATCH_SERVICE_NETWORK_RECEIVED);
    }

    @Override // defpackage.tgs
    public final /* synthetic */ void e() {
        if (this.$cid != 0) {
            d();
        } else {
            d();
        }
    }

    public acsa(xir xirVar, int i) {
        this.$cid = i;
        this.a = xirVar;
    }
}
