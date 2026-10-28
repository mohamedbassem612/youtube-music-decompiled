package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aip extends akc implements aia {
    public final aiq a;
    private aio b;

    public aip(Object obj, aiq aiqVar) {
        this.a = aiqVar;
        ajw ajwVarA = aka.a();
        aio aioVar = new aio(ajwVarA.m(), obj);
        if (!(ajwVarA instanceof aju)) {
            aioVar.c = new aio(1L, obj);
        }
        this.b = aioVar;
    }

    @Override // defpackage.aia, defpackage.ais
    public final Object e() {
        return ((aio) aka.d(this.b, this)).a;
    }

    @Override // defpackage.aia
    public final void f(Object obj) {
        ajw ajwVarA;
        aio aioVar = (aio) aka.b(this.b, this);
        if (this.a.a(aioVar.a, obj)) {
            return;
        }
        aio aioVar2 = this.b;
        synchronized (aka.a) {
            ajwVarA = aka.a();
            ((aio) aka.c(aioVar2, this, ajwVarA, aioVar)).a = obj;
        }
        aka.e(ajwVarA, this);
    }

    @Override // defpackage.akb
    public final akd g() {
        return this.b;
    }

    @Override // defpackage.akb
    public final void h(akd akdVar) {
        this.b = (aio) akdVar;
    }

    public final String toString() {
        return "MutableState(value=" + ((aio) aka.b(this.b, this)).a + ")@" + hashCode();
    }
}
