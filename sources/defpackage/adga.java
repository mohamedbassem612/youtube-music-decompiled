package defpackage;

import com.google.android.libraries.multiplatform.elements.runtime.logging.PerformanceLoggerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adga implements tcr, tcq {
    public final List a = new ArrayList();
    public final wmy b;

    public adga(wmy wmyVar) {
        this.b = wmyVar;
    }

    @Override // defpackage.tcr
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((PerformanceLoggerImpl) ((avgj) it.next()).a).a();
        }
    }

    @Override // defpackage.tcq
    public final void t() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            PerformanceLoggerImpl performanceLoggerImpl = (PerformanceLoggerImpl) ((avgj) it.next()).a;
            ListenableFuture listenableFuture = performanceLoggerImpl.b;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                performanceLoggerImpl.b = null;
            }
        }
    }
}
