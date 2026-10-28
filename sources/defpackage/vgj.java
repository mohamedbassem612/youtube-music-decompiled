package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgj extends vhf {
    public final ImageView s;
    public aqcs t;
    public final bog u;
    public final vhg v;
    private final vic x;

    public vgj(View view, vhg vhgVar, vic vicVar, bog bogVar) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.image);
        this.v = vhgVar;
        this.x = vicVar;
        this.u = bogVar;
    }

    @Override // defpackage.vhf
    public final void C() {
        apji apjiVar = this.w;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqct.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("renderer missing");
        }
        apji apjiVar2 = this.w;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqct.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        this.t = (aqcs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        Optional optionalFj = yno.fj(this.w);
        if (optionalFj.isPresent()) {
            this.v.f.add((Uri) optionalFj.get());
        }
        this.v.q.o(true);
        this.x.a((Uri) yno.fj(this.w).orElse(null), new vgi(this, 0));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vhf
    public final void D() {
        ImageView imageView = this.s;
        imageView.setImageDrawable(null);
        imageView.setContentDescription(null);
        Optional optionalFj = yno.fj(this.w);
        if (optionalFj.isPresent()) {
            vic vicVar = this.x;
            Uri uri = (Uri) optionalFj.get();
            ?? r2 = vicVar.b;
            if (r2.containsKey(uri)) {
                sxw sxwVar = (sxw) r2.get(uri);
                if (!sxwVar.d()) {
                    sxwVar.c();
                }
            }
            this.v.B((Uri) optionalFj.get());
        }
        this.t = null;
    }
}
