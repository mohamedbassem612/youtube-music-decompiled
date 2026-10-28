package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hvu extends zik implements DialogInterface.OnDismissListener {
    public hvt a;
    public final /* synthetic */ hvv b;
    int c;
    private final abnl d;
    private tbt e;
    private xzc f;
    private cf g;
    private boolean h;
    private boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public hvu(hvv hvvVar, tbt tbtVar, abnl abnlVar, cf cfVar, xzc xzcVar) {
        String str;
        super((byte[]) null);
        this.b = hvvVar;
        String str2 = null;
        this.g = cfVar;
        this.d = abnlVar;
        this.e = tbtVar;
        tbtVar.f(this);
        this.f = xzcVar;
        xzcVar.ay(this);
        this.h = false;
        this.i = false;
        this.c = 1;
        if (hvvVar.h.l(247, 45825186L, false)) {
            return;
        }
        hvt hvtVar = new hvt();
        this.a = hvtVar;
        hvtVar.n = this;
        hvtVar.o = 1;
        hvtVar.i();
        this.a.gT(this.g.getSupportFragmentManager(), null);
        if (abnlVar == null || this.g == null) {
            return;
        }
        String strW = abnlVar.w();
        String strU = abnlVar.u();
        if (abnlVar.x() == null) {
            if (TextUtils.isEmpty(strU) && TextUtils.isEmpty(strW)) {
                ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController", "getVideoIdForThumbnail", 374, "ConnectionPendingDialogFragmentController.java")).t("Could not determine video ID from PlayerStartDescriptor");
            } else {
                str = strW;
            }
            if (TextUtils.isEmpty(str)) {
            }
            ivi iviVar = new ivi(this, 1);
            abpd abpdVar = hvvVar.c;
            byte[] bArrQ = abnlVar.Q();
            abpdVar.d.execute(afwl.i(new zdy(abpdVar, str, abnlVar.s(), bArrQ, (sxu) new sxs(this.g, iviVar), 5)));
        }
        str2 = (String) abnlVar.x().get(Math.max(0, abnlVar.a()));
        str = str2;
        if (TextUtils.isEmpty(str)) {
            ivi iviVar2 = new ivi(this, 1);
            abpd abpdVar2 = hvvVar.c;
            byte[] bArrQ2 = abnlVar.Q();
            abpdVar2.d.execute(afwl.i(new zdy(abpdVar2, str, abnlVar.s(), bArrQ2, (sxu) new sxs(this.g, iviVar2), 5)));
        }
    }

    private final void g() {
        agrx agrxVar = agso.a;
        if (this.h && this.i) {
            a();
            abnl abnlVar = this.d;
            if (abnlVar != null) {
                hvv hvvVar = this.b;
                taf.j(hvvVar.f.submit(afwl.i(new hqa(this, abnlVar, 10))), new hou(8));
            }
        }
    }

    private final void j() {
        if (c()) {
            return;
        }
        this.c = 2;
        hvt hvtVar = this.a;
        if (hvtVar != null) {
            hvtVar.o = 2;
            hvtVar.i();
        } else if (this.b.h.l(247, 45825186L, false)) {
            a();
        }
    }

    public final void a() {
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            agrx agrxVar = agso.a;
            return;
        }
        agrx agrxVar2 = agso.a;
        this.c = 3;
        tbt tbtVar = this.e;
        if (tbtVar != null) {
            tbtVar.l(this);
        }
        xzc xzcVar = this.f;
        if (xzcVar != null) {
            xzcVar.az(this);
        }
        hvt hvtVar = this.a;
        if (hvtVar != null) {
            hvtVar.dismiss();
            ImageView imageView = this.a.m;
            if (imageView != null) {
                this.b.b.f(imageView);
            }
            this.a = null;
        }
        this.e = null;
        this.g = null;
    }

    public final boolean c() {
        int i = this.c;
        if (i != 0) {
            return i == 3 || i == 2;
        }
        throw null;
    }

    @Override // defpackage.zik
    public final void d() {
        if (c()) {
            return;
        }
        this.i = true;
        g();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        a();
    }

    @tcc
    void onMdxSessionStatusEvent(xzh xzhVar) {
        if (c()) {
            return;
        }
        xzc xzcVar = xzhVar.a;
        if (xzcVar == null) {
            ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController$PendingDialogSession", "onMdxSessionStatusEvent", 263, "ConnectionPendingDialogFragmentController.java")).t("Received null MDX session while waiting for connection");
            this.h = false;
            j();
            return;
        }
        if (!this.b.h.l(247, 45825186L, false)) {
            if (xzcVar.b() == 1) {
                this.h = true;
                g();
                return;
            } else {
                ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController$PendingDialogSession", "onMdxSessionStatusEvent", 283, "ConnectionPendingDialogFragmentController.java")).w("Received unexpected MDX state while waiting for connection: %s", xzcVar);
                this.h = false;
                j();
                return;
            }
        }
        if (xzcVar.b() == 2) {
            ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController$PendingDialogSession", "onMdxSessionStatusEvent", 271, "ConnectionPendingDialogFragmentController.java")).w("Received unexpected MDX state while waiting for connection: %s", xzcVar);
            this.h = false;
            j();
        } else if (xzcVar.b() == 1) {
            this.h = true;
            g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvu(hvv hvvVar) {
        super((byte[]) null);
        this.b = hvvVar;
        this.c = 3;
        this.d = null;
    }
}
