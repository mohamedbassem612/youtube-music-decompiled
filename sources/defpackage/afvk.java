package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afvk implements afvx {
    private final afuu a;

    public afvk(afuu afuuVar) {
        this.a = afuuVar;
    }

    @Override // defpackage.afvx
    public final void a(ListenableFuture listenableFuture) {
        this.a.a(listenableFuture);
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
