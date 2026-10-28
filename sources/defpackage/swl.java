package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class swl extends tud {
    final /* synthetic */ swm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swl(swm swmVar, String str) {
        super(str);
        this.a = swmVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        swm swmVar = this.a;
        View view = swmVar.a;
        if (view.getParent() != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            view.measure(View.MeasureSpec.makeMeasureSpec(((View) view.getParent()).getMeasuredWidth(), 1073741824), 0);
            if (swmVar.b.getMeasuredWidth() > view.getMeasuredWidth() / 2) {
                swmVar.g(1);
            } else {
                swmVar.g(0);
            }
            view.requestLayout();
        }
    }
}
