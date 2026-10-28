package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class iz {
    public View a;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final iq e;
    private final boolean f;
    private final int g;
    private boolean h;
    private ja i;
    private iy j;
    public int b = 8388611;
    private final PopupWindow.OnDismissListener k = new acya(this, 1);

    public iz(Context context, iq iqVar, View view, boolean z, int i) {
        this.d = context;
        this.e = iqVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }

    public final iy a() {
        iy ikVar = this.j;
        if (ikVar == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            ikVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new ik(context, this.a, this.g, this.f) : new ji(context, this.e, this.a, this.g, this.f);
            ikVar.j(this.e);
            ikVar.p(this.k);
            ikVar.l(this.a);
            ikVar.d(this.i);
            ikVar.m(this.h);
            ikVar.n(this.b);
            this.j = ikVar;
        }
        return ikVar;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        iy iyVar = this.j;
        if (iyVar != null) {
            iyVar.m(z);
        }
    }

    public final void e(ja jaVar) {
        this.i = jaVar;
        iy iyVar = this.j;
        if (iyVar != null) {
            iyVar.d(jaVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        iy iyVarA = a();
        iyVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            iyVarA.o(i);
            iyVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            iyVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        iyVarA.s();
    }

    public final boolean g() {
        iy iyVar = this.j;
        return iyVar != null && iyVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }
}
