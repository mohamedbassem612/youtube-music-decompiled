package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyn implements wyl {
    private final Map a = new ConcurrentHashMap();
    private final Map b = new ConcurrentHashMap();
    private final Map c = new ConcurrentHashMap();
    private final Map d = new ConcurrentHashMap();

    static {
        new wym();
    }

    @Override // defpackage.wyl
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.wyl
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.wyl
    public final void c(aijp aijpVar) {
        int[] iArr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            Map map = this.b;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            Integer numValueOf = Integer.valueOf(i3);
            aijp aijpVar2 = (aijp) map.get(numValueOf);
            if (aijpVar2 != null && aijpVar.b - aijpVar2.b >= 86400) {
                this.a.put(numValueOf, 0);
                map.remove(numValueOf);
            }
        }
        int[] iArr2 = {1, 2, 3, 4};
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = iArr2[i4];
            Map map2 = this.d;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            Integer numValueOf2 = Integer.valueOf(i6);
            aijp aijpVar3 = (aijp) map2.get(numValueOf2);
            if (aijpVar3 != null && aijpVar.b - aijpVar3.b >= 86400) {
                this.c.put(numValueOf2, 0);
                map2.remove(numValueOf2);
            }
        }
    }

    @Override // defpackage.wyl
    public final void d() {
        this.b.clear();
        this.a.clear();
        this.d.clear();
        this.c.clear();
    }

    @Override // defpackage.wyl
    public final void e(int i, aijp aijpVar) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i - 1);
        map.put(numValueOf, aijpVar);
        j$.util.Map.EL.merge(this.a, numValueOf, 1, new itl(7));
    }

    @Override // defpackage.wyl
    public final void f(int i, aijp aijpVar) {
        Map map = this.d;
        Integer numValueOf = Integer.valueOf(i - 1);
        map.put(numValueOf, aijpVar);
        j$.util.Map.EL.merge(this.c, numValueOf, 1, new itl(7));
    }
}
