package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqb implements Runnable {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;
    private final Object c;

    public eqb(Handler handler, Callable callable, axo axoVar, int i) {
        this.$cid = i;
        this.c = callable;
        this.b = axoVar;
        this.a = handler;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        aami aamiVarCall;
        if (this.$cid != 0) {
            try {
                aamiVarCall = ((axa) this.c).call();
            } catch (Exception unused) {
                aamiVarCall = null;
            }
            Object obj = this.b;
            ((Handler) this.a).post(new blq(obj, aamiVarCall, 1));
            return;
        }
        eqk eqkVar = (eqk) this.a;
        if (eqkVar.isCanceled()) {
            eqkVar.finish("canceled-at-delivery");
            return;
        }
        eqq eqqVar = (eqq) this.b;
        if (eqqVar.a()) {
            eqkVar.deliverResponse(eqqVar.a);
        } else {
            eqkVar.deliverError((equ) eqqVar.d);
        }
        if (eqqVar.b) {
            eqkVar.addMarker("intermediate-response");
        } else {
            eqkVar.finish("done");
        }
        ?? r4 = this.c;
        if (r4 != 0) {
            r4.run();
        }
    }

    public eqb(eqk eqkVar, eqq eqqVar, Runnable runnable, int i) {
        this.$cid = i;
        this.a = eqkVar;
        this.b = eqqVar;
        this.c = runnable;
    }
}
