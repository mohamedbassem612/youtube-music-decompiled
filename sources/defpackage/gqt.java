package defpackage;

import android.view.Menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gqt implements gpv, hlo {
    private final hlp a;
    private final tbt b;
    private final gfq c;
    private final jki d;
    private final itq e;
    private gpl f;

    public gqt(hlp hlpVar, tbt tbtVar, gfq gfqVar, jki jkiVar, itq itqVar) {
        this.a = hlpVar;
        this.b = tbtVar;
        this.c = gfqVar;
        this.d = jkiVar;
        this.e = itqVar;
    }

    @Override // defpackage.hlo
    public final void V() {
        this.f.R(true, 1);
    }

    @Override // defpackage.gpv
    public final void c(gpl gplVar) {
        this.f = gplVar;
        this.b.f(this);
        this.a.f(this);
        itq itqVar = this.e;
        if (itqVar.d.remove(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS) != null) {
            gplVar.R(false, 1);
        }
    }

    @Override // defpackage.gpv
    public final void d() {
        this.b.l(this);
        this.a.i(this);
    }

    @tcc
    public void handleCreatePlaylistActionEvent(gsc gscVar) {
        String strB;
        gpl gplVar = this.f;
        if (gplVar.s == null || !this.d.i(gplVar) || (strB = this.f.s.b()) == null || !strB.equals(this.c.b())) {
            return;
        }
        this.f.R(true, 1);
    }

    @Override // defpackage.hlo
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.hlo
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.gpv
    public final void b(Menu menu) {
    }

    @Override // defpackage.gpv
    public final /* synthetic */ void f(Object obj) {
    }
}
