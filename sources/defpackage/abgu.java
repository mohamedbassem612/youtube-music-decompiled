package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgu implements abgt {
    private static final arbl[] c = new arbl[0];
    public final abvk a;
    public wjf b;
    private final hyo d;

    static {
        wfs.g(307, "auto_speed_state_entity_key");
        wfs.g(307, "has_auto_speed_cue_range_set_key");
    }

    public abgu(abvk abvkVar, hyo hyoVar) {
        abvkVar.getClass();
        this.a = abvkVar;
        hyoVar.getClass();
        this.d = hyoVar;
        hyoVar.d.m = new hyn(hyoVar, this);
    }

    private final void d() {
        hyo hyoVar = this.d;
        hyoVar.c(false);
        hyoVar.a(c, -1);
    }

    public final void a(aazj aazjVar) {
        wjf wjfVar = aazjVar.b;
        this.b = wjfVar;
        abob abobVar = aazjVar.a;
        if (abobVar.h()) {
            d();
            this.d.b(false);
        }
        if (abobVar == abob.i) {
            arbl[] arblVarArrA = aaxh.a(wjfVar);
            abvk abvkVar = this.a;
            b(arblVarArrA, abvkVar.a());
            hyo hyoVar = this.d;
            arbm arbmVar = wjfVar.f().d.s;
            if (arbmVar == null) {
                arbmVar = arbm.a;
            }
            hyoVar.b = arbmVar.d;
            hyoVar.b(abvkVar.T());
        }
    }

    public final void b(arbl[] arblVarArr, float f) {
        abvk abvkVar = this.a;
        hyo hyoVar = this.d;
        boolean zAb = abvkVar.ab();
        hyoVar.c(zAb);
        if (!zAb) {
            d();
            return;
        }
        int i = 0;
        while (i < arblVarArr.length) {
            if (Float.compare(arblVarArr[i].d, f) == 0) {
                hyoVar.a(arblVarArr, i);
            }
            i++;
        }
        i = -1;
        hyoVar.a(arblVarArr, i);
    }

    public final avmn[] c(abvn abvnVar) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 6;
        arrayList.add(((avlh) abvnVar.r().a).i(aawb.y(abvnVar.X(), 131072L)).i(new abwr(i)).al(new aawl(new abgd(this, 11), "PRSP", 1), new abeq(i2)));
        arrayList.add(abvnVar.M(new aawe(14), new aawe(15)).i(aawb.y(abvnVar.X(), 131072L)).i(new abwr(i)).al(new abgd(this, 12), new abeq(i2)));
        return (avmn[]) arrayList.toArray(new avmn[0]);
    }

    @tcc
    public void handlePlaybackRateChangedEvent(aaxh aaxhVar) {
        b(aaxhVar.b, aaxhVar.c);
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "PRSP");
        try {
            a(aazjVar);
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
