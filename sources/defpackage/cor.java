package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cor extends cpa {
    public final List a;

    public cor(cno cnoVar) {
        super(cnoVar);
        this.a = new ArrayList();
    }

    @Override // defpackage.cpa, defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        cow cowVar = new cow(super.c(cnmVar, craVar, j), 0L);
        this.a.add(cowVar);
        return cowVar;
    }

    @Override // defpackage.cpa, defpackage.cno
    public final void k(cnk cnkVar) {
        cow cowVar = (cow) cnkVar;
        this.a.remove(cowVar);
        super.k(cowVar.a);
    }
}
