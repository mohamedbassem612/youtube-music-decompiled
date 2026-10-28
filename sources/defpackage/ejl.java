package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ejl extends enp {
    final /* synthetic */ eno a;
    final /* synthetic */ enp b;
    final /* synthetic */ ejs c;

    public ejl(eno enoVar, enp enpVar, ejs ejsVar) {
        this.a = enoVar;
        this.b = enpVar;
        this.c = ejsVar;
    }

    @Override // defpackage.enp
    public final /* bridge */ /* synthetic */ Object a(eno enoVar) {
        float f = enoVar.a;
        float f2 = enoVar.b;
        String str = ((ejs) enoVar.c).a;
        String str2 = ((ejs) enoVar.d).a;
        eno enoVar2 = this.a;
        enoVar2.a(f, f2, str, str2, enoVar.e, enoVar.f, enoVar.g);
        String str3 = (String) this.b.a(enoVar2);
        ejs ejsVar = (ejs) (enoVar.f == 1.0f ? enoVar.d : enoVar.c);
        ejs ejsVar2 = this.c;
        ejsVar2.a(str3, ejsVar.b, ejsVar.c, ejsVar.m, ejsVar.d, ejsVar.e, ejsVar.f, ejsVar.g, ejsVar.h, ejsVar.i, ejsVar.j, ejsVar.k, ejsVar.l);
        return ejsVar2;
    }
}
