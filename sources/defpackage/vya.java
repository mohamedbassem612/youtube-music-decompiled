package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class vya extends awrb implements awqk {
    public static final vya a = new vya();

    public vya() {
        super(2, aini.class, "parseFrom", "parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protos/experiments/proto/TypedFeatures$Int32ListParam;", 0);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        aigj aigjVar = (aigj) obj;
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
        aigjVar.getClass();
        extensionRegistryLite.getClass();
        return (aini) aihn.parseFrom(aini.a, aigjVar, extensionRegistryLite);
    }
}
