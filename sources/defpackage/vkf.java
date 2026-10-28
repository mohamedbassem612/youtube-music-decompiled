package defpackage;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vkf extends tud {
    final /* synthetic */ InputMethodManager a;
    final /* synthetic */ vkl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkf(vkl vklVar, String str, InputMethodManager inputMethodManager) {
        super(str);
        this.a = inputMethodManager;
        this.b = vklVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        vkl vklVar = this.b;
        vklVar.q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        vklVar.q.requestFocus();
        this.a.showSoftInput(vklVar.q, 1);
    }
}
