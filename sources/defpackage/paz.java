package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class paz extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ pbc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paz(pbc pbcVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = pbcVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new paz(this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((paz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        awox awoxVar = awox.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            atqp.j(obj);
        } else {
            atqp.j(obj);
            pbc pbcVar = this.d;
            String str = pbcVar.h;
            pav pavVar = pbcVar.a;
            this.a = pavVar;
            this.b = str;
            this.c = 1;
            obj = pbcVar.l(this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            obj2 = str;
            obj3 = pavVar;
        }
        pbc pbcVar2 = this.d;
        ahyk ahykVar = (ahyk) obj;
        boolean z = pbcVar2.o;
        if (ahykVar != null) {
            awrm awrmVar = new awrm();
            awrmVar.a = ahykVar;
            int iNextInt = 0;
            if (z) {
                Integer num = (Integer) auus.b().b.get(0);
                Integer num2 = (Integer) auus.b().b.get(1);
                int iIntValue = num.intValue();
                Random random = ((pay) obj3).b;
                int iIntValue2 = num2.intValue();
                num.getClass();
                iNextInt = random.nextInt(iIntValue2 - num.intValue()) + iIntValue;
                aihf builder = ((ahyk) awrmVar.a).toBuilder();
                builder.getClass();
                ahyj ahyjVar = ((ahyk) builder.instance).c;
                if (ahyjVar == null) {
                    ahyjVar = ahyj.a;
                }
                ahyjVar.getClass();
                aihf builder2 = ahyjVar.toBuilder();
                builder2.getClass();
                ahyh ahyhVar = ((ahyj) builder2.instance).e;
                if (ahyhVar == null) {
                    ahyhVar = ahyh.a;
                }
                ahyhVar.getClass();
                axst axstVarAv = aewo.av(ahyhVar.toBuilder());
                axstVarAv.R(((ahyh) ((aihf) axstVarAv.a).instance).k + TimeUnit.MILLISECONDS.toMicros(iNextInt));
                aewo.W(axstVarAv.L(), builder2);
                aewo.T(aewo.V(builder2), builder);
                awrmVar.a = aewo.S(builder);
            }
            kih kihVarJ = (obj2 == null ? ((pay) obj3).c.K() : ((pay) obj3).c.J((String) obj2)).j((MessageLite) awrmVar.a, mea.a(((pay) obj3).a, new mdp(-548316723)));
            if (z) {
                long j = iNextInt;
                long jB = kihVarJ.b() + j;
                aihh aihhVar = kihVarJ.m;
                long j2 = ((aulj) aihhVar.instance).d + j;
                aihhVar.copyOnWrite();
                aulj auljVar = (aulj) aihhVar.instance;
                auljVar.b |= 1;
                auljVar.c = jB;
                aihhVar.copyOnWrite();
                aulj auljVar2 = (aulj) aihhVar.instance;
                auljVar2.b |= 2;
                auljVar2.d = j2;
                long j3 = auljVar2.c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long offset = ((long) TimeZone.getDefault().getOffset(j3)) / 1000;
                aihhVar.copyOnWrite();
                aulj auljVar3 = (aulj) aihhVar.instance;
                auljVar3.b |= 131072;
                auljVar3.g = offset;
            }
            Set set = pbcVar2.p;
            if (!set.isEmpty()) {
                kihVarJ.j(atqq.az(set));
            }
            kihVarJ.e();
        }
        return awmy.a;
    }
}
