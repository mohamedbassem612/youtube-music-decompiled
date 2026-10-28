package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgt implements adma, iyv {
    public final ycp a;
    private final jgs b;
    private final avlh c;
    private avmm d;
    private final hwz e;

    public jgt(jgs jgsVar, hwz hwzVar, avlh avlhVar, ycp ycpVar) {
        this.b = jgsVar;
        this.e = hwzVar;
        this.c = avlhVar;
        this.a = ycpVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b.a();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        avmm avmmVar = this.d;
        if (avmmVar != null && !avmmVar.b) {
            this.d.b();
            this.d = null;
        }
        this.b.b(admhVar);
    }

    public final void d(adly adlyVar, hzg hzgVar) {
        this.b.o(adlyVar, hzgVar.c, hzgVar);
    }

    @Override // defpackage.iyv
    public final int f() {
        return 3;
    }

    @Override // defpackage.iyv
    public final int g() {
        return this.b.i;
    }

    @Override // defpackage.iyv
    public final void h() {
        this.b.h();
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        jgt jgtVar;
        adly adlyVar2;
        abke abkeVar = (abke) ((ida) obj).get();
        if (abkeVar instanceof hzf) {
            hzf hzfVar = (hzf) abkeVar;
            this.b.o(adlyVar, hzfVar.a, hzfVar);
            return;
        }
        if (abkeVar instanceof hzg) {
            hzg hzgVar = (hzg) abkeVar;
            if (this.d == null) {
                avmm avmmVar = new avmm();
                this.d = avmmVar;
                jgtVar = this;
                adlyVar2 = adlyVar;
                avmmVar.e(this.e.h().ay().i(new abwr(1)).al(new gto(jgtVar, adlyVar2, hzgVar, 7, (char[]) null), new jeh(6)), jgtVar.c.H(new hpn(jgtVar, hzgVar, 2, null)).x(new hxe(19)).i(new abwr(1)).al(new gto(jgtVar, adlyVar2, hzgVar, 8, (char[]) null), new jeh(6)));
            } else {
                jgtVar = this;
                adlyVar2 = adlyVar;
            }
            jgtVar.d(adlyVar2, hzgVar);
        }
    }

    @Override // defpackage.iyv
    public final void i(jas jasVar) {
        this.b.i(jasVar);
    }

    @Override // defpackage.iyw
    public final void j(Canvas canvas, RecyclerView recyclerView, oh ohVar, float f, float f2, int i, boolean z) {
        this.b.j(canvas, recyclerView, ohVar, f, f2, i, z);
    }

    @Override // defpackage.iyw
    public final void k() {
        this.b.a();
    }

    @Override // defpackage.iyw
    public final void l() {
        this.b.a();
    }
}
