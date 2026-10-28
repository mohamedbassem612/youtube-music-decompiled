package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aiky implements Comparator, Serializable {
    INSTANCE;

    public static final int a(aijp aijpVar, aijp aijpVar2) {
        aikz.d(aijpVar);
        aikz.d(aijpVar2);
        int iCompare = Long.compare(aijpVar.b, aijpVar2.b);
        return iCompare == 0 ? Integer.compare(aijpVar.c, aijpVar2.c) : iCompare;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((aijp) obj, (aijp) obj2);
    }
}
