package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipLoadingIndicator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ixj extends View implements aupi {
    private aupc a;
    private boolean b;

    ixj(Context context) {
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
        ght ghtVar = ((gkj) generatedComponent()).a;
        ((ChipCloudChipLoadingIndicator) this).a = (Executor) ghtVar.B.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public ixj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    ixj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    ixj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
