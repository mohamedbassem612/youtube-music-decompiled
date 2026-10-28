package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmg extends fgv {
    final mmi a;
    public final BitSet d;
    private final String[] e;

    public mmg(fhd fhdVar, mmi mmiVar) {
        super(fhdVar, mmiVar);
        this.e = new String[]{"children", "commandResolver", "conversionContext", "decoratorManager", "enableAndroidScrollableContainerInitialState", "enableScrollableContainerCommandEventDataDecorator", "flexDirection", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollableContainerType"};
        BitSet bitSet = new BitSet(12);
        this.d = bitSet;
        this.a = mmiVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(12, this.d, this.e);
        return this.a;
    }

    public final void b(int i) {
        this.a.t = i;
    }

    public final void c(int i) {
        this.a.u = i;
    }

    public final void d(boolean z) {
        this.a.f = z;
        this.d.set(4);
    }

    public final void e(int i) {
        this.a.v = i;
    }

    public final void f(int i) {
        this.a.w = i;
    }

    public final void g(int i) {
        this.a.y = i;
        this.d.set(6);
    }
}
