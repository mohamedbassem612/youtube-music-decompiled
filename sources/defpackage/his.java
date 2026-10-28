package defpackage;

import j$.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class his implements zza {
    public final /* synthetic */ hiv a;
    private final hjn b;

    public his(hiv hivVar, hjn hjnVar) {
        this.a = hivVar;
        this.b = hjnVar;
    }

    public final void d(amzs amzsVar, Set set) {
        aunn aunnVar = this.a.f;
        hir hirVar = (hir) aunnVar.io();
        hjn hjnVar = this.b;
        zne zneVar = hjnVar.i;
        hiq hiqVarA = hirVar.a(zneVar);
        agke agkeVar = (agke) Collection.EL.stream(amzsVar.c).map(new hpm(this, set, zneVar, 1, null)).filter(new gqk(5)).map(new bwa(17)).collect(aghu.a);
        znf znfVar = hjnVar.j;
        hiqVarA.n(znfVar, agkeVar);
        hir hirVar2 = (hir) aunnVar.io();
        synchronized (hirVar2.c) {
            hirVar2.h.add(znfVar);
        }
        boolean zL = ((vxz) this.a.x.io()).l(21, 45791927L, false);
        hjn hjnVar2 = this.b;
        if (zL) {
            hiqVarA.o(hjnVar2);
        } else {
            hjnVar2.c(agkeVar, null);
        }
    }

    @Override // defpackage.tnh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(amzs amzsVar) {
        hjn hjnVar = this.b;
        hjnVar.b(tau.MEDIA_BROWSER_GET_CHILDREN_RESPONSE_RECEIVED);
        zne zneVar = hjnVar.i;
        znf znfVar = hjnVar.j;
        if (amzsVar == null || amzsVar.c.size() == 0) {
            String.format("MBS: Empty children response for client %s, id %s", zneVar, znfVar.l);
            return;
        }
        hiv hivVar = this.a;
        String.format("MBS: Get media item children result returned for client `%s`, id `%s`", zneVar, znfVar.l);
        hivVar.A = ((hin) hivVar.k.io()).e(zneVar);
        taf.i(hivVar.A, (Executor) hivVar.v.io(), new gou(this, amzsVar, 7), new gov(this, amzsVar, 10), null);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        hjn hjnVar = this.b;
        hjnVar.b(tau.MEDIA_BROWSER_GET_CHILDREN_REQUEST_FAILED);
        String message = toeVar.getMessage() != null ? toeVar.getMessage() : "Lacking required capabilities.";
        zne zneVar = hjnVar.i;
        zvp.a(zvn.b, zvm.n, message);
        String.format("MBS: Get media item children error for client %s", zneVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
