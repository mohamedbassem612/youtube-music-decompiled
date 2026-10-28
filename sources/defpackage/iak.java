package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iak implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iak(Object obj, Object obj2, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        Object obj2;
        int i = this.$cid;
        if (i == 0) {
            hth hthVar = (hth) obj;
            if (hthVar.a().isEmpty()) {
                return ahng.m(new IllegalArgumentException("Empty backing model."));
            }
            boolean z = this.a;
            Object obj3 = this.c;
            Object obj4 = this.b;
            iao iaoVar = (iao) obj4;
            htf htfVarZ = iaoVar.e.z(hthVar);
            if (!iaoVar.c(z)) {
                return iaoVar.f.Y((abnl) obj3, htfVarZ);
            }
            byte[] bArr = null;
            return ahno.as(ahno.an(ahng.u(ahno.ar(iaoVar.d.q((abnl) obj3, null), new hqt(20), MoreExecutors.directExecutor()), iaoVar.c, TimeUnit.SECONDS, iaoVar.b), Throwable.class, new hlk(obj4, obj3, htfVarZ, 4, bArr), MoreExecutors.directExecutor()), new hlk(obj4, obj3, htfVarZ, 5, bArr), MoreExecutors.directExecutor());
        }
        if (i == 1) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return ahng.n(Optional.empty());
            }
            boolean z2 = this.a;
            ?? r1 = this.c;
            return ((hpb) this.b).l(r1, list, ((anuk) r1).h(), false, z2);
        }
        if (i == 2) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj5 = this.b;
            if (!zBooleanValue) {
                ((ong) ((xgg) obj5).d).j(1036);
                return ahng.m(new IOException("Unable to update file group metadata"));
            }
            ?? r9 = this.c;
            if (this.a) {
                new elr(((xgg) obj5).d, (byte[]) null).f(1072, (oip) ahng.v(r9));
            }
            return ahng.n((oip) ahng.v(r9));
        }
        if (i == 3) {
            return ((olp) this.c).m.i((oiw) this.b, this.a);
        }
        List list2 = (List) obj;
        if (list2 == null) {
            return aher.a;
        }
        ?? r0 = this.c;
        HashSet hashSet = new HashSet();
        for (String str : r0) {
            if (str != null) {
                hashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        boolean z3 = false;
        while (true) {
            obj2 = this.b;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (!hashSet.contains(str2)) {
                arrayList.add(((axlj) obj2).m(str2, this.a));
                z3 = true;
            }
        }
        if (z3) {
            ((aeiv) ((axlj) obj2).a).d(28);
        }
        aeiv aeivVar = (aeiv) ((axlj) obj2).a;
        aeivVar.c("ds_dc");
        aeivVar.c("ds_dels");
        return ahno.aw(arrayList).k(new fxv(19), MoreExecutors.directExecutor());
    }

    public /* synthetic */ iak(olp olpVar, oiw oiwVar, boolean z, int i) {
        this.$cid = i;
        this.c = olpVar;
        this.b = oiwVar;
        this.a = z;
    }

    public /* synthetic */ iak(xgg xggVar, boolean z, ListenableFuture listenableFuture, int i) {
        this.$cid = i;
        this.b = xggVar;
        this.a = z;
        this.c = listenableFuture;
    }
}
