package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gtk implements acwm {
    final /* synthetic */ ajwo a;
    final /* synthetic */ Object b;
    final /* synthetic */ gtm c;

    public gtk(gtm gtmVar, ajwo ajwoVar, Object obj) {
        this.a = ajwoVar;
        this.b = obj;
        this.c = gtmVar;
    }

    @Override // defpackage.acwm
    public final void b() {
        gtm gtmVar = this.c;
        gtmVar.d(this.a, this.b, false);
        gtmVar.e.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(267122)), null);
    }

    @Override // defpackage.acwm
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.acwm
    public final /* synthetic */ void c(boolean z) {
    }
}
