package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pra implements pqn {
    public static final /* synthetic */ int d = 0;
    private static final agsn e = agsn.h("GnpSdk");
    public final pul a;
    public final mbc b;
    public final awmd c;
    private final aunn f;
    private final awou g;
    private final awou h;
    private final agev i;
    private final pls j;
    private final pwf k;
    private final Context l;
    private final agev m;
    private final omm n;
    private final omr o;
    private final oml p;

    public pra(pul pulVar, oml omlVar, omm ommVar, aunn aunnVar, awou awouVar, awou awouVar2, agev agevVar, pls plsVar, pwf pwfVar, Context context, mbc mbcVar, agev agevVar2, omr omrVar, awmd awmdVar) {
        ommVar.getClass();
        aunnVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        context.getClass();
        mbcVar.getClass();
        this.a = pulVar;
        this.p = omlVar;
        this.n = ommVar;
        this.f = aunnVar;
        this.g = awouVar;
        this.h = awouVar2;
        this.i = agevVar;
        this.j = plsVar;
        this.k = pwfVar;
        this.l = context;
        this.b = mbcVar;
        this.m = agevVar2;
        this.o = omrVar;
        this.c = awmdVar;
    }

    private static final boolean h(List list, plx plxVar) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (awrc.c(((aiay) it.next()).i, String.valueOf(plxVar.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pqn
    public final Object a(List list, Map map, pqq pqqVar, String str, int i, pqo pqoVar, plv plvVar, aier aierVar, String str2, awoq awoqVar) {
        return awro.p(this.h, new pqw(this, list, map, pqqVar, plvVar, aierVar, i, pqoVar, str, str2, null), awoqVar);
    }

    @Override // defpackage.pqn
    public final Object b(List list, Map map, String str, aiaz aiazVar, awoq awoqVar) {
        return awro.p(this.g, new pmu(list, this, str, aiazVar, map, (awoq) null, 2), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [pra] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public final Object c(plx plxVar, pqq pqqVar, Map map, Map map2, List list, StringBuilder sb, plv plvVar, long j, awoq awoqVar) throws Throwable {
        pqv pqvVar;
        pky pkyVar;
        Object obj;
        ?? r15;
        pky ptbVar;
        if (awoqVar instanceof pqv) {
            pqvVar = (pqv) awoqVar;
            int i = pqvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqvVar.e = i - Integer.MIN_VALUE;
            } else {
                pqvVar = new pqv(this, awoqVar);
            }
        } else {
            pqvVar = new pqv(this, awoqVar);
        }
        pqv pqvVar2 = pqvVar;
        Object objF = pqvVar2.c;
        awox awoxVar = awox.a;
        int i2 = pqvVar2.e;
        if (i2 == 0) {
            atqp.j(objF);
            boolean z = ((aiba) atqq.x(map2, plxVar.b())).h;
            pky pkyVar2 = (pky) atqq.x(pqqVar.c, plxVar.b());
            Objects.checkIndex(0, 3);
            if (pkyVar2 == null) {
                pkyVar = pkyVar2;
            } else {
                if (pkyVar2 instanceof pld) {
                    ptbVar = new ptc(((pld) pkyVar2).b(), z, pkx.ah);
                } else if (pkyVar2 instanceof pkz) {
                    ptbVar = new ptb(((pkz) pkyVar2).b(), z, pkx.ah);
                } else {
                    pkyVar = pkyVar2;
                }
                pkyVar = ptbVar;
            }
            map.put(plxVar.b(), pkyVar);
            if (!z) {
                String str = "Account id " + plxVar.a + " registration removed by GNP backend";
                sb.append(str);
                sb.getClass();
                sb.append('\n');
                ((agsj) e.c()).w("%s", str);
                plw plwVar = new plw(plxVar);
                plwVar.i(3);
                return plwVar.a();
            }
            map.put(plxVar.b(), pkyVar);
            Object obj2 = map2.get(plxVar.b());
            if (obj2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            aibb aibbVar = pqqVar.b;
            String str2 = aibbVar.c;
            str2.getClass();
            pqvVar2.a = list;
            pqvVar2.b = pkyVar;
            pqvVar2.e = 1;
            objF = f(plxVar, (aiba) obj2, str2, j, plvVar, aibbVar.d, pkyVar instanceof pla, pqvVar2);
            if (objF == awoxVar) {
                return awoxVar;
            }
            obj = pkyVar;
            r15 = list;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = pqvVar2.b;
            Object obj3 = pqvVar2.a;
            atqp.j(objF);
            r15 = obj3;
        }
        plx plxVar2 = (plx) objF;
        if (!(obj instanceof pla)) {
            return plxVar2;
        }
        r15.add(plxVar2);
        return plxVar2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:115:0x0530  */
    /* JADX WARN: Code duplicated, block: B:117:0x054a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0563  */
    /* JADX WARN: Code duplicated, block: B:125:0x0566  */
    /* JADX WARN: Code duplicated, block: B:65:0x0278  */
    /* JADX WARN: Code duplicated, block: B:67:0x0292  */
    /* JADX WARN: Code duplicated, block: B:69:0x029f  */
    /* JADX WARN: Code duplicated, block: B:71:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x030c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0311  */
    /* JADX WARN: Code duplicated, block: B:77:0x0330  */
    /* JADX WARN: Code duplicated, block: B:79:0x033e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0346  */
    /* JADX WARN: Code duplicated, block: B:84:0x038a  */
    /* JADX WARN: Code duplicated, block: B:86:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x03de  */
    /* JADX WARN: Code duplicated, block: B:91:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:93:0x047a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object, pny] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [pra] */
    /* JADX WARN: Type inference failed for: r1v11, types: [pra] */
    /* JADX WARN: Type inference failed for: r1v12, types: [pra] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [pra] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r25v0, types: [pra] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v40, types: [kjc] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x038a -> B:85:0x039e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.List r26, java.util.Map r27, defpackage.pqq r28, defpackage.plv r29, long r30, defpackage.aier r32, defpackage.awoq r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pra.d(java.util.List, java.util.Map, pqq, plv, long, aier, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, pxu] */
    public final Object e(Map map, Map map2, plv plvVar, awoq awoqVar) throws Throwable {
        pqy pqyVar;
        if (awoqVar instanceof pqy) {
            pqyVar = (pqy) awoqVar;
            int i = pqyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqyVar.c = i - Integer.MIN_VALUE;
            } else {
                pqyVar = new pqy(this, awoqVar);
            }
        } else {
            pqyVar = new pqy(this, awoqVar);
        }
        Object obj = pqyVar.a;
        awox awoxVar = awox.a;
        int i2 = pqyVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                if (plvVar.a()) {
                    ?? r4 = ((agfa) this.i).a;
                    pqyVar.c = 1;
                    if (qnl.W(r4, map, map2, pqyVar) == awoxVar) {
                        return awoxVar;
                    }
                }
                return awmy.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        } catch (Exception e2) {
            ((agsj) ((agsj) e.c()).j(e2)).t("Failed to report registration results");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(plx plxVar, aiba aibaVar, String str, long j, plv plvVar, long j2, boolean z, awoq awoqVar) throws Throwable {
        pqz pqzVar;
        plw plwVar;
        if (awoqVar instanceof pqz) {
            pqzVar = (pqz) awoqVar;
            int i = pqzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqzVar.d = i - Integer.MIN_VALUE;
            } else {
                pqzVar = new pqz(this, awoqVar);
            }
        } else {
            pqzVar = new pqz(this, awoqVar);
        }
        Object obj = pqzVar.b;
        awox awoxVar = awox.a;
        int i2 = pqzVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            plwVar = new plw(plxVar);
            plwVar.i(1);
            if (z) {
                plwVar.h(j);
            }
            aiby aibyVar = aibaVar.d;
            if (aibyVar == null) {
                aibyVar = aiby.a;
            }
            if ((aibyVar.b & 4) != 0) {
                aiby aibyVar2 = aibaVar.d;
                if (aibyVar2 == null) {
                    aibyVar2 = aiby.a;
                }
                plwVar.f = aibyVar2.e;
            }
            if (!TextUtils.isEmpty(str)) {
                plwVar.g = str;
                omm ommVarG = g(plvVar);
                pqzVar.g = plxVar;
                pqzVar.e = aibaVar;
                pqzVar.f = plwVar;
                pqzVar.a = j2;
                pqzVar.d = 1;
                if (ommVarG.n(str, pqzVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = pqzVar.a;
            plw plwVar2 = pqzVar.f;
            aiba aibaVar2 = pqzVar.e;
            plx plxVar2 = pqzVar.g;
            atqp.j(obj);
            j2 = j3;
            plwVar = plwVar2;
            aibaVar = aibaVar2;
            plxVar = plxVar2;
        }
        if (!plxVar.c() && (aibaVar.b & 4) != 0) {
            plwVar.a = aibaVar.e;
        }
        String str2 = aibaVar.f;
        str2.getClass();
        if (str2.length() > 0) {
            plwVar.c = aibaVar.f;
        }
        if (j2 != 0 && plxVar.m == 0) {
            plwVar.d(j2);
        }
        plwVar.g(-1);
        return plwVar.a();
    }

    public final omm g(plv plvVar) {
        if (plvVar.a()) {
            return this.n;
        }
        if (!plvVar.b()) {
            throw new IllegalStateException("targetType is not supported");
        }
        Object objIo = this.f.io();
        objIo.getClass();
        return (omm) objIo;
    }
}
