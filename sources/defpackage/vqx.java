package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class vqx implements View.OnLayoutChangeListener, vqi {
    private final avmb a;
    public final avmm b = new avmm();
    public boolean c;
    public int d;
    public int e;
    public final vor f;

    public vqx(avmb avmbVar, vor vorVar) {
        this.f = vorVar;
        this.a = avmbVar;
    }

    @Override // defpackage.vqi
    public final void a(vob vobVar) {
        if (vobVar != null) {
            this.e = 0;
        }
    }

    public final void e(boc bocVar, View view) {
        vor vorVar = this.f;
        vuk vukVar = vorVar.d;
        avlh avlhVar = vukVar.m;
        avmb avmbVar = this.a;
        avmn avmnVarAk = avlhVar.L(avmbVar).ak(new vpi(this, 5));
        avmm avmmVar = this.b;
        avmmVar.c(avmnVarAk);
        avmmVar.c(vukVar.p.L(avmbVar).ak(new mnt(this, view, 9, null)));
        view.addOnLayoutChangeListener(this);
        bocVar.b(new vqw(this, view));
        vorVar.w.h(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 == i8 && i2 == i6) {
            return;
        }
        vor vorVar = this.f;
        if (vorVar.L().b != 0) {
            c(vorVar.d.t - this.d, view);
        }
    }

    protected void b() {
    }

    protected void c(int i, View view) {
    }

    public void d(int i, View view) {
    }
}
