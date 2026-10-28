package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cun {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static aerm a(byte[] bArr) {
        return b(new dqp(bArr, (byte[]) null), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        if (r13 != 3) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aerm b(defpackage.dqp r13, boolean r14) throws defpackage.bsz {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cun.b(dqp, boolean):aerm");
    }

    private static int c(dqp dqpVar) {
        int i = dqpVar.i(5);
        return i == 31 ? dqpVar.i(6) + 32 : i;
    }

    private static int d(dqp dqpVar) throws bsz {
        int i = dqpVar.i(4);
        if (i == 15) {
            if (dqpVar.f() >= 24) {
                return dqpVar.i(24);
            }
            throw new bsz("AAC header insufficient data", null, true, 1);
        }
        if (i < 13) {
            return b[i];
        }
        throw new bsz("AAC header wrong Sampling Frequency Index", null, true, 1);
    }
}
