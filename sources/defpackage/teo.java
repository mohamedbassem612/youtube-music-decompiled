package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class teo extends awpk implements awqk {
    int a;
    final /* synthetic */ teq b;
    final /* synthetic */ List c;
    final /* synthetic */ long d;
    final /* synthetic */ tew e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ String i;
    final /* synthetic */ int j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teo(teq teqVar, List list, long j, int i, tew tewVar, boolean z, int i2, int i3, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.b = teqVar;
        this.c = list;
        this.d = j;
        this.j = i;
        this.e = tewVar;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        teo teoVar = new teo(this.b, this.c, this.d, this.j, this.e, this.f, this.g, this.h, this.i, awoqVar);
        teoVar.k = obj;
        return teoVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((teo) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            awut awutVar = (awut) this.k;
            teq teqVar = this.b;
            List list = this.c;
            this.a = 1;
            obj = teqVar.a(awutVar, list, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        teq teqVar2 = this.b;
        if (teqVar2.f()) {
            mbc mbcVar = teqVar2.d;
            long jB = mbcVar.b() - this.d;
            int i2 = 3;
            boolean z = false;
            int i3 = 0;
            teqVar2.k(this.j, new tev(i2, this.e, this.f, z, i3, true, jB, this.g + this.h + iIntValue, 24), this.i);
        }
        return awmy.a;
    }
}
