package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aepd {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/suggest/fetcher/DefaultSuggestFetcher");
    public final Executor a;
    public final mbc b;
    public final List c;
    public String d;
    public final aend e;
    private final Set g = Collections.EMPTY_SET;

    public aepd(aend aendVar, Executor executor, mbc mbcVar, List list) {
        this.e = aendVar;
        this.a = executor;
        this.b = mbcVar;
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zwb] */
    public final ListenableFuture b(String str, boolean z) {
        aend aendVar = this.e;
        wtp wtpVar = new wtp("suggest", aendVar.b, aendVar.c.e());
        wtpVar.a = str;
        wtpVar.d = z;
        wtpVar.c = this.d;
        wtpVar.b = null;
        if (!z) {
            wtpVar.y = tnr.d;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aepe) it.next()).a();
        }
        return ahno.aq(afwl.c(new gmf(this, wtpVar, str, 20, (byte[]) null)), this.a);
    }
}
