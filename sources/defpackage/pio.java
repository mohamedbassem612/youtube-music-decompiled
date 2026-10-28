package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pio extends awpk implements awqk {
    int a;
    final /* synthetic */ aieg b;
    final /* synthetic */ pit c;
    final /* synthetic */ plx d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ plb h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pio(aieg aiegVar, pit pitVar, plx plxVar, int i, int i2, boolean z, plb plbVar, int i3, awoq awoqVar) {
        super(2, awoqVar);
        this.b = aiegVar;
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
        return new pio(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pio) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        aieg aiegVar = this.b;
        String str = aiegVar.d;
        if (str.length() == 0) {
            str = aiegVar.b;
        }
        String str2 = str;
        str2.getClass();
        pit pitVar = this.c;
        plx plxVar = this.d;
        int i2 = this.e;
        int i3 = this.f;
        boolean z = this.g;
        plb plbVar = this.h;
        int i4 = this.i;
        this.a = 1;
        Object objL = pitVar.l(plxVar, str2, i2, i3, z, plbVar, i4, this);
        return objL == awoxVar ? awoxVar : objL;
    }
}
