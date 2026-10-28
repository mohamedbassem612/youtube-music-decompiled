package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlr extends rqt {
    public View a;
    public LinearLayout b;
    private ListView j;
    private View k;
    private ListView l;
    private final aduv m;
    private final admu n;
    private final rlh o;
    private final afvq p;
    private final vxz q;
    private final afip r;
    private final axlj s;
    private final lqa t;
    private final xsc u;

    public rlr(Context context, ttm ttmVar, xgn xgnVar, adhv adhvVar, ci ciVar, xsc xscVar, awmd awmdVar, aduv aduvVar, axlj axljVar, afip afipVar, aeda aedaVar, lqa lqaVar, afvq afvqVar, vxz vxzVar) {
        Context context2;
        super(context, ttmVar, xgnVar, adhvVar, ciVar, vxzVar);
        this.n = new admu();
        this.o = new rlh();
        this.u = xscVar;
        this.m = aduvVar;
        this.s = axljVar;
        this.r = afipVar;
        this.t = lqaVar;
        this.p = afvqVar;
        this.q = vxzVar;
        if (aedaVar.f()) {
            context2 = context;
            this.a.setBackgroundColor(tzk.i(context2, R.attr.ytRaisedBackground));
        } else {
            context2 = context;
        }
        o(new rlf(context2, ttmVar, xgnVar, adhvVar, this, this, this, this, aduvVar, axljVar, afipVar, lqaVar, xscVar, afvqVar, vxzVar), ciVar, this.j);
        o(new rld(context, this, this, xgnVar, awmdVar, vxzVar), ciVar, this.l);
    }

    private final void o(advb advbVar, ci ciVar, ListView listView) {
        advbVar.b(wnt.class);
        adln adlnVarAi = ciVar.ai((admh) advbVar.io());
        if (listView == this.l) {
            adlnVarAi.h(this.n);
        } else {
            adlnVarAi.h(this.e);
        }
        listView.setAdapter((ListAdapter) adlnVarAi);
    }

    @Override // defpackage.rqt
    public final View a(Context context) {
        if (n()) {
            this.a = LayoutInflater.from(context).inflate(R.layout.fusion_account_selector_layout, (ViewGroup) null);
        } else {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_selector_layout_old, (ViewGroup) null);
            this.a = viewInflate;
            ((ImageView) viewInflate.findViewById(R.id.add_account)).setOnClickListener(new rnx((Object) this, 1));
        }
        this.j = (ListView) this.a.findViewById(R.id.account_list);
        this.k = this.a.findViewById(R.id.footer_separator);
        this.l = (ListView) this.a.findViewById(R.id.account_list_footer);
        this.b = (LinearLayout) this.a.findViewById(R.id.extra_footers);
        return this.a;
    }

    @Override // defpackage.rqt
    protected final ListView b() {
        return this.j;
    }

    @Override // defpackage.rqt
    public final admu c() {
        return this.n;
    }

    @Override // defpackage.rqt
    protected final void d() {
        if (this.e.isEmpty() && !this.q.m(56, 45750297L)) {
            l(this.o);
        } else if (this.q.m(56, 45750297L)) {
            this.n.add(this.o);
        }
    }

    @Override // defpackage.rqt
    protected final void e() {
        l(this.c);
    }

    public final void f(boolean z) {
        this.k.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.rqt
    public final void g(xsc xscVar) {
        super.g(xscVar);
        int i = 0;
        while (true) {
            adlq adlqVar = this.e;
            if (i >= adlqVar.a()) {
                return;
            }
            Object objD = adlqVar.d(i);
            if (objD instanceof adll) {
                f(false);
            } else if (objD instanceof rpu) {
                f(true);
            }
            i++;
        }
    }
}
