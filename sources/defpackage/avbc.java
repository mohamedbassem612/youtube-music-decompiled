package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avbc extends avbb {
    private final avbd d;

    public avbc(String str, boolean z, avbd avbdVar) {
        super(str, z);
        ahno.M(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        avbdVar.getClass();
        this.d = avbdVar;
    }

    @Override // defpackage.avbb
    public final Object a(byte[] bArr) {
        return this.d.a(bArr);
    }

    @Override // defpackage.avbb
    public final byte[] b(Object obj) {
        byte[] bArrB = this.d.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
