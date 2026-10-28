package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fye extends fys {
    public final qcb a;

    public fye(qcb qcbVar) {
        super("internal.logger");
        this.a = qcbVar;
        this.e.put("log", new fyd(this, false, true));
        this.e.put("silent", new fyb());
        ((fys) this.e.get("silent")).r("log", new fyd(this, true, true));
        this.e.put("unmonitored", new fyc());
        ((fys) this.e.get("unmonitored")).r("log", new fyd(this, false, false));
    }

    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        return fyy.f;
    }
}
