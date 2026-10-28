package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aeuu extends ast {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private aeuv viewOffsetHelper;

    public aeuu() {
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public int getLeftAndRightOffset() {
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar != null) {
            return aeuvVar.c;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar != null) {
            return aeuvVar.b;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        aeuv aeuvVar = this.viewOffsetHelper;
        return aeuvVar != null && aeuvVar.e;
    }

    public boolean isVerticalOffsetEnabled() {
        aeuv aeuvVar = this.viewOffsetHelper;
        return aeuvVar != null && aeuvVar.d;
    }

    protected void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.ast
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        layoutChild(coordinatorLayout, view, i);
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar == null) {
            aeuvVar = new aeuv(view);
            this.viewOffsetHelper = aeuvVar;
        }
        aeuvVar.b();
        this.viewOffsetHelper.a();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.d(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        this.viewOffsetHelper.c(i3);
        this.tempLeftRightOffset = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar != null) {
            aeuvVar.e = z;
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar != null) {
            return aeuvVar.c(i);
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar != null) {
            return aeuvVar.d(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        aeuv aeuvVar = this.viewOffsetHelper;
        if (aeuvVar != null) {
            aeuvVar.d = z;
        }
    }

    public aeuu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }
}
