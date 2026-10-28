package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbp extends uhv {
    public final zvl b;
    public final avmb c;
    public final vxe d;
    public final vbn e;
    public final avmm f;
    public final adxj g;
    public final Context h;
    public final aeda i;
    public agke j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public xhc o;
    public FrameLayout p;
    public String q;
    public final roq r;
    public final roq s;
    public zf t;
    public final xsc u;

    public vbp(cc ccVar, zvl zvlVar, awmd awmdVar, vxe vxeVar, xsc xscVar, avmb avmbVar, roq roqVar, roq roqVar2, adxj adxjVar, aeda aedaVar) {
        super(ccVar, false);
        this.f = new avmm();
        this.j = agpi.a;
        this.k = "";
        this.h = ccVar.requireContext();
        this.b = zvlVar;
        this.c = avmbVar;
        this.d = vxeVar;
        this.u = xscVar;
        this.s = roqVar;
        this.e = (vbn) awmdVar.io();
        this.r = roqVar2;
        this.g = adxjVar;
        this.i = aedaVar;
    }

    @Override // defpackage.uhv
    protected final void d() {
        this.f.dispose();
    }

    public final void l(boolean z) {
        boolean z2 = z && !this.m;
        this.l = z2;
        if (this.q != null) {
            this.e.d(true != z2 ? 8 : 0);
            if (z2) {
                return;
            }
            this.u.D(this.q);
        }
    }
}
