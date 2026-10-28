package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcz implements dbn {
    private final bwb a = new bwb();

    @Override // defpackage.dbn
    public final int a() {
        return 2;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        bus busVarA;
        bwb bwbVar = this.a;
        bwbVar.N(bArr, i2 + i);
        bwbVar.P(i);
        ArrayList arrayList = new ArrayList();
        while (bwbVar.d() > 0) {
            ahno.G(bwbVar.d() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i3 = bwbVar.i() - 8;
            if (bwbVar.i() == 1987343459) {
                CharSequence charSequenceA = null;
                bur burVarA = null;
                while (i3 > 0) {
                    ahno.G(i3 >= 8, "Incomplete vtt cue box header found.");
                    int i4 = bwbVar.i();
                    int i5 = bwbVar.i();
                    int i6 = i3 - 8;
                    int i7 = i4 - 8;
                    String strM = bwp.M(bwbVar.b, bwbVar.c, i7);
                    bwbVar.Q(i7);
                    if (i5 == 1937011815) {
                        Pattern pattern = ddg.a;
                        ddf ddfVar = new ddf();
                        ddg.b(strM, ddfVar);
                        burVarA = ddfVar.a();
                    } else if (i5 == 1885436268) {
                        charSequenceA = ddg.a(null, strM.trim(), Collections.EMPTY_LIST);
                    }
                    i3 = i6 - i7;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (burVarA != null) {
                    burVarA.d(charSequenceA);
                    busVarA = burVarA.a();
                } else {
                    Pattern pattern2 = ddg.a;
                    ddf ddfVar2 = new ddf();
                    ddfVar2.c = charSequenceA;
                    busVarA = ddfVar2.a().a();
                }
                arrayList.add(busVarA);
            } else {
                bwbVar.Q(i3);
            }
        }
        bvhVar.a(new abnx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
