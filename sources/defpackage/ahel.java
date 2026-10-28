package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahel extends ahch {
    private ahem a;

    public ahel(ahem ahemVar) {
        this.a = ahemVar;
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ahem ahemVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        ahemVar.getClass();
        ahemVar.a = true;
        if (!z) {
            ahemVar.b = false;
        }
        ahemVar.a();
        return true;
    }

    @Override // defpackage.ahch
    protected final void gH() {
        this.a = null;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        ahem ahemVar = this.a;
        if (ahemVar == null) {
            return null;
        }
        ListenableFuture[] listenableFutureArr = ahemVar.d;
        AtomicInteger atomicInteger = ahemVar.c;
        return "inputCount=[" + listenableFutureArr.length + "], remaining=[" + atomicInteger.get() + ']';
    }
}
