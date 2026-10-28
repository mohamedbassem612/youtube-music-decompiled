package defpackage;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aczy extends PublicKeyVerifier {
    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status initialize(String str, byte[] bArr, byte[] bArr2) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status verify(byte[] bArr, byte[] bArr2) {
        return Status.OK;
    }
}
