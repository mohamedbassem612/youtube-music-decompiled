package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aeyr extends ImageButton {
    public int d;

    public aeyr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }

    public final void g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        g(i, true);
    }

    public aeyr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aeyr(Context context) {
        this(context, null);
    }
}
