package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdz extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ List g;
    final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdz(List list, List list2, awoq awoqVar) {
        super(2, awoqVar);
        this.g = list;
        this.h = list2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bdz bdzVar = new bdz(this.g, this.h, awoqVar);
        bdzVar.f = obj;
        return bdzVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bdz) create(obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [bdx] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            awox r1 = defpackage.awox.a
            int r2 = r8.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            if (r2 == r3) goto L14
            java.lang.Object r0 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.atqp.j(r9)
            goto L31
        L14:
            java.lang.Object r0 = r8.d
            java.lang.Object r2 = r8.c
            java.lang.Object r5 = r8.b
            java.lang.Object r6 = r8.a
            defpackage.atqp.j(r9)
            r7 = r6
            r6 = r2
            r2 = r7
            goto L54
        L23:
            defpackage.atqp.j(r9)
            java.util.List r9 = r8.g
            java.util.List r2 = r8.h
            java.util.Iterator r9 = r9.iterator()
            r7 = r0
            r0 = r9
            r9 = r7
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r0.next()
            bdx r5 = (defpackage.bdx) r5
            r8.f = r4
            r8.a = r2
            r8.b = r0
            r8.c = r5
            r8.d = r9
            r8.e = r3
            java.lang.Object r6 = r5.b(r9, r8)
            if (r6 == r1) goto L7c
            r7 = r0
            r0 = r9
            r9 = r6
            r6 = r5
            r5 = r7
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L78
            bep r9 = new bep
            r9.<init>(r6, r4, r3)
            r2.add(r9)
            r8.f = r4
            r8.a = r2
            r8.b = r5
            r8.c = r4
            r8.d = r4
            r9 = 2
            r8.e = r9
            java.lang.Object r9 = r6.a(r0, r8)
            if (r9 == r1) goto L7c
            goto L79
        L78:
            r9 = r0
        L79:
            r0 = r5
            goto L31
        L7b:
            r1 = r9
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
