package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfc {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(cvj cvjVar) {
        bwb bwbVar = new bwb(8);
        int i = yvt.b(cvjVar, bwbVar).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((cvb) cvjVar).n(bwbVar.b, 0, 4, false);
        bwbVar.P(0);
        int i2 = bwbVar.i();
        if (i2 == 1463899717) {
            return true;
        }
        bvx.c("WavHeaderReader", a.bR(i2, "Unsupported form type: "));
        return false;
    }

    public static yvt b(int i, cvj cvjVar, bwb bwbVar) throws bsz {
        yvt yvtVarB = yvt.b(cvjVar, bwbVar);
        while (true) {
            int i2 = yvtVarB.b;
            if (i2 == i) {
                return yvtVarB;
            }
            bvx.e("WavHeaderReader", a.bR(i2, "Ignoring unknown WAV chunk: "));
            long j = yvtVarB.a;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw new bsz(a.bR(i2, "Chunk is too large (~2GB+) to skip; id: "), null, false, 1);
            }
            ((cvb) cvjVar).p((int) j2, false);
            yvtVarB = yvt.b(cvjVar, bwbVar);
        }
    }
}
