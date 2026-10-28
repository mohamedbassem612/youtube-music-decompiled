package defpackage;

import android.text.Layout;
import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nuz {
    public static /* synthetic */ boolean a(Layout layout, Spanned spanned) {
        int length = spanned.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return ((oyb[]) spanned.getSpans(i, i, oyb.class)).length > 0 || (layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() + (-1)) > 0);
    }
}
