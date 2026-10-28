package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.ui.image.AutoCropImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class izk extends AppCompatImageView implements aupi {
    private aupc a;
    private boolean b;

    public izk(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.a;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.a = aupcVar2;
        return aupcVar2;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((AutoCropImageView) this).a = aupm.b(((gkj) generatedComponent()).a.km);
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public izk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public izk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
