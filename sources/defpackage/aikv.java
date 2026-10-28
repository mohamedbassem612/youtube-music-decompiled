package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aikv extends aikp implements Set, j$.util.Set, awrp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aikv(Collection collection) {
        super(collection);
        collection.getClass();
    }

    @Override // defpackage.aikp, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
