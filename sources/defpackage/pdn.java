package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pdn {
    private final pdr a;
    private final pgi b;
    private final pcb c;
    private final aunn d;

    static {
        agsn.h("GnpSdk");
    }

    public pdn(pdr pdrVar, pgi pgiVar, pcb pcbVar, aunn aunnVar) {
        pdrVar.getClass();
        pgiVar.getClass();
        pcbVar.getClass();
        aunnVar.getClass();
        this.a = pdrVar;
        this.b = pgiVar;
        this.c = pcbVar;
        this.d = aunnVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[LOOP:2: B:29:0x00b0->B:31:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[LOOP:1: B:46:0x0123->B:48:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0146  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:56:0x0155  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(pbf pbfVar, awoq awoqVar) {
        pdm pdmVar;
        pcb pcbVar;
        ArrayList arrayList;
        Iterator it;
        aiff aiffVar;
        int i;
        plx plxVar;
        pbh pbhVar;
        pbf pbfVar2;
        aiff aiffVarB;
        aiff aiffVar2;
        Iterator it2;
        int i2;
        pbf pbfVar3;
        pgi pgiVar;
        String str;
        String str2;
        pbh pbhVar2;
        ArrayList arrayList2;
        Iterator it3;
        String strF;
        if (awoqVar instanceof pdm) {
            pdmVar = (pdm) awoqVar;
            int i3 = pdmVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdmVar.d = i3 - Integer.MIN_VALUE;
            } else {
                pdmVar = new pdm(this, awoqVar);
            }
        } else {
            pdmVar = new pdm(this, awoqVar);
        }
        pdm pdmVar2 = pdmVar;
        Object obj = pdmVar2.b;
        awox awoxVar = awox.a;
        int i4 = pdmVar2.d;
        if (i4 == 0) {
            atqp.j(obj);
            if (!pbfVar.e.isEmpty()) {
                if (pbfVar.l == 1) {
                    aunn aunnVar = this.d;
                    Map map = (Map) aunnVar.io();
                    int i5 = pbfVar.a;
                    if (map.containsKey(new Integer(i5))) {
                        Object objIo = aunnVar.io();
                        objIo.getClass();
                        phc phcVar = (phc) atqq.x((Map) objIo, new Integer(i5));
                        pdmVar2.e = pbfVar;
                        pdmVar2.d = 1;
                        if (phcVar.a(pbfVar, pdmVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                pcbVar = this.c;
                List list = pbfVar.e;
                list.getClass();
                arrayList = new ArrayList(atqq.N(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((poq) it.next()).e());
                }
                aiffVar = pbfVar.f;
                aiffVar.getClass();
                i = pbfVar.l;
                if (i != 0) {
                    throw null;
                }
                plxVar = pbfVar.c;
                pbhVar = pbfVar.k;
                pbhVar.getClass();
                pdmVar2.e = pbfVar;
                pdmVar2.a = plxVar;
                pdmVar2.d = 2;
                if (pcbVar.b(plxVar, arrayList, aiffVar, i, pbhVar, pdmVar2) != awoxVar) {
                    return awoxVar;
                }
                pbfVar2 = pbfVar;
                aihf aihfVarCreateBuilder = aiff.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aiffVarB = aext.B(aihfVarCreateBuilder);
                aiffVar2 = pbfVar2.f;
                if (!awrc.c(aiffVar2, aiffVarB)) {
                    if (plxVar != null) {
                        i2 = pbfVar2.l;
                        pbfVar3 = pbfVar2;
                        pgiVar = this.b;
                        aiffVar2.getClass();
                        str = pbfVar3.b;
                        if (str == null) {
                            str = "";
                        }
                        str2 = str;
                        if (i2 == 0) {
                            throw null;
                        }
                        pbhVar2 = pbfVar3.k;
                        pbhVar2.getClass();
                        List list2 = pbfVar3.e;
                        list2.getClass();
                        arrayList2 = new ArrayList(atqq.N(list2, 10));
                        it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((poq) it3.next()).c());
                        }
                        pdmVar2.e = null;
                        pdmVar2.a = null;
                        pdmVar2.d = 3;
                        if (pgiVar.c(plxVar, aiffVar2, str2, i2, pbhVar2, arrayList2, 0, 0, pdmVar2) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        it2 = pbfVar2.e.iterator();
                        while (it2.hasNext()) {
                            strF = ((poq) it2.next()).f();
                            if (strF == null) {
                            }
                        }
                    }
                }
            }
        } else if (i4 == 1) {
            pbfVar = pdmVar2.e;
            atqp.j(obj);
            pcbVar = this.c;
            List list3 = pbfVar.e;
            list3.getClass();
            arrayList = new ArrayList(atqq.N(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((poq) it.next()).e());
            }
            aiffVar = pbfVar.f;
            aiffVar.getClass();
            i = pbfVar.l;
            if (i != 0) {
                throw null;
            }
            plxVar = pbfVar.c;
            pbhVar = pbfVar.k;
            pbhVar.getClass();
            pdmVar2.e = pbfVar;
            pdmVar2.a = plxVar;
            pdmVar2.d = 2;
            if (pcbVar.b(plxVar, arrayList, aiffVar, i, pbhVar, pdmVar2) != awoxVar) {
                return awoxVar;
            }
            pbfVar2 = pbfVar;
            aihf aihfVarCreateBuilder2 = aiff.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            aiffVarB = aext.B(aihfVarCreateBuilder2);
            aiffVar2 = pbfVar2.f;
            if (!awrc.c(aiffVar2, aiffVarB)) {
                if (plxVar != null) {
                    i2 = pbfVar2.l;
                    pbfVar3 = pbfVar2;
                    pgiVar = this.b;
                    aiffVar2.getClass();
                    str = pbfVar3.b;
                    if (str == null) {
                        str = "";
                    }
                    str2 = str;
                    if (i2 == 0) {
                        throw null;
                    }
                    pbhVar2 = pbfVar3.k;
                    pbhVar2.getClass();
                    List list4 = pbfVar3.e;
                    list4.getClass();
                    arrayList2 = new ArrayList(atqq.N(list4, 10));
                    it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((poq) it3.next()).c());
                    }
                    pdmVar2.e = null;
                    pdmVar2.a = null;
                    pdmVar2.d = 3;
                    if (pgiVar.c(plxVar, aiffVar2, str2, i2, pbhVar2, arrayList2, 0, 0, pdmVar2) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    it2 = pbfVar2.e.iterator();
                    while (it2.hasNext()) {
                        strF = ((poq) it2.next()).f();
                        if (strF == null) {
                        }
                    }
                }
            }
        } else if (i4 == 2) {
            plx plxVar2 = (plx) pdmVar2.a;
            pbfVar2 = pdmVar2.e;
            atqp.j(obj);
            plxVar = plxVar2;
            aihf aihfVarCreateBuilder3 = aiff.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            aiffVarB = aext.B(aihfVarCreateBuilder3);
            aiffVar2 = pbfVar2.f;
            if (!awrc.c(aiffVar2, aiffVarB)) {
                if (plxVar != null) {
                    i2 = pbfVar2.l;
                    pbfVar3 = pbfVar2;
                    pgiVar = this.b;
                    aiffVar2.getClass();
                    str = pbfVar3.b;
                    if (str == null) {
                        str = "";
                    }
                    str2 = str;
                    if (i2 == 0) {
                        throw null;
                    }
                    pbhVar2 = pbfVar3.k;
                    pbhVar2.getClass();
                    List list5 = pbfVar3.e;
                    list5.getClass();
                    arrayList2 = new ArrayList(atqq.N(list5, 10));
                    it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((poq) it3.next()).c());
                    }
                    pdmVar2.e = null;
                    pdmVar2.a = null;
                    pdmVar2.d = 3;
                    if (pgiVar.c(plxVar, aiffVar2, str2, i2, pbhVar2, arrayList2, 0, 0, pdmVar2) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    it2 = pbfVar2.e.iterator();
                    while (it2.hasNext()) {
                        strF = ((poq) it2.next()).f();
                        if (strF == null) {
                        }
                    }
                }
            }
        } else if (i4 == 3) {
            atqp.j(obj);
        } else {
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) pdmVar2.a;
            pbfVar2 = pdmVar2.e;
            atqp.j(obj);
            while (it2.hasNext()) {
                strF = ((poq) it2.next()).f();
                if (strF == null && strF.length() != 0) {
                    pdr pdrVar = this.a;
                    aiff aiffVar3 = pbfVar2.f;
                    aiffVar3.getClass();
                    pdmVar2.e = pbfVar2;
                    pdmVar2.a = it2;
                    pdmVar2.d = 4;
                    if (pdrVar.g(strF, aiffVar3, pdmVar2) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
        }
        return awmy.a;
    }
}
