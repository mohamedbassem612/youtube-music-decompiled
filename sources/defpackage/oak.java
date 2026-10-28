package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class oak implements auyu {
    private static final nrj b = new nrj();
    private final avkv a;

    public oak(avkv avkvVar) {
        this.a = avkvVar;
    }

    @Override // defpackage.auyu
    public final auyt a(avbh avbhVar, auyq auyqVar, auyr auyrVar) {
        nrj nrjVar = b;
        auyp auypVar = avcw.c;
        Collection collection = (Collection) auyqVar.d(auypVar);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        avkv avkvVar = this.a;
        arrayList.add(nrjVar);
        return avkvVar.a(avbhVar, auyqVar.c(auypVar, DesugarCollections.unmodifiableList(arrayList)), auyrVar);
    }
}
