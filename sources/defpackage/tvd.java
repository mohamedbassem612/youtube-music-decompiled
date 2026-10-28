package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class tvd extends duc {
    private final boolean i;
    private final tvc j;
    private final tvc k;

    public tvd(Context context) {
        super(context);
        final int i = 1;
        this.i = true;
        this.j = new tvc(this) { // from class: tvb
            public final /* synthetic */ tvd a;

            {
                this.a = this;
            }

            @Override // defpackage.tvc
            public final boolean a(MotionEvent motionEvent) {
                int i2 = i;
                tvd tvdVar = this.a;
                return i2 != 0 ? tvdVar.x(motionEvent) : tvdVar.w(motionEvent);
            }
        };
        final int i2 = 0;
        this.k = new tvc(this) { // from class: tvb
            public final /* synthetic */ tvd a;

            {
                this.a = this;
            }

            @Override // defpackage.tvc
            public final boolean a(MotionEvent motionEvent) {
                int i3 = i2;
                tvd tvdVar = this.a;
                return i3 != 0 ? tvdVar.x(motionEvent) : tvdVar.w(motionEvent);
            }
        };
    }

    private static final boolean v(MotionEvent motionEvent, tvc tvcVar) {
        try {
            return tvcVar.a(motionEvent);
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            return false;
        }
    }

    @Override // defpackage.duc, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.i && super.canScrollHorizontally(i);
    }

    @Override // defpackage.duc, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.i && v(motionEvent, this.k);
    }

    @Override // defpackage.duc, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i && v(motionEvent, this.j);
    }

    @Override // defpackage.duc
    public final boolean r(KeyEvent keyEvent) {
        return this.i && super.r(keyEvent);
    }

    public final /* synthetic */ boolean w(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final /* synthetic */ boolean x(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public tvd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 1;
        this.i = true;
        this.j = new tvc(this) { // from class: tvb
            public final /* synthetic */ tvd a;

            {
                this.a = this;
            }

            @Override // defpackage.tvc
            public final boolean a(MotionEvent motionEvent) {
                int i3 = i;
                tvd tvdVar = this.a;
                return i3 != 0 ? tvdVar.x(motionEvent) : tvdVar.w(motionEvent);
            }
        };
        final int i2 = 0;
        this.k = new tvc(this) { // from class: tvb
            public final /* synthetic */ tvd a;

            {
                this.a = this;
            }

            @Override // defpackage.tvc
            public final boolean a(MotionEvent motionEvent) {
                int i3 = i2;
                tvd tvdVar = this.a;
                return i3 != 0 ? tvdVar.x(motionEvent) : tvdVar.w(motionEvent);
            }
        };
    }
}
