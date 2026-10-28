package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzq extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzq(awys awysVar, Object obj, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awysVar;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            uzq uzqVar = new uzq((List) this.b, (uzt) this.c, awoqVar, 0);
            uzqVar.d = obj;
            return uzqVar;
        }
        if (i == 1) {
            uzq uzqVar2 = new uzq((tkd) this.c, (awqk) this.b, awoqVar, 1);
            uzqVar2.d = obj;
            return uzqVar2;
        }
        if (i != 2) {
            uzq uzqVar3 = new uzq((awys) this.b, this.c, awoqVar, 3);
            uzqVar3.d = obj;
            return uzqVar3;
        }
        uzq uzqVar4 = new uzq((List) this.b, (vhu) this.c, awoqVar, 2);
        uzqVar4.d = obj;
        return uzqVar4;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((uzq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((uzq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 2) {
            return ((uzq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((uzq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r11.h(r1, r10) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r11 != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r1.invoke(r11, r10) != r0) goto L39;
     */
    /* JADX WARN: Type inference failed for: r11v19, types: [awys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzq(List list, uzt uztVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = list;
        this.c = uztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzq(List list, vhu vhuVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = list;
        this.c = vhuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzq(tkd tkdVar, awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = tkdVar;
        this.b = awqkVar;
    }
}
