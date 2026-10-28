package defpackage;

import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsw implements atvz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public atsw(atta attaVar, atsp atspVar, String str, int i) {
        this.$cid = i;
        this.b = attaVar;
        this.c = atspVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [atta, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [atta, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [atta, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [atta, java.lang.Object] */
    @Override // defpackage.atvz
    public final void a(long j) {
        if (this.$cid != 0) {
            if (j == 0) {
                Effect.c(this.c, null, "RemoteAssetManager failed to natively load", null);
                return;
            }
            Object obj = this.b;
            Effect.nativeLoadWithRemoteAssetManager(((aifs) obj).toByteArray(), j, this.a, new atsv(this.c, 1));
            return;
        }
        if (j == 0) {
            Effect.c(this.b, null, "RemoteAssetManager failed to natively load", null);
            return;
        }
        Object obj2 = this.c;
        Effect.nativeLoadChoreoWithRemoteAssetManager(((aifs) obj2).toByteArray(), j, this.a, new atsv(this.b, 0));
    }

    public atsw(atta attaVar, atte atteVar, String str, int i) {
        this.$cid = i;
        this.c = attaVar;
        this.b = atteVar;
        this.a = str;
    }
}
