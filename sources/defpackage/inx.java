package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class inx extends RelativeLayout implements aupi {
    private aupc a;
    private boolean b;

    inx(Context context) {
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
        SearchToolbarView searchToolbarView = (SearchToolbarView) this;
        ght ghtVar = ((gkj) objGeneratedComponent).a;
        searchToolbarView.m = ghtVar.a.ct();
        searchToolbarView.a = (adxj) ghtVar.Ad.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    inx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public inx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    inx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
