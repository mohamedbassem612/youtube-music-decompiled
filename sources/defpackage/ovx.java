package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ovx {
    public owb a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;

    private final void g() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = false;
    }

    public final void a(View view) {
        if (!this.c || this.d) {
            return;
        }
        if (!this.e) {
            this.d = true;
            owb owbVar = this.a;
            if (owbVar != null) {
                owbVar.ak(view, 1);
            }
            this.c = false;
        }
        this.e = false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.f = false;
            if (this.c || !this.b || this.d) {
                return;
            }
            this.d = true;
            owb owbVar = this.a;
            if (owbVar != null) {
                owbVar.ak(view, 1);
            }
        }
    }

    public final void c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 2) {
            if (this.d) {
                g();
            } else {
                this.c = false;
                this.e = true;
            }
            this.f = true;
        }
    }

    public final void d(View view) {
        if (this.f || this.c || Memory.peekByte(FlagServices.b().c + 102) == 0) {
            if (!this.b && !this.d) {
                this.b = true;
                owb owbVar = this.a;
                if (owbVar != null) {
                    owbVar.ak(view, 0);
                }
            }
            this.e = true;
        }
    }

    public final void e(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 2) {
            if (this.d) {
                g();
                return;
            } else {
                this.c = false;
                this.e = true;
                return;
            }
        }
        if ((actionMasked == 1 || actionMasked == 3) && !this.c && this.b && !this.d) {
            this.d = true;
            owb owbVar = this.a;
            if (owbVar != null) {
                owbVar.ak(view, 1);
            }
        }
    }

    public final void f() {
        this.c = true;
    }
}
