package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gh extends ie {
    public boolean a;
    public boolean b;
    final /* synthetic */ gp c;
    public hhb d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(gp gpVar, Window.Callback callback) {
        super(callback);
        this.c = gpVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.a) {
            return this.e.dispatchKeyEvent(keyEvent);
        }
        return this.c.Q(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        gp gpVar = this.c;
        int keyCode = keyEvent.getKeyCode();
        fl flVarD = gpVar.d();
        if (flVarD != null && flVarD.t(keyCode, keyEvent)) {
            return true;
        }
        gn gnVar = gpVar.A;
        if (gnVar != null && gpVar.Z(gnVar, keyEvent.getKeyCode(), keyEvent)) {
            gn gnVar2 = gpVar.A;
            if (gnVar2 == null) {
                return true;
            }
            gnVar2.l = true;
            return true;
        }
        if (gpVar.A == null) {
            gn gnVarY = gpVar.Y(0);
            gpVar.T(gnVarY, keyEvent);
            boolean Z = gpVar.Z(gnVarY, keyEvent.getKeyCode(), keyEvent);
            gnVarY.k = false;
            if (Z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof iq)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        hhb hhbVar = this.d;
        if (hhbVar != null) {
            if (i == 0) {
                view = new View(((gx) hhbVar.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        fl flVarD;
        super.onMenuOpened(i, menu);
        if (i == 108 && (flVarD = this.c.d()) != null) {
            flVarD.d(true);
        }
        return true;
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        gp gpVar = this.c;
        if (i == 108) {
            fl flVarD = gpVar.d();
            if (flVarD != null) {
                flVarD.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            gn gnVarY = gpVar.Y(0);
            if (gnVarY.m) {
                gpVar.L(gnVarY, false);
            }
        }
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        iq iqVar = menu instanceof iq ? (iq) menu : null;
        if (i == 0) {
            if (iqVar == null) {
                return false;
            }
            i = 0;
        }
        if (iqVar != null) {
            iqVar.j = true;
        }
        hhb hhbVar = this.d;
        if (hhbVar != null && i == 0) {
            gx gxVar = (gx) hhbVar.a;
            if (!gxVar.b) {
                gxVar.c.h();
                gxVar.b = true;
            }
            i = 0;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (iqVar != null) {
            iqVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        iq iqVar = this.c.Y(0).h;
        if (iqVar != null) {
            super.onProvideKeyboardShortcuts(list, iqVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        gp gpVar = this.c;
        if (!gpVar.t || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        hx hxVar = new hx(gpVar.j, callback);
        hv hvVarF = gpVar.f(hxVar);
        if (hvVarF != null) {
            return hxVar.e(hvVarF);
        }
        return null;
    }

    @Override // defpackage.ie, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
