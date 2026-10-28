package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezp extends bld {
    @Override // defpackage.bld
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = aezq.h;
        return ((aezq) obj).b() * 10000.0f;
    }

    @Override // defpackage.bld
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        aezq aezqVar = (aezq) obj;
        int i = aezq.h;
        aezqVar.d(f / 10000.0f);
        if (aezqVar.j.c(true)) {
            if (aezqVar.d == null) {
                Context context = aezqVar.i;
                TimeInterpolator timeInterpolator = aetz.a;
                aezqVar.f = afba.y(context, R.attr.motionEasingStandardInterpolator, timeInterpolator);
                aezqVar.g = afba.y(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
                aezqVar.d = new ValueAnimator();
                aezqVar.d.setDuration(500L);
                aezqVar.d.setFloatValues(0.0f, 1.0f);
                aezqVar.d.setInterpolator(null);
                aezqVar.d.addUpdateListener(new adey(aezqVar, 10));
            }
            float fA = aezqVar.a((int) f);
            if (fA == aezqVar.c) {
                if (aezqVar.d.isRunning()) {
                    return;
                }
                aezqVar.c(fA);
                return;
            }
            if (aezqVar.d.isRunning()) {
                aezqVar.d.cancel();
            }
            aezqVar.c = fA;
            if (fA == 1.0f) {
                aezqVar.e = aezqVar.f;
                aezqVar.d.start();
            } else {
                aezqVar.e = aezqVar.g;
                aezqVar.d.reverse();
            }
        }
    }
}
