package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gpi extends jlc {
    final /* synthetic */ gpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpi(gpl gplVar, avmb avmbVar) {
        super(500L, avmbVar);
        this.a = gplVar;
    }

    @Override // defpackage.jlc
    public final void a() {
        gpl gplVar = this.a;
        View view = gplVar.D;
        if (view != null) {
            view.setSoundEffectsEnabled(false);
            gplVar.D.performClick();
            gplVar.D.setSoundEffectsEnabled(true);
        }
    }
}
