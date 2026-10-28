package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ain extends akc implements ahz, aia {
    private aim a;

    public ain(int i) {
        ajw ajwVarA = aka.a();
        aim aimVar = new aim(ajwVarA.m(), i);
        if (!(ajwVarA instanceof aju)) {
            aimVar.c = new aim(1L, i);
        }
        this.a = aimVar;
    }

    @Override // defpackage.ahz, defpackage.ahu
    public final int a() {
        return ((aim) aka.d(this.a, this)).a;
    }

    @Override // defpackage.ahz
    public final /* synthetic */ Integer b() {
        return Integer.valueOf(a());
    }

    @Override // defpackage.ahz
    public final void c(int i) {
        ajw ajwVarA;
        aim aimVar = (aim) aka.b(this.a, this);
        if (aimVar.a != i) {
            aim aimVar2 = this.a;
            synchronized (aka.a) {
                ajwVarA = aka.a();
                ((aim) aka.c(aimVar2, this, ajwVarA, aimVar)).a = i;
            }
            aka.e(ajwVarA, this);
        }
    }

    @Override // defpackage.ahz
    public final /* synthetic */ void d(int i) {
        c(i);
    }

    @Override // defpackage.ais
    public final /* synthetic */ Object e() {
        return b();
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        d(((Number) obj).intValue());
    }

    @Override // defpackage.akb
    public final akd g() {
        return this.a;
    }

    @Override // defpackage.akb
    public final void h(akd akdVar) {
        this.a = (aim) akdVar;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((aim) aka.b(this.a, this)).a + ")@" + hashCode();
    }
}
