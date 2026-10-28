package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acxy extends nh {
    private final mlo a;
    private final List e;
    private final xgn f;
    private final Object g;
    private Optional h;
    private final akrn i;
    private final List j = new ArrayList();
    private final afip k;

    public acxy(mlo mloVar, List list, afip afipVar, xgn xgnVar, Object obj, Optional optional, akrn akrnVar) {
        this.h = Optional.empty();
        this.a = mloVar;
        this.e = new ArrayList(list);
        this.f = xgnVar;
        this.g = obj;
        this.h = optional;
        this.i = akrnVar;
        this.k = afipVar;
        jW();
    }

    @Override // defpackage.nh
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new aeap(new fjw(viewGroup.getContext()));
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        aeap aeapVar = (aeap) ohVar;
        int i2 = aeap.u;
        View view = aeapVar.s;
        fjw fjwVar = (fjw) view;
        Context context = fjwVar.getContext();
        mlf mlfVar = (mlf) this.j.get(i);
        fly flyVar = new fly();
        flyVar.d(mlf.class, mlfVar);
        fhd fhdVar = new fhd(new fhd(context, null, null, null), flyVar, null);
        nsk nskVarB = nsl.b();
        nskVarB.b(view);
        nskVarB.p(false);
        nskVarB.o(agke.q(aawb.ad(this.g, null, (Map) this.h.orElse(null))));
        xgn xgnVar = this.f;
        nskVarB.n(xgnVar != null ? this.k.f(xgnVar, this.i) : null);
        fhm fhmVarC = ComponentTree.c(fhdVar, this.a.a(fhdVar, nskVarB.a(), ((aigj) this.e.get(i)).G(), xgnVar != null ? new adat(xgnVar) : null, (avmm) aeapVar.t), null);
        fhmVarC.d = false;
        fjwVar.K(fhmVarC.a(), true);
        tym.j(view, -1, -2);
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void s(oh ohVar) {
        aeap aeapVar = (aeap) ohVar;
        int i = aeap.u;
        ((avmm) aeapVar.t).b();
        fjw fjwVar = (fjw) aeapVar.s;
        fjwVar.H();
        fjwVar.O();
        fjwVar.K(null, true);
    }

    @Override // defpackage.nh
    public final void v() {
        List list = this.j;
        list.clear();
        for (int i = 0; i < this.e.size(); i++) {
            list.add(new mlf());
        }
    }

    @Override // defpackage.nh
    public final void w() {
        int i = 0;
        while (true) {
            int size = this.e.size();
            List list = this.j;
            if (i >= size) {
                list.clear();
                return;
            } else {
                ((mlf) list.get(i)).dispose();
                i++;
            }
        }
    }
}
