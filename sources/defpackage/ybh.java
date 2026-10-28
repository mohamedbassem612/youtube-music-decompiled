package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ybh extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ String e;
    final /* synthetic */ ybi f;
    final /* synthetic */ zwa g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybh(String str, ybi ybiVar, zwa zwaVar, awoq awoqVar) {
        super(2, awoqVar);
        this.e = str;
        this.f = ybiVar;
        this.g = zwaVar;
    }

    public static final ybd a(awtr awtrVar) {
        return (ybd) awtrVar.a;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ybh ybhVar = new ybh(this.e, this.f, this.g, awoqVar);
        ybhVar.h = obj;
        return ybhVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ybh) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060 A[PHI: r1 r3 r7 r12
      0x0060: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v5 java.lang.Object) binds: [B:10:0x002d, B:17:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r3v3 awzd) = (r3v2 awzd), (r3v4 awzd) binds: [B:10:0x002d, B:17:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r7v3 ??) = (r7v8 ??), (r7v9 ??) binds: [B:10:0x002d, B:17:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r12v6 java.lang.Object) = (r12v5 java.lang.Object), (r12v7 java.lang.Object) binds: [B:10:0x002d, B:17:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0091 A[PHI: r1 r3 r7 r12
      0x0091: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v7 java.lang.Object) binds: [B:15:0x008f, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r3v4 awzd) = (r3v3 awzd), (r3v8 awzd) binds: [B:15:0x008f, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r7v4 ??) = (r7v7 ??), (r7v6 ??) binds: [B:15:0x008f, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r12v7 java.lang.Object) = (r12v6 java.lang.Object), (r12v8 java.lang.Object) binds: [B:15:0x008f, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008f -> B:16:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            awox r0 = defpackage.awox.a
            int r1 = r11.d
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L30
            if (r1 == r3) goto L1f
            java.lang.Object r3 = r11.c
            if (r1 != r4) goto L21
            java.lang.Object r1 = r11.b
            java.lang.Object r5 = r11.a
            java.lang.Object r6 = r11.h
            awzd r6 = (defpackage.awzd) r6
            defpackage.atqp.j(r12)
            r7 = r3
            r12 = r5
            r3 = r6
            goto L91
        L1f:
            java.lang.Object r3 = r11.c
        L21:
            java.lang.Object r1 = r11.b
            java.lang.Object r5 = r11.a
            java.lang.Object r6 = r11.h
            awzd r6 = (defpackage.awzd) r6
            defpackage.atqp.j(r12)
            r7 = r3
        L2d:
            r12 = r5
            r3 = r6
            goto L60
        L30:
            defpackage.atqp.j(r12)
            java.lang.Object r12 = r11.h
            r6 = r12
            awzd r6 = (defpackage.awzd) r6
            java.lang.String r12 = r11.e
            ybd r1 = new ybd
            j$.time.Duration r5 = defpackage.ybi.c
            r1.<init>(r2, r12, r5)
            awts r12 = defpackage.awts.a
            awtr r5 = new awtr
            r5.<init>(r1, r12)
            ybi r1 = r11.f
            zwa r12 = r11.g
            j$.time.Duration r7 = j$.time.Duration.ZERO
            r11.h = r6
            r11.a = r5
            r11.b = r1
            r11.c = r12
            r11.d = r3
            java.lang.Object r3 = defpackage.afyd.r(r7, r11)
            if (r3 == r0) goto Lab
            r7 = r12
            goto L2d
        L60:
            ybe r5 = new ybe
            r8 = r12
            awtr r8 = (defpackage.awtr) r8
            r6 = r1
            ybi r6 = (defpackage.ybi) r6
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            awyv r6 = new awyv
            r6.<init>(r5)
            ybf r5 = new ybf
            r5.<init>(r2)
            awzj r9 = new awzj
            r9.<init>(r6, r5, r4)
            ybg r5 = new ybg
            r5.<init>(r3, r8)
            r11.h = r3
            r11.a = r12
            r11.b = r1
            r11.c = r7
            r11.d = r4
            java.lang.Object r5 = r9.collect(r5, r11)
            if (r5 == r0) goto Lab
        L91:
            r5 = r12
            awtr r5 = (defpackage.awtr) r5
            ybd r5 = a(r5)
            j$.time.Duration r5 = r5.c
            r11.h = r3
            r11.a = r12
            r11.b = r1
            r11.c = r7
            r6 = 3
            r11.d = r6
            java.lang.Object r5 = defpackage.yno.cR(r5, r11)
            if (r5 != r0) goto L60
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
