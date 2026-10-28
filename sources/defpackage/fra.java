package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fra implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ frc a;
    final /* synthetic */ Integer b;
    final /* synthetic */ fwl c;
    final /* synthetic */ abh d;

    public fra(frc frcVar, Integer num, abh abhVar, fwl fwlVar) {
        this.a = frcVar;
        this.b = num;
        this.d = abhVar;
        this.c = fwlVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        frc frcVar = this.a;
        frcVar.getViewTreeObserver().removeOnPreDrawListener(this);
        Integer num = this.b;
        if (num != null && num.intValue() != -1) {
            frcVar.setScrollX(num.intValue());
            this.d.a = num.intValue();
            return true;
        }
        abh abhVar = this.d;
        int i = abhVar.a;
        if (i != -1) {
            frcVar.setScrollX(i);
            return true;
        }
        if (this.c == fwl.RTL) {
            frcVar.fullScroll(66);
        }
        abhVar.a = frcVar.getScrollX();
        return true;
    }
}
