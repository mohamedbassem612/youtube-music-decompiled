package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqf implements jqb {
    private static final float[] c = {1.0f, 0.89f, 0.78f, 0.67f, 0.58f, 0.48f, 0.4f, 0.32f, 0.25f, 0.18f, 0.13f, 0.08f, 0.05f, 0.02f, 0.01f, 0.0f};
    public jqh a;
    public final ggf b;
    private final View d;
    private final View e;
    private final View f;
    private final Context g;
    private iwl h;
    private final ggf i;
    private final View.OnLayoutChangeListener j;
    private final int k;
    private final vxz l;

    public jqf(View view, View view2, View view3, Context context, vxz vxzVar) {
        view.getClass();
        view2.getClass();
        view3.getClass();
        context.getClass();
        vxzVar.getClass();
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.g = context;
        this.l = vxzVar;
        this.h = iwl.a;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.player_page_scrim_offset);
        if (Build.VERSION.SDK_INT < 29) {
            jqh jqhVar = new jqh(d().b);
            view2.setBackground(jqhVar);
            this.a = jqhVar;
        }
        this.i = new jqd(view);
        this.b = new jqe(this, view2, this.a);
        this.j = new jfx(this, 4);
    }

    private final int e() {
        return this.h.f.d;
    }

    private final boolean f() {
        vxz vxzVar = this.l;
        return vxzVar.c(7, 45818042L, 100L) > 0 && vxzVar.c(7, 45818042L, 100L) < 100;
    }

    @Override // defpackage.jqb
    public final void a() {
        this.f.addOnLayoutChangeListener(this.j);
    }

    @Override // defpackage.jqb
    public final void b() {
        this.f.removeOnLayoutChangeListener(this.j);
    }

    @Override // defpackage.jqb
    public final void c(iwl iwlVar, Duration duration) {
        duration.getClass();
        this.h = iwlVar;
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = avv.f(iwlVar.f.c, (int) (c[i] * 255.0f));
        }
        this.i.a(iArr, duration);
        jqc jqcVarD = d();
        this.b.b(jqcVarD.a, jqcVarD.b, duration);
    }

    public final jqc d() {
        float f;
        int iF;
        boolean zF = f();
        iwl iwlVar = this.h;
        int iC = zF ? avv.c(iwlVar.f.a, e(), this.l.c(7, 45818042L, 100L) / 100.0f) : iwlVar.f.c;
        int iE = e();
        View view = this.e;
        float measuredHeight = view.getMeasuredHeight();
        View view2 = this.f;
        float fM = measuredHeight <= 0.0f ? 0.0f : awro.m(((view2.getY() + view2.getMeasuredHeight()) - view.getY()) / measuredHeight);
        float measuredHeight2 = view.getMeasuredHeight();
        float fM2 = measuredHeight2 > 0.0f ? awro.m(this.k / measuredHeight2) : 0.0f;
        if (fM2 > fM) {
            fM2 = fM;
        }
        boolean zF2 = f();
        int i = 0;
        int i2 = (fM >= 1.0f || zF2) ? 0 : 1;
        float f2 = true != zF2 ? 0.45f : 1.0f;
        int i3 = i2 + 17;
        int[] iArr = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            if (i4 < 16) {
                iF = avv.f(iC, (int) (c[15 - i4] * f2 * 255.0f));
            } else {
                iF = (i4 != 16 || zF2) ? iE : iC;
            }
            iArr[i4] = iF;
            i4++;
        }
        if (true == zF2) {
            fM2 = fM;
        }
        float[] fArr = new float[i3];
        while (i < i3) {
            if (i < 16) {
                f = (i / 15.0f) * fM2;
            } else {
                f = (i != 16 || zF2) ? 1.0f : fM;
            }
            fArr[i] = f;
            i++;
        }
        return new jqc(iArr, fArr);
    }
}
