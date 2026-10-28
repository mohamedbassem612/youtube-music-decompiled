package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aift implements aiix {
    private static final ExtensionRegistryLite a = ExtensionRegistryLite.a;

    private static final void k(MessageLite messageLite) throws aiik {
        if (messageLite != null && !messageLite.isInitialized()) {
            throw ((aifs) messageLite).newUninitializedMessageException().a();
        }
    }

    @Override // defpackage.aiix
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessageLite h(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return i(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // defpackage.aiix
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MessageLite i(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        MessageLite messageLiteC = c(bArr, i, i2, extensionRegistryLite);
        k(messageLiteC);
        return messageLiteC;
    }

    public MessageLite c(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }

    @Override // defpackage.aiix
    public final /* bridge */ /* synthetic */ Object d(byte[] bArr) {
        return h(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.aiix
    public final /* bridge */ /* synthetic */ Object e(aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aigm aigmVarG = aigjVar.g();
        ?? J = j(aigmVarG, extensionRegistryLite);
        aigmVarG.z(0);
        k(J);
        return J;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.aiix
    public final /* bridge */ /* synthetic */ Object f(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        ?? J = j(aigmVar, extensionRegistryLite);
        k(J);
        return J;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.aiix
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aigm aigmVarN = aigm.N(inputStream, SemanticState.Obscured);
        ?? J = j(aigmVarN, extensionRegistryLite);
        aigmVarN.z(0);
        k(J);
        return J;
    }
}
