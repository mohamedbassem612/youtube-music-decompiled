package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duh {
    public final ViewPager2 a;
    public final dul b;
    public final RecyclerView c;
    public VelocityTracker d;
    public int e;
    public float f;
    public int g;
    public long h;

    public duh(ViewPager2 viewPager2, dul dulVar, RecyclerView recyclerView) {
        this.a = viewPager2;
        this.b = dulVar;
        this.c = recyclerView;
    }

    public final void a(long j, int i, float f, float f2) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.h, j, i, f, f2, 0);
        this.d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }
}
