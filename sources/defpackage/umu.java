package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umu extends uhv {
    public final awmd b;
    public final awmd c;
    public final cc d;
    public final ums e;
    public final ulp f;
    public final View g;
    public final uyg h;
    public final vqv i;
    public final umt j;
    public vbp k;
    private avmn l;
    private final avmb m;

    public umu(cc ccVar, avmb avmbVar, awmd awmdVar, awmd awmdVar2, ums umsVar, uyg uygVar, vqv vqvVar, ulp ulpVar, View view, umt umtVar) {
        super(ccVar, false);
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = ccVar;
        this.m = avmbVar;
        this.e = umsVar;
        this.f = ulpVar;
        this.g = view;
        this.h = uygVar;
        this.i = vqvVar;
        this.j = umtVar;
    }

    @Override // defpackage.uhv
    protected final void d() {
        Object obj = this.l;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
    }

    @Override // defpackage.uhv
    protected final void j(View view) {
        this.l = this.f.h.c.O(this.m).an(agpr.a).C(new uln(this, 16));
    }
}
