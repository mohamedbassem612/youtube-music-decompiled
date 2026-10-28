package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yor implements Comparable {
    public final List a;
    public wgs b;
    public aipc c;

    public yor(wgs wgsVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = wgsVar;
        arrayList.add(Integer.valueOf(wgsVar.e()));
        this.c = wgsVar.q();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iD;
        int iD2;
        yor yorVar = (yor) obj;
        if (yorVar.b.d() == this.b.d()) {
            iD = yorVar.b.g;
            iD2 = this.b.g;
        } else {
            iD = yorVar.b.d();
            iD2 = this.b.d();
        }
        return iD - iD2;
    }
}
