package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aumz implements Iterable {
    public final Set a = new HashSet();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aumy(this);
    }
}
