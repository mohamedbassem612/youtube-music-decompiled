package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wbk {
    protected abstract byte[] a(byte[] bArr, wjr wjrVar);

    public final wbi b(byte[] bArr, wjr wjrVar) {
        byte[] bArrA = a(bArr, wjrVar);
        return bArrA != null ? tzk.M(new waz(bArrA)) : waw.a;
    }
}
