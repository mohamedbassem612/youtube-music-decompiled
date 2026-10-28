package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyg implements tuv {
    public View[] a = new View[0];
    public View[] b = new View[0];
    public int c = 1;
    public final vor d;

    public uyg(vor vorVar) {
        this.d = vorVar;
    }

    @Override // defpackage.tuv
    public final void a(int i, tss tssVar) {
        if (i == 3) {
            int i2 = this.c;
            View[] viewArr = this.b;
            if (i2 == 1) {
                nuo.s(viewArr);
                return;
            } else {
                nuo.t(4, viewArr);
                return;
            }
        }
        if (i != 1) {
            return;
        }
        int i3 = this.c;
        View[] viewArr2 = this.b;
        int i4 = 0;
        if (i3 == 1) {
            viewArr2.getClass();
            while (true) {
                View[] viewArr3 = this.a;
                if (i4 >= viewArr3.length) {
                    nuo.t(4, this.b);
                    return;
                }
                View view = viewArr3[i4];
                if (view == null || view.getVisibility() != 0) {
                    this.b[i4] = null;
                } else {
                    this.b[i4] = this.a[i4];
                }
                i4++;
            }
        } else {
            viewArr2.getClass();
            while (true) {
                View[] viewArr4 = this.a;
                if (i4 >= viewArr4.length) {
                    nuo.s(this.b);
                    return;
                }
                View view2 = viewArr4[i4];
                if (view2 == null || view2.getVisibility() == 0) {
                    this.b[i4] = null;
                } else {
                    this.b[i4] = this.a[i4];
                }
                i4++;
            }
        }
    }
}
