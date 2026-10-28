package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agou extends agov implements aglz {
    public agou(aglz aglzVar, agof agofVar) {
        super(aglzVar, agofVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.agov
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a(Object obj, Collection collection) {
        return aguu.u((List) collection, new afiq(this, obj, 2));
    }

    @Override // defpackage.agov, defpackage.agom
    public final /* bridge */ /* synthetic */ Collection c(Object obj) {
        return a(obj, this.a.c(obj));
    }

    @Override // defpackage.aglz
    /* JADX INFO: renamed from: f */
    public final List c(Object obj) {
        throw null;
    }

    @Override // defpackage.aglz
    public final List g(Object obj) {
        throw null;
    }
}
