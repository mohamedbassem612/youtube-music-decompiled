package defpackage;

import android.text.Layout;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxs {
    public final boolean a;
    private final Layout b;
    private final Size c;
    private final boolean d;

    public oxs(Layout layout, Size size, boolean z, boolean z2) {
        this.b = layout;
        this.c = size;
        this.a = z;
        this.d = z2;
    }

    public static Layout a(oxs oxsVar, float f, float f2) {
        Layout layout;
        if (oxsVar == null) {
            return null;
        }
        Size size = oxsVar.c;
        if (size.getWidth() == f && size.getHeight() == f2) {
            return oxsVar.b;
        }
        if (f <= size.getWidth() || size.getHeight() != f2 || oxsVar.d || (layout = oxsVar.b) == null || layout.getLineCount() != 1 || layout.getEllipsisCount(0) > 0) {
            return null;
        }
        Layout.Alignment alignment = layout.getAlignment();
        int paragraphDirection = layout.getParagraphDirection(0);
        if ((alignment == Layout.Alignment.ALIGN_NORMAL && paragraphDirection == 1) || (alignment == Layout.Alignment.ALIGN_OPPOSITE && paragraphDirection == -1)) {
            return layout;
        }
        return null;
    }
}
