package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vye extends awrb implements awqk {
    public static final vye a = new vye();

    public vye() {
        super(2, aink.class, "parseFrom", "parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protos/experiments/proto/TypedFeatures$StringListParam;", 0);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        aigj aigjVar = (aigj) obj;
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
        aigjVar.getClass();
        extensionRegistryLite.getClass();
        return (aink) aihn.parseFrom(aink.a, aigjVar, extensionRegistryLite);
    }
}
