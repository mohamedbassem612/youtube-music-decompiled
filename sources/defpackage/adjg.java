package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adjg extends tmn {
    private final adic l;
    private final eug m;
    private final tnr n;
    private final Map o;
    private final Optional p;
    private final mbc q;
    private final adji r;
    private final boolean s;
    private final int t;

    public adjg(adic adicVar, String str, eug eugVar, tnr tnrVar, Map map, Optional optional, mbc mbcVar, adji adjiVar, boolean z, int i) {
        super(1, str, null);
        this.l = adicVar;
        this.m = eugVar;
        this.n = tnrVar;
        this.o = map;
        this.p = optional;
        this.q = mbcVar;
        this.r = adjiVar;
        this.s = z;
        this.t = i;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        int iA = tnmVar.a();
        boolean z = tnmVar.g;
        Map map = tnmVar.e;
        this.r.k(this.a, iA, z, map != null ? (String) map.get("content-type") : null);
        return new tml(new tnw(tnmVar.e(), tym.aG(tnmVar, this.q, this.t), null, false));
    }

    @Override // defpackage.tns
    public final Class ab() {
        return byte[].class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (this.s) {
            return;
        }
        this.m.b(this.l.d(bArr));
    }

    @Override // defpackage.tmn, defpackage.tns
    public final tnr af() {
        return this.n;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        return this.o;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final toe i(toe toeVar) {
        tnm tnmVar = toeVar.b;
        this.r.i(this.a, tnmVar != null ? tnmVar.d : 0);
        if (!this.s) {
            this.m.e(toeVar);
        }
        return toeVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zwa] */
    @Override // defpackage.tmn, defpackage.tns
    public final String q() {
        Optional optional = this.p;
        boolean zIsPresent = optional.isPresent();
        String str = this.a;
        if (!zIsPresent) {
            return str;
        }
        return str + '|' + optional.get().i();
    }
}
