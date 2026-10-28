package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adhc implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ adhc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            weh wehVar = ((weo) ((agew) obj).a).c;
            wehVar.getClass();
            return wehVar;
        }
        boolean z = true;
        if (i == 1) {
            aksj aksjVar = ((alik) obj).B;
            return aksjVar == null ? aksj.a : aksjVar;
        }
        if (i == 2) {
            return ((akzz) obj).c;
        }
        if (i == 3) {
            return Boolean.valueOf(((rkp) obj).a());
        }
        if (i == 4) {
            return ((aeoy) obj).b;
        }
        if (i != 5) {
            return (Boolean) ((Optional) obj).get();
        }
        long jLongValue = ((Long) obj).longValue() & 4294967295L;
        int i2 = trd.x;
        int i3 = (int) jLongValue;
        int i4 = (i3 >> 8) & 15;
        int i5 = (i3 >> 12) & 7;
        int i6 = i3 & 15;
        if (trd.q(i5)) {
            return Optional.of(Boolean.valueOf(i4 == 1 && i6 == 3 && i5 == 1));
        }
        boolean z2 = i4 == 1 || !trd.q(i4);
        if (i6 != 3 && trd.q(i6)) {
            z = false;
        }
        return (z2 && z) ? Optional.empty() : Optional.of(Boolean.FALSE);
    }
}
