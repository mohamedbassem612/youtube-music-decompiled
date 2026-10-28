package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrw implements ahcx {
    public List a;
    public final /* synthetic */ qrx b;

    public qrw(qrx qrxVar) {
        this.b = qrxVar;
    }

    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        qrx qrxVar = this.b;
        afuu afuuVarB = qrxVar.e.b("Initialize ".concat(String.valueOf(qrxVar.a)));
        try {
            synchronized (qrxVar.d) {
                if (this.a == null) {
                    this.a = qrxVar.f;
                    qrxVar.f = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            hwe hweVar = new hwe(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((ahcy) it.next()).a(hweVar));
                } catch (Exception e) {
                    arrayList.add(ahng.m(e));
                }
            }
            ListenableFuture listenableFutureA = new ahek(true, agke.j(arrayList)).a(new ebs(this, 17), MoreExecutors.directExecutor());
            afuuVarB.a(listenableFutureA);
            afuuVarB.close();
            return listenableFutureA;
        } catch (Throwable th) {
            try {
                afuuVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
