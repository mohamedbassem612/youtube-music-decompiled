package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeip extends aeir {
    public aeip(aeis aeisVar) {
        super(aeisVar, aipb.MINI_APP_STATE_ROOT, null);
    }

    @Override // defpackage.aeir
    public final void j() {
        this.g = this.j.d;
        g(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_ADDED, null, null, new aeio(this, 1));
        g(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_REMOVED, null, null, new aeio(this, 0));
    }
}
