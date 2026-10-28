package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aflu implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aflu(afry afryVar, ListenableFuture listenableFuture, afsa afsaVar, int i) {
        this.$cid = i;
        this.c = afryVar;
        this.b = listenableFuture;
        this.a = afsaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aflf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            ListenableFuture listenableFutureA = ((aflv) this.a).a.io().a((WorkerParameters) this.c);
            ((afuu) this.b).a(listenableFutureA);
            return listenableFutureA;
        }
        if (i == 1) {
            Set set = (Set) ((afip) this.a).e.io();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            Object obj = this.c;
            while (it.hasNext()) {
                try {
                    arrayList.add(((afhr) it.next()).a((afhs) obj));
                } catch (Exception e) {
                    arrayList.add(ahng.m(e));
                }
            }
            ?? r5 = this.b;
            r5.addAll(arrayList);
            return ahng.i(r5).a(new okp(15), MoreExecutors.directExecutor());
        }
        int i2 = 2;
        if (i == 2) {
            ?? r0 = this.b;
            return ((afry) this.c).c(this.a, r0);
        }
        if (i == 3) {
            Object obj2 = this.a;
            return ((afry) this.c).d(this.b, (afsa) obj2);
        }
        Object obj3 = this.b;
        Object obj4 = this.c;
        afno afnoVar = new afno(obj3, obj4, i2, null);
        afry afryVar = (afry) this.a;
        return ahng.u(ahcs.e(ahno.aq(afnoVar, afryVar.c), new aeni(13), MoreExecutors.directExecutor()), ((afrg) obj4).a().b, TimeUnit.MILLISECONDS, afryVar.b);
    }

    public /* synthetic */ aflu(afry afryVar, ListenableFuture listenableFuture, Map map, int i) {
        this.$cid = i;
        this.c = afryVar;
        this.a = listenableFuture;
        this.b = map;
    }

    public /* synthetic */ aflu(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
