package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aadz implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aadz(aaea aaeaVar, int i, long j, int i2) {
        this.$cid = i2;
        this.c = aaeaVar;
        this.a = i;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 0;
        if (this.$cid != 0) {
            atpn atpnVar = (atpn) obj;
            jrq jrqVar = (jrq) atpnVar.toBuilder();
            aiip aiipVar = atpnVar.f;
            Object obj2 = this.c;
            Long l = (Long) aiipVar.get(obj2);
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = (String) obj2;
            jrqVar.f(str, jLongValue + this.b);
            Integer num = (Integer) atpnVar.g.get(obj2);
            jrqVar.a(str, (num != null ? num.intValue() : 0) + 1);
            Integer num2 = (Integer) atpnVar.i.get(obj2);
            jrqVar.b(str, (num2 != null ? num2.intValue() : 0) + this.a);
            jrqVar.c(str, true);
            return (atpn) jrqVar.build();
        }
        Optional optional = (Optional) obj;
        boolean zIsPresent = optional.isPresent();
        Object obj3 = this.c;
        if (zIsPresent) {
            aohq aohqVar = (aohq) optional.get();
            ArrayList arrayList = new ArrayList();
            for (aqdp aqdpVar : aohqVar.getStreamsProgress()) {
                int i2 = this.a;
                if (aqdpVar.h == i2) {
                    long j = this.b;
                    if (j > aqdpVar.c) {
                        aihf builder = aqdpVar.toBuilder();
                        builder.copyOnWrite();
                        aqdp aqdpVar2 = (aqdp) builder.instance;
                        aqdpVar2.b |= 1;
                        aqdpVar2.c = j;
                        if (j >= aqdpVar.d) {
                            builder.copyOnWrite();
                            aqdp aqdpVar3 = (aqdp) builder.instance;
                            aqdpVar3.f = 2;
                            aqdpVar3.b |= 8;
                        }
                        arrayList.add((aqdp) builder.build());
                        i = 1;
                    }
                }
                arrayList.add(aqdpVar);
            }
            if (i != 0) {
                try {
                    wer werVarE = ((aaea) obj3).b.e();
                    aoho aohoVarD = aohqVar.d();
                    aohoVarD.an();
                    aohoVarD.am(arrayList);
                    werVarE.e(aohoVarD.ao());
                    werVarE.b().G();
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) aaea.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/EntitiesBasedStreamStore", "updateStreamProgressFunction", (char) 197, "EntitiesBasedStreamStore.java")).t("Issue with updateStream in entityStore");
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public /* synthetic */ aadz(String str, long j, int i, int i2) {
        this.$cid = i2;
        this.c = str;
        this.b = j;
        this.a = i;
    }
}
