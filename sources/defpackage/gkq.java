package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gkq implements avno {
    private final /* synthetic */ int $cid;

    public /* synthetic */ gkq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                long j = gkt.a;
                return "FEmusic_home".equals(((gmu) obj).a);
            case 1:
                agrf agrfVar = get.a;
                return "FEmusic_home".equals(((gmu) obj).a);
            case 2:
                return ((Boolean) obj).booleanValue();
            case 3:
                return ((Optional) obj).isPresent();
            case 4:
                return a.w((weo) obj);
            case 5:
                if (!((idd) obj).d()) {
                    return true;
                }
                break;
            case 6:
                if (((aazn) obj).a == 2) {
                    return true;
                }
                break;
            case 7:
                return ((agev) obj).g();
            case 8:
                Duration duration = hia.a;
                return ((Boolean) obj).booleanValue();
            case 9:
                Duration duration2 = hia.a;
                return a.w((weo) obj);
            case 10:
                return ((Optional) obj).isPresent();
            case 11:
                weh wehVar = (weh) obj;
                Duration duration3 = hia.a;
                if (wehVar instanceof anjq) {
                    if (!((anjq) wehVar).c.d.isEmpty()) {
                        return true;
                    }
                } else if ((wehVar instanceof anuc) && !((anuc) wehVar).c.d.isEmpty()) {
                    return true;
                }
            case 12:
                aanv aanvVar = (aanv) obj;
                if (aanvVar.a() || aanvVar.b == aanu.c) {
                    return true;
                }
                break;
            case 13:
                if (((aanv) obj).b == aanu.c) {
                    return true;
                }
                break;
            case 14:
                return a.K((List) obj);
            case 15:
                return a.K((List) obj);
            case 16:
                return a.K((List) obj);
            case 17:
                return ((Optional) obj).isEmpty();
            case 18:
                return ((Optional) obj).isPresent();
            case 19:
                return Objects.nonNull(obj);
            default:
                if (((weo) obj).c == null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
