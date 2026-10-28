package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbn extends sbk implements sai {
    public final awmd a;
    private final ahey b;
    private final ScheduledExecutorService c;

    public sbn(awmd awmdVar, ahey aheyVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = awmdVar;
        this.b = aheyVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(skc.class);
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof skc) {
                skc skcVar = (skc) snkVar;
                if (TextUtils.equals(skoVar.a, skcVar.a)) {
                    ahbo ahboVar = skcVar.c;
                    if (ahboVar.f() || ahboVar.e(i)) {
                        arrayList.add(sniVar);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sni sniVar2 = (sni) arrayList.get(i2);
            skc skcVar2 = (skc) sniVar2.b;
            taf.h(ahng.p(new gwj(this, sniVar2, 15), skcVar2.b, TimeUnit.MILLISECONDS, this.b), this.c, new iul(13));
        }
    }
}
