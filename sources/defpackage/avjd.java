package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjd {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    public final int e;
    final avjf f;
    final boolean g;
    final boolean h;

    public avjd(List list, Collection collection, Collection collection2, avjf avjfVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = avjfVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        ahno.P(!z2 || list == null, "passThrough should imply buffer is null");
        ahno.P((z2 && avjfVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        ahno.P(!z2 || (collection.size() == 1 && collection.contains(avjfVar)) || (collection.size() == 0 && avjfVar.b), "passThrough should imply winningSubstream is drained");
        ahno.P((z && avjfVar == null) ? false : true, "cancelled should imply committed");
    }

    final avjd a(avjf avjfVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        ahno.P(!z, "hedging frozen");
        avjf avjfVar2 = this.f;
        ahno.P(avjfVar2 == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(avjfVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(avjfVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new avjd(this.b, this.c, collectionUnmodifiableCollection, avjfVar2, this.g, this.a, z, this.e + 1);
    }

    final avjd b() {
        return !this.h ? new avjd(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e) : this;
    }

    final avjd c(avjf avjfVar) {
        ahno.P(!this.a, "Already passThrough");
        boolean z = avjfVar.b;
        Collection collectionUnmodifiableCollection = this.c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(avjfVar);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(avjfVar);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        avjf avjfVar2 = this.f;
        boolean z2 = avjfVar2 != null;
        List list = this.b;
        if (z2) {
            ahno.P(avjfVar2 == avjfVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new avjd(list, collection, this.d, avjfVar2, this.g, z2, this.h, this.e);
    }
}
