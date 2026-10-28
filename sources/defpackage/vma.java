package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vma extends fky {

    @fmt(a = 13)
    vmd a;

    @fmt(a = 3)
    boolean b;

    @fmt(a = 13)
    vmo c;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        switch (aeroVar.a) {
            case Integer.MIN_VALUE:
                this.a = (vmd) ((Object[]) obj)[0];
                break;
            case -2147483647:
                this.b = ((Boolean) ((Object[]) obj)[0]).booleanValue();
                break;
            case -2147483646:
                this.c = (vmo) ((Object[]) obj)[0];
                break;
        }
    }
}
