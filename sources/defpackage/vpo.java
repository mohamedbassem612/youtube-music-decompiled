package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vpo {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = new float[8];
    private static final ViewOutlineProvider c = ViewOutlineProvider.BACKGROUND;

    public static void a(ViewGroup viewGroup, vny vnyVar) {
        if (viewGroup == null || vnyVar == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.panel_header);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            b(frameLayout, vnyVar.b());
        }
        View viewFindViewById = viewGroup.findViewById(R.id.close_button);
        if (viewFindViewById != null) {
            if (vnyVar instanceof vos) {
                viewFindViewById.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = viewGroup.findViewById(R.id.top_content_container);
            if (viewFindViewById2 != null) {
                c(viewFindViewById, viewFindViewById2.getVisibility() == 0);
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) viewFindViewById2.getTag(R.id.top_content_container);
                if (onLayoutChangeListener != null) {
                    viewFindViewById2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                jfx jfxVar = new jfx(viewFindViewById, 9);
                viewFindViewById2.addOnLayoutChangeListener(jfxVar);
                viewFindViewById2.setTag(R.id.top_content_container, jfxVar);
            } else {
                c(viewFindViewById, false);
            }
        }
        View viewA = vnyVar.a();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.panel_subheader);
        if (viewGroup2 != null) {
            if (viewA == null) {
                viewGroup2.setVisibility(8);
                return;
            }
            viewGroup2.removeAllViews();
            b(viewGroup2, viewA);
            viewGroup2.setVisibility(0);
        }
    }

    public static void b(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        viewGroup.addView(view);
    }

    public static void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z2 = layoutParams instanceof LinearLayout.LayoutParams;
        int i = true != z ? 16 : 80;
        if (z2) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2.gravity != i) {
                layoutParams2.gravity = i;
                view.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams3.gravity != i) {
                layoutParams3.gravity = i;
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean e(vob vobVar) {
        if (vobVar.S() != 2) {
            return false;
        }
        akuj akujVarU = vobVar.u();
        if (akujVarU != null && (akujVarU.c & 2) != 0) {
            akui akuiVar = akujVarU.g;
            if (akuiVar == null) {
                akuiVar = akui.a;
            }
            int i = akuiVar.b;
            if (atqp.S(i) != 15) {
                if (i != 138681548) {
                    return false;
                }
                akuo akuoVar = (akuo) akuiVar.c;
                if ((akuoVar.b & 2) != 0) {
                    alay alayVar = akuoVar.e;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    if (!TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean f(Context context, int i, int i2, int i3) {
        return i2 == 3 && (twm.v(context) || context.getResources().getConfiguration().orientation == 2) && i >= i3;
    }

    public static void g(Context context, boolean z, boolean z2, boolean z3, boolean z4, View view, View view2, vxz vxzVar, boolean z5) {
        if (view == null || view2 == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.arrow_drag_handle);
        if (z3) {
            if (z) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground().mutate();
        if (!z || z5) {
            gradientDrawable.setCornerRadii(b);
            h(view2);
            return;
        }
        if (z4) {
            gradientDrawable.setCornerRadii(aecm.r(context, vxzVar));
            view2.setOutlineProvider(new vpn(context, vxzVar));
            view2.setClipToOutline(true);
        } else if (!z2) {
            gradientDrawable.setCornerRadii(aecm.r(context, vxzVar));
            h(view2);
        } else {
            if (d(context)) {
                float fQ = aecm.q(context, vxzVar);
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, fQ, fQ, 0.0f, 0.0f, 0.0f, 0.0f});
                view2.setOutlineProvider(new vpm(context, vxzVar));
                view2.setClipToOutline(true);
                return;
            }
            float fQ2 = aecm.q(context, vxzVar);
            gradientDrawable.setCornerRadii(new float[]{fQ2, fQ2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            view2.setOutlineProvider(new vpl(context, vxzVar));
            view2.setClipToOutline(true);
        }
    }

    private static void h(View view) {
        view.setOutlineProvider(c);
        view.setClipToOutline(false);
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background.mutate()).setCornerRadii(b);
        }
    }
}
