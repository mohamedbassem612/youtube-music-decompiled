package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class uio extends FrameLayout implements aupi {
    private afqc a;
    private boolean b;

    public uio(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afqc componentManager() {
        afqc afqcVar = this.a;
        if (afqcVar != null) {
            return afqcVar;
        }
        afqc afqcVar2 = new afqc(this);
        this.a = afqcVar2;
        return afqcVar2;
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        uin uinVar = (uin) generatedComponent();
        uinVar.c();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public uio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public uio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    uio(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
