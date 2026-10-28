package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pvq extends awpk implements awqg {
    int a;
    final /* synthetic */ pvr b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvq(pvr pvrVar, long j, awoq awoqVar) {
        super(1, awoqVar);
        this.b = pvrVar;
        this.c = j;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pvq(this.b, this.c, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pvq) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG;
        aigj aigjVar;
        Set setAw;
        Set set;
        awox awoxVar = awox.a;
        int i = this.a;
        int i2 = 1;
        atqp.j(obj);
        if (i != 0) {
            if (i == 1) {
                objG = obj;
            }
            return awmy.a;
        }
        ptd ptdVarW = this.b.b.w();
        this.a = 1;
        objG = apb.g(((ptg) ptdVarW).a, true, false, new pte(), this);
        if (objG == awoxVar) {
            return awoxVar;
        }
        pvr pvrVar = this.b;
        long epochMilli = pvrVar.c.f().toEpochMilli() - this.c;
        ptd ptdVarW2 = pvrVar.b.w();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objG) {
            pth pthVar = (pth) obj2;
            pti ptiVar = pthVar.k;
            int iOrdinal = ptiVar.ordinal();
            if (iOrdinal == 0) {
                throw new UnsupportedOperationException("System tray threads are unsupported GnpChimeThreadStorage");
            }
            if (iOrdinal != i2) {
                throw new awmj();
            }
            int iOrdinal2 = ptiVar.ordinal();
            if (iOrdinal2 == 0) {
                throw new UnsupportedOperationException("System tray threads are unsupported GnpChimeThreadStorage");
            }
            if (iOrdinal2 != i2) {
                throw new awmj();
            }
            String str = pthVar.b;
            int i3 = pthVar.t;
            aidu aiduVar = pthVar.c;
            int i4 = pthVar.q;
            int i5 = pthVar.r;
            ptd ptdVar = ptdVarW2;
            long j = pthVar.d;
            long j2 = pthVar.e;
            long j3 = pthVar.f;
            String str2 = pthVar.g;
            aifv aifvVar = pthVar.h;
            long j4 = pthVar.i;
            int i6 = pthVar.s;
            aigj aigjVar2 = pthVar.j;
            aieh aiehVar = ((pwc) aihn.parseFrom(pwc.a, pthVar.l)).b;
            if (aiehVar == null) {
                aiehVar = aieh.a;
            }
            aieh aiehVar2 = aiehVar;
            aiehVar2.getClass();
            String str3 = pthVar.m;
            if (str3.length() == 0) {
                set = awnq.a;
                aigjVar = aigjVar2;
            } else {
                try {
                    List listF = awrc.F(str3, new String[]{","});
                    aigjVar = aigjVar2;
                    try {
                        ArrayList arrayList2 = new ArrayList(atqq.N(listF, 10));
                        Iterator it = listF.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
                        setAw = atqq.aw(arrayList2);
                    } catch (NumberFormatException e) {
                        e = e;
                        ((agsj) ((agsj) pvr.a.b()).j(e)).t("Failed to parse delimited string to experiment IDs.");
                        setAw = awnq.a;
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    aigjVar = aigjVar2;
                }
                set = setAw;
            }
            aies aiesVar = (aies) aihn.parseFrom(aies.a, pthVar.n);
            aiesVar.getClass();
            aijp aijpVar = new por(str, i3, aiduVar, i4, i5, j, j2, j3, str2, aifvVar, j4, i6, aigjVar, set, aiesVar, aiehVar2, pthVar.o, pthVar.p).a.b;
            if (aijpVar == null) {
                aijpVar = aijp.a;
            }
            aijpVar.getClass();
            if (aikz.a(aijpVar) < epochMilli) {
                arrayList.add(obj2);
            }
            ptdVarW2 = ptdVar;
            i2 = 1;
        }
        ptd ptdVar2 = ptdVarW2;
        this.a = 2;
        if (apb.g(((ptg) ptdVar2).a, false, true, new pge(ptdVar2, arrayList, 2, null), this) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }
}
