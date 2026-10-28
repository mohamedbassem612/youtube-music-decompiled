package j$.lang;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.y0;
import j$.util.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof a) {
            ((a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        consumer.getClass();
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Spliterator spliterator(Iterable iterable) {
        Spliterator y0Var;
        if (iterable instanceof a) {
            return ((a) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            y0Var = new z(sortedSet, sortedSet);
        } else {
            if (iterable instanceof Set) {
                return Spliterators.spliterator((Set) iterable, 1);
            }
            if (iterable instanceof List) {
                return j$.util.List.CC.$default$spliterator((List) iterable);
            }
            if (iterable instanceof Collection) {
                return j$.util.Collection.CC.$default$spliterator((Collection) iterable);
            }
            Iterator it = iterable.iterator();
            it.getClass();
            y0Var = new y0(it);
        }
        return y0Var;
    }
}
