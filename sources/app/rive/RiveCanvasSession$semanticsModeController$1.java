package app.rive;

import defpackage.awmy;
import defpackage.awqg;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class RiveCanvasSession$semanticsModeController$1 extends awrb implements awqg {
    public RiveCanvasSession$semanticsModeController$1(Object obj) {
        super(1, obj, RiveCanvasSession.class, "setSemanticsEnabled", "setSemanticsEnabled(Z)V", 0);
    }

    @Override // defpackage.awqg
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return awmy.a;
    }

    public final void invoke(boolean z) {
        ((RiveCanvasSession) this.receiver).setSemanticsEnabled(z);
    }
}
