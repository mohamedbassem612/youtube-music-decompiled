package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpp implements fop, fpx {
    public final fsy a;
    public final boolean b;

    public fpp(fsy fsyVar, boolean z) {
        this.a = fsyVar;
        this.b = z;
    }

    @Override // defpackage.fop
    public final void a(int i, int i2) {
        boolean z = this.b;
        fsy fsyVar = this.a;
        if (!z) {
            fsyVar.M(i, i2);
            return;
        }
        fsyVar.y();
        if (ftj.a) {
            fsyVar.hashCode();
        }
        fsp fspVar = new fsp(i, i2);
        synchronized (fsyVar) {
            fsyVar.L = true;
            for (int i3 = 0; i3 < i2; i3++) {
                fsyVar.c.remove(i);
            }
            fsyVar.w(fspVar);
        }
    }

    @Override // defpackage.fpx
    public final void ag() {
        this.a.ag();
    }

    @Override // defpackage.fpx
    public final void ah(fkw fkwVar, int i, int i2, fip fipVar) {
        this.a.ah(fkwVar, i, i2, fipVar);
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void ai(ViewGroup viewGroup) {
        this.a.G((RecyclerView) viewGroup);
    }

    @Override // defpackage.fpx
    public final void aj(int i, int i2) {
        this.a.aj(i, i2);
    }

    @Override // defpackage.fop
    public final void e(int i) {
        throw null;
    }

    @Override // defpackage.fop
    public final void f(int i, List list) {
        boolean z = this.b;
        fsy fsyVar = this.a;
        if (!z) {
            fsyVar.A(i, list);
            return;
        }
        fsyVar.y();
        if (ftj.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((ftg) list.get(i2)).s();
            }
            fsyVar.hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        list.size();
        synchronized (fsyVar) {
            fsyVar.L = true;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ftg ftgVar = (ftg) list.get(i3);
                if (ftgVar == null) {
                    throw new RuntimeException("Received null RenderInfo to insert/update!");
                }
                int i4 = i + i3;
                fsm fsmVarV = fsyVar.v(i4, ftgVar);
                fsyVar.c.add(i4, fsmVarV.b);
                fsyVar.J(fsmVarV);
            }
        }
    }

    @Override // defpackage.fop
    public final void g(int i, List list) {
        boolean z = this.b;
        fsy fsyVar = this.a;
        if (!z) {
            fsyVar.R(i, list);
            return;
        }
        fsyVar.y();
        if (ftj.a) {
            fsyVar.hashCode();
            list.size();
        }
        synchronized (fsyVar) {
            fsyVar.w(new fsq(i, list));
            list.size();
        }
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void i(ViewGroup viewGroup) {
        this.a.P((RecyclerView) viewGroup);
    }

    @Override // defpackage.fpx
    public final boolean j() {
        return this.a.A;
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void k() {
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void l() {
    }

    @Override // defpackage.fpx
    public final void m() {
    }
}
