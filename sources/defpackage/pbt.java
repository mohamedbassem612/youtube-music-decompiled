package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbt implements awqg {
    final /* synthetic */ long a;
    final /* synthetic */ awri b;
    final /* synthetic */ Map c;
    final /* synthetic */ long d;

    public pbt(long j, awri awriVar, Map map, long j2) {
        this.a = j;
        this.b = awriVar;
        this.c = map;
        this.d = j2;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        pbu pbuVar = (pbu) obj;
        pbuVar.getClass();
        aihf builder = pbuVar.toBuilder();
        builder.getClass();
        pbv pbvVar = pbuVar.c;
        if (pbvVar == null) {
            pbvVar = pbv.a;
        }
        awri awriVar = this.b;
        long j = this.a;
        if (pbvVar.b < j) {
            long j2 = this.d;
            awriVar.a = true;
            aihf aihfVarCreateBuilder = pbv.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            nvm.b(j2, aihfVarCreateBuilder);
            nvm.c(j, aihfVarCreateBuilder);
            pbv pbvVarA = nvm.a(aihfVarCreateBuilder);
            builder.copyOnWrite();
            pbu pbuVar2 = (pbu) builder.instance;
            pbuVar2.c = pbvVarA;
            pbuVar2.b |= 1;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            pbv pbvVar2 = (pbv) DesugarCollections.unmodifiableMap(pbuVar.d).get(str);
            if (pbvVar2 == null) {
                pbvVar2 = pbv.a;
                pbvVar2.getClass();
            }
            if (pbvVar2.b < j) {
                awriVar.a = true;
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pbu) builder.instance).d)).getClass();
                aihf aihfVarCreateBuilder2 = pbv.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                nvm.b(jLongValue, aihfVarCreateBuilder2);
                nvm.c(j, aihfVarCreateBuilder2);
                pbv pbvVarA2 = nvm.a(aihfVarCreateBuilder2);
                str.getClass();
                builder.copyOnWrite();
                pbu pbuVar3 = (pbu) builder.instance;
                aiip aiipVar = pbuVar3.d;
                if (!aiipVar.b) {
                    pbuVar3.d = aiipVar.a();
                }
                pbuVar3.d.put(str, pbvVarA2);
            }
        }
        return nvl.a(builder);
    }
}
