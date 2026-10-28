package defpackage;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acyk extends PublicKeyVerifier {
    private final zj a;

    public acyk(zj zjVar) {
        this.a = zjVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status initialize(String str, byte[] bArr, byte[] bArr2) {
        return this.a.m(str, bArr, bArr2);
    }

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status verify(byte[] bArr, byte[] bArr2) {
        return this.a.n(bArr, bArr2);
    }
}
