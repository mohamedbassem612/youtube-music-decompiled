package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzk extends LinearLayout {
    public adzk(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }
}
