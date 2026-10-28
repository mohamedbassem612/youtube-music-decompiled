package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class miq extends fgv {
    final mis a;
    private final String[] d;
    private final BitSet e;

    public miq(fhd fhdVar, mis misVar) {
        super(fhdVar, misVar);
        this.d = new String[]{"backgroundScheduler", "conversionContext", "crashOnTemplateResolutionError", "debuggerClient", "debuggerStatus", "devServerEnabled", "disableDogfoodCrashOnElementsError", "disposeSharedComponentOnComponentSpecDetach", "disposeSubscriptionOnRematerialization", "elementSource", "logger", "templatePerformanceLogger", "typeAndProperties"};
        BitSet bitSet = new BitSet(13);
        this.e = bitSet;
        this.a = misVar;
        bitSet.clear();
    }

    public final void Z(avlr avlrVar) {
        this.a.s = avlrVar;
        this.e.set(9);
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(13, this.e, this.d);
        return this.a;
    }

    public final void aa(nuc nucVar) {
        this.a.t = nucVar;
        this.e.set(10);
    }

    public final void ab(nxa nxaVar) {
        this.a.u = nxaVar;
        this.e.set(11);
    }

    public final void ac(mjb mjbVar) {
        this.a.v = mjbVar;
        this.e.set(12);
    }

    public final void b(avmb avmbVar) {
        this.a.a = avmbVar;
        this.e.set(0);
    }

    public final void c(nsl nslVar) {
        this.a.b = nslVar;
        this.e.set(1);
    }

    public final void d(boolean z) {
        this.a.c = z;
        this.e.set(2);
    }

    public final void e(awmd awmdVar) {
        this.a.d = awmdVar;
        this.e.set(3);
    }

    public final void f(nsu nsuVar) {
        this.a.e = nsuVar;
        this.e.set(4);
    }

    public final void g(boolean z) {
        this.a.f = z;
        this.e.set(5);
    }

    public final void h(boolean z) {
        this.a.g = z;
        this.e.set(6);
    }

    public final void i(boolean z) {
        this.a.q = z;
        this.e.set(7);
    }

    public final void j(boolean z) {
        this.a.r = z;
        this.e.set(8);
    }
}
