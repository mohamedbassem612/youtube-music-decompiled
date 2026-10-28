package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.player.MusicPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hvx extends acdk implements aupi {
    private aupc a;
    private boolean b;

    hvx(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
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

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        Object objGeneratedComponent = generatedComponent();
        MusicPlayerView musicPlayerView = (MusicPlayerView) this;
        gkj gkjVar = (gkj) objGeneratedComponent;
        ght ghtVar = gkjVar.a;
        musicPlayerView.g = (isi) ghtVar.a.fN.io();
        musicPlayerView.a = aupm.b(gkjVar.b.aw);
        musicPlayerView.b = aupm.b(ghtVar.km);
        musicPlayerView.c = (avmb) ghtVar.dA.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public hvx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
