package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ojh implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ListenableFuture a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ojh(hpk hpkVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, boolean z, int i) {
        this.$cid = i;
        this.f = hpkVar;
        this.e = listenableFuture;
        this.d = listenableFuture2;
        this.a = listenableFuture3;
        this.b = listenableFuture4;
        this.g = listenableFuture5;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = 0;
        if (this.$cid == 0) {
            ListenableFuture listenableFuture = this.a;
            if (((agev) ahng.v(listenableFuture)).g()) {
                return ahng.n(new oke((ListenableFuture) ((agev) ahng.v(listenableFuture)).c()));
            }
            ListenableFuture listenableFuture2 = this.b;
            if (((agev) ahng.v(listenableFuture2)).g()) {
                return ahng.n(new oke((ListenableFuture) ((agev) ahng.v(listenableFuture2)).c()));
            }
            Object obj = this.g;
            Object obj2 = this.f;
            boolean z = this.c;
            Object obj3 = this.e;
            Object obj4 = this.d;
            zpw zpwVar = (zpw) obj4;
            oiw oiwVar = (oiw) obj3;
            ListenableFuture listenableFutureD = ((olp) zpwVar.j).d(oiwVar, false);
            iub iubVar = new iub(obj4, obj3, 15, null);
            ?? r10 = zpwVar.o;
            return ahno.as(ahno.as(listenableFutureD, iubVar, r10), new oji(zpwVar, oiwVar, z, (oih) obj2, (String) obj, 0), r10);
        }
        adt adtVar = new adt();
        adtVar.a(agpi.a);
        adtVar.e = agke.n((List) ahng.v(this.e));
        adtVar.d = agke.n((List) ahng.v(this.d));
        Optional optional = (Optional) ahng.v(this.a);
        if (optional == null) {
            throw new NullPointerException("Null singleEpisodeContainer");
        }
        boolean z2 = this.c;
        ?? r4 = this.g;
        ListenableFuture listenableFuture3 = this.b;
        Object obj5 = this.f;
        adtVar.b = optional;
        agke agkeVar = (agke) ahng.v(listenableFuture3);
        agke agkeVar2 = (agke) ahng.v(r4);
        Stream map = Collection.EL.stream(agkeVar).map(new hpi(obj5, z2, i));
        Collector collector = aghu.a;
        agke agkeVar3 = (agke) map.collect(collector);
        agke agkeVar4 = (agke) Collection.EL.stream(agkeVar2).map(new hpi(obj5, z2, 2)).collect(collector);
        ahud ahudVarAu = ahno.au(agkeVar3);
        ub ubVar = new ub(agkeVar3, 18);
        Executor executor = ((hpk) obj5).e;
        ListenableFuture listenableFutureK = ahudVarAu.k(ubVar, executor);
        ListenableFuture listenableFutureK2 = ahno.au(agkeVar4).k(new ub(agkeVar4, 19), executor);
        return ahno.av(listenableFutureK, listenableFutureK2).k(new egz(adtVar, listenableFutureK, listenableFutureK2, 10), executor);
    }

    public /* synthetic */ ojh(zpw zpwVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, oiw oiwVar, boolean z, oih oihVar, String str, int i) {
        this.$cid = i;
        this.d = zpwVar;
        this.a = listenableFuture;
        this.b = listenableFuture2;
        this.e = oiwVar;
        this.c = z;
        this.f = oihVar;
        this.g = str;
    }
}
