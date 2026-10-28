package defpackage;

import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kke implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kke(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        onu onuVar;
        boolean zB = true;
        switch (this.$cid) {
            case 0:
                boolean z = ((kkp) obj).a;
                WeakHashMap weakHashMap = kkf.b;
                return Boolean.valueOf(z);
            case 1:
                double d = 1.0d;
                for (kiz kizVar : (List) obj) {
                    zB &= kizVar.b();
                    d *= kizVar.f;
                }
                return kiz.a(zB, d);
            case 2:
                return ((asmv) obj).toByteString();
            case 3:
                return null;
            case 4:
                return odw.a;
            case 5:
                return Boolean.FALSE;
            case 6:
                return odw.c;
            case 7:
                return odw.e;
            case 8:
                return odw.d;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return aczl.t(5);
            case 13:
                return new okd((ohp) obj);
            case 14:
                return null;
            case 15:
                ohp ohpVar = (ohp) obj;
                ohpVar.getClass();
                return ohpVar;
            case 16:
                return ((Boolean) obj).booleanValue() ? oky.d : oky.e;
            case 17:
                return agev.h((oip) obj);
            case 18:
                onuVar = new onu(true, obj, null);
                break;
            case 19:
                onuVar = new onu(false, null, (Exception) obj);
                break;
            default:
                onuVar = new onu(true, obj, null);
                break;
        }
        return onuVar;
    }
}
