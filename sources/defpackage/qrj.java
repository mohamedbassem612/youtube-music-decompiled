package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qrj implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qrj(Object obj, Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ahcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            final MessageLite messageLite = (MessageLite) obj;
            final ?? r0 = this.c;
            ahek ahekVar = new ahek(false, agke.j(r0));
            final int i2 = this.a;
            final qrk qrkVar = (qrk) this.b;
            ahcx ahcxVar = new ahcx() { // from class: qri
                @Override // defpackage.ahcx
                public final ListenableFuture a() {
                    MessageLite messageLite2 = messageLite;
                    ListenableFuture aherVar = messageLite2 == null ? aher.a : new aher(messageLite2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        Future future = (Future) r0.get(i3);
                        ahno.R(future.isDone(), "Future was expected to be done: %s", future);
                        if (((Boolean) a.i(future)).booleanValue()) {
                            olm olmVar = new olm((qrh) qrkVar.a.get(i3), 11);
                            long j = afwl.a;
                            ahdb ahdbVar = new ahdb(afty.c(false), olmVar, 1);
                            Executor executorDirectExecutor = MoreExecutors.directExecutor();
                            int i4 = ahcs.c;
                            ahcq ahcqVar = new ahcq(aherVar, ahdbVar);
                            aherVar.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
                            aherVar = ahcqVar;
                        }
                    }
                    return aherVar;
                }
            };
            long j = afwl.a;
            return ahekVar.b(new afwh(afty.c(false), ahcxVar, 0), qrkVar.b);
        }
        if (i == 1) {
            final agev agevVar = (agev) obj;
            if (!agevVar.g()) {
                return aher.a;
            }
            final int i3 = this.a;
            ?? r1 = this.c;
            final ong ongVar = (ong) this.b;
            return ooi.d(r1.a()).e(new agek() { // from class: ond
                @Override // defpackage.agek
                public final Object apply(Object obj2) {
                    List list = (List) obj2;
                    if (list == null) {
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        agev agevVar2 = agevVar;
                        ongVar.p(i3, ((ahak) it.next()).toBuilder(), 100L, (ahaz) agevVar2.c());
                    }
                    return null;
                }
            }, MoreExecutors.directExecutor());
        }
        int i4 = this.a;
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            Future future = (Future) this.c.get(i5);
            ahno.R(future.isDone(), "Future was expected to be done: %s", future);
            if (((Boolean) a.i(future)).booleanValue()) {
                arrayList.add(((qrh) ((qrk) this.b).a.get(i5)).a());
            }
        }
        return new ahek(true, agke.j(arrayList)).a(new okp(15), MoreExecutors.directExecutor());
    }

    public /* synthetic */ qrj(qrk qrkVar, int i, List list, int i2) {
        this.$cid = i2;
        this.b = qrkVar;
        this.a = i;
        this.c = list;
    }
}
