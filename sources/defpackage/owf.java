package defpackage;

import android.graphics.Paint;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class owf extends ouu {
    public owf(NodeTreeProcessor nodeTreeProcessor, owe oweVar) {
        super(nodeTreeProcessor, oweVar);
    }

    @Override // defpackage.oyn, android.view.View
    public final void setBackgroundColor(int i) {
        owe oweVar = (owe) ((ouu) this).a;
        Paint paint = oweVar.c;
        int color = paint.getColor();
        if (i == 0) {
            i = -13415322;
        }
        if (color != i) {
            paint.setColor(i);
            oweVar.s();
        }
    }
}
