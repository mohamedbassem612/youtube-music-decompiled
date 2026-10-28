package defpackage;

import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class geo extends qr {
    final /* synthetic */ get a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geo(get getVar) {
        super(false);
        this.a = getVar;
    }

    @Override // defpackage.qr
    public final void b() {
        get getVar = this.a;
        ((tbt) getVar.O.io()).c(new haj());
        if (getVar.j.aa()) {
            getVar.l();
            return;
        }
        if (getVar.j.Y()) {
            getVar.j.A();
            return;
        }
        if (getVar.j.ac()) {
            aunn aunnVar = getVar.bp;
            if (((vor) aunnVar.io()).I()) {
                ((vor) aunnVar.io()).t();
                return;
            } else {
                getVar.j.D();
                return;
            }
        }
        if (!getVar.j.W() && !getVar.j.bE.b(hww.g)) {
            if (getVar.j.ad()) {
                getVar.j.L(false);
                return;
            }
            return;
        }
        WatchWhileLayout watchWhileLayout = getVar.j;
        if (watchWhileLayout.bU.l(105, 45795183L, false)) {
            String strK = ((vor) watchWhileLayout.l.io()).k();
            String str = (String) ((vor) watchWhileLayout.l.io()).i().f();
            if (strK == null || str == null || strK.equals(str)) {
                ((vor) watchWhileLayout.l.io()).u(true);
                return;
            }
        }
        ((vor) watchWhileLayout.l.io()).t();
    }
}
