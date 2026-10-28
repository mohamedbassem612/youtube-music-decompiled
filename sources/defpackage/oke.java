package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oke extends okg {
    private final ListenableFuture a;

    public oke(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.okh
    public final int b() {
        return 2;
    }

    @Override // defpackage.okg, defpackage.okh
    public final ListenableFuture c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof okh)) {
            return false;
        }
        okh okhVar = (okh) obj;
        return okhVar.b() == 2 && this.a.equals(okhVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
