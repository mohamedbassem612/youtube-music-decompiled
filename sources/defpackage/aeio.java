package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeio implements aeie {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aeir a;

    public /* synthetic */ aeio(aeir aeirVar, int i) {
        this.$cid = i;
        this.a = aeirVar;
    }

    @Override // defpackage.aeie
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((aeip) this.a).j.b.c(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_CHANGED);
            return;
        }
        aeir aeirVar = this.a;
        if (i == 1) {
            ((aeip) aeirVar).j.b.c(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_CHANGED);
            return;
        }
        aeit aeitVar = (aeit) aeirVar;
        aeitVar.j.l.set(0);
        aeitVar.m();
    }
}
