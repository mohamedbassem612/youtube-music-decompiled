package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hiu implements zza {
    final /* synthetic */ hiv a;
    private final hjo b;

    public hiu(hiv hivVar, hjo hjoVar) {
        this.a = hivVar;
        this.b = hjoVar;
    }

    @Override // defpackage.tnh
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(anab anabVar) {
        hjo hjoVar = this.b;
        hjoVar.a(tau.MEDIA_BROWSER_SEARCH_RESPONSE_RECEIVED);
        zne zneVar = hjoVar.d;
        if (anabVar == null || anabVar.d.size() == 0) {
            String.format("MBS: onSearch empty response for client %s", zneVar);
            hjoVar.b(agpi.a);
            return;
        }
        hiv hivVar = this.a;
        String.format("MBS: onSearch result returned for client %s", zneVar);
        if ((anabVar.b & 2) != 0 && anabVar.e == null) {
            amzl amzlVar = amzl.a;
        }
        ((hir) hivVar.f.io()).a(zneVar).r(anabVar.d, hjoVar);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        hjo hjoVar = this.b;
        hjoVar.a(tau.MEDIA_BROWSER_SEARCH_REQUEST_FAILED);
        zvp.a(zvn.b, zvm.n, toeVar.getMessage() != null ? toeVar.getMessage() : "Lacking required capabilities.");
        zne zneVar = hjoVar.d;
        String.format("MBS: onSearch error for client %s", zneVar);
        hjoVar.b(agpi.a);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
