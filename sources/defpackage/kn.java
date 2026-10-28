package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kn extends PopupWindow {
    public kn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        ahto ahtoVarL = ahto.L(context, attributeSet, he.s, i, 0);
        if (ahtoVarL.H(2)) {
            setOverlapAnchor(ahtoVarL.G(2, false));
        }
        setBackgroundDrawable(ahtoVarL.B(0));
        ahtoVarL.F();
    }
}
