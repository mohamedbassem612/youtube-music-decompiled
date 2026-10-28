package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dux extends RecyclerView {
    final /* synthetic */ ViewPager2 ae;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dux(ViewPager2 viewPager2, Context context) {
        super(context);
        this.ae = viewPager2;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.ae;
        accessibilityEvent.setFromIndex(viewPager2.a);
        accessibilityEvent.setToIndex(viewPager2.a);
        accessibilityEvent.setSource(((duu) viewPager2.j).a);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.ae.h && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.ae.h && super.onTouchEvent(motionEvent);
    }
}
