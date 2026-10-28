package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.airbnb.lottie.LottieAnimationView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tvf extends tve {
    public MotionEvent b;
    public hwc c;
    private final Handler d;
    private Runnable e;

    public tvf(ViewConfiguration viewConfiguration) {
        super(viewConfiguration);
        this.d = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.tve
    public final void a() {
        super.a();
        this.d.removeCallbacks(this.e);
        this.b = null;
    }

    @Override // defpackage.tve
    public final boolean b(View view, MotionEvent motionEvent) {
        hwc hwcVar = this.c;
        if (hwcVar != null && !hwcVar.p && !hwcVar.C.d) {
            if (abkp.a((int) motionEvent.getX(), hwcVar.getWidth()) == 0 ? hwcVar.I() : hwcVar.I.A()) {
                if (!c(motionEvent)) {
                    return false;
                }
                if (this.e == null) {
                    this.e = new szq(this, 15);
                }
                if (this.b == null) {
                    this.b = motionEvent;
                    this.d.postDelayed(this.e, ViewConfiguration.getDoubleTapTimeout());
                } else {
                    hwc hwcVar2 = this.c;
                    if (!hwcVar2.j.a() && !abgg.a(hwcVar2.y)) {
                        if (abkp.a((int) motionEvent.getX(), hwcVar2.getWidth()) == 0) {
                            amks amksVar = hwcVar2.z;
                            if (amksVar != null) {
                                Optional optionalEb = yno.eb(amlg.LIKE, (aihh) amksVar.toBuilder());
                                if (optionalEb.isPresent()) {
                                    hwcVar2.a.a((ajwo) optionalEb.get());
                                    if (!hwcVar2.R.m(8, 45661900L)) {
                                        hwcVar2.L.b();
                                    }
                                    hwcVar2.g();
                                    LottieAnimationView lottieAnimationView = hwcVar2.J;
                                    lottieAnimationView.p(0.0f, true);
                                    lottieAnimationView.setVisibility(0);
                                    lottieAnimationView.f();
                                    hwcVar2.i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 202381);
                                }
                            }
                        } else if (hwcVar2.I.A()) {
                            hwcVar2.C.a(motionEvent, hwcVar2);
                        }
                    }
                    a();
                }
                return true;
            }
        }
        return super.b(view, motionEvent);
    }
}
