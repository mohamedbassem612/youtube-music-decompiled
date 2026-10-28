package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afcv extends afcr {
    public static final /* synthetic */ int a = 0;
    private static final int[] y = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private boolean A;
    private final AccessibilityManager z;

    private afcv(Context context, ViewGroup viewGroup, View view, afcs afcsVar) {
        super(context, viewGroup, view, afcsVar);
        this.z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:30:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:3:0x0002->B:34:?, LOOP_END, SYNTHETIC] */
    public static afcv p(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = R.layout.design_layout_snackbar_include;
        if (resourceId != -1 && resourceId2 != -1) {
            i2 = R.layout.mtrl_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate(i2, viewGroup, false);
        afcv afcvVar = new afcv(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        afcvVar.o().setText(charSequence);
        afcvVar.m = i;
        return afcvVar;
    }

    private final SnackbarContentLayout r() {
        return (SnackbarContentLayout) this.k.getChildAt(0);
    }

    @Override // defpackage.afcr
    public final int a() {
        int i = this.m;
        if (i != -2) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = this.A;
            if (i2 >= 29) {
                return this.z.getRecommendedTimeoutMillis(i, (true != z ? 0 : 4) | 3);
            }
            if (!z || !this.z.isTouchExplorationEnabled()) {
                return i;
            }
        }
        return -2;
    }

    public final Button n() {
        return r().b;
    }

    public final TextView o() {
        return r().a;
    }

    public final void q(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button buttonN = n();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonN.setVisibility(8);
            buttonN.setOnClickListener(null);
            this.A = false;
        } else {
            this.A = true;
            buttonN.setVisibility(0);
            buttonN.setText(charSequence);
            buttonN.setOnClickListener(new aems(this, onClickListener, 4));
        }
    }
}
