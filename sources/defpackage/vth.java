package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vth implements avnk {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vth(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnk
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        vvl vvlVar;
        int i = this.$cid;
        if (i == 0) {
            return new vti(((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
        if (i == 1) {
            vvlVar = new vvl(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (agev) obj4, (Rect) obj3);
        } else {
            if (i != 2) {
                return Boolean.valueOf(((Configuration) obj4).orientation == 2 && (((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()) && !((Boolean) obj3).booleanValue());
            }
            vvlVar = new vvl(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (agev) obj4, (Rect) obj3);
        }
        return vvlVar;
    }
}
