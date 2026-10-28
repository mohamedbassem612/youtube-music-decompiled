package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.mealbar.MusicMealbar$MealbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iyk {
    public static final Interpolator a = new bnn();
    public static final Handler b = new Handler(Looper.getMainLooper(), new iye(0));
    public final ViewGroup c;
    public final MusicMealbar$MealbarLayout d;
    public ixt e;
    private jin h;
    private vxz i;
    private int g = 3;
    public final qcb f = new qcb(this);

    public iyk(ViewGroup viewGroup) {
        this.c = viewGroup;
        this.d = (MusicMealbar$MealbarLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mealbar_layout, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[DONT_INVERT, PHI: r2
      0x001a: PHI (r2v4 android.widget.FrameLayout) = (r2v1 android.widget.FrameLayout), (r2v7 android.widget.FrameLayout) binds: [B:7:0x000c, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:27:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:3:0x0003->B:31:?, LOOP_END, SYNTHETIC] */
    public static iyk g(View view, CharSequence charSequence, CharSequence charSequence2, jin jinVar, vxz vxzVar) {
        ViewGroup viewGroup;
        Object parent;
        View view2 = view;
        FrameLayout frameLayout = null;
        while (true) {
            if (!(view2 instanceof CoordinatorLayout)) {
                if (view2 instanceof FrameLayout) {
                    frameLayout = (FrameLayout) view2;
                    if (view2.getId() != 16908290) {
                        if (view2 != null) {
                            parent = view2.getParent();
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            } else {
                                view2 = null;
                            }
                        }
                        if (view2 == null) {
                        }
                    }
                } else {
                    if (view2 != null) {
                        parent = view2.getParent();
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        } else {
                            view2 = null;
                        }
                    }
                    if (view2 == null) {
                    }
                }
                viewGroup = frameLayout;
                break;
            }
            viewGroup = (CoordinatorLayout) view2;
            break;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        iyk iykVar = new iyk(viewGroup);
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = iykVar.d;
        tuk.u(musicMealbar$MealbarLayout.a, charSequence);
        TextView textView = musicMealbar$MealbarLayout.b;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(false);
        textView.setText(charSequence2);
        if (TextUtils.isEmpty(charSequence)) {
            musicMealbar$MealbarLayout.b.setTextColor(view.getContext().getColor(R.color.ytm_text_color_primary));
        }
        iykVar.g = 1;
        iykVar.h = jinVar;
        iykVar.i = vxzVar;
        return iykVar;
    }

    public final ImageView a() {
        ImageView imageView = this.d.e;
        imageView.setVisibility(0);
        return imageView;
    }

    public final void b() {
        MusicMealbar$MealbarLayout musicMealbar$MealbarLayout = this.d;
        musicMealbar$MealbarLayout.setTranslationY(musicMealbar$MealbarLayout.getHeight());
        ci ciVarX = bac.x(musicMealbar$MealbarLayout);
        ciVarX.w(0.0f);
        ciVarX.s(a);
        ciVarX.r(250L);
        ciVarX.t(new iyh(this));
        ciVarX.p();
    }

    public final void c() {
        jit jitVarA = jit.a();
        Object obj = jitVarA.a;
        qcb qcbVar = this.f;
        synchronized (obj) {
            if (jitVarA.g(qcbVar)) {
                jit.d(jitVarA.b);
            }
            if (jitVarA.h(qcbVar)) {
                jit.d(jitVarA.c);
            }
        }
    }

    public final void d() {
        this.d.e.setVisibility(8);
    }

    public final void e() {
        this.c.removeView(this.d);
        ixt ixtVar = this.e;
        if (ixtVar != null) {
            ixtVar.f();
        }
        qcb qcbVar = this.f;
        jit jitVarA = jit.a();
        synchronized (jitVarA.a) {
            if (jitVarA.g(qcbVar)) {
                jitVarA.b = null;
                if (jitVarA.c != null) {
                    jitVarA.b();
                }
            }
        }
    }

    public final void f() {
        jit.a().i(this.g, this.f, this.h, this.i);
    }

    public final void h(View view, jij jijVar, int i, ajnf ajnfVar, View.OnClickListener onClickListener) {
        if (ajnfVar == null) {
            view.setVisibility(8);
            view.setOnClickListener(null);
        } else {
            bac.p(view, new iyf());
            view.setVisibility(0);
            jijVar.a(view, null, new gdp(this, onClickListener, 15, null), null, false).j(new adly(), ajnfVar, i);
        }
    }

    public final void i(jij jijVar, ajnf ajnfVar, View.OnClickListener onClickListener) {
        h(this.d.c, jijVar, 27, ajnfVar, onClickListener);
    }
}
