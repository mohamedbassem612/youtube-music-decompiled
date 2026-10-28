package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avny implements avnn {
    @Override // defpackage.avnn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(a.bR(length, "Array of size 6 expected but got "));
        }
        return new vni((agev) objArr[0], (Rect) objArr[1], ((Integer) objArr[2]).intValue(), (tuy) objArr[3], ((Boolean) objArr[4]).booleanValue(), ((Integer) objArr[5]).intValue());
    }
}
