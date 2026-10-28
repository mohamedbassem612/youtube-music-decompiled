package defpackage;

import com.google.research.xeno.effect.Effect;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsy implements Effect.NativeLoadCallback {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public atsy(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r4v1, types: [atta, java.lang.Object] */
    @Override // com.google.research.xeno.effect.Effect.NativeLoadCallback
    public final void onCompletion(long j, String str) {
        if (this.$cid == 0) {
            Effect.c(this.a, j != 0 ? new Effect(j) : null, str, this.b);
            return;
        }
        if (j != 0) {
            ((AtomicReference) this.a).set(new Effect(j));
        }
        if (str != null) {
            ((AtomicReference) this.b).set(str);
        }
    }
}
