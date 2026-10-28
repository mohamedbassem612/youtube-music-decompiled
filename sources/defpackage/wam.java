package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.SecurityVerifier;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wam extends SecurityVerifier {
    private final afip a;

    public wam(afip afipVar) {
        this.a = afipVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.SecurityVerifier
    public final Status verify(ResourceEntry resourceEntry) {
        return this.a.ab(resourceEntry.getResourceMetadata().getResourceIdentifier()) ? Status.OK : Status.d;
    }

    @Override // com.google.android.libraries.elements.interfaces.SecurityVerifier
    public final Status verifySignature(String str, byte[] bArr, byte[] bArr2) {
        return this.a.ab(str) ? Status.OK : Status.d;
    }
}
