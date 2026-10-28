package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdx implements ahcx {
    final /* synthetic */ Callable a;

    public ahdx(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ahcx
    public final ListenableFuture a() throws Exception {
        Object objCall = this.a.call();
        return objCall == null ? aher.a : new aher(objCall);
    }

    public final String toString() {
        return this.a.toString();
    }
}
