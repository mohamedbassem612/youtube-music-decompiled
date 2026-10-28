package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agge extends aggz implements aglz {
    private static final long serialVersionUID = 6588350623831699109L;

    public agge(Map map) {
        super(map);
    }

    @Override // defpackage.aggz
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.aggz
    public final /* synthetic */ Collection b() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.aggz
    public final Collection d(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // defpackage.aggz
    public final Collection e(Object obj, Collection collection) {
        return m(obj, (List) collection, null);
    }

    @Override // defpackage.aggz, defpackage.agom
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List c(Object obj) {
        return (List) super.c(obj);
    }

    @Override // defpackage.aglz
    public final List g(Object obj) {
        Collection collectionD;
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            collectionD = b();
        } else {
            Collection collectionA = a();
            collectionA.addAll(collection);
            this.b -= collection.size();
            collection.clear();
            collectionD = d(collectionA);
        }
        return (List) collectionD;
    }
}
