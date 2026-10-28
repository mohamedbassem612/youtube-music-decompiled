package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class agml extends agiz implements Serializable, Map {
    private static final long serialVersionUID = 3;
    final agmy a;
    final agmy b;
    final ageb c;
    final int d;
    transient ConcurrentMap e;

    public agml(agmy agmyVar, agmy agmyVar2, ageb agebVar, int i, ConcurrentMap concurrentMap) {
        this.a = agmyVar;
        this.b = agmyVar2;
        this.c = agebVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.agja, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.e;
    }

    @Override // defpackage.agiz, defpackage.agja
    protected final /* synthetic */ java.util.Map b() {
        return this.e;
    }

    @Override // defpackage.agiz
    protected final ConcurrentMap c() {
        return this.e;
    }
}
