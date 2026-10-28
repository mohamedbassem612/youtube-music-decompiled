package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hxe implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hxe(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        abnl abnlVarN;
        wgi wgiVar;
        switch (this.$cid) {
            case 0:
                if (((akxs) obj) == akxs.FEATURE_AVAILABILITY_UNKNOWN) {
                    return false;
                }
                break;
            case 1:
                return hqg.b.contains(((ayq) obj).a);
            case 2:
                return ((aayw) obj).b.b(abnw.d);
            case 3:
                return ((aayw) obj).b.b(abnw.e);
            case 4:
                acip acipVar = ((aazq) obj).b;
                if (acipVar == null || (abnlVarN = acipVar.n()) == null || TextUtils.isEmpty(abnlVarN.w())) {
                    return false;
                }
                break;
            case 5:
                return ((Boolean) obj).booleanValue();
            case 6:
                agrf agrfVar = idr.a;
                if (((aayw) obj).b != abnw.b) {
                    return false;
                }
                break;
            case 7:
                agrf agrfVar2 = idr.a;
                if (((aayw) obj).b != abnw.e) {
                    return false;
                }
                break;
            case 8:
                return ((Optional) obj).isPresent();
            case 9:
                agrf agrfVar3 = idr.a;
                return ((Boolean) obj).booleanValue();
            case 10:
                aayw aaywVar = (aayw) obj;
                if (aaywVar.b != abnw.e || (wgiVar = aaywVar.d) == null || fhz.ab(wgiVar.a) != null) {
                    return false;
                }
                break;
            case 11:
                if (((aayw) obj).d == null) {
                    return false;
                }
                break;
            case 12:
                if (((icw) obj).a() != 1) {
                    return false;
                }
                break;
            case 13:
                return ((idd) obj).g();
            case 14:
                int i = ime.i;
                return ((Boolean) obj).booleanValue();
            case 15:
                return a.K((List) obj);
            case 16:
                return a.K((List) obj);
            case 17:
                return a.K((List) obj);
            case 18:
                gnk gnkVar = (gnk) obj;
                if (gnkVar != gnk.b && gnkVar != gnk.c) {
                    return false;
                }
                break;
            case 19:
                return ((Boolean) obj).booleanValue();
            default:
                if (((gnk) obj) != gnk.a) {
                    return false;
                }
                break;
        }
        return true;
    }
}
