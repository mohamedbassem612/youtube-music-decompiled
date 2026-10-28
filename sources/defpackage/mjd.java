package defpackage;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjd extends fgv {
    public final mje a;
    private final String[] d;
    private final BitSet e;

    public mjd(fhd fhdVar, mje mjeVar) {
        super(fhdVar, mjeVar);
        this.d = new String[]{"children", "flexDirection"};
        BitSet bitSet = new BitSet(2);
        this.e = bitSet;
        this.a = mjeVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mje a() {
        hmy.c(2, this.e, this.d);
        return this.a;
    }

    public final void c(int i) {
        this.a.w = i;
    }

    public final void d(int i) {
        this.a.x = i;
    }

    public final void e(List list) {
        this.a.a = list;
        this.e.set(0);
    }

    public final void f(int i) {
        this.a.y = i;
    }

    public final void g(String str) {
        this.a.q = str;
    }

    public final void h(int i) {
        this.a.z = i;
    }

    public final void i(int i) {
        this.a.A = i;
        this.e.set(1);
    }
}
