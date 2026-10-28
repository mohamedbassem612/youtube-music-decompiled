package com.google.android.apps.youtube.music.watchpage.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.ahsm;
import defpackage.jpk;
import defpackage.ttn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PlayerPageBehavior extends BottomSheetBehavior {
    private final int S;
    private final ttn T;
    private MotionEvent U;
    private boolean V;
    private ahsm W;
    public final Map b;
    public jpk c;
    public boolean d;
    public boolean e;

    public PlayerPageBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new HashMap();
        this.d = false;
        this.V = false;
        this.e = false;
        this.S = ViewConfiguration.get(context).getScaledTouchSlop();
        this.T = new ttn(context, 200, 1, 20);
    }

    private final int S(MotionEvent motionEvent, MotionEvent motionEvent2) {
        double rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        double rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        if (Math.hypot(rawX, rawY) <= this.S) {
            return 1;
        }
        double dAtan2 = Math.atan2(rawY, rawX);
        if (dAtan2 < 0.7853981633974483d || dAtan2 > 2.356194490192345d) {
            return (dAtan2 < -2.356194490192345d || dAtan2 > -0.7853981633974483d) ? 1 : 2;
        }
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0063  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        jpk jpkVar;
        int actionMasked = motionEvent.getActionMasked();
        ahsm ahsmVar = null;
        if (actionMasked == 0) {
            if (this.V) {
                ttn ttnVar = this.T;
                ttnVar.d(motionEvent);
                ttnVar.b(motionEvent);
            }
            MotionEvent motionEvent3 = this.U;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            this.U = MotionEvent.obtain(motionEvent);
            for (ahsm ahsmVar2 : this.b.values()) {
                Object obj = ahsmVar2.b;
                Rect rect = (Rect) ahsmVar2.c;
                ((View) obj).getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    ahsmVar = ahsmVar2;
                    break;
                }
            }
            this.W = ahsmVar;
        } else if (actionMasked == 1) {
            if (this.V) {
                this.T.c();
            }
            this.W = null;
        } else if (actionMasked == 2) {
            if (this.V) {
                this.T.b(motionEvent);
            }
            ahsm ahsmVar3 = this.W;
            if (ahsmVar3 != null && ahsmVar3.a && (motionEvent2 = this.U) != null) {
                if (this.V) {
                    int iS = S(motionEvent2, motionEvent);
                    int i = this.F;
                    if (i != 3 ? !(i != 4 ? iS == 1 : iS != 2) : iS == 3) {
                        jpkVar = this.c;
                        if ((jpkVar != null || !jpkVar.a(false)) && (!this.d || this.e)) {
                            onTouchEvent(coordinatorLayout, view, this.U);
                            return true;
                        }
                    }
                } else if (S(motionEvent2, motionEvent) == 3) {
                    jpkVar = this.c;
                    if (jpkVar != null) {
                        onTouchEvent(coordinatorLayout, view, this.U);
                        return true;
                    }
                    onTouchEvent(coordinatorLayout, view, this.U);
                    return true;
                }
            }
        } else if (actionMasked == 3) {
            if (this.V) {
                this.T.c();
            }
            this.W = null;
        }
        jpk jpkVar2 = this.c;
        if (jpkVar2 != null) {
            if (jpkVar2.a(this.W != null)) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            boolean z = this.V;
            if (actionMasked != 3) {
                if (z) {
                    this.T.b(motionEvent);
                }
            } else if (z) {
                this.T.c();
            }
        } else if (this.V) {
            ttn ttnVar = this.T;
            ttnVar.b(motionEvent);
            if (ttnVar.e(motionEvent, 1) == 1 && this.V && view != null && coordinatorLayout != null) {
                if (view.getTop() >= ((int) (coordinatorLayout.getHeight() * (1.0f - this.z)))) {
                    I(4);
                }
            }
            ttnVar.c();
        }
        try {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void q(View view, boolean z) {
        this.b.put(view, new ahsm(view, z));
    }

    public final void r(View view) {
        this.b.remove(view);
    }

    final void s() {
        this.V = true;
    }
}
