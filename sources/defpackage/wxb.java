package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxb implements avlw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public wxb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    private final void e(boolean z) {
        wxc wxcVar = (wxc) this.a;
        wxf wxfVar = wxcVar.i;
        if (!wxfVar.j()) {
            wxcVar.v();
            return;
        }
        acjx acjxVarB = wxfVar.b();
        if (acjxVarB == null) {
            wxcVar.h.a();
            wxcVar.w("Streaming connection error from the server due to ".concat(true != z ? "HTTP errors." : "network errors."));
        }
        if (acjxVarB == null) {
            acjxVarB = wxfVar.a();
        }
        wxcVar.v();
        if (!wxcVar.h.b() && acjxVarB != null) {
            wxfVar.g(wxcVar.f.schedule(afwl.i(new wtg(this, acjxVarB, 13)), 50L, TimeUnit.MILLISECONDS));
            return;
        }
        Executor executor = wxcVar.g;
        wwn wwnVar = wxcVar.e;
        wwnVar.getClass();
        executor.execute(afwl.i(new wvr(wwnVar, 8)));
        wxcVar.w("Falling back from streaming to unary GetLiveChat.");
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.$cid != 0) {
            ((agrc) ((agrc) ((agrc) gpl.U.b()).j(th)).k("com/google/android/apps/youtube/music/browse/LibraryBrowseFragment$4", "onError", (char) 400, "LibraryBrowseFragment.java")).t("Error observing musicShowYtPlaylists entity update");
        } else {
            e(true);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (this.$cid == 0) {
            wxf wxfVar = ((wxc) this.a).i;
            if (wxfVar.j()) {
                wxfVar.h(avmnVar);
            }
        }
    }

    @Override // defpackage.avlw
    public final /* synthetic */ void kk(Object obj) {
        if (this.$cid == 0) {
            wxc wxcVar = (wxc) this.a;
            alsi alsiVar = (alsi) obj;
            if (wxcVar.i.j()) {
                wxcVar.g.execute(afwl.i(new wtg(this, alsiVar, 14)));
                return;
            }
            return;
        }
        Object obj2 = this.a;
        gpl gplVar = (gpl) obj2;
        if (gplVar.isResumed()) {
            ((gnf) obj2).R(true, 1);
        } else {
            gplVar.ax.l(true);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.$cid == 0) {
            e(false);
        }
    }
}
