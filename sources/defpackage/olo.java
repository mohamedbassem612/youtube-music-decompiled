package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class olo implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ahcy b;
    public final /* synthetic */ Object c;

    public /* synthetic */ olo(Object obj, boolean z, ahcy ahcyVar, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = z;
        this.b = ahcyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, ola] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        if (this.$cid == 0) {
            olp olpVar = (olp) this.c;
            olpVar.i.E();
            olpVar.k.j(1031);
            xgg xggVar = olpVar.m;
            ahcy ahcyVar = this.b;
            boolean z = this.a;
            ListenableFuture listenableFutureD = xggVar.m.d();
            olo oloVar = new olo(xggVar, z, ahcyVar, 1);
            long j = afwl.a;
            return xggVar.s(listenableFutureD, new ahdb(afty.c(false), oloVar, 1));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (true) {
            Object obj2 = this.c;
            if (!it.hasNext()) {
                return new kjc(new ahek(false, agke.j(arrayList))).N(new okp(3), ((xgg) obj2).k);
            }
            oiw oiwVar = (oiw) it.next();
            if (!oiwVar.f) {
                ahcy ahcyVar2 = this.b;
                xgg xggVar2 = (xgg) obj2;
                arrayList.add(xggVar2.s(xggVar2.m.g(oiwVar), new rox(xggVar2, this.a, oiwVar, ahcyVar2, 1)));
            }
        }
    }
}
