package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jnn extends FrameLayout implements aupi {
    private aupc a;
    private boolean b;

    jnn(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.a;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.a = aupcVar2;
        return aupcVar2;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        Object objGeneratedComponent = generatedComponent();
        MusicPlaybackControls musicPlaybackControls = (MusicPlaybackControls) this;
        gkj gkjVar = (gkj) objGeneratedComponent;
        ghj ghjVar = gkjVar.b;
        musicPlaybackControls.a = (cf) ghjVar.d.io();
        musicPlaybackControls.q = (jij) ghjVar.aX.io();
        ght ghtVar = gkjVar.a;
        musicPlaybackControls.b = (xgn) ghtVar.Ac.io();
        musicPlaybackControls.c = (abea) ghtVar.kt.io();
        musicPlaybackControls.u = (hfn) ghjVar.aY.io();
        musicPlaybackControls.d = (acdq) ghtVar.oh.io();
        musicPlaybackControls.e = aupm.b(gkjVar.c);
        musicPlaybackControls.r = (aerz) ghtVar.EW.io();
        musicPlaybackControls.l = (igk) ghtVar.EY.io();
        musicPlaybackControls.f = aupm.b(ghjVar.lp);
        musicPlaybackControls.m = (hbf) ghtVar.cz.io();
        musicPlaybackControls.g = (adxj) ghtVar.Ad.io();
        musicPlaybackControls.p = (jnj) ghtVar.mp.io();
        musicPlaybackControls.o = (vxz) ghtVar.km.io();
        musicPlaybackControls.t = (hhb) gkjVar.d.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public jnn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    jnn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    jnn(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
