package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface agow extends Collection {
    int a(Object obj);

    @Override // java.util.Collection, defpackage.agow
    boolean add(Object obj);

    int c(Object obj, int i);

    @Override // java.util.Collection, defpackage.agow
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    void f(Object obj, int i);

    boolean h(Object obj, int i);

    Set i();

    @Override // java.util.Collection, java.lang.Iterable, defpackage.agow
    Iterator iterator();

    Set j();

    @Override // java.util.Collection, defpackage.agow
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.agow
    int size();
}
