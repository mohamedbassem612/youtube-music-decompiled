package defpackage;

import android.view.View;
import android.view.Window;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bbo extends bbm {
    protected final Window a;
    private final zf b;

    public bbo(Window window, zf zfVar) {
        this.a = window;
        this.b = zfVar;
    }

    @Override // defpackage.bbm
    public final void b(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m(4);
                } else if (i2 == 2) {
                    m(2);
                } else if (i2 == 8) {
                    this.b.g();
                }
            }
        }
    }

    @Override // defpackage.bbm
    public final void f() {
        this.a.getDecorView().setTag(356039078, 2);
        n(SemanticState.Modal);
        m(SemanticState.Obscured);
    }

    @Override // defpackage.bbm
    public final void g() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((i & 8) != 0) {
                if (i == 1) {
                    n(4);
                    o(SemanticState.ReadOnly);
                } else if (i == 2) {
                    n(2);
                } else if (i == 8) {
                    this.b.h();
                }
            }
        }
    }

    protected final void m(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    protected final void n(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }

    protected final void o(int i) {
        this.a.clearFlags(i);
    }

    protected final void p() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
