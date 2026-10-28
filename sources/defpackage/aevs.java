package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aevs {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new acem(this, 8, null);

    public aevs(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        WeakReference weakReference = bottomSheetBehavior.J;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) bottomSheetBehavior.J.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
