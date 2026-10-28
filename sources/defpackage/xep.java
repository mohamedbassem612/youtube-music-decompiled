package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xep implements Runnable {
    final /* synthetic */ Function a;
    final /* synthetic */ alou b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ boolean h;
    final /* synthetic */ akku i;
    final /* synthetic */ xeq j;

    public xep(xeq xeqVar, Function function, alou alouVar, long j, long j2, long j3, String str, String str2, boolean z, akku akkuVar) {
        this.a = function;
        this.b = alouVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = akkuVar;
        this.j = xeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        alos alosVarM = xeq.m(this.a, this.b);
        alot alotVarA = alot.a(((alou) alosVarM.instance).c);
        xeq xeqVar = this.j;
        if (xeqVar.l(this.c, alotVarA)) {
            xeqVar.o(this.i, alotVarA, xeq.n(alosVarM, this.d, this.e, this.f, this.g, this.h));
        }
    }
}
