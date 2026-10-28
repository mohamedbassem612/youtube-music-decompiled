package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gen extends qr {
    final /* synthetic */ get a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gen(get getVar) {
        super(false);
        this.a = getVar;
    }

    @Override // defpackage.qr
    public final void b() {
        get getVar = this.a;
        ((tbt) getVar.O.io()).c(new haj());
        aunn aunnVar = getVar.aq;
        if (((swh) aunnVar.io()).c()) {
            ((swh) aunnVar.io()).a();
        } else {
            aunn aunnVar2 = getVar.af;
            if (((jki) aunnVar2.io()).b() instanceof jjm) {
                ((jjm) ((jki) aunnVar2.io()).b()).w();
            }
            jki jkiVar = (jki) aunnVar2.io();
            dd ddVar = jkiVar.c;
            if (ddVar.b() > 0) {
                try {
                    ddVar.ae(null, -1, 0);
                    if (ddVar.b() == 0) {
                        ((hke) jkiVar.b.io()).e(null);
                    }
                } catch (IllegalStateException e) {
                    ((agrc) ((agrc) ((agrc) jki.a.b()).j(e)).k("com/google/android/apps/youtube/music/util/BackStackUtil", "navigateBack", (char) 187, "BackStackUtil.java")).t("State loss when popping from back stack.");
                }
            }
        }
        getVar.v();
    }
}
