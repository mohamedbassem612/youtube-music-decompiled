package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vjf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/stickers/interactivestickers/InteractiveStickerEditLayerControllerImpl");
    public final Context b;
    public final ujp d;
    public final xgn e;
    public View f;
    public View g;
    public View h;
    public ViewGroup i;
    public ViewGroup j;
    public RecyclerView k;
    public vjc l;
    public vin m;
    public int o;
    public final roq p;
    public final xpl q;
    public Optional n = Optional.empty();
    public final awlo c = new awlo();

    public vjf(Context context, xpl xplVar, ujp ujpVar, roq roqVar, xgn xgnVar) {
        this.b = context;
        this.q = xplVar;
        this.d = ujpVar;
        this.e = xgnVar;
        this.p = roqVar;
    }

    public final void a() {
        vjc vjcVar = this.l;
        if (vjcVar != null) {
            vjcVar.a.setVisibility(8);
            this.l = null;
        }
        if (this.g != null) {
            this.d.a();
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                this.j.setVisibility(8);
            }
            this.g.setVisibility(8);
            this.c.kk(Boolean.FALSE);
            this.m = null;
            new ugo(this.p, xhb.a(this.o)).a();
        }
    }

    public final void b() {
        if (this.m != null) {
            this.n.ifPresentOrElse(new usf(this, 15), new vhm(this, 5));
        }
        this.p.k(xhb.b(183102)).d();
        a();
    }
}
