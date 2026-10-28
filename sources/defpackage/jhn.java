package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jhn extends LinearLayout implements aupi {
    private aupc a;
    private boolean b;

    public jhn(Context context) {
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
        TabbedView tabbedView = (TabbedView) this;
        gkj gkjVar = (gkj) objGeneratedComponent;
        ght ghtVar = gkjVar.b.a;
        Context context = (Context) ghtVar.v.io();
        tabbedView.a = ((vxz) ghtVar.ga.io()).l(10, 45668753L, false) ? new jib(context) : new jhy(context);
        ght ghtVar2 = gkjVar.a;
        tabbedView.i = (vxz) ghtVar2.cu.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public jhn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public jhn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    jhn(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
