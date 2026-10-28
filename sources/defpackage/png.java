package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class png implements pmh {
    private static final agsn a = agsn.h("GnpSdk");
    private final pve b;
    private final ppe c;

    public png(pve pveVar, ppe ppeVar) {
        pveVar.getClass();
        ppeVar.getClass();
        this.b = pveVar;
        this.c = ppeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.c == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r4.length() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (r4.length() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        r4 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r4 = defpackage.aifa.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r4 = defpackage.aiel.a(r4.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        r4 = defpackage.aiel.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r4 != defpackage.aiel.IN_APP) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return defpackage.pnc.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return defpackage.pnc.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r4.length() != 0) goto L49;
     */
    @Override // defpackage.pmh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pnc a(defpackage.aicw r5) {
        /*
            r4 = this;
            if (r5 == 0) goto La8
            int r4 = r5.b
            r0 = r4 & 4
            if (r0 == 0) goto L1b
            aiec r4 = r5.e
            if (r4 != 0) goto Le
            aiec r4 = defpackage.aiec.a
        Le:
            java.lang.String r4 = r4.e
            r4.getClass()
            int r4 = r4.length()
            if (r4 == 0) goto La8
            goto La5
        L1b:
            r4 = r4 & 8
            if (r4 == 0) goto La8
            aifa r4 = r5.f
            if (r4 != 0) goto L25
            aifa r4 = defpackage.aifa.a
        L25:
            int r4 = r4.b
            aiex r4 = defpackage.aiex.a(r4)
            if (r4 != 0) goto L2f
            aiex r4 = defpackage.aiex.UNKNOWN_INSTRUCTION
        L2f:
            r0 = 5
            aiex[] r0 = new defpackage.aiex[r0]
            r1 = 0
            aiex r2 = defpackage.aiex.SYNC
            r0[r1] = r2
            r1 = 1
            aiex r2 = defpackage.aiex.FULL_SYNC
            r0[r1] = r2
            aiex r1 = defpackage.aiex.STORE_ALL_ACCOUNTS
            r2 = 2
            r0[r2] = r1
            r2 = 3
            aiex r3 = defpackage.aiex.UPDATE_THREAD
            r0[r2] = r3
            aiex r2 = defpackage.aiex.UPDATE_BADGE_COUNT
            r3 = 4
            r0[r3] = r2
            java.util.List r0 = defpackage.atqq.aL(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto La8
            if (r4 != r2) goto L66
            aieo r4 = r5.g
            if (r4 != 0) goto L5d
            aieo r4 = defpackage.aieo.a
        L5d:
            long r4 = r4.c
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto La5
            goto La8
        L66:
            if (r4 == r1) goto La5
            boolean r4 = defpackage.auvg.c()
            if (r4 == 0) goto L80
            aieq r4 = r5.d
            if (r4 != 0) goto L74
            aieq r4 = defpackage.aieq.a
        L74:
            java.lang.String r4 = r4.d
            r4.getClass()
            int r4 = r4.length()
            if (r4 == 0) goto La8
            goto L8b
        L80:
            java.lang.String r4 = r5.c
            r4.getClass()
            int r4 = r4.length()
            if (r4 == 0) goto La8
        L8b:
            aifa r4 = r5.f
            if (r4 != 0) goto L91
            aifa r4 = defpackage.aifa.a
        L91:
            int r4 = r4.e
            aiel r4 = defpackage.aiel.a(r4)
            if (r4 != 0) goto L9b
            aiel r4 = defpackage.aiel.UNKNOWN
        L9b:
            aiel r5 = defpackage.aiel.IN_APP
            if (r4 != r5) goto La2
            pnc r4 = defpackage.pnc.c
            goto Laa
        La2:
            pnc r4 = defpackage.pnc.b
            goto Laa
        La5:
            pnc r4 = defpackage.pnc.b
            goto Laa
        La8:
            pnc r4 = defpackage.pnc.a
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.png.a(aicw):pnc");
    }

    @Override // defpackage.pmh
    public final Object b(aicw aicwVar, awoq awoqVar) {
        return auvg.c() ? d(aicwVar, awoqVar) : c(aicwVar, awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156 A[LOOP:0: B:60:0x0150->B:62:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [png] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bf -> B:55:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c5 -> B:55:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0107 -> B:49:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x012f -> B:53:0x012d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:59:0x0141
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.aicw r11, defpackage.awoq r12) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.png.c(aicw, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(aicw aicwVar, awoq awoqVar) throws Throwable {
        pne pneVar;
        String str;
        String str2;
        if (awoqVar instanceof pne) {
            pneVar = (pne) awoqVar;
            int i = pneVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pneVar.c = i - Integer.MIN_VALUE;
            } else {
                pneVar = new pne(this, awoqVar);
            }
        } else {
            pneVar = new pne(this, awoqVar);
        }
        Object objC = pneVar.a;
        awox awoxVar = awox.a;
        int i2 = pneVar.c;
        if (i2 == 0) {
            atqp.j(objC);
            if ((aicwVar.b & 2) != 0) {
                aieq aieqVar = aicwVar.d;
                if (aieqVar == null) {
                    aieqVar = aieq.a;
                }
                str = aieqVar.d;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                ((agsj) a.b()).t("Representative target id in payload is empty, can't find account");
                return new pkv("Payload does not contain an RTID", pkx.aM);
            }
            pve pveVar = this.b;
            pneVar.d = str;
            pneVar.c = 1;
            objC = pveVar.c(pneVar);
            if (objC == awoxVar) {
                return awoxVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = pneVar.d;
            atqp.j(objC);
        }
        pky pkyVar = (pky) objC;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu != 1) {
                throw new awmj();
            }
            pku pkuVar = (pku) pkyVar;
            ((agsj) ((agsj) a.c()).j(pkuVar.b())).t("Failed to fetch accounts from storage.");
            return pkuVar;
        }
        for (plx plxVar : (List) ((pla) pkyVar).a) {
            if (awrc.c(plxVar.i, str2)) {
                return new pla(plxVar);
            }
        }
        return new pkv("An account with the requested RTID was not found in storage", pkx.X);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(plx plxVar, awoq awoqVar) throws Throwable {
        pnf pnfVar;
        if (awoqVar instanceof pnf) {
            pnfVar = (pnf) awoqVar;
            int i = pnfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnfVar.c = i - Integer.MIN_VALUE;
            } else {
                pnfVar = new pnf(this, awoqVar);
            }
        } else {
            pnfVar = new pnf(this, awoqVar);
        }
        Object objA = pnfVar.a;
        awox awoxVar = awox.a;
        int i2 = pnfVar.c;
        if (i2 == 0) {
            atqp.j(objA);
            String str = plxVar.b;
            ppe ppeVar = this.c;
            str.getClass();
            pnfVar.d = plxVar;
            pnfVar.c = 1;
            objA = ppeVar.a(str, pnfVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            plxVar = pnfVar.d;
            atqp.j(objA);
        }
        pky pkyVar = (pky) objA;
        if (pkyVar.g()) {
            ((agsj) ((agsj) a.b()).j(pkyVar.f())).v("Failed to get the obfuscated account ID for account with ID [%s].", plxVar.a);
            return null;
        }
        String str2 = (String) pkyVar.d();
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        ((agsj) a.b()).v("AuthUtil returned empty obfuscated account ID for account with ID [%s].", plxVar.a);
        return null;
    }
}
