package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pc extends fj {
    public int b;

    public pc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public pc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public pc(fj fjVar) {
        super(fjVar);
        this.b = 0;
    }

    public pc(pc pcVar) {
        super((fj) pcVar);
        this.b = 0;
        this.b = pcVar.b;
    }

    public pc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public pc(int i, int i2) {
        super(i, i2);
        this.b = 0;
        this.a = 8388627;
    }
}
