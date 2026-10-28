package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aein extends aeir {
    public aein(aeis aeisVar) {
        super(aeisVar, aipb.MINI_APP_STATE_OUT_OF_FOCUS, aeisVar.c);
    }

    @Override // defpackage.aeir
    public final void j() {
        this.h = new aehz(this, 5);
        g(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_CHANGED, this.j.f, new aeil(this, 2), null);
    }
}
