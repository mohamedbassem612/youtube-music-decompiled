package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeib implements tul {
    final /* synthetic */ aeic a;

    public aeib(aeic aeicVar) {
        this.a = aeicVar;
    }

    @Override // defpackage.tul
    public final void jn(long j) {
        lqa lqaVar = this.a.d;
        if (lqaVar != null) {
            Object obj = lqaVar.a;
            ((aeis) obj).b.c(aipa.MINI_APP_EVENT_USER_INTERACTION);
        }
    }
}
