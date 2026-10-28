package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kif extends kia {
    public kim g;
    public int h;

    public final kii b() {
        String str = this.e;
        kja kjaVar = this.d;
        kim kimVar = this.g;
        int iBc = 0;
        if (kimVar != null && (kimVar.b & 4) != 0 && (iBc = a.bc(kimVar.e)) == 0) {
            iBc = 1;
        }
        Context context = this.a;
        int i = iBc;
        kij kijVar = this.c;
        int i2 = this.h;
        kkd kkdVar = null;
        if (kimVar != 0 && i2 != 0) {
            agjz agjzVar = new agjz(4);
            if ((kimVar.b & 2) != 0) {
                kil kilVar = kimVar.d;
                if (kilVar == null) {
                    kilVar = kil.a;
                }
                agjzVar.h(new kkg(i2, kilVar));
            }
            if ((kimVar.b & 1) != 0) {
                kik kikVar = kimVar.c;
                if (kikVar == null) {
                    kikVar = kik.a;
                }
                agjzVar.h(new kkf(i2, kikVar, new kkk(context)));
            }
            agke agkeVarG = agjzVar.g();
            if (!agkeVarG.isEmpty()) {
                kkdVar = new kkd(agkeVarG);
            }
        }
        return new kii(context, this.b, str, kjaVar, i, kijVar, null, kkdVar, this.f);
    }
}
