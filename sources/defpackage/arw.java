package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arw {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public arw(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(aqu aquVar, int i) {
        int iO;
        int iO2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        ard ardVar = ((ard) arrayList.get(0)).U;
        aquVar.k();
        ardVar.b(aquVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ard) arrayList.get(i2)).b(aquVar, false);
        }
        if (i == 0) {
            are areVar = (are) ardVar;
            if (areVar.at > 0) {
                yp.b(areVar, aquVar, arrayList, 0);
            }
        }
        if (i == 1) {
            are areVar2 = (are) ardVar;
            if (areVar2.au > 0) {
                yp.b(areVar2, aquVar, arrayList, 1);
            }
        }
        try {
            aquVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + '\n' + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new zi((ard) arrayList.get(i3)));
        }
        if (i == 0) {
            are areVar3 = (are) ardVar;
            iO = aqu.o(areVar3.J);
            iO2 = aqu.o(areVar3.L);
            aquVar.k();
        } else {
            are areVar4 = (are) ardVar;
            iO = aqu.o(areVar4.K);
            iO2 = aqu.o(areVar4.M);
            aquVar.k();
        }
        return iO2 - iO;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                arw arwVar = (arw) arrayList.get(i);
                if (this.f == arwVar.c) {
                    c(this.d, arwVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, arw arwVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ard ardVar = (ard) arrayList.get(i2);
            arwVar.d(ardVar);
            if (i == 0) {
                ardVar.ao = arwVar.c;
            } else {
                ardVar.ap = arwVar.c;
            }
        }
        this.f = arwVar.c;
    }

    public final boolean d(ard ardVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(ardVar)) {
            return false;
        }
        arrayList.add(ardVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = (i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both") + " [" + this.c + "] <";
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str = str + ' ' + ((ard) arrayList.get(i2)).ai;
        }
        return str.concat(" >");
    }
}
