package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ixk extends FrameLayout implements aupi {
    private aupc a;
    private boolean b;

    ixk(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.a;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.a = aupcVar2;
        return aupcVar2;
    }

    protected final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        Object objGeneratedComponent = generatedComponent();
        ChipCloudChipView chipCloudChipView = (ChipCloudChipView) this;
        ght ghtVar = ((gkj) objGeneratedComponent).a;
        chipCloudChipView.a = (izf) ghtVar.cD.io();
        chipCloudChipView.b = new izg();
        chipCloudChipView.f = (vxz) ghtVar.cu.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public ixk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    ixk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    ixk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
