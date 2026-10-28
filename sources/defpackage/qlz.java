package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class qlz extends qlj implements qlm {
    private volatile int d;
    private omj e;

    public qlz(String str, String str2, qmj qmjVar) {
        super(str, str2, qmjVar);
        this.d = -1;
    }

    @Override // defpackage.qlm
    public final int a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [qlj, qlm, qlz] */
    @Override // defpackage.qlj
    protected final Object f(qkh qkhVar) {
        qmi qmiVarA;
        Object obj;
        Object obj2;
        Object objIq;
        int iA = a();
        if (iA == -1 || iA < j().W()) {
            synchronized (this) {
                int iA2 = a();
                ?? B = 0;
                B = 0;
                if (iA2 == -1) {
                    qkh.d();
                    qkhVar.getClass();
                    qmiVarA = this.c.a(qkhVar);
                    k(qmiVarA.j);
                } else {
                    qmiVarA = null;
                }
                int iW = j().W();
                if (iA2 < iW) {
                    qkh.d();
                    qkhVar.getClass();
                    Context context = qkhVar.c;
                    agev agevVarA = qkc.a(context);
                    if (agevVarA.g()) {
                        String strF = ((ijt) agevVarA.c()).f(qke.a(this.a), null, this.b);
                        if (strF != null) {
                            objIq = iq(strF);
                        } else {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (qmiVarA == null) {
                        obj = objIq;
                        qmiVarA = this.c.a(qkhVar);
                    }
                    obj = objIq;
                    String str = qmiVarA.c;
                    if (!context.getPackageName().equals("com.android.vending") && !context.getPackageName().equals("com.google.android.wearable.app.cn") && !str.startsWith("com.google.android.gms.measurement#")) {
                        ListenableFuture listenableFutureI = qkhVar.b().submit(new lph(qkhVar, str, 13, (byte[]) B));
                        listenableFutureI.addListener(new mbo(listenableFutureI, 14), MoreExecutors.directExecutor());
                    }
                    boolean zH = h();
                    String str2 = this.b;
                    if (zH) {
                        web webVarD = qmiVarA.d();
                        obj2 = ((agkz) webVarD.d).contains(str2) ? ((agkj) webVarD.c).get(str2) : null;
                    } else {
                        obj2 = ((agkj) qmiVarA.d().c).get(str2);
                    }
                    if (obj2 != null) {
                        try {
                            B = b(obj2);
                        } catch (IOException | ClassCastException e) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                        }
                    }
                    ?? E = obj;
                    if (true != agevVarA.g()) {
                        E = B;
                    }
                    if (E == 0) {
                        E = e();
                    }
                    if (E != 0) {
                        g(E);
                        i(iW);
                    }
                    return E;
                }
            }
        }
        return d();
    }

    @Override // defpackage.qlm
    public final void i(int i) {
        this.d = i;
    }

    @Override // defpackage.qlm
    public final omj j() {
        return this.e;
    }

    @Override // defpackage.qlm
    public final void k(omj omjVar) {
        this.e = omjVar;
    }
}
