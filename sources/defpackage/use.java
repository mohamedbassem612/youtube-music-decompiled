package defpackage;

import android.content.Context;
import j$.util.Collection;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class use {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositionManagerFactory");
    public final Executor a;
    public final Executor b;
    public usd c;
    public final aaok d;
    private final Context f;
    private final zvl g;
    private final agke h;
    private final File i;
    private final quc j;
    private final uss k;
    private final qcb l;

    public use(Context context, zvl zvlVar, aaok aaokVar, Executor executor, Executor executor2, utg utgVar, quc qucVar, qcb qcbVar) {
        this.f = context;
        this.g = zvlVar;
        this.d = aaokVar;
        this.a = executor;
        this.b = executor2;
        this.i = utgVar.a;
        this.j = qucVar;
        this.k = utgVar.b;
        this.l = qcbVar;
        this.h = utgVar.c;
    }

    public static final void b(usd usdVar, agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return;
        }
        usdVar.h(new uug((agke) Collection.EL.stream(agkeVar).map(new snm(19)).collect(aghu.a), 0));
    }

    public final usd a(auhs auhsVar) {
        usd usdVar = this.c;
        if (usdVar != null) {
            return usdVar;
        }
        auhn auhnVar = auhsVar.i;
        if (auhnVar == null) {
            auhnVar = auhn.a;
        }
        usj.c(auhnVar);
        agkx agkxVar = new agkx();
        int i = 0;
        Collection.EL.stream(auhsVar.e).map(new ush(5)).forEach(new usf(agkxVar, i));
        Collection.EL.stream(auhsVar.d).map(new snm(20)).forEach(new usf(agkxVar, i));
        usd usdVar2 = new usd(this.f, this.g, this.i, this.j, this.k, this.d, agkxVar.g());
        usdVar2.f = this.l;
        this.c = usdVar2;
        usdVar2.i(new utm((auhsVar.b & 8) != 0 ? Boolean.valueOf(auhsVar.j) : null, 1));
        agke agkeVar = this.h;
        while (i < ((agpi) agkeVar).d) {
            uth uthVar = (uth) agkeVar.get(i);
            if (!uthVar.a(this.c, auhsVar)) {
                ((agrc) ((agrc) e.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositionManagerFactory", "initializeManagerFromDraft", 326, "CreationMediaCompositionManagerFactory.java")).w("CompositionLoadStep %s completely or partially failed.", uthVar);
            }
            i++;
        }
        return this.c;
    }
}
