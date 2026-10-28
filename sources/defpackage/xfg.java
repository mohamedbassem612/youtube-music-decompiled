package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xfg {
    public SparseArray a;
    SparseArray b;
    public long c;
    public long d;
    public final awmd g;
    public final ScheduledExecutorService h;
    private volatile boolean i;
    private final awmd j;
    public zup f = zvb.a;
    public zup[] e = new zup[0];

    public xfg(awmd awmdVar, awmd awmdVar2, ScheduledExecutorService scheduledExecutorService) {
        this.g = awmdVar;
        this.j = awmdVar2;
        this.h = scheduledExecutorService;
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        this.b = sparseArray;
        this.c = 0L;
        this.d = 0L;
    }

    final void a(List list) {
        SparseArray sparseArrayClone = this.b.clone();
        long j = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zup zupVar = (zup) it.next();
            int i = zupVar.a.c;
            sparseArrayClone.put(i, zupVar);
            j |= 1 << (i & 63);
        }
        this.a = sparseArrayClone;
        this.c = j;
    }

    final synchronized void b() {
        if (this.i) {
            return;
        }
        zvb zvbVar = (zvb) this.g.io();
        akwd akwdVar = ((zrs) this.j.io()).d;
        ArrayList arrayList = new ArrayList();
        for (akwf akwfVar : akwdVar.d) {
            if (akwfVar != null) {
                int i = zup.g;
                axng axngVar = new axng(null);
                axngVar.e = akwfVar;
                axngVar.c(zvbVar);
                arrayList.add(axngVar.a());
            }
        }
        int i2 = zup.g;
        axng axngVar2 = new axng(null);
        aihf aihfVarCreateBuilder = akwf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar2 = (akwf) aihfVarCreateBuilder.instance;
        akwfVar2.b |= 2;
        akwfVar2.d = true;
        akku akkuVar = akku.DELAYED_EVENT_TIER_DEFAULT;
        aihfVarCreateBuilder.copyOnWrite();
        akwf akwfVar3 = (akwf) aihfVarCreateBuilder.instance;
        akwfVar3.f = akkuVar.f;
        akwfVar3.b |= 8;
        aihf builder = ((akwf) aihfVarCreateBuilder.build()).toBuilder();
        builder.copyOnWrite();
        akwf akwfVar4 = (akwf) builder.instance;
        akwfVar4.b |= 1;
        akwfVar4.c = -1;
        axngVar2.e = (akwf) builder.build();
        axngVar2.c(zvbVar);
        this.f = axngVar2.a();
        a(arrayList);
        this.b = this.a;
        this.d = this.c;
        this.i = true;
    }
}
