package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hgu implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hgu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                if (((idd) obj).d()) {
                    return false;
                }
                break;
            case 1:
                return ((agev) obj).g();
            case 2:
                return ((aayt) obj).a.a(abnv.f);
            case 3:
                if (((aazn) obj).a != 2) {
                    return false;
                }
                break;
            case 4:
                agrf agrfVar = how.a;
                return a.K((List) obj);
            case 5:
                int i = hpd.b;
                return ((Boolean) obj).booleanValue();
            case 6:
                return ((Boolean) obj).booleanValue();
            case 7:
                if (((weo) obj).c != null) {
                    return false;
                }
                break;
            case 8:
                return ((aaxk) obj).a;
            case 9:
                if (((akxs) obj) == akxs.FEATURE_AVAILABILITY_UNKNOWN) {
                    return false;
                }
                break;
            case 10:
                return ((Optional) obj).isPresent();
            case 11:
                return ((hze) obj).a.equals(hzd.a);
            case 12:
                aayw aaywVar = (aayw) obj;
                if (!aaywVar.b.a(abnw.e) || aaywVar.d == null) {
                    return false;
                }
                break;
            case 13:
                return ((Optional) obj).isPresent();
            case 14:
                aayw aaywVar2 = (aayw) obj;
                wgi wgiVar = aaywVar2.d;
                if (!aaywVar2.b.a(abnw.e) || wgiVar == null || TextUtils.isEmpty(wgiVar.b)) {
                    return false;
                }
                break;
            case 15:
                return ((Boolean) obj).booleanValue();
            case 16:
                return ((Boolean) obj).booleanValue();
            case 17:
                return ((Boolean) obj).booleanValue();
            case 18:
                return ((aaxk) obj).a;
            case 19:
                return ((aazn) obj).c();
            default:
                if (((aayw) obj).d == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
