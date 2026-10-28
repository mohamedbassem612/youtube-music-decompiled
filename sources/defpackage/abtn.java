package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abtn implements abto {
    public final abmt a;
    public abnl b;
    public final abpj c;
    public final acui d;
    public final adet e;
    private final avlh f;
    private final avlh g;
    private final aboi j;
    private final avmm i = new avmm();
    private final abtv h = new abtv() { // from class: abtm
        @Override // defpackage.abtv
        public final void k() {
            this.a.d();
        }
    };

    public abtn(avlh avlhVar, avlh avlhVar2, adet adetVar, aboi aboiVar, abpj abpjVar, abmt abmtVar, acui acuiVar) {
        this.f = avlhVar;
        this.g = avlhVar2;
        this.e = adetVar;
        this.j = aboiVar;
        this.c = abpjVar;
        this.a = abmtVar;
        this.d = acuiVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [axsp, java.lang.Object] */
    @Override // defpackage.abto
    public final void a() {
        avmn avmnVarAk = this.f.ak(new absp(this, 2));
        avmm avmmVar = this.i;
        avmmVar.c(avmnVarAk);
        avmmVar.c(this.g.ak(new absp(this, 3)));
        this.j.j();
        d();
        abnl abnlVar = this.c.k;
        String strU = abnlVar == null ? null : abnlVar.u();
        this.e.a.kk(new abmf(strU));
        this.d.b.add(this.h);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [axsp, java.lang.Object] */
    @Override // defpackage.abto
    public final void b() {
        aayu aayuVar = new aayu(false);
        adet adetVar = this.e;
        adetVar.h.kk(aayuVar);
        adetVar.e.kk(aayw.a);
        this.j.d();
        this.i.dispose();
        acui acuiVar = this.d;
        acuiVar.b.remove(this.h);
        acuiVar.e.F(acuiVar);
        Object obj = acuiVar.c;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            acuiVar.c = null;
        }
    }

    @Override // defpackage.abto
    public final boolean c(abtu abtuVar) {
        return acui.a(abtuVar) == 2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [axsp, java.lang.Object] */
    public final void d() {
        this.e.d.kk(new aayv(c(abtu.b), c(abtu.a), 0, false));
    }

    public final void e() {
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [axsp, java.lang.Object] */
    public final void f(abmg abmgVar) {
        this.e.j.kk(new abmh(abmgVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [axsp, java.lang.Object] */
    public final void g(String str) {
        String strC = this.j.c();
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(strC)) || TextUtils.equals(str, strC)) {
            return;
        }
        adet adetVar = this.e;
        adetVar.a.kk(new abmf(str));
    }
}
