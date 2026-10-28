package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awsm implements awsx {
    private final AtomicReference a;

    public awsm(awsx awsxVar) {
        this.a = new AtomicReference(awsxVar);
    }

    @Override // defpackage.awsx
    public final Iterator a() {
        awsx awsxVar = (awsx) this.a.getAndSet(null);
        if (awsxVar != null) {
            return awsxVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
