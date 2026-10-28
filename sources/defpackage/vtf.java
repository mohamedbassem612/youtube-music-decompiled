package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vtf implements avnk {
    @Override // defpackage.avnk
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Integer) obj).intValue();
        return Integer.valueOf((((Integer) obj3).intValue() - ((Integer) obj4).intValue()) - (iIntValue + ((Rect) obj2).height()));
    }
}
