package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class nrd {
    public nrd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, rmp rmpVar) {
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        rmpVar.getClass();
    }

    public static /* synthetic */ nzo a() {
        Thread thread = Looper.getMainLooper().getThread();
        Thread threadCurrentThread = Thread.currentThread();
        return new nzo(thread == threadCurrentThread, Thread.currentThread().getId());
    }

    public static void b(sol solVar) {
        xpd xpdVarA = solVar.c().a();
        xpdVarA.g(false);
        solVar.f = xpdVarA.f();
    }

    public static void c(sol solVar, abnr abnrVar, ajnf ajnfVar, boolean z, boolean z2) {
        if (ajnfVar != null) {
            xpd xpdVarB = sop.b();
            xpdVarB.k(ajnfVar);
            xpdVarB.i(true);
            xpdVarB.g(z);
            xpdVarB.h(z2);
            xpdVarB.j(abnrVar == abnr.FULLSCREEN);
            solVar.f = xpdVarB.f();
        }
    }

    public static boolean d(sol solVar, abnr abnrVar) {
        boolean z = solVar.c().a;
        boolean z2 = abnrVar == abnr.FULLSCREEN;
        if (z == z2) {
            return false;
        }
        xpd xpdVarA = solVar.c().a();
        xpdVarA.j(z2);
        solVar.f = xpdVarA.f();
        return true;
    }

    public static void e(sol solVar, sgn sgnVar) {
        son sonVarB = soo.b();
        sonVarB.b(sgnVar);
        solVar.c = sonVarB.a();
    }

    public static void f(sol solVar, int i, int i2, boolean z) {
        son sonVarA = solVar.b().a();
        int iMax = i - i2;
        if (z) {
            iMax = Math.max(0, iMax);
        }
        sonVarA.d(iMax);
        solVar.c = sonVarA.a();
    }

    public static void g(sol solVar) {
        son sonVarA = solVar.b().a();
        sonVarA.c(true);
        sonVarA.d(-2);
        solVar.c = sonVarA.a();
    }

    public nrd(byte[] bArr) {
    }

    public nrd() {
    }
}
