package defpackage;

import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xue extends nh {
    public final List a;
    public final ydu e;
    public final xru f;
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    public final ycp i;
    private final xgn j;
    private final xrx k;
    private final xrd l;
    private final awmd m;
    private final tbt n;
    private final xla o;
    private final ycp p;
    private final dov q;

    public xue(List list, ydu yduVar, ycp ycpVar, ycp ycpVar2, xru xruVar, xgn xgnVar, xrx xrxVar, xrd xrdVar, dov dovVar, awmd awmdVar, tbt tbtVar, xla xlaVar) {
        this.a = list;
        this.e = yduVar;
        this.p = ycpVar;
        this.i = ycpVar2;
        this.f = xruVar;
        this.j = xgnVar;
        this.k = xrxVar;
        this.l = xrdVar;
        this.q = dovVar;
        this.m = awmdVar;
        this.n = tbtVar;
        this.o = xlaVar;
    }

    private final amdd A(dii diiVar) {
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
        int iL = this.k.l(diiVar);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar.c = iL - 1;
        amdgVar.b |= 1;
        int iBU = zik.bU(this.p.b);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar2.d = iBU - 1;
        amdgVar2.b |= 4;
        amdg amdgVar3 = (amdg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdgVar3.getClass();
        amddVar.f = amdgVar3;
        amddVar.b |= 4;
        return (amdd) aihfVarCreateBuilder.build();
    }

    private final void B(int i, dii diiVar, Map map) {
        xgt xgtVarA;
        xgn xgnVar = this.j;
        if (xgnVar == null || (xgtVarA = xgnVar.a()) == null) {
            return;
        }
        xgx xgxVar = new xgx(xgtVarA, xhb.b(i));
        xgnVar.d(xgxVar);
        xgnVar.w(xgxVar, A(diiVar));
        map.put(xrx.a(diiVar), xgxVar);
    }

    @Override // defpackage.nh
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new xuc(new aecl(viewGroup.getContext()));
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        aliz alizVar;
        xuc xucVar = (xuc) ohVar;
        dii diiVar = (dii) this.a.get(i);
        aecl aeclVar = (aecl) xucVar.s;
        aeclVar.b();
        aeclVar.b.setText(diiVar.e);
        int i2 = diiVar.o;
        if (i2 != 1) {
            alizVar = (i2 == 2 || i2 == 3) ? aliz.SPEAKER : aliz.CAST_ICON;
        } else {
            alizVar = aliz.TV;
        }
        aduv aduvVar = aeclVar.a;
        if (aduvVar != null) {
            aeclVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(aduvVar.a(alizVar), 0, 0, 0);
        }
        B(135332, diiVar, this.g);
        aeclVar.setOnClickListener(new xud(this, diiVar, this.f, (Boolean) this.m.io(), this.q, this.l, this.n, diiVar));
        if (this.o.aN()) {
            return;
        }
        aeclVar.c.setVisibility(0);
        B(135333, diiVar, this.h);
        aeclVar.c.setOnClickListener(new ivx(this, diiVar, xucVar, 20));
    }

    public final void z(dii diiVar, Map map) {
        xgz xgzVar = (xgz) map.get(xrx.a(diiVar));
        xgn xgnVar = this.j;
        if (xgnVar == null || xgzVar == null) {
            agrx agrxVar = agso.a;
        } else {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVar, A(diiVar));
        }
    }
}
