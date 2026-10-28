package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mom {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int j;
    public boolean l;
    public boolean a = true;
    public int h = 0;
    public boolean i = false;
    public List k = null;

    public final View a(nv nvVar, oe oeVar) {
        List list = this.k;
        if (list == null) {
            if (!c(oeVar)) {
                return null;
            }
            try {
                View viewN = nvVar.n(this.d);
                this.d += this.e;
                return viewN;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List list2 = this.k;
            list2.getClass();
            oh ohVar = (oh) list2.get(i);
            ohVar.getClass();
            View view = ohVar.a;
            nq nqVar = (nq) view.getLayoutParams();
            nqVar.getClass();
            if (!nqVar.gN() && this.d == nqVar.gL()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(View view) {
        int iGL;
        if (view == null) {
            this.d = -1;
            return;
        }
        List list = this.k;
        list.getClass();
        int size = list.size();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = this.k;
            list2.getClass();
            oh ohVar = (oh) list2.get(i2);
            ohVar.getClass();
            View view3 = ohVar.a;
            nq nqVar = (nq) view3.getLayoutParams();
            nqVar.getClass();
            if (view3 != view && !nqVar.gN() && (iGL = (nqVar.gL() - this.d) * this.e) >= 0 && iGL < i) {
                view2 = view3;
                if (iGL == 0) {
                    break;
                } else {
                    i = iGL;
                }
            }
        }
        view2.getClass();
        nq nqVar2 = (nq) view2.getLayoutParams();
        nqVar2.getClass();
        this.d = nqVar2.gL();
    }

    public final boolean c(oe oeVar) {
        int i = this.d;
        return i >= 0 && i < oeVar.a();
    }
}
