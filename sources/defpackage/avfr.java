package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfr implements avab {
    private final /* synthetic */ int $cid;

    public avfr(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avbd
    public final /* synthetic */ Object a(byte[] bArr) {
        if (this.$cid != 0) {
            return bArr;
        }
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, avac.a)));
        }
        return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    @Override // defpackage.avbd
    public final /* synthetic */ byte[] b(Object obj) {
        if (this.$cid != 0) {
            return (byte[]) obj;
        }
        throw new UnsupportedOperationException();
    }
}
