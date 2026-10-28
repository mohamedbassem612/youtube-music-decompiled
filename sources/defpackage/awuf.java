package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awuf extends awum {
    public final awto a;

    public awuf(awoq awoqVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.bV(awoqVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new awto(false, awts.a);
    }
}
