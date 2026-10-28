package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yon implements Comparable {
    final List a;
    final wgs b;
    aipc c;

    public yon(wgs wgsVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = wgsVar;
        this.c = wgsVar.q();
        arrayList.add(Integer.valueOf(wgsVar.e()));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iD;
        int iD2;
        wgs wgsVar = ((yon) obj).b;
        int iD3 = wgsVar.d();
        wgs wgsVar2 = this.b;
        if (iD3 == wgsVar2.d()) {
            iD = wgsVar.g;
            iD2 = wgsVar2.g;
        } else {
            iD = wgsVar.d();
            iD2 = wgsVar2.d();
        }
        return iD - iD2;
    }
}
