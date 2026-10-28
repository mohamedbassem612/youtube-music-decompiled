package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pik extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ aieg c;
    final /* synthetic */ pit d;
    final /* synthetic */ boolean e;
    final /* synthetic */ plb f;
    final /* synthetic */ plx g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pik(aieg aiegVar, pit pitVar, boolean z, plb plbVar, int i, plx plxVar, int i2, int i3, awoq awoqVar) {
        super(2, awoqVar);
        this.c = aiegVar;
        this.d = pitVar;
        this.e = z;
        this.f = plbVar;
        this.j = i;
        this.g = plxVar;
        this.h = i2;
        this.i = i3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pik(this.c, this.d, this.e, this.f, this.j, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pik) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        awox awoxVar = awox.a;
        if (this.b != 0) {
            obj2 = this.a;
            atqp.j(obj);
        } else {
            atqp.j(obj);
            aieg aiegVar = this.c;
            String str = aiegVar.d;
            if (str.length() == 0) {
                str = aiegVar.b;
            }
            String str2 = str;
            str2.getClass();
            pit pitVar = this.d;
            boolean z = this.e;
            plb plbVar = this.f;
            pij pijVar = new pij(pitVar, this.g, str2, this.h, this.i, (awoq) null, 0);
            this.a = str2;
            this.b = 1;
            obj = pit.j(z, plbVar, pijVar, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            obj2 = str2;
        }
        pit pitVar2 = this.d;
        pky pkyVar = (pky) obj;
        String packageName = pitVar2.b.getPackageName();
        packageName.getClass();
        pitVar2.p(packageName, (String) obj2, this.j, pkyVar.i(), "FILE");
        return new awml(this.c, pkyVar);
    }
}
