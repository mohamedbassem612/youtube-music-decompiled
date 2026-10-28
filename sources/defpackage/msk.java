package defpackage;

import java.util.BitSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msk extends fgv {
    public final msm a;
    private final String[] d;
    private final BitSet e;

    public msk(fhd fhdVar, msm msmVar) {
        super(fhdVar, msmVar);
        this.d = new String[]{"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
        BitSet bitSet = new BitSet(7);
        this.e = bitSet;
        this.a = msmVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final msm a() {
        hmy.c(7, this.e, this.d);
        return this.a;
    }

    public final void c(nry nryVar) {
        this.a.b = nryVar;
        this.e.set(0);
    }

    public final void d(nsl nslVar) {
        this.a.c = nslVar;
        this.e.set(1);
    }

    public final void e(nso nsoVar) {
        this.a.d = nsoVar;
    }

    public final void f(nte nteVar) {
        this.a.f = nteVar;
        this.e.set(2);
    }

    public final void g(nuc nucVar) {
        this.a.t = nucVar;
        this.e.set(3);
    }

    public final void h(Map map) {
        this.a.y = map;
        this.e.set(4);
    }

    public final void i(ner nerVar) {
        this.a.z = nerVar;
        this.e.set(5);
    }

    public final void j(nxl nxlVar) {
        this.a.A = nxlVar;
        this.e.set(6);
    }
}
