package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nc extends nd {
    @Override // defpackage.nd
    public final int a(View view) {
        return this.a.getDecoratedBottom(view) + ((nq) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.nd
    public final int b(View view) {
        nq nqVar = (nq) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + nqVar.topMargin + nqVar.bottomMargin;
    }

    @Override // defpackage.nd
    public final int c(View view) {
        nq nqVar = (nq) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + nqVar.leftMargin + nqVar.rightMargin;
    }

    @Override // defpackage.nd
    public final int d(View view) {
        return this.a.getDecoratedTop(view) - ((nq) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.nd
    public final int e() {
        return this.a.getHeight();
    }

    @Override // defpackage.nd
    public final int f() {
        np npVar = this.a;
        return npVar.getHeight() - npVar.getPaddingBottom();
    }

    @Override // defpackage.nd
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.nd
    public final int h() {
        return this.a.getHeightMode();
    }

    @Override // defpackage.nd
    public final int i() {
        return this.a.getWidthMode();
    }

    @Override // defpackage.nd
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.nd
    public final int k() {
        np npVar = this.a;
        return (npVar.getHeight() - npVar.getPaddingTop()) - npVar.getPaddingBottom();
    }

    @Override // defpackage.nd
    public final int l(View view) {
        Rect rect = this.b;
        this.a.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // defpackage.nd
    public final int m(View view) {
        Rect rect = this.b;
        this.a.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // defpackage.nd
    public final void n(int i) {
        this.a.offsetChildrenVertical(i);
    }
}
