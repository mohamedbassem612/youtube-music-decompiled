package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjk implements eyw, adic {
    private final /* synthetic */ int $cid;
    private final awmd a;
    private final awmd b;
    private final adjj c;
    private final Map d = new HashMap();

    public adjk(awmd awmdVar, awmd awmdVar2, adjj adjjVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = adjjVar;
    }

    @Override // defpackage.adic
    public final Class a() {
        return this.$cid != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        int i = this.$cid;
        adjj adjjVar = this.c;
        return i != 0 ? adjjVar.a(this, this.a, this.b, this.d) : adjjVar.a(this, this.a, this.b, this.d);
    }

    @Override // defpackage.adic
    public final /* synthetic */ Object d(byte[] bArr) {
        return this.$cid != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.eyw
    public final void c() {
    }

    public adjk(awmd awmdVar, awmd awmdVar2, adjj adjjVar, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = adjjVar;
    }
}
