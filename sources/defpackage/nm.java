package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nm implements pi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ np a;

    public nm(np npVar, int i) {
        this.$cid = i;
        this.a = npVar;
    }

    @Override // defpackage.pi
    public final int a(View view) {
        int decoratedBottom;
        int i;
        if (this.$cid != 0) {
            nq nqVar = (nq) view.getLayoutParams();
            decoratedBottom = this.a.getDecoratedRight(view);
            i = nqVar.rightMargin;
        } else {
            nq nqVar2 = (nq) view.getLayoutParams();
            decoratedBottom = this.a.getDecoratedBottom(view);
            i = nqVar2.bottomMargin;
        }
        return decoratedBottom + i;
    }

    @Override // defpackage.pi
    public final int b(View view) {
        int decoratedTop;
        int i;
        if (this.$cid != 0) {
            nq nqVar = (nq) view.getLayoutParams();
            decoratedTop = this.a.getDecoratedLeft(view);
            i = nqVar.leftMargin;
        } else {
            nq nqVar2 = (nq) view.getLayoutParams();
            decoratedTop = this.a.getDecoratedTop(view);
            i = nqVar2.topMargin;
        }
        return decoratedTop - i;
    }

    @Override // defpackage.pi
    public final int c() {
        int height;
        int paddingBottom;
        int i = this.$cid;
        np npVar = this.a;
        if (i != 0) {
            height = npVar.getWidth();
            paddingBottom = npVar.getPaddingRight();
        } else {
            height = npVar.getHeight();
            paddingBottom = npVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    @Override // defpackage.pi
    public final int d() {
        int i = this.$cid;
        np npVar = this.a;
        return i != 0 ? npVar.getPaddingLeft() : npVar.getPaddingTop();
    }

    @Override // defpackage.pi
    public final View e(int i) {
        int i2 = this.$cid;
        np npVar = this.a;
        return i2 != 0 ? npVar.getChildAt(i) : npVar.getChildAt(i);
    }
}
