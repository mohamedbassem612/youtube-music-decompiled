package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axbu extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ awzc[] f;
    final /* synthetic */ Function0 g;
    final /* synthetic */ awql h;
    final /* synthetic */ awzd i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbu(awzc[] awzcVarArr, Function0 function0, awql awqlVar, awzd awzdVar, awoq awoqVar) {
        super(2, awoqVar);
        this.f = awzcVarArr;
        this.g = function0;
        this.h = awqlVar;
        this.i = awzdVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        axbu axbuVar = new axbu(this.f, this.g, this.h, this.i, awoqVar);
        axbuVar.j = obj;
        return axbuVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((axbu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089 A[LOOP:0: B:21:0x0089->B:44:?, LOOP_START, PHI: r8 r12
      0x0089: PHI (r8v5 int) = (r8v4 int), (r8v6 int) binds: [B:20:0x0087, B:44:?] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r12v4 awnr) = (r12v3 awnr), (r12v17 awnr) binds: [B:20:0x0087, B:44:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:31:0x00ae BREAK  A[LOOP:0: B:21:0x0089->B:44:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [awye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [awye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ec -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axbu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
