package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpn implements advb {
    public admh a;
    private final Context b;
    private final ttm c;
    private final xgn d;
    private final rpq e;
    private final rpr f;
    private final rpt g;
    private final adhv h;

    public rpn(Context context, ttm ttmVar, xgn xgnVar, adhv adhvVar, rpq rpqVar, rpr rprVar, rpt rptVar) {
        this.b = context;
        this.c = ttmVar;
        this.h = adhvVar;
        this.d = xgnVar;
        this.e = rpqVar;
        this.f = rprVar;
        this.g = rptVar;
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        this.a = new adlg();
        ahno.F(cls == wnt.class);
        Context context = this.b;
        this.a.d(rpi.class, new rpp(context, 1, (byte[]) null));
        xgn xgnVar = this.d;
        this.a.d(airc.class, new rph(context, R.layout.account_item_section_header, xgnVar));
        this.a.d(wnq.class, new jdg(context, this.h, xgnVar, this.e, 3));
        this.a.d(wnr.class, new jdg(context, this.c, this.f, 2));
        this.a.d(rpm.class, new jcx(context, this.g, 10));
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.a;
    }
}
