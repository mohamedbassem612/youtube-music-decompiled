package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.offline.views.OfflineBadgeView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class hvi extends AppCompatImageView implements aupi {
    private aupc a;
    private boolean b;

    public hvi(Context context) {
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
        ((OfflineBadgeView) this).a = (adxj) ((gkj) generatedComponent()).a.Ad.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public hvi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public hvi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
