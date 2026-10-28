package defpackage;

import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class atsv implements Effect.NativeLoadCallback {
    private final /* synthetic */ int $cid;
    final /* synthetic */ atta a;

    public atsv(atta attaVar, int i) {
        this.$cid = i;
        this.a = attaVar;
    }

    @Override // com.google.research.xeno.effect.Effect.NativeLoadCallback
    public final void onCompletion(long j, String str) {
        if (this.$cid != 0) {
            Effect.c(this.a, j != 0 ? new Effect(j) : null, str, null);
        } else {
            Effect.c(this.a, j != 0 ? new Effect(j) : null, str, null);
        }
    }
}
