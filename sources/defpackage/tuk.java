package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tuk {
    public static ttx a;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/common/ui/UiUtil");

    public static float a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public static Rect b(ttq ttqVar) {
        int iA;
        int i;
        int iB;
        int i2;
        ttj ttjVar = ttqVar.b;
        if (ttjVar.b.isEmpty()) {
            iA = 0;
            i = 0;
            iB = 0;
            i2 = 0;
        } else {
            iA = ttjVar.a();
            iB = ttjVar.b();
            Rect rect = ttjVar.a;
            i2 = rect.right;
            i = rect.bottom;
        }
        Rect rect2 = ttqVar.a;
        return new Rect(Math.max(rect2.left, iA), Math.max(rect2.top, iB), Math.max(rect2.right, i2), Math.max(rect2.bottom, i));
    }

    public static Rect c(avw avwVar) {
        return new Rect(avwVar.b, avwVar.c, avwVar.d, avwVar.e);
    }

    public static Drawable d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{1 != i ? R.attr.selectableItemBackground : R.attr.selectableItemBackgroundBorderless});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static View e(View view, int i, int i2) {
        View viewFindViewById = view.findViewById(i);
        return viewFindViewById instanceof ViewStub ? ((ViewStub) viewFindViewById).inflate() : view.findViewById(i2);
    }

    public static ttj f(View view) {
        if (Build.VERSION.SDK_INT < 28) {
            return new ttj(new Rect(), agke.n(agpi.a));
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
        return displayCutout == null ? new ttj(new Rect(), agke.n(agpi.a)) : new ttj(new Rect(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()), agke.n(displayCutout.getBoundingRects()));
    }

    public static avlr g(View view, avmb avmbVar) {
        awbl awblVar = new awbl(new tdu(view, 2));
        avnn avnnVar = atqp.l;
        return awblVar.W(avmbVar);
    }

    public static void h(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.getWindow().getDecorView();
        }
        if (currentFocus != null) {
            i(currentFocus);
        }
    }

    public static void i(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void j(EditText editText) {
        Editable text = editText.getText();
        Selection.setSelection(text, text.length());
    }

    public static void k(View view, Drawable drawable, int i) {
        boolean z = drawable instanceof tuj;
        if (z && ((tuj) drawable).b == i) {
            view.setBackground(drawable);
            return;
        }
        Drawable drawableD = d(view.getContext(), i);
        if (drawableD == null) {
            tym.Z(view, drawable);
        } else {
            if (drawable == null) {
                tym.Z(view, drawableD);
                return;
            }
            if (z) {
                drawable = ((tuj) drawable).a;
            }
            tym.Z(view, new tuj(drawable, drawableD, i));
        }
    }

    public static void l(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public static void m(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    public static void n(Context context, int i, int i2) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), i, i2).show();
        }
    }

    public static void o(Context context, CharSequence charSequence, int i) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), charSequence, i).show();
        }
    }

    public static boolean p(Context context) {
        if (context == null) {
            return false;
        }
        ahno.F(context instanceof Activity);
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(View view, View view2) {
        if (view instanceof ViewParent) {
            ViewParent viewParent = (ViewParent) view;
            while (view2 != null) {
                if (view2 == viewParent) {
                    return true;
                }
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
                Object parent = view2.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
            }
        } else if (view2 == view) {
            return true;
        }
        return false;
    }

    public static boolean r(Context context) {
        if (p(context)) {
            return s(((cf) context).getSupportFragmentManager());
        }
        return false;
    }

    public static boolean s(dd ddVar) {
        ddVar.getClass();
        if (!ddVar.ad() && !ddVar.A) {
            return true;
        }
        ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/common/ui/UiUtil", "isFragmentTransactionAllowed", 623, "UiUtil.java")).t("Fragment transaction is not allowed.");
        return false;
    }

    public static boolean t(View view) {
        View rootView = view.getRootView();
        int i = bac.a;
        bbn bbnVarA = azt.a(rootView);
        return bbnVarA != null && bbnVarA.x();
    }

    public static void u(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    public static avlh v(final View view, final boolean z) {
        tuy tuyVar;
        Rect rect;
        if (Build.VERSION.SDK_INT < 29 || view.getRootWindowInsets() == null) {
            tuyVar = new tuy(new ttq(new Rect(), new ttj(new Rect(), agke.n(agpi.a)), new Rect(), new Rect(), false));
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = view.getRootWindowInsets();
                rootWindowInsets.getClass();
                rect = tth.c(rootWindowInsets.getSystemWindowInsets());
            } else {
                rect = new Rect();
            }
            tuyVar = new tuy(new ttq(rect, new ttj(new Rect(), agke.n(agpi.a)), tth.a(view), tth.b(view), t(view)));
        }
        final awkv awkvVarAI = new awku(tuyVar).aI();
        avlh avlhVarV = awkvVarAI.v(new avni() { // from class: tui
            @Override // defpackage.avni
            public final void a(Object obj) {
                final boolean z2 = z;
                final awkv awkvVar = awkvVarAI;
                ayx ayxVar = new ayx() { // from class: tug
                    @Override // defpackage.ayx
                    public final bbn a(View view2, bbn bbnVar) {
                        awkvVar.kk(new tuy(new ttq(tuk.c(bbnVar.f((true != z2 ? 0 : 8) | 519)), tuk.f(view2), tuk.c(bbnVar.f(32)), tuk.c(bbnVar.g(519)), bbnVar.x())));
                        return bbnVar;
                    }
                };
                int i = bac.a;
                azs.c(view, ayxVar);
            }
        });
        isg isgVar = new isg(view, 3);
        return avlhVarV.t(avoi.d, new avnw(isgVar), isgVar, avoi.c).p().ax().c();
    }

    public static Drawable w(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        drawable.mutate().setColorFilter(tzk.i(context, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
