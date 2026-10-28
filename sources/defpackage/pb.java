package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pb implements jb {
    iq a;
    public is b;
    final /* synthetic */ Toolbar c;

    public pb(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.jb
    public final void b(Context context, iq iqVar) {
        is isVar;
        iq iqVar2 = this.a;
        if (iqVar2 != null && (isVar = this.b) != null) {
            iqVar2.t(isVar);
        }
        this.a = iqVar;
    }

    @Override // defpackage.jb
    public final void d(ja jaVar) {
        throw null;
    }

    @Override // defpackage.jb
    public final boolean e() {
        return false;
    }

    @Override // defpackage.jb
    public final boolean f(jj jjVar) {
        return false;
    }

    @Override // defpackage.jb
    public final boolean g(is isVar) {
        Toolbar toolbar = this.c;
        View view = toolbar.h;
        if (view instanceof iu) {
            ((iu) view).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        ArrayList arrayList = toolbar.t;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                isVar.h(false);
                toolbar.w();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.jb
    public final boolean h(is isVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new AppCompatImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            pc pcVar = new pc(-2, -2);
            pcVar.a = (toolbar.m & 112) | 8388611;
            pcVar.b = 2;
            toolbar.g.setLayoutParams(pcVar);
            toolbar.g.setOnClickListener(new jn(toolbar, 2));
        }
        ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        toolbar.h = isVar.getActionView();
        this.b = isVar;
        ViewParent parent2 = toolbar.h.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.h);
            }
            pc pcVar2 = new pc(-2, -2);
            pcVar2.a = (toolbar.m & 112) | 8388611;
            pcVar2.b = 2;
            toolbar.h.setLayoutParams(pcVar2);
            toolbar.addView(toolbar.h);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((pc) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.t.add(childAt);
            }
        }
        toolbar.requestLayout();
        isVar.h(true);
        View view = toolbar.h;
        if (view instanceof iu) {
            ((iu) view).a.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.jb
    public final void i() {
        if (this.b != null) {
            iq iqVar = this.a;
            if (iqVar != null) {
                int size = iqVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.jb
    public final void c(iq iqVar, boolean z) {
    }
}
