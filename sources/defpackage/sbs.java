package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbs extends sbk implements sai {
    public final awmd a;
    private final ahey b;
    private final ScheduledExecutorService c;
    private final vyo d;

    public sbs(awmd awmdVar, ahey aheyVar, ScheduledExecutorService scheduledExecutorService, vyo vyoVar) {
        this.a = awmdVar;
        this.b = aheyVar;
        this.c = scheduledExecutorService;
        this.d = vyoVar;
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(skq.class);
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if ((snkVar instanceof skq) && TextUtils.equals(skoVar.a, ((skq) snkVar).a)) {
                arrayList.add(sniVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        taf.h(ahng.p(new gwj(this, arrayList, 16), afxw.e(this.d).A, TimeUnit.MILLISECONDS, this.b), this.c, new iul(15));
    }
}
