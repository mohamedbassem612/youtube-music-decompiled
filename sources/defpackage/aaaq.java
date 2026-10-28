package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class aaaq implements aaas {
    public aaaq(Executor executor) {
        Collections.newSetFromMap(new WeakHashMap());
        executor.getClass();
    }

    @Override // defpackage.aaas
    public /* synthetic */ ListenableFuture a() {
        throw null;
    }

    @Override // defpackage.aaas
    public final boolean b() {
        return c();
    }

    protected abstract boolean c();
}
