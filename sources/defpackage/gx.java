package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gx extends fl {
    public final Window.Callback a;
    boolean b;
    public final ph c;
    final hhb d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new bq(this, 14, null);
    private final pd i;

    public gx(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        gv gvVar = new gv(this);
        this.i = gvVar;
        ph phVar = new ph(toolbar, false);
        this.c = phVar;
        callback.getClass();
        this.a = callback;
        phVar.d = callback;
        toolbar.w = gvVar;
        phVar.m(charSequence);
        this.d = new hhb(this);
    }

    public final Menu A() {
        if (!this.e) {
            ph phVar = this.c;
            gw gwVar = new gw(this);
            kb kbVar = new kb(this, 1);
            Toolbar toolbar = phVar.a;
            toolbar.z = gwVar;
            toolbar.A = kbVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(gwVar, kbVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void B(int i, int i2) {
        ph phVar = this.c;
        phVar.d((i & i2) | (phVar.b & (~i2)));
    }

    @Override // defpackage.fl
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.fl
    public final Context b() {
        return this.c.a();
    }

    @Override // defpackage.fl
    public final void d(boolean z) {
        if (z != this.f) {
            this.f = z;
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fk) arrayList.get(i)).a();
            }
        }
    }

    @Override // defpackage.fl
    public final void e() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.fl
    public final void f(Drawable drawable) {
        this.c.a.setBackground(drawable);
    }

    @Override // defpackage.fl
    public final void h(boolean z) {
        B(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.fl
    public final void i(boolean z) {
        B(true != z ? 0 : 2, 2);
    }

    @Override // defpackage.fl
    public final void j(boolean z) {
        B(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.fl
    public final void k(Drawable drawable) {
        this.c.j(drawable);
    }

    @Override // defpackage.fl
    public final void l(int i) {
        this.c.e(i);
    }

    @Override // defpackage.fl
    public final void n(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.fl
    public final void o(CharSequence charSequence) {
        this.c.m(charSequence);
    }

    @Override // defpackage.fl
    public final void p() {
        this.c.l(0);
    }

    @Override // defpackage.fl
    public final boolean q() {
        return this.c.o();
    }

    @Override // defpackage.fl
    public final boolean r() {
        ph phVar = this.c;
        if (!phVar.n()) {
            return false;
        }
        phVar.b();
        return true;
    }

    @Override // defpackage.fl
    public final boolean s() {
        Toolbar toolbar = this.c.a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int i = bac.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.fl
    public final boolean t(int i, KeyEvent keyEvent) {
        Menu menuA = A();
        if (menuA == null) {
            return false;
        }
        menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuA.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.fl
    public final boolean u(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            v();
        }
        return true;
    }

    @Override // defpackage.fl
    public final boolean v() {
        return this.c.q();
    }

    @Override // defpackage.fl
    public final void x() {
        B(0, 1);
    }

    @Override // defpackage.fl
    public final void y() {
        this.c.i(R.string.navigate_back);
    }

    @Override // defpackage.fl
    public final void z() {
        this.c.g(null);
    }

    @Override // defpackage.fl
    public final void w() {
    }

    @Override // defpackage.fl
    public final void g(boolean z) {
    }

    @Override // defpackage.fl
    public final void m(boolean z) {
    }
}
