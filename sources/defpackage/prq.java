package defpackage;

import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class prq implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ prq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                agsn agsnVar = pse.a;
                ((Map) obj).getClass();
                return awmy.a;
            case 1:
                break;
            case 2:
                int i = psm.b;
                ((Map) obj).getClass();
                break;
            case 3:
                ((bdu) obj).getClass();
                aihf aihfVarCreateBuilder = pym.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                return qnl.H(aihfVarCreateBuilder);
            case 4:
                return nxp.a(obj);
            case 5:
                aiqj aiqjVar = (aiqj) obj;
                aiqjVar.getClass();
                akxt akxtVar = aiqjVar.b;
                return akxtVar == null ? akxt.a : akxtVar;
            case 6:
                return awmy.a;
            case 7:
                twu.c(6, "Failed to update from config", (Throwable) obj);
                return awmy.a;
            case 8:
                ((akxt) obj).getClass();
                return awmy.a;
            case 9:
                Optional optional = (Optional) obj;
                optional.getClass();
                return (affd) awrc.f(optional);
            case 10:
                return rov.a;
            case 11:
                ((tew) obj).getClass();
                return new CopyOnWriteArrayList();
            case 12:
                ((tew) obj).getClass();
                return new CopyOnWriteArrayList();
            case 13:
                ((tew) obj).getClass();
                return new CopyOnWriteArrayList();
            case 14:
                agrf agrfVar = tsl.a;
                ((mgr) obj).c();
                return awmy.a;
            case 15:
                agrf agrfVar2 = tsl.a;
                return awmy.a;
            case 16:
                agrf agrfVar3 = tsl.a;
                return awmy.a;
            case 17:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(!list.isEmpty());
            case 18:
                List list2 = (List) obj;
                list2.getClass();
                return Optional.ofNullable(atqq.Z(list2));
            case 19:
                ((yno) obj).getClass();
                return awmy.a;
            default:
                ((yno) obj).getClass();
                return awmy.a;
        }
        return awmy.a;
    }
}
