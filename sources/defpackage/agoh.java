package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agoh extends AbstractMap {
    public abstract Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        aguu.E(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new agog(this);
    }
}
