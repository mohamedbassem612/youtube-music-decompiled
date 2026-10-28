package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class upt extends FrameLayout implements aupi {
    private afqc a;
    private boolean b;

    public upt(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final afqc componentManager() {
        afqc afqcVar = this.a;
        if (afqcVar != null) {
            return afqcVar;
        }
        afqc afqcVar2 = new afqc(this);
        this.a = afqcVar2;
        return afqcVar2;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        upr uprVar = (upr) generatedComponent();
        uprVar.d();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public upt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public upt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    upt(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
