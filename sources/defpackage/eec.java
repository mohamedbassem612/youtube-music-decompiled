package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eec implements eea {
    public final dma a = new eeb();
    private final dmq b;

    public eec(dmq dmqVar) {
        this.b = dmqVar;
    }

    @Override // defpackage.eea
    public final Long a(String str) {
        return (Long) apb.f(this.b, true, false, new eck(str, 4, (byte[]) null));
    }

    @Override // defpackage.eea
    public final void b(edz edzVar) {
        apb.f(this.b, false, true, new eck(this, edzVar, 3));
    }
}
