package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class psu extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    Object i;
    int j;
    final /* synthetic */ psw k;
    final /* synthetic */ plv l;
    final /* synthetic */ List m;
    final /* synthetic */ aier n;
    final /* synthetic */ String o;
    final /* synthetic */ Map p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psu(psw pswVar, plv plvVar, List list, aier aierVar, String str, Map map, awoq awoqVar) {
        super(2, awoqVar);
        this.k = pswVar;
        this.l = plvVar;
        this.m = list;
        this.n = aierVar;
        this.o = str;
        this.p = map;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new psu(this.k, this.l, this.m, this.n, this.o, this.p, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((psu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0198  */
    /* JADX WARN: Code duplicated, block: B:32:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x01df  */
    /* JADX WARN: Code duplicated, block: B:41:0x020c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r4v4, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01df -> B:38:0x01e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
