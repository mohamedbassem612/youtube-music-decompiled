package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jpg extends CoordinatorLayout implements aupi {
    private aupc j;
    private boolean k;

    jpg(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.j;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.j = aupcVar2;
        return aupcVar2;
    }

    protected final void o() {
        if (this.k) {
            return;
        }
        this.k = true;
        Object objGeneratedComponent = generatedComponent();
        WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this;
        gkj gkjVar = (gkj) objGeneratedComponent;
        ght ghtVar = gkjVar.a;
        watchWhileLayout.bW = (jnj) ghtVar.mp.io();
        watchWhileLayout.bU = (vxz) ghtVar.km.io();
        ghj ghjVar = gkjVar.b;
        watchWhileLayout.k = (awku) ghjVar.og.io();
        watchWhileLayout.l = aupm.b(ghjVar.hU);
        watchWhileLayout.bV = (vxz) ghtVar.dd.io();
        watchWhileLayout.bY = (vwt) ghjVar.D.io();
        watchWhileLayout.m = (avmb) ghtVar.dA.io();
        watchWhileLayout.n = aupm.b(ghjVar.lt);
        watchWhileLayout.o = aupm.b(ghjVar.lu);
        watchWhileLayout.bX = (kjc) ghjVar.au.io();
        watchWhileLayout.p = aupm.b(ghtVar.Ac);
        watchWhileLayout.q = aupm.b(ghjVar.mB);
    }

    public jpg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    jpg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}
