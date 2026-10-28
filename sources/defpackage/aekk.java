package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aekk implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ alhq b;
    final /* synthetic */ Object c;
    final /* synthetic */ aekn d;

    public aekk(aekn aeknVar, View view, alhq alhqVar, Object obj) {
        this.a = view;
        this.b = alhqVar;
        this.c = obj;
        this.d = aeknVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        aekn aeknVar = this.d;
        View view2 = this.a;
        if (aeknVar.a(view2)) {
            aeknVar.c(this.b, view2, this.c);
            view2.removeOnLayoutChangeListener(this);
        }
    }
}
