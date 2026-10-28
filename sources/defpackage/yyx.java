package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yyx implements byd {
    final /* synthetic */ zin a;
    final /* synthetic */ wiu b;
    final /* synthetic */ zcf c;
    final /* synthetic */ yza d;

    public yyx(yza yzaVar, zin zinVar, wiu wiuVar, zcf zcfVar) {
        this.a = zinVar;
        this.b = wiuVar;
        this.c = zcfVar;
        this.d = yzaVar;
    }

    @Override // defpackage.byd
    public final synchronized bye a() {
        zha zhaVar;
        zcf zcfVar;
        zjd zjdVarB;
        Optional optionalOf;
        yza yzaVar;
        zhaVar = zha.c;
        Optional.empty();
        zcfVar = this.c;
        zjdVarB = zcfVar.b.b();
        optionalOf = Optional.of(zcfVar.j());
        yzaVar = this.d;
        return ((yek) this.a.a(new zim(zcfVar.a, yzaVar.j, this.b, zjdVarB, zcfVar.I, false, zhaVar, optionalOf, zcfVar.Z, zcfVar.J), 3)).a;
    }
}
