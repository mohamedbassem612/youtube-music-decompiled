package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jin implements aeez {
    public final Context a;
    public afcv c;
    private final aunn f;
    private Object g;
    public View b = null;
    public final awku d = new awku();

    public jin(Context context, aunn aunnVar) {
        this.a = context;
        this.f = aunnVar;
    }

    public static final jio e() {
        jik jikVar = new jik();
        jikVar.i(-1);
        jikVar.c();
        jikVar.j();
        return jikVar;
    }

    private final void f(afcv afcvVar, boolean z, int i) {
        Drawable drawable;
        afcq afcqVar = afcvVar.k;
        TextView textView = (TextView) afcqVar.findViewById(R.id.snackbar_text);
        TextView textView2 = (TextView) afcqVar.findViewById(R.id.snackbar_action);
        afcqVar.setPadding(0, 0, 0, 0);
        textView.setPadding(0, 0, 0, 0);
        Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.music_snackbar_message_margin_horizontal);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.music_snackbar_action_margin_horizontal);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.setMarginStart(dimensionPixelSize);
            if (true == z) {
                dimensionPixelSize = 0;
            }
            layoutParams.setMarginEnd(dimensionPixelSize);
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(dimensionPixelSize2);
            layoutParams2.setMarginEnd(dimensionPixelSize2);
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(R.attr.musicSnackbarBackgroundColor, typedValue, true);
        if (i == 3) {
            drawable = context.getDrawable(R.drawable.music_snackbar_gradient);
            drawable.getClass();
        } else {
            drawable = context.getDrawable(R.drawable.music_snackbar_background);
            drawable.getClass();
            drawable.setTint(context.getColor(typedValue.resourceId));
        }
        int i2 = bac.a;
        afcqVar.setBackground(drawable);
        theme.resolveAttribute(R.attr.musicSnackbarTextColor, typedValue, true);
        textView.setTextColor(context.getColor(typedValue.resourceId));
        textView.setTypeface(Typeface.DEFAULT);
        theme.resolveAttribute(R.attr.musicSnackbarActionColor, typedValue, true);
        textView2.setTextColor(context.getColor(typedValue.resourceId));
        textView2.setAllCaps(false);
    }

    @Override // defpackage.aeez
    public final /* bridge */ /* synthetic */ aefb a() {
        return e();
    }

    public final void b() {
        afcv afcvVar = this.c;
        if (afcvVar != null) {
            afcvVar.e(3);
        }
    }

    public final void c() {
        this.b = null;
    }

    @Override // defpackage.aeez
    public final void d(aefd aefdVar) {
        boolean z = aefdVar instanceof jir;
        afco afcoVar = null;
        Object obj = z ? ((jir) aefdVar).a : null;
        Object obj2 = this.g;
        if (obj2 == null || !obj2.equals(obj)) {
            this.g = obj;
            aunn aunnVar = this.f;
            if ((aunnVar == null || aunnVar.io() == null) && this.b == null) {
                tuk.o(this.a, aefdVar.e(), aefdVar.a() != -1 ? 1 : 0);
                return;
            }
            View view = this.b;
            if (view == null) {
                view = (View) aunnVar.io();
            }
            afcv afcvVarP = afcv.p(view, aefdVar.e(), aefdVar.a());
            afco afcoVar2 = afcvVarP.n;
            if (afcoVar2 != null) {
                afcoVar2.a();
            }
            if (view != null) {
                afcoVar = new afco(afcvVarP, view);
                if (view.isAttachedToWindow()) {
                    afba.A(view, afcoVar);
                }
                view.addOnAttachStateChangeListener(afcoVar);
            }
            afcvVarP.n = afcoVar;
            aeem aeemVarC = aefdVar.c();
            if (aeemVarC != null) {
                afcvVarP.m(new jim(aeemVarC, aefdVar));
            }
            boolean z2 = aefdVar.b() != null;
            if (z2) {
                afcvVarP.q(aefdVar.d(), aefdVar.b());
                if (aefdVar.a() == -1) {
                    afcvVarP.m = 3500;
                }
                if (twb.c(this.a)) {
                    afcvVarP.m = -2;
                }
            }
            if (z) {
                int i = ((jir) aefdVar).b;
                f(afcvVarP, z2, i != 0 ? i : 1);
            } else {
                f(afcvVarP, z2, 1);
            }
            this.c = afcvVarP;
            aefdVar.f();
            afcv afcvVar = this.c;
            if (afcvVar != null) {
                afcvVar.m(new jil(this));
                this.c.h();
            }
        }
    }
}
