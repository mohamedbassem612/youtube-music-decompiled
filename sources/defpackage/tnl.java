package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tnl implements tnj {
    private final byte[] a;

    public tnl(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.tnj
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.tnj
    public final aigm b() {
        int i = aigm.l;
        byte[] bArr = this.a;
        return aigm.O(bArr, 0, bArr.length, false);
    }

    @Override // defpackage.tnj
    public final Iterable c() {
        return agke.q(ByteBuffer.wrap(this.a));
    }

    @Override // defpackage.tnj
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.tnj
    public final byte[] e() {
        return this.a;
    }
}
