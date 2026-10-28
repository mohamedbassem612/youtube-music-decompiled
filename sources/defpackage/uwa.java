package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwa implements uwb {
    public static final Duration a = Duration.ofSeconds(3);
    public View b;
    public CreationButtonView c;
    public CreationButtonView d;
    public uiv e;
    public final vxz f;
    public final vxz g;
    public final xte h;
    public final aaok i;
    public final qcb j;
    private final ukp l;
    private final avmm m = new avmm();
    private final awli k = new awli(Boolean.TRUE);

    public uwa(qcb qcbVar, aaok aaokVar, vxz vxzVar, xte xteVar, ukp ukpVar, vxz vxzVar2) {
        this.j = qcbVar;
        this.i = aaokVar;
        this.f = vxzVar;
        this.h = xteVar;
        this.l = ukpVar;
        this.g = vxzVar2;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [adxj, java.lang.Object] */
    public final CreationButtonView a() {
        Drawable drawable;
        xte xteVar = this.h;
        Object obj = xteVar.a;
        xhc xhcVarB = xhb.b(119242);
        if (((aaok) obj).J()) {
            drawable = xteVar.d.d((Context) xteVar.c, arqz.hm);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            xteVar.f(drawable);
        } else {
            drawable = ((Resources) xteVar.e).getDrawable(R.drawable.ic_filter_off_stroke);
        }
        CreationButtonView creationButtonViewD = xteVar.d(R.id.shorts_edit_preset_button, drawable, xhcVarB, ((Resources) xteVar.e).getString(R.string.shorts_filter_presets_title), null);
        if (this.g.l(88, 45685201L, false)) {
            creationButtonViewD.e(creationButtonViewD.b.getDrawable());
        }
        this.c = creationButtonViewD;
        return creationButtonViewD;
    }

    @Override // defpackage.uwb
    public final void b() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
        this.k.kk(Boolean.FALSE);
        this.m.b();
    }

    @Override // defpackage.uwb
    public final void c() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
        this.k.kk(Boolean.TRUE);
        d();
    }

    public final void d() {
        avmm avmmVar = this.m;
        avmmVar.b();
        ukp ukpVar = this.l;
        avmmVar.c(ukpVar.d().af(new usn(this, 5)));
        if (this.i.N()) {
            avmmVar.c(ukpVar.e().K(new rtq(20)).r().af(new usn(this, 6)));
        }
    }
}
