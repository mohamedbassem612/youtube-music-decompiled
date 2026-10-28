package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class aghm extends aghk implements agpv {
    private static final long serialVersionUID = 430848587173315748L;

    public aghm(Map map) {
        super(map);
    }

    @Override // defpackage.aghk, defpackage.aggz, defpackage.agom
    public /* bridge */ /* synthetic */ Collection c(Object obj) {
        throw null;
    }

    @Override // defpackage.aghk, defpackage.aggz
    public final /* bridge */ /* synthetic */ Collection d(Collection collection) {
        return collection instanceof NavigableSet ? ahng.ah((NavigableSet) collection) : DesugarCollections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // defpackage.aghk, defpackage.aggz
    public final Collection e(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new aggw(this, obj, (NavigableSet) collection, null) : new aggy(this, obj, (SortedSet) collection, null);
    }

    @Override // defpackage.aghk, defpackage.agpv
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ Set c(Object obj) {
        throw null;
    }

    public final SortedSet g(Object obj) {
        return (SortedSet) super.c(obj);
    }

    @Override // defpackage.aggz, defpackage.agom
    public Map n() {
        throw null;
    }
}
