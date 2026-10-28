package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tej extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ List e;
    final /* synthetic */ AtomicInteger f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tej(List list, AtomicInteger atomicInteger, List list2, AtomicInteger atomicInteger2, awoq awoqVar) {
        super(2, awoqVar);
        this.c = list;
        this.d = atomicInteger;
        this.e = list2;
        this.f = atomicInteger2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        tej tejVar = new tej(this.c, this.d, this.e, this.f, awoqVar);
        tejVar.g = obj;
        return tejVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:27:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            awox r0 = defpackage.awox.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L1b
            java.lang.Object r3 = r4.a
            if (r1 == r2) goto L13
            java.lang.Object r1 = r4.g
            awut r1 = (defpackage.awut) r1
            defpackage.atqp.j(r5)     // Catch: java.lang.Exception -> L7e
            goto L78
        L13:
            java.lang.Object r1 = r4.g
            awut r1 = (defpackage.awut) r1
            defpackage.atqp.j(r5)     // Catch: java.lang.Exception -> L4e
            goto L48
        L1b:
            defpackage.atqp.j(r5)
            java.lang.Object r5 = r4.g
            awut r5 = (defpackage.awut) r5
            java.util.List r1 = r4.c
            java.util.Iterator r1 = r1.iterator()
            r3 = r1
            r1 = r5
        L2a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r3.next()
            r5.getClass()
            tdz r5 = (defpackage.tdz) r5
            defpackage.awrc.M(r1)
            r4.g = r1     // Catch: java.lang.Exception -> L4e
            r4.a = r3     // Catch: java.lang.Exception -> L4e
            r4.b = r2     // Catch: java.lang.Exception -> L4e
            java.lang.Object r5 = r5.jC()     // Catch: java.lang.Exception -> L4e
            if (r5 == r0) goto L84
        L48:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.d     // Catch: java.lang.Exception -> L4e
            r5.incrementAndGet()     // Catch: java.lang.Exception -> L4e
            goto L2a
        L4e:
            defpackage.awrc.M(r1)
            goto L2a
        L52:
            java.util.List r5 = r4.e
            java.util.Iterator r5 = r5.iterator()
            r3 = r5
        L59:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            r5.getClass()
            acyg r5 = (defpackage.acyg) r5
            defpackage.awrc.M(r1)
            r4.g = r1     // Catch: java.lang.Exception -> L7e
            r4.a = r3     // Catch: java.lang.Exception -> L7e
            r2 = 2
            r4.b = r2     // Catch: java.lang.Exception -> L7e
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Exception -> L7e
            if (r5 == r0) goto L84
        L78:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f     // Catch: java.lang.Exception -> L7e
            r5.incrementAndGet()     // Catch: java.lang.Exception -> L7e
            goto L59
        L7e:
            defpackage.awrc.M(r1)
            goto L59
        L82:
            awmy r0 = defpackage.awmy.a
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tej.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
