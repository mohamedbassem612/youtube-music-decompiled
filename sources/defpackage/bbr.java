package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bbr extends bbm {
    final WindowInsetsController a;
    protected final Window b;
    final zf c;

    public bbr(Window window, zf zfVar) {
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        new aha(0);
        this.a = windowInsetsController;
        this.c = zfVar;
        this.b = window;
    }

    private final void o(boolean z, int i, int i2) {
        if (this.b != null) {
            if (z) {
                m(i);
                return;
            } else {
                n(i);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(i2, i2);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, i2);
        }
    }

    @Override // defpackage.bbm
    public final void b(int i) {
        if ((i & 8) != 0) {
            this.c.g();
        }
        this.a.hide(i & (-9));
    }

    @Override // defpackage.bbm
    public void c(boolean z) {
        o(z, 16, 16);
    }

    @Override // defpackage.bbm
    public void d(boolean z) {
        o(z, SemanticState.Multiline, 8);
    }

    @Override // defpackage.bbm
    public boolean e() {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            if ((windowInsetsController.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & SemanticState.Multiline) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bbm
    public void f() {
        Window window = this.b;
        if (window == null) {
            this.a.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        n(SemanticState.Modal);
        m(SemanticState.Obscured);
    }

    @Override // defpackage.bbm
    public final void g() {
        this.c.h();
        this.a.show(0);
    }

    protected final void m(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    protected final void n(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
