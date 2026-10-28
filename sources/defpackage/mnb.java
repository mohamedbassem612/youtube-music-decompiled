package defpackage;

import com.google.android.libraries.elements.interfaces.FetcherFactory;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mnb extends FetcherFactory {
    final /* synthetic */ nsn a;
    final /* synthetic */ mnc b;

    public mnb(mnc mncVar, nsn nsnVar) {
        this.a = nsnVar;
        this.b = mncVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FetcherFactory
    public final StatusOr create(int i, byte[] bArr) {
        try {
            asng asngVar = (asng) aihn.parseFrom(asng.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            nsn nsnVar = this.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(nsnVar.a());
            asngVar.c(aihlVarCheckIsLite);
            Object objK = asngVar.j.k(aihlVarCheckIsLite.d);
            if (objK == null) {
                Object obj = aihlVarCheckIsLite.b;
            } else {
                aihlVarCheckIsLite.c(objK);
            }
            return StatusOr.fromValue(nsnVar.b());
        } catch (aiik e) {
            this.b.a.f(aslh.LOG_TYPE_CONFIGURATION_ERROR, nsl.a, e, "Error parsing Fetcher configuration", new Object[0]);
            return StatusOr.fromStatus(Status.b(e));
        }
    }
}
