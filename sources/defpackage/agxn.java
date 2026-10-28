package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
enum agxn implements agxo {
    INSTANCE;

    @Override // defpackage.agxo
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() != 0) {
            throw null;
        }
        return ((((long) bArr[i + 7]) & 255) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
    }
}
