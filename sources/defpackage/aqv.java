package defpackage;

import android.util.Pair;
import android.view.View;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqv implements Comparator {
    public static final aqv a = new aqv(2);
    private final /* synthetic */ int $cid;

    public aqv(int i) {
        this.$cid = i;
    }

    public static final int a(zed zedVar, zed zedVar2) {
        int iB;
        int iB2;
        if (zedVar2.b() == zedVar.b()) {
            iB = zedVar2.a();
            iB2 = zedVar.a();
        } else {
            iB = zedVar2.b();
            iB2 = zedVar.b();
        }
        return iB - iB2;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int iA;
        int iA2;
        switch (this.$cid) {
            case 0:
                iA = ((aqy) obj).c;
                iA2 = ((aqy) obj2).c;
                break;
            case 1:
                iA = ((aamu) obj).a;
                iA2 = ((aamu) obj2).a;
                break;
            case 2:
                return ((dii) obj).e.compareToIgnoreCase(((dii) obj2).e);
            case 3:
                iA = ((djv) obj2).a();
                iA2 = ((djv) obj).a();
                break;
            case 4:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 5:
                iA = ((byte[]) obj).length;
                iA2 = ((byte[]) obj2).length;
                break;
            case 6:
                xdm xdmVar = (xdm) obj;
                xdm xdmVar2 = (xdm) obj2;
                int i = xdmVar.d;
                int i2 = xdmVar2.d;
                return i != i2 ? Integer.compare(i2, i) : Long.compare(xdmVar.c, xdmVar2.c);
            case 7:
                return a((zed) obj, (zed) obj2);
            case 8:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return ((Integer) pair2.first).intValue() == ((Integer) pair.first).intValue() ? ((Long) pair.second).compareTo((Long) pair2.second) : ((Integer) pair2.first).compareTo((Integer) pair.first);
            case 9:
                iA = ((View) obj).getTop();
                iA2 = ((View) obj2).getTop();
                break;
            default:
                return -Integer.compare(((axkg) obj).b, ((axkg) obj2).b);
        }
        return iA - iA2;
    }
}
