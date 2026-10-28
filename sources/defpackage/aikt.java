package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aikt extends aikp implements Set, j$.util.Set, awrp {
    private final Set a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aikt(Set set) {
        super(set);
        set.getClass();
        this.a = set;
    }

    @Override // defpackage.aikp, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // defpackage.aikp, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new aiks(this.a.iterator());
    }

    @Override // defpackage.aikp, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
