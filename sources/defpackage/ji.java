package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ji extends iy implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, jb {
    final na a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final iq f;
    private final in h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private ja o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new jg(this, 0);
    private final View.OnAttachStateChangeListener l = new jh(this, 0);
    private int s = 0;

    public ji(Context context, iq iqVar, View view, int i, boolean z) {
        this.e = context;
        this.f = iqVar;
        this.i = z;
        this.h = new in(iqVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new na(context, i);
        iqVar.h(this, context);
    }

    @Override // defpackage.jb
    public final void c(iq iqVar, boolean z) {
        if (iqVar == this.f) {
            k();
            ja jaVar = this.o;
            if (jaVar != null) {
                jaVar.a(iqVar, z);
            }
        }
    }

    @Override // defpackage.jb
    public final void d(ja jaVar) {
        this.o = jaVar;
    }

    @Override // defpackage.jb
    public final boolean e() {
        return false;
    }

    @Override // defpackage.jb
    public final boolean f(jj jjVar) {
        if (!jjVar.hasVisibleItems()) {
            return false;
        }
        iz izVar = new iz(this.e, jjVar, this.c, this.i, this.k);
        izVar.e(this.o);
        izVar.d(iy.w(jjVar));
        izVar.c = this.m;
        this.m = null;
        this.f.i(false);
        na naVar = this.a;
        int width = naVar.g;
        int iB = naVar.b();
        if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
            width += this.n.getWidth();
        }
        if (!izVar.g()) {
            if (izVar.a == null) {
                return false;
            }
            izVar.f(width, iB, true, true);
        }
        ja jaVar = this.o;
        if (jaVar != null) {
            jaVar.b(jjVar);
        }
        return true;
    }

    @Override // defpackage.jf
    public final ListView fN() {
        return this.a.e;
    }

    @Override // defpackage.jb
    public final void i() {
        this.q = false;
        in inVar = this.h;
        if (inVar != null) {
            inVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jf
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.iy
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.iy
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.iy
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.iy
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.i(true);
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.iy
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.iy
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.iy
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.jf
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        na naVar = this.a;
        naVar.v(this);
        naVar.l = this;
        naVar.z();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        naVar.k = view2;
        naVar.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        naVar.r(this.r);
        naVar.y();
        naVar.t(this.g);
        naVar.s();
        mb mbVar = naVar.e;
        mbVar.setOnKeyListener(this);
        if (this.t) {
            iq iqVar = this.f;
            if (iqVar.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) mbVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iqVar.e);
                }
                frameLayout.setEnabled(false);
                mbVar.addHeaderView(frameLayout, null, false);
            }
        }
        naVar.e(this.h);
        naVar.s();
    }

    @Override // defpackage.jf
    public final boolean u() {
        return !this.p && this.a.u();
    }

    @Override // defpackage.iy
    public final void j(iq iqVar) {
    }
}
