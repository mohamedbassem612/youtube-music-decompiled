package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blf extends blc {
    public blg p;
    private float q;
    private boolean r;

    public blf(ble bleVar) {
        super(bleVar);
        this.p = null;
        this.q = Float.MAX_VALUE;
        this.r = false;
    }

    @Override // defpackage.blc
    public final boolean d(long j) {
        float f;
        boolean z = this.r;
        float f2 = this.q;
        if (z) {
            if (f2 != Float.MAX_VALUE) {
                this.p.d(f2);
                this.q = Float.MAX_VALUE;
            }
            this.h = this.p.a();
            this.g = 0.0f;
            this.r = false;
            return true;
        }
        blg blgVar = this.p;
        if (f2 != Float.MAX_VALUE) {
            long j2 = j / 2;
            bky bkyVarB = blgVar.b(this.h, this.g, j2);
            this.p.d(this.q);
            this.q = Float.MAX_VALUE;
            bky bkyVarB2 = this.p.b(bkyVarB.a, bkyVarB.b, j2);
            f = bkyVarB2.a;
            this.h = f;
            this.g = bkyVarB2.b;
        } else {
            bky bkyVarB3 = blgVar.b(this.h, this.g, j);
            f = bkyVarB3.a;
            this.h = f;
            this.g = bkyVarB3.b;
        }
        float fMax = Math.max(f, this.n);
        this.h = fMax;
        float fMin = Math.min(fMax, this.m);
        this.h = fMin;
        float f3 = this.g;
        blg blgVar2 = this.p;
        if (Math.abs(f3) >= blgVar2.d || Math.abs(fMin - blgVar2.a()) >= blgVar2.c) {
            return false;
        }
        this.h = this.p.a();
        this.g = 0.0f;
        return true;
    }

    public final void i(float f) {
        if (this.l) {
            this.q = f;
            return;
        }
        blg blgVar = this.p;
        if (blgVar == null) {
            blgVar = new blg(f);
            this.p = blgVar;
        }
        blgVar.d(f);
        l();
    }

    public final void j() {
        if (!bkq.a().b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.l) {
            super.b(true);
        }
        float f = this.q;
        if (f != Float.MAX_VALUE) {
            blg blgVar = this.p;
            if (blgVar == null) {
                this.p = new blg(f);
            } else {
                blgVar.d(f);
            }
            this.q = Float.MAX_VALUE;
        }
    }

    public final void k() {
        if (this.p.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!bkq.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            this.r = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    public final void l() {
        blg blgVar = this.p;
        if (blgVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = blgVar.a();
        if (dA > this.m) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.o * 0.75f);
        blgVar.c = dAbs;
        blgVar.d = dAbs * 62.5d;
        if (!bkq.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.l;
        if (z || z) {
            return;
        }
        this.l = true;
        if (!this.i) {
            this.h = this.k.a(this.j);
        }
        float f = this.h;
        if (f > this.m || f < this.n) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        bkq bkqVarA = bkq.a();
        ArrayList arrayList = bkqVarA.b;
        if (arrayList.size() == 0) {
            bkqVarA.g.m(bkqVarA.c);
            if (Build.VERSION.SDK_INT >= 33) {
                bkqVarA.e = ValueAnimator.getDurationScale();
                if (bkqVarA.f == null) {
                    bkqVarA.f = new ere(bkqVarA);
                }
                final ere ereVar = bkqVarA.f;
                if (ereVar.a == null) {
                    ereVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: bkp
                        public final void onChanged(float f2) {
                            ((bkq) ereVar.b).e = f2;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(ereVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public blf(Object obj, bld bldVar) {
        super(obj, bldVar);
        this.p = null;
        this.q = Float.MAX_VALUE;
        this.r = false;
    }
}
