package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jce implements advb {
    public final admh a = new adlg();
    private final jgc b;
    private final View c;
    private final jgc d;
    private final abzi e;
    private final abzo f;
    private final aehs g;
    private final kyr h;
    private final aczl i;
    private final xsc j;
    private final xsc k;

    public jce(jgc jgcVar, abzo abzoVar, jgc jgcVar2, aczl aczlVar, abzi abziVar, xsc xscVar, kyr kyrVar, xsc xscVar2, aehs aehsVar, View view) {
        this.d = jgcVar;
        this.f = abzoVar;
        this.b = jgcVar2;
        this.i = aczlVar;
        this.e = abziVar;
        this.k = xscVar;
        this.h = kyrVar;
        this.j = xscVar2;
        this.g = aehsVar;
        this.c = view;
        b(null);
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        jgc jgcVar = this.d;
        View view = this.c;
        jcx jcxVar = new jcx(jgcVar, view, 2);
        admh admhVar = this.a;
        admhVar.d(anne.class, jcxVar);
        admhVar.d(anpr.class, new jcx(this.f, view, 5));
        admhVar.d(anzx.class, new jcx(this.b, view, 9));
        admhVar.d(annx.class, new jdg(this.i, this, view, 0));
        admhVar.d(anny.class, new jcx(this.e, view, 7));
        admhVar.d(anpf.class, new jcx(this.k, view, 4));
        admhVar.d(anzl.class, new jcx(this.h, view, 8));
        admhVar.d(anrs.class, new jcx(this.j, view, 6));
        admhVar.d(anob.class, new jcx(this.g, view, 3));
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.a;
    }
}
