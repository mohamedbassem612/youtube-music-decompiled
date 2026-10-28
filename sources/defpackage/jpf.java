package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jpf extends LinearLayout implements aupi {
    private aupc a;
    private boolean b;

    jpf(Context context) {
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
        PlayerBottomSheet playerBottomSheet = (PlayerBottomSheet) this;
        gkj gkjVar = (gkj) objGeneratedComponent;
        ght ghtVar = gkjVar.a;
        playerBottomSheet.h = (jnj) ghtVar.mp.io();
        ghj ghjVar = gkjVar.b;
        playerBottomSheet.g = (vxz) ghtVar.km.io();
        playerBottomSheet.i = (kjc) ghjVar.au.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public jpf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    jpf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    jpf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
