package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pgk implements per {
    private final phe a;
    private final pav b;

    static {
        agsn.h("GnpSdk");
    }

    public pgk(phe pheVar, pav pavVar) {
        pheVar.getClass();
        pavVar.getClass();
        this.a = pheVar;
        this.b = pavVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.per
    public final Object a(plx plxVar, MessageLite messageLite, MessageLite messageLite2, awoq awoqVar) throws Throwable {
        pgj pgjVar;
        String str;
        if (awoqVar instanceof pgj) {
            pgjVar = (pgj) awoqVar;
            int i = pgjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgjVar.c = i - Integer.MIN_VALUE;
            } else {
                pgjVar = new pgj(this, awoqVar);
            }
        } else {
            pgjVar = new pgj(this, awoqVar);
        }
        Object obj = pgjVar.a;
        awox awoxVar = awox.a;
        int i2 = pgjVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            if (plxVar != null && (str = plxVar.b) != null) {
                nxp.a(str);
            }
            aiar aiarVar = (aiar) messageLite;
            if (aiarVar != null) {
                ArrayList arrayList = new ArrayList();
                for (aiaq aiaqVar : aiarVar.d) {
                    paw pawVarB = this.b.b(ahzv.SUCCEED_TO_UPDATE_THREAD_STATE);
                    pawVarB.f(plxVar);
                    aiie aiieVar = aiaqVar.c;
                    aiieVar.getClass();
                    pawVarB.j(aiieVar);
                    pawVarB.a();
                    aiff aiffVar = aiaqVar.d;
                    if (aiffVar == null) {
                        aiffVar = aiff.a;
                    }
                    int iAS = a.aS(aiffVar.f);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    if (iAS == 3) {
                        aiie aiieVar2 = aiaqVar.c;
                        aiieVar2.getClass();
                        arrayList.addAll(aiieVar2);
                    }
                }
                if (!arrayList.isEmpty() && plxVar != null) {
                    phe pheVar = this.a;
                    pgjVar.c = 1;
                    if (pheVar.c(plxVar, arrayList, null, pgjVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    @Override // defpackage.per
    public final Object b(plx plxVar, MessageLite messageLite, awoq awoqVar) {
        aiie<aiaq> aiieVar;
        String str;
        if (plxVar != null && (str = plxVar.b) != null) {
            nxp.a(str);
        }
        aiar aiarVar = (aiar) messageLite;
        if (aiarVar != null && (aiieVar = aiarVar.d) != null) {
            for (aiaq aiaqVar : aiieVar) {
                paw pawVarA = this.b.a(ahyy.FAILED_TO_UPDATE_THREAD_STATE);
                pawVarA.f(plxVar);
                aiie aiieVar2 = aiaqVar.c;
                aiieVar2.getClass();
                pawVarA.j(aiieVar2);
                pawVarA.a();
            }
        }
        return awmy.a;
    }
}
