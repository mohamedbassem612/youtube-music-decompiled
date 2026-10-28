package defpackage;

import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class crv {
    public static final /* synthetic */ int e = 0;
    private static final Comparator f = Comparator$CC.comparingInt(new crt(0));
    private static final Comparator g = new cru(0);
    public int c;
    public int d;
    private final int h;
    private int i;
    private final duk[] j = new duk[5];
    public final ArrayList a = new ArrayList();
    public int b = -1;

    public crv(int i) {
        this.h = i;
    }

    public final float a(float f2) {
        int i = 0;
        if (this.b != 0) {
            List.EL.sort(this.a, g);
            this.b = 0;
        }
        float f3 = f2 * this.d;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((duk) arrayList.get(arrayList.size() - 1)).b;
            }
            duk dukVar = (duk) arrayList.get(i);
            i2 += dukVar.a;
            if (i2 >= f3) {
                return dukVar.b;
            }
            i++;
        }
    }

    public final void b(int i, float f2) {
        duk dukVar;
        if (this.b != 1) {
            List.EL.sort(this.a, f);
            this.b = 1;
        }
        int i2 = this.i;
        if (i2 > 0) {
            duk[] dukVarArr = this.j;
            int i3 = i2 - 1;
            this.i = i3;
            dukVar = dukVarArr[i3];
        } else {
            dukVar = new duk();
        }
        int i4 = this.c;
        this.c = i4 + 1;
        dukVar.c = i4;
        dukVar.a = i;
        dukVar.b = f2;
        ArrayList arrayList = this.a;
        arrayList.add(dukVar);
        this.d += i;
        while (true) {
            int i5 = this.d;
            int i6 = this.h;
            if (i5 <= i6) {
                return;
            }
            duk dukVar2 = (duk) arrayList.get(0);
            int i7 = dukVar2.a;
            int i8 = i5 - i6;
            if (i7 <= i8) {
                this.d -= i7;
                arrayList.remove(0);
                int i9 = this.i;
                if (i9 < 5) {
                    duk[] dukVarArr2 = this.j;
                    this.i = i9 + 1;
                    dukVarArr2[i9] = dukVar2;
                }
            } else {
                dukVar2.a = i7 - i8;
                this.d -= i8;
            }
        }
    }
}
