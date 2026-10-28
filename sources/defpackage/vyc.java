package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class vyc extends awrb implements awqk {
    public static final vyc a = new vyc();

    public vyc() {
        super(2, ainj.class, "parseFrom", "parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protos/experiments/proto/TypedFeatures$Int64ListParam;", 0);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        aigj aigjVar = (aigj) obj;
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
        aigjVar.getClass();
        extensionRegistryLite.getClass();
        return (ainj) aihn.parseFrom(ainj.a, aigjVar, extensionRegistryLite);
    }
}
