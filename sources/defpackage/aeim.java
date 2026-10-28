package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeim extends aeir {
    public aeim(aeis aeisVar) {
        super(aeisVar, aipb.MINI_APP_STATE_IN_FOCUS, aeisVar.c);
    }

    @Override // defpackage.aeir
    public final void j() {
        this.h = new aehz(this, 4);
        aeis aeisVar = this.j;
        aeit aeitVar = aeisVar.h;
        this.g = aeitVar;
        g(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_CHANGED, aeisVar.g, new aeil(this, 1), null);
        g(aipa.MINI_APP_EVENT_USER_INTERACTION, aeitVar, new aeil(this, 0), null);
    }
}
