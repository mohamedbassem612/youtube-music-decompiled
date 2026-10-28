package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yqz implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yqz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                if (((Integer) obj).intValue() == 2) {
                    return false;
                }
                break;
            case 1:
                if (((yee) obj) == yee.a) {
                    return false;
                }
                break;
            case 2:
                return ((Boolean) obj).booleanValue();
            case 3:
                if (((Integer) obj).intValue() == 2) {
                    return false;
                }
                break;
            case 4:
                if (TextUtils.isEmpty((String) obj)) {
                    return false;
                }
                break;
            case 5:
                return a.K((List) obj);
            case 6:
                wgi wgiVar = (wgi) obj;
                if (TextUtils.isEmpty(wgiVar.b) && wgiVar.d == null) {
                    return false;
                }
                break;
            case 7:
                return ((Optional) obj).isPresent();
            case 8:
                return ((aayt) obj).a.a(abnv.g);
            case 9:
                abob abobVar = ((aazj) obj).a;
                if (!abobVar.equals(abob.c) && !abobVar.d() && !abobVar.h()) {
                    return false;
                }
                break;
            case 10:
                return ((Optional) obj).isPresent();
            case 11:
                return abpj.t((aazj) obj);
            case 12:
                return ((aayt) obj).a.equals(abnv.f);
            case 13:
                return ((Boolean) obj).booleanValue();
            case 14:
                return ((agev) obj).g();
            case 15:
                return ((acvm) obj) instanceof acvl;
            case 16:
                return ((acvm) obj) instanceof acvh;
            case 17:
                return ((Boolean) obj).booleanValue();
            case 18:
                String str = acoi.g;
                return ((Boolean) obj).booleanValue();
            case 19:
                return ((agev) obj).g();
            default:
                return ((Boolean) obj).booleanValue();
        }
        return true;
    }
}
