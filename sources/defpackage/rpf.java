package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rpf extends tud {
    final /* synthetic */ rpg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpf(rpg rpgVar, String str) {
        super(str);
        this.a = rpgVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        wnq wnqVar;
        rpg rpgVar = this.a;
        View view = rpgVar.a;
        if (view.getVisibility() != 0 || rpgVar.c || (wnqVar = rpgVar.b) == null || !wnqVar.n()) {
            return;
        }
        view.requestFocus();
        view.sendAccessibilityEvent(8);
        rpgVar.c = true;
    }
}
