package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeop implements aeoq {
    @Override // defpackage.aeoq
    public final ListenableFuture a(aeom aeomVar, Object obj, aeow aeowVar) {
        return ahng.m(new IllegalStateException("Unable to store the value in disk."));
    }

    @Override // defpackage.aeoq
    public final ListenableFuture e(aeom aeomVar) {
        return ahng.m(new IllegalStateException("Unable to read the value from the disk."));
    }
}
