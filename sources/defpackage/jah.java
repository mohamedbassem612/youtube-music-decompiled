package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jah {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/presentation/ConnectivityDirectUpdateCoordinator");
    public static final byte[] b = ixt.d(0.0f);
    public static final byte[] c = ixt.d(1.0f);
    public final Optional d;
    public final zzf e;
    public final avmb f;
    public avmn g;
    public long h;
    public volatile float i;
    public volatile boolean j;
    public Long k;
    public final Set l;
    public final vxz m;
    private ValueAnimator n;

    public jah(Optional optional, zzf zzfVar, vxz vxzVar, avmb avmbVar) {
        zzfVar.getClass();
        vxzVar.getClass();
        avmbVar.getClass();
        this.d = optional;
        this.e = zzfVar;
        this.m = vxzVar;
        this.f = avmbVar;
        this.l = new LinkedHashSet();
    }

    public final float a() {
        return this.j ? 1.0f : 0.0f;
    }

    public final void b() {
        e();
        c(a(), true);
    }

    public final void c(float f, boolean z) {
        DirectUpdateDataRelay directUpdateDataRelay = (DirectUpdateDataRelay) awrc.f(this.d);
        if (directUpdateDataRelay != null) {
            Set set = this.l;
            synchronized (set) {
                this.i = f;
                if (set.isEmpty()) {
                    return;
                }
                List listAp = atqq.ap(set);
                if (z && !this.j) {
                    set.clear();
                }
                byte[] bArrE = ixt.e(f);
                Iterator it = listAp.iterator();
                while (it.hasNext()) {
                    directUpdateDataRelay.send((String) it.next(), bArrE);
                }
            }
        }
    }

    public final void d() {
        e();
        float fA = a();
        float f = this.i;
        long jAbs = (long) (this.h * Math.abs(fA - f));
        if (jAbs <= 0) {
            b();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, fA);
        valueAnimatorOfFloat.setDuration(jAbs);
        valueAnimatorOfFloat.addUpdateListener(new pr(this, 9, null));
        valueAnimatorOfFloat.addListener(new jag(this));
        this.n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        this.n = null;
    }
}
