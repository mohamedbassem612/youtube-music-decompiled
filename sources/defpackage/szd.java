package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class szd implements szb {
    private final Random a;
    private final int[] b = new int[szc.values().length];

    public szd(Random random) {
        this.a = random;
    }

    @Override // defpackage.szb
    public final boolean b(float f, szc szcVar) {
        int[] iArr = this.b;
        int iOrdinal = szcVar.ordinal();
        int i = iArr[iOrdinal];
        if (i == 0) {
            i = ((float) this.a.nextInt(1000)) < f * 1000.0f ? 1 : 2;
            iArr[iOrdinal] = i;
        }
        return i == 1;
    }
}
