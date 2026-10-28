package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import app.rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tto extends Handler implements View.OnSystemUiVisibilityChangeListener {
    public View a;
    public int b;
    public int c;
    public boolean d;
    public boolean f;
    public boolean g;
    private final Window h;
    private final hwf j;
    private int i = 1;
    public final boolean e = true;

    public tto(Window window, hwf hwfVar) {
        this.h = window;
        hwfVar.getClass();
        this.j = hwfVar;
    }

    private final void c() {
        if (this.a != null) {
            removeMessages(0);
            int i = this.b;
            int i2 = this.c;
            boolean z = true;
            boolean z2 = i2 == 2 && this.i == 0 && !this.f;
            boolean z3 = (i & 7) == 7;
            boolean z4 = i2 == 2 && this.i == 0 && this.f;
            boolean z5 = (i & 1) == 1 && !z3;
            if (z2 == z3 && z4 == z5) {
                z = false;
            }
            if (this.g || !z) {
                return;
            }
            sendEmptyMessageDelayed(0, 2500L);
        }
    }

    public final void a() {
        int i;
        if (this.a != null) {
            c();
            int i2 = this.c;
            if (i2 == 2 || i2 == 1) {
                int i3 = this.i;
                i = 1536;
                if (i3 == 0) {
                    i = 1536 | (true != this.f ? 7 : 1);
                } else if (i3 == 2) {
                    i = 1540;
                }
                if (this.d) {
                    i |= SemanticState.Obscured;
                }
                if (this.e) {
                    i |= SemanticState.Hidden;
                }
            } else {
                i = 0;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                int i4 = Build.VERSION.SDK_INT;
                Window window = this.h;
                if (i4 > 34) {
                    window.getAttributes().layoutInDisplayCutoutMode = 3;
                } else {
                    window.getAttributes().layoutInDisplayCutoutMode = 0;
                }
            }
            this.a.setSystemUiVisibility(i);
            ((tth) this.j.a).d();
        }
    }

    public final void b(int i) {
        this.i = i;
        removeMessages(0);
        a();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            a();
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = i & 2;
        if (((this.b & 2) == 0) != (i2 == 0)) {
            hwf hwfVar = this.j;
            if (i2 == 0) {
                tth tthVar = (tth) hwfVar.a;
                if (!tthVar.j) {
                    Iterator it = tthVar.g.iterator();
                    while (it.hasNext()) {
                        ((ttu) it.next()).a();
                    }
                }
            }
        }
        this.b = i;
        c();
    }
}
