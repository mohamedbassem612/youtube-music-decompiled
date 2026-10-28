package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ciy {
    public final bse c;
    public final agke d;
    public final long e;
    public final long f;
    public final List g;
    public final civ h;

    public ciy(bse bseVar, List list, cje cjeVar, List list2) {
        ahno.F(!list.isEmpty());
        this.c = bseVar;
        this.d = agke.n(list);
        this.g = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.h = cjeVar.j(this);
        this.e = cjeVar.k;
        this.f = bwp.C(cjeVar.l, 1000000L, cjeVar.k);
    }

    public abstract cia k();

    public abstract civ l();

    public abstract String m();
}
