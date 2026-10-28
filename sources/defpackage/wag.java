package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.google.android.libraries.youtube.client.mobile.executor.JsExecutorPool;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wag implements sqs {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksContainerFactory");
    public final awmd b;
    public final ahex c;
    public final awmd d;
    public final agfr e;
    public volatile ResourceLoader f;
    public volatile ResourcePreloader g;
    private final awmd i;
    private final Map k;
    private final vxz l;
    private final axfd m;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    private final agfr j = aguu.al(new tpc(this, 13));

    public wag(awmd awmdVar, vxz vxzVar, axfd axfdVar, ahex ahexVar, awmd awmdVar2, awmd awmdVar3, Map map) {
        this.b = awmdVar;
        this.l = vxzVar;
        this.m = axfdVar;
        this.c = ahexVar;
        this.d = awmdVar2;
        this.i = awmdVar3;
        this.e = aguu.al(new tpc(axfdVar, 14));
        this.k = map;
    }

    @Override // defpackage.sqs
    public final Container a(maz mazVar, Container container) {
        asbr asbrVar = (asbr) c(mazVar.a()).io();
        return mazVar.d(d(asbrVar.c), asbrVar, container);
    }

    @Override // defpackage.sqs
    public final void b() {
        vxz vxzVar = this.l;
        if (vxzVar.l(3, 45385895L, false)) {
            Iterator it = ((Set) this.i.io()).iterator();
            while (it.hasNext()) {
                ((aber) it.next()).c();
            }
        }
        if (vxzVar.l(4, 45387469L, false)) {
            int iC = (int) vxzVar.c(3, 45387470L, 0L);
            int iG = tym.G();
            if (iC <= 0 || iC > iG) {
                iC = iG;
            }
            JsExecutorPool.runExperiment(iC);
        }
    }

    public final agfr c(int i) {
        Future future = (Future) this.j.io();
        future.getClass();
        awcw awcwVar = new awcw(future);
        avnn avnnVar = atqp.l;
        return new jxq(this, (waf) ((HashMap) awcwVar.aj()).get(Integer.valueOf(i)), 11, null);
    }

    public final asbq d(long j) {
        return this.m.C(this.k, Long.valueOf(j));
    }
}
