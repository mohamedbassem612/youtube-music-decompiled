package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvj implements atvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Callbacks$StatusCallback a;

    public /* synthetic */ atvj(Callbacks$StatusCallback callbacks$StatusCallback, int i) {
        this.$cid = i;
        this.a = callbacks$StatusCallback;
    }

    @Override // defpackage.atvh
    public final void a(long j) {
        int i = this.$cid;
        Callbacks$StatusCallback callbacks$StatusCallback = this.a;
        if (i != 0) {
            atuv.nativeLifecycleStopProcessing(j, callbacks$StatusCallback);
        } else {
            atvp.nativeStopVideoProcessing(j, callbacks$StatusCallback);
        }
    }
}
