package defpackage;

import android.view.Window;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bbp extends bbo {
    public bbp(Window window, zf zfVar) {
        super(window, zfVar);
    }

    @Override // defpackage.bbm
    public final void d(boolean z) {
        if (!z) {
            n(SemanticState.Multiline);
            return;
        }
        o(67108864);
        p();
        m(SemanticState.Multiline);
    }

    @Override // defpackage.bbm
    public final boolean e() {
        return (this.a.getDecorView().getSystemUiVisibility() & SemanticState.Multiline) != 0;
    }
}
