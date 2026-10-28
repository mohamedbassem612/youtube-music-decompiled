package defpackage;

import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acxb {
    public final acwz a;
    public final acwy b;
    public final xgn c;
    public final vxe d;
    public acwm e;
    public Object f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final vxz j;
    public final abfv k;
    public final abfv l;
    public final aciz m;
    private final afip n;

    public acxb(acwz acwzVar, acwy acwyVar, afip afipVar, aciz acizVar, xgn xgnVar, abfv abfvVar, abfv abfvVar2, vxe vxeVar, vxz vxzVar) {
        this.a = acwzVar;
        this.b = acwyVar;
        this.n = afipVar;
        this.m = acizVar;
        this.l = abfvVar2;
        this.c = xgnVar;
        this.k = abfvVar;
        this.d = vxeVar;
        this.j = vxzVar;
    }

    public final void a(TextView textView, ajnf ajnfVar, Runnable runnable) {
        xgn xgnVar = this.c;
        aeaa aeaaVarD = this.n.d(textView);
        aeaaVarD.a(ajnfVar, xgnVar, null);
        aeaaVarD.d = new acxa(this, 0);
        aeaaVarD.c = new roa(this, runnable, 4);
    }
}
