package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnd extends awpk implements awqk {
    int a;
    final /* synthetic */ dnl b;
    final /* synthetic */ int[] c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnd(dnl dnlVar, int[] iArr, String[] strArr, awoq awoqVar) {
        super(2, awoqVar);
        this.b = dnlVar;
        this.c = iArr;
        this.d = strArr;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        dnd dndVar = new dnd(this.b, this.c, this.d, awoqVar);
        dndVar.e = obj;
        return dndVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dnd) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:40:0x00c8, B:42:0x00cc, B:44:0x00db, B:45:0x00de, B:47:0x00e3, B:49:0x00e7), top: B:64:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:40:0x00c8, B:42:0x00cc, B:44:0x00db, B:45:0x00de, B:47:0x00e3, B:49:0x00e7), top: B:64:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0098 A[EXC_TOP_SPLITTER, PHI: r2 r16
      0x0098: PHI (r2v6 awzd) = (r2v2 awzd), (r2v3 awzd), (r2v12 awzd) binds: [B:28:0x0074, B:32:0x0096, B:6:0x0010] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r16v6 long) = (r16v0 long), (r16v2 long), (r16v10 long) binds: [B:28:0x0074, B:32:0x0096, B:6:0x0010] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        if (r4.y(r6, r22) == r0) goto L35;
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
