package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class arh extends ard {
    public ard[] ar = new ard[4];
    public int as = 0;

    public final void T(ArrayList arrayList, int i, arw arwVar) {
        for (int i2 = 0; i2 < this.as; i2++) {
            arwVar.d(this.ar[i2]);
        }
        for (int i3 = 0; i3 < this.as; i3++) {
            zi.c(this.ar[i3], i, arrayList, arwVar);
        }
    }
}
