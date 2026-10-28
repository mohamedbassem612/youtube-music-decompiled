package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aakt implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aakt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 1;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                return (aanp) ((agke) obj).get(0);
            case 1:
                return Boolean.valueOf(((su) obj).a().isEmpty());
            case 2:
                return (aanp) ((agke) obj).get(0);
            case 3:
                Optional optional = (Optional) obj;
                return true == optional.isPresent() ? Optional.ofNullable(((aret) optional.get()).d()) : optional;
            case 4:
                return agke.n((List) obj);
            case 5:
                return (aoec) ((aihf) obj).build();
            case 6:
                return (agkj) Collection.EL.stream((List) obj).collect(aghu.a(new aakc(18), new aakc(19)));
            case 7:
                return (agkj) Collection.EL.stream((agkz) obj).map(new aakc(12)).collect(aghu.a(new aakc(15), new aakc(17)));
            case 8:
                return (agkj) Collection.EL.stream((agkz) obj).map(new aakc(20)).collect(aghu.a(new aalr(i), new aalr(i2)));
            case 9:
                return ((aami) obj).b;
            case 10:
                altv altvVar = (altv) obj;
                if (altvVar == null) {
                    return null;
                }
                HashMap map = new HashMap();
                for (aohc aohcVar : altvVar.c) {
                    aohb aohbVar = aohcVar.c;
                    if (aohbVar == null) {
                        aohbVar = aohb.a;
                    }
                    String str = aohbVar.c;
                    aohb aohbVar2 = aohcVar.c;
                    if (aohbVar2 == null) {
                        aohbVar2 = aohb.a;
                    }
                    map.put(str, aamo.b(aohbVar2));
                }
                return map;
            case 11:
                return ((aaup) obj).toString();
            case 12:
                return ((acip) obj).U();
            case 13:
                return ((acip) obj).M();
            case 14:
                return ((acip) obj).Z();
            case 15:
                return ((acip) obj).E();
            case 16:
                return ((acip) obj).D();
            case 17:
                return ((acip) obj).Z();
            case 18:
                return ((acip) obj).R();
            case 19:
                return ((acip) obj).W();
            default:
                return ((acip) obj).E();
        }
    }
}
