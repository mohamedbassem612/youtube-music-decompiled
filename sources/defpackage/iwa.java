package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.ui.appchrome.insets.InsetAdjustingToolbar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class iwa extends Toolbar implements aupi {
    private aupc C;
    private boolean D;

    iwa(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        F();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.C;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.C = aupcVar2;
        return aupcVar2;
    }

    protected final void F() {
        if (this.D) {
            return;
        }
        this.D = true;
        ((InsetAdjustingToolbar) this).D = (avlh) ((gkj) generatedComponent()).b.oN.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public iwa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        F();
    }

    iwa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        F();
    }
}
