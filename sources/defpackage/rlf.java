package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlf implements advb {
    public final Context a;
    private final ttm b;
    private final xgn c;
    private final rpq d;
    private final rpr e;
    private final rpt f;
    private final rps g;
    private final adhv h;
    private admh i;
    private final aduv j;
    private final afvq k;
    private final vxz l;
    private final afip m;
    private final axlj n;
    private final lqa o;
    private final xsc p;

    public rlf(Context context, ttm ttmVar, xgn xgnVar, adhv adhvVar, rpq rpqVar, rpr rprVar, rpt rptVar, rps rpsVar, aduv aduvVar, axlj axljVar, afip afipVar, lqa lqaVar, xsc xscVar, afvq afvqVar, vxz vxzVar) {
        this.a = context;
        this.b = ttmVar;
        this.h = adhvVar;
        this.c = xgnVar;
        this.d = rpqVar;
        this.e = rprVar;
        this.f = rptVar;
        this.g = rpsVar;
        this.j = aduvVar;
        this.n = axljVar;
        this.m = afipVar;
        this.o = lqaVar;
        this.p = xscVar;
        this.k = afvqVar;
        this.l = vxzVar;
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        ahno.F(cls == wnt.class);
        this.i = new adlg();
        vxz vxzVar = this.l;
        if (!vxzVar.m(56, 45750297L)) {
            this.i.d(rlh.class, new rlg(this.a, this.f, vxzVar.m(56, 45750297L)));
        }
        admh admhVar = this.i;
        Context context = this.a;
        admhVar.d(rpi.class, new rpp(context, 1, (byte[]) null));
        admh admhVar2 = this.i;
        xgn xgnVar = this.c;
        admhVar2.d(airc.class, new rph(context, R.layout.fusion_account_item_section_header, xgnVar));
        this.i.d(wnq.class, new rlk(context, this.h, xgnVar, this.d, this.g, this.j, this.n, this.m, this.o, this.k, vxzVar));
        this.i.d(wnr.class, new jdg(context, this.b, this.e, 2));
        this.i.d(airo.class, new rpp(context, 0));
        this.i.d(adll.class, new rle(this, 0));
        this.i.d(rpu.class, new rpp(context, 2, (char[]) null));
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.i;
    }
}
