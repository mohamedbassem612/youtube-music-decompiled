package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ocw implements odk {
    private final Map a;
    private final fxg b;
    private final ofb c;
    private final long d;
    private final omj e;

    public ocw(fxg fxgVar, Map map, oaq oaqVar, omj omjVar) {
        this.a = map;
        this.b = fxgVar;
        this.e = omjVar;
        this.c = omjVar.h(112);
        this.d = oaqVar.n;
    }

    public final void a() {
        ofb ofbVar;
        fxl fxlVar;
        try {
            try {
                try {
                    try {
                        this.c.c();
                        ListenableFuture listenableFuture = (ListenableFuture) this.a.get("gs");
                        if (listenableFuture != null && (fxlVar = (fxl) listenableFuture.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                            fxg fxgVar = this.b;
                            synchronized (fxgVar) {
                                try {
                                    fxo fxoVar = fxlVar.an;
                                    if (fxoVar == null) {
                                        fxoVar = fxo.a;
                                    }
                                    fxgVar.copyOnWrite();
                                    fxl fxlVar2 = (fxl) fxgVar.instance;
                                    fxoVar.getClass();
                                    fxlVar2.an = fxoVar;
                                    fxlVar2.e |= 64;
                                    long j = fxlVar.T;
                                    fxgVar.copyOnWrite();
                                    fxl fxlVar3 = (fxl) fxgVar.instance;
                                    fxlVar3.c |= 1048576;
                                    fxlVar3.T = j;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        ofbVar = this.c;
                    } catch (Throwable th2) {
                        this.c.a();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    ofbVar = this.c;
                }
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                ofb ofbVar2 = this.c;
                if (cause != null) {
                    e = cause;
                }
                ofbVar2.b(e);
                ofbVar2.a();
                return;
            }
        } catch (ClassCastException e2) {
            ofb ofbVar3 = this.c;
            ofbVar3.b(e2);
            ofbVar3.a();
            return;
        } catch (TimeoutException unused2) {
            this.e.j(127);
            ofbVar = this.c;
        }
        ofbVar.a();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }
}
