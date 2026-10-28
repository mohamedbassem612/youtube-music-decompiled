package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ms {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(nv nvVar) {
        List list = this.l;
        if (list == null) {
            View viewN = nvVar.n(this.d);
            this.d += this.e;
            return viewN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((oh) this.l.get(i)).a;
            nq nqVar = (nq) view.getLayoutParams();
            if (!nqVar.gN() && this.d == nqVar.gL()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(View view) {
        int iGL;
        int size = this.l.size();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((oh) this.l.get(i2)).a;
            nq nqVar = (nq) view3.getLayoutParams();
            if (view3 != view && !nqVar.gN() && (iGL = (nqVar.gL() - this.d) * this.e) >= 0 && iGL < i) {
                view2 = view3;
                if (iGL == 0) {
                    break;
                } else {
                    i = iGL;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((nq) view2.getLayoutParams()).gL();
        }
    }

    public final boolean c(oe oeVar) {
        int i = this.d;
        return i >= 0 && i < oeVar.a();
    }
}
