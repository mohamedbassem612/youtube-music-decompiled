package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adll {
    public final agev a;
    public final agev b;
    public final agev c;
    public final boolean d;

    public adll(akrq akrqVar) {
        this.a = (!akrqVar.c || (akrqVar.b & 8) == 0) ? agdf.a : agev.i(Integer.valueOf((int) akrqVar.f));
        this.b = (akrqVar.b & 4) != 0 ? agev.i(Float.valueOf(akrqVar.e)) : agdf.a;
        this.c = (akrqVar.b & 2) != 0 ? agev.i(Float.valueOf(akrqVar.d)) : agdf.a;
        this.d = akrqVar.g;
    }

    public adll() {
        agdf agdfVar = agdf.a;
        this.a = agdfVar;
        this.b = agdfVar;
        this.c = agdfVar;
        this.d = false;
    }
}
