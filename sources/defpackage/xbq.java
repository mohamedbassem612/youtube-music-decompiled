package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbq extends WindowInsetsAnimation$Callback {
    boolean a;
    boolean b;
    final /* synthetic */ View c;
    final /* synthetic */ xbs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbq(xbs xbsVar, View view) {
        super(0);
        this.c = view;
        this.d = xbsVar;
        this.a = false;
        this.b = false;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            xbs xbsVar = this.d;
            xcb xcbVar = xbsVar.a;
            if (xcbVar != null && xbsVar.e) {
                xcbVar.B = true;
            }
            if (this.a) {
                this.a = false;
                if (xbsVar.g) {
                    return;
                }
                xbsVar.w();
            }
        }
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            xbs xbsVar = this.d;
            xcb xcbVar = xbsVar.a;
            if (xcbVar != null && xbsVar.e) {
                xcbVar.B = false;
            }
            WindowInsets rootWindowInsets = this.c.getRootWindowInsets();
            if (rootWindowInsets != null) {
                this.b = rootWindowInsets.isVisible(8);
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        WindowInsets rootWindowInsets;
        xcb xcbVar;
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0 && (rootWindowInsets = this.c.getRootWindowInsets()) != null) {
            boolean z = true;
            this.a = this.b && rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom == 0;
            xbs xbsVar = this.d;
            if (xbsVar.e && !xbsVar.i.l(314, 45763779L, false)) {
                z = false;
            }
            if (this.a && z && xbsVar.b != null && (xcbVar = xbsVar.a) != null && !xbsVar.g) {
                xcbVar.m().setVisibility(4);
                Dialog dialog = xbsVar.b;
                if (dialog != null) {
                    xbsVar.onDismiss(dialog);
                }
            }
        }
        return bounds;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        return windowInsets;
    }
}
