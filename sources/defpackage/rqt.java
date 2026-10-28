package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class rqt implements rpq, rpr, rpt, rps {
    private final admu b;
    public final View d;
    public final adlq e;
    public final Map f;
    public final Context g;
    public final xgn h;
    public rqq i;
    private final vxz j;
    private final rpm a = new rpm();
    protected final rpi c = new rpi();

    public rqt(Context context, ttm ttmVar, xgn xgnVar, adhv adhvVar, ci ciVar, vxz vxzVar) {
        this.g = context;
        this.h = xgnVar;
        this.j = vxzVar;
        this.d = a(context);
        adlq adlqVar = new adlq(false);
        this.e = adlqVar;
        this.f = new afv();
        this.b = new admu();
        rpn rpnVar = new rpn(context, ttmVar, xgnVar, adhvVar, this, this, this);
        rpnVar.b(wnt.class);
        adln adlnVarAi = ciVar.ai(rpnVar.a);
        adlnVarAi.h(adlqVar);
        b().setAdapter((ListAdapter) adlnVarAi);
    }

    public View a(Context context) {
        ListView listView = new ListView(context);
        listView.setId(R.id.account_list);
        listView.setBackgroundColor(tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(0));
        return listView;
    }

    protected ListView b() {
        return (ListView) this.d;
    }

    public admu c() {
        return this.b;
    }

    protected void d() {
        l(this.a);
    }

    protected void e() {
        l(this.c);
        l(this.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public void g(xsc xscVar) {
        m();
        if (n()) {
            d();
        }
        rpm.a(this.g, new rme(this, 2), new rew(this, xscVar, 4), new rme(this, 3), (wnt) xscVar.a);
        if (!n()) {
            d();
        }
        Iterator it = xscVar.b.iterator();
        while (it.hasNext()) {
            this.h.d(new xgj(((ovo) it.next()).k()));
        }
    }

    @Override // defpackage.rps
    public final void h() {
        rqq rqqVar = this.i;
        if (rqqVar != null) {
            rqqVar.a();
        }
    }

    @Override // defpackage.rpq
    public final void i(wnq wnqVar) {
        rqq rqqVar = this.i;
        if (rqqVar != null) {
            rqqVar.i(wnqVar);
        }
    }

    @Override // defpackage.rpr
    public final void j(wnr wnrVar) {
        rqq rqqVar = this.i;
        if (rqqVar != null) {
            rqqVar.j(wnrVar);
        }
    }

    @Override // defpackage.rpt
    public final void k() {
        rqq rqqVar = this.i;
        if (rqqVar != null) {
            sdo sdoVar = rqqVar.g;
            rqqVar.b.f(rqqVar.a, sdoVar);
        }
    }

    public final void l(Object obj) {
        admu admuVar = new admu();
        admuVar.add(obj);
        this.e.m(-1, admuVar, true);
    }

    public final void m() {
        this.e.t();
        this.f.clear();
        this.b.clear();
        c().clear();
    }

    public final boolean n() {
        return this.j.m(56, 45750297L);
    }
}
