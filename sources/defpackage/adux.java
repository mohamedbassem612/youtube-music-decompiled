package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adux extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ anfy b;
    final /* synthetic */ View c;
    final /* synthetic */ Object d;
    final /* synthetic */ xgn e;
    final /* synthetic */ adva f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adux(adva advaVar, String str, View view, anfy anfyVar, View view2, Object obj, xgn xgnVar) {
        super(str);
        this.a = view;
        this.b = anfyVar;
        this.c = view2;
        this.d = obj;
        this.e = xgnVar;
        this.f = advaVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f.k(this.b, this.c, this.d, this.e);
    }
}
