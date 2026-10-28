package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvc {
    public final abfs c;
    public final abvn d;
    public final xgn e;
    public final Context f;
    public abgk g;
    public long h;
    public long i;
    public LinearLayout k;
    public ViewStub l;
    public apfg m;
    public ImageView n;
    public View o;
    public View p;
    public View q;
    public View r;
    public final acmx s;
    public final hno t;
    private final xeu u;
    public final List a = new ArrayList();
    public final avmm b = new avmm();
    public boolean j = false;

    public acvc(Context context, abvn abvnVar, acmx acmxVar, abfs abfsVar, xgm xgmVar, xeu xeuVar, hno hnoVar) {
        this.f = context;
        this.d = abvnVar;
        this.s = acmxVar;
        this.c = abfsVar;
        this.e = xgmVar.hB();
        this.u = xeuVar;
        this.t = hnoVar;
    }

    public final void a() {
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            tuk.l(linearLayout, false);
        }
    }

    public final void b() {
        aihf aihfVarCreateBuilder = aldb.a.createBuilder();
        aldd alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ACCESSIBILITY_MODE_ENABLED;
        aihfVarCreateBuilder.copyOnWrite();
        aldb aldbVar = (aldb) aihfVarCreateBuilder.instance;
        aldbVar.c = alddVar.aW;
        aldbVar.b |= 1;
        xeu xeuVar = this.u;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.GENERIC_CLIENT_EXPERIMENT_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aldb aldbVar2 = (aldb) aihfVarCreateBuilder.build();
        aldbVar2.getClass();
        alouVar.d = aldbVar2;
        alouVar.c = 423;
        xeuVar.b((alou) alosVar.build());
    }

    public final boolean c() {
        return this.k != null && twb.d(this.f) && this.k.getVisibility() == 0;
    }
}
