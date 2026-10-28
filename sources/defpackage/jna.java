package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jna implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jna(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                if (((aayw) obj).b == abnw.e) {
                    return true;
                }
                break;
            case 1:
                agrf agrfVar = ihr.a;
                if (!((aaxk) obj).a) {
                    return true;
                }
                break;
            case 2:
                if (((aayw) obj).d != null) {
                    return true;
                }
                break;
            case 3:
                if (((aboe) obj).j == 12) {
                    return true;
                }
                break;
            case 4:
                return aawb.B(((aboe) obj).j);
            case 5:
                if (((aayw) obj).b == abnw.e) {
                    return true;
                }
                break;
            case 6:
                return ((Optional) obj).isPresent();
            case 7:
                if (!((idd) obj).d()) {
                    return true;
                }
                break;
            case 8:
                agsn agsnVar = joz.a;
                if (!((idd) obj).d()) {
                    return true;
                }
                break;
            case 9:
                abob abobVar = ((aazj) obj).a;
                agsn agsnVar2 = joz.a;
                if (abobVar == abob.a) {
                    return true;
                }
                break;
            case 10:
                return ((aaza) obj).g;
            case 11:
                int i = trd.x;
                if (((((int) (((Long) obj).longValue() & 4294967295L)) >> 12) & 7) != 0) {
                    return true;
                }
                break;
            case 12:
                return ((agev) obj).g();
            case 13:
                return ((vni) obj).a.g();
            case 14:
                return ((agev) obj).g();
            case 15:
                return ((vut) obj).c;
            case 16:
                if (!((agev) obj).g()) {
                    return true;
                }
                break;
            case 17:
                return ((agev) obj).g();
            case 18:
                return ((agev) obj).g();
            case 19:
                return ((agev) obj).g();
            default:
                return ((agev) obj).g();
        }
        return false;
    }
}
