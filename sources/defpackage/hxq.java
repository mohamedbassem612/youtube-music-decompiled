package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hxq extends RelativeLayout implements aupi {
    private aupc a;
    private boolean b;

    hxq(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.a;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.a = aupcVar2;
        return aupcVar2;
    }

    protected final void j() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((AudioVideoSwitcherToggleView) this).p = (vxz) ((gkj) generatedComponent()).a.km.io();
    }

    public hxq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    hxq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    hxq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        j();
    }
}
