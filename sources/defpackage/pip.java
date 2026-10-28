package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pip extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ pit c;
    final /* synthetic */ plx d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ plb h;
    final /* synthetic */ int i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pip(List list, pit pitVar, plx plxVar, int i, int i2, boolean z, plb plbVar, int i3, awoq awoqVar, int i4) {
        super(2, awoqVar);
        this.$cid = i4;
        this.b = list;
        this.c = pitVar;
        this.d = plxVar;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = plbVar;
        this.i = i3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            pip pipVar = new pip(this.b, this.c, this.g, this.h, this.i, this.d, this.e, this.f, awoqVar, 1);
            pipVar.j = obj;
            return pipVar;
        }
        pip pipVar2 = new pip(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, awoqVar, 0);
        pipVar2.j = obj;
        return pipVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((pip) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pip) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (r0 != r1) goto L13;
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pip.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pip(List list, pit pitVar, boolean z, plb plbVar, int i, plx plxVar, int i2, int i3, awoq awoqVar, int i4) {
        super(2, awoqVar);
        this.$cid = i4;
        this.b = list;
        this.c = pitVar;
        this.g = z;
        this.h = plbVar;
        this.i = i;
        this.d = plxVar;
        this.e = i2;
        this.f = i3;
    }
}
