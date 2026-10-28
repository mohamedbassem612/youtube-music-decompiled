package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xuf extends xtt {
    public static final agrf m = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/dialogfactory/MdxMediaRouteChooserDialogFragment");
    public xrx A;
    public aeda B;
    public ycp C;
    public ycp D;
    public vxz E;
    public abte F;
    public xsc G;
    public dov H;
    private dfu I;
    public did n;
    public awmd o;
    public xrd p;
    public tbt q;
    public awmd r;
    public boolean s;
    public awmd t;
    public xla u;
    public xmr v;
    public ydu w;
    public xru x;
    public xgm y;
    public Executor z;

    @Override // defpackage.dfv
    public final dfu j(Context context) {
        Window window;
        xub xubVar = new xub(context, (yar) this.o.io(), this.H, this.s, this.q, this.t, this.r, this.p, this.G, this.v, this.u, this.w, this.D, this.C, this.x, this.y.hB(), this.z, this.A, this.F, this.E);
        xubVar.x = Optional.of(this.B);
        this.I = xubVar;
        xubVar.i(this.n);
        this.I.setCanceledOnTouchOutside(true);
        if (this.B.f() && (window = this.I.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(tzk.i(context, R.attr.ytRaisedBackground)));
        }
        return this.I;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }
}
