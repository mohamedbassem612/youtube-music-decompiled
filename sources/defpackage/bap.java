package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bap implements View.OnApplyWindowInsetsListener {
    final bam a;
    private bbn b;

    public bap(View view, bam bamVar) {
        bbn bbnVarA;
        this.a = bamVar;
        int i = bac.a;
        bbn bbnVarA2 = azt.a(view);
        if (bbnVarA2 != null) {
            bbnVarA = (Build.VERSION.SDK_INT >= 36 ? new bba(bbnVarA2) : Build.VERSION.SDK_INT >= 35 ? new baz(bbnVarA2) : Build.VERSION.SDK_INT >= 34 ? new bay(bbnVarA2) : Build.VERSION.SDK_INT >= 31 ? new bax(bbnVarA2) : Build.VERSION.SDK_INT >= 30 ? new baw(bbnVarA2) : Build.VERSION.SDK_INT >= 29 ? new bav(bbnVarA2) : new bau(bbnVarA2)).a();
        } else {
            bbnVarA = null;
        }
        this.b = bbnVarA;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = bbn.o(windowInsets, view);
            return baq.a(view, windowInsets);
        }
        bbn bbnVarO = bbn.o(windowInsets, view);
        bbn bbnVarA = this.b;
        if (bbnVarA == null) {
            int i = bac.a;
            bbnVarA = azt.a(view);
            this.b = bbnVarA;
        }
        if (bbnVarA == null) {
            this.b = bbnVarO;
            return baq.a(view, windowInsets);
        }
        bam bamVarB = baq.b(view);
        if (bamVarB != null && Objects.equals(bamVarB.b, bbnVarO)) {
            return baq.a(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        bbn bbnVar = this.b;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            avw avwVarF = bbnVarO.f(i2);
            avw avwVarF2 = bbnVar.f(i2);
            int i3 = avwVarF.b;
            int i4 = avwVarF2.b;
            boolean z = i3 > i4 || avwVarF.c > avwVarF2.c || avwVarF.d > avwVarF2.d || avwVarF.e > avwVarF2.e;
            if (z != (i3 < i4 || avwVarF.c < avwVarF2.c || avwVarF.d < avwVarF2.d || avwVarF.e < avwVarF2.e)) {
                if (z) {
                    iArr[0] = iArr[0] | i2;
                } else {
                    iArr2[0] = iArr2[0] | i2;
                }
            }
        }
        int i5 = iArr[0];
        int i6 = iArr2[0];
        int i7 = i5 | i6;
        if (i7 == 0) {
            this.b = bbnVarO;
            return baq.a(view, windowInsets);
        }
        bbn bbnVar2 = this.b;
        if ((i5 & 8) != 0) {
            interpolator = baq.a;
        } else if ((i6 & 8) != 0) {
            interpolator = baq.b;
        } else if ((i5 & 519) != 0) {
            interpolator = baq.c;
        } else {
            interpolator = (i6 & 519) != 0 ? baq.d : null;
        }
        ci ciVar = new ci(i7, interpolator, (i7 & 8) != 0 ? 160L : 250L);
        ciVar.n(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(((bat) ciVar.a).j());
        avw avwVarF3 = bbnVarO.f(i7);
        avw avwVarF4 = bbnVar2.f(i7);
        int i8 = avwVarF3.b;
        int i9 = avwVarF4.b;
        int i10 = avwVarF3.c;
        int i11 = avwVarF4.c;
        int i12 = avwVarF3.d;
        int i13 = avwVarF4.d;
        int i14 = avwVarF3.e;
        int i15 = avwVarF4.e;
        bal balVar = new bal(avw.d(Math.min(i8, i9), Math.min(i10, i11), Math.min(i12, i13), Math.min(i14, i15)), avw.d(Math.max(i8, i9), Math.max(i10, i11), Math.max(i12, i13), Math.max(i14, i15)));
        baq.e(view, ciVar, bbnVarO, false);
        duration.addUpdateListener(new ban(ciVar, bbnVarO, bbnVar2, i7, view));
        duration.addListener(new bao(ciVar, view));
        ayz.b(view, new aew(view, ciVar, balVar, duration, 2));
        this.b = bbnVarO;
        return baq.a(view, windowInsets);
    }
}
