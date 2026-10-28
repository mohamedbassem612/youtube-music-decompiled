package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aekl implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ aekn b;
    final /* synthetic */ addn c;

    public aekl(aekn aeknVar, addn addnVar, View view) {
        this.c = addnVar;
        this.a = view;
        this.b = aeknVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        addn addnVar = this.c;
        if (addnVar.e()) {
            int[] iArr = this.b.a;
            int i = iArr[0];
            int i2 = iArr[1];
            this.a.getLocationOnScreen(iArr);
            if (i != iArr[0] || i2 != iArr[1]) {
                aefh aefhVar = (aefh) addnVar.a;
                aefhVar.a();
                aefhVar.requestLayout();
            }
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }
}
