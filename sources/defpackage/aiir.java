package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface aiir extends Cloneable, aiis {
    MessageLite build();

    MessageLite buildPartial();

    /* JADX INFO: renamed from: clone */
    aiir mo53clone();

    aiir mergeFrom(aigj aigjVar);

    aiir mergeFrom(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite);

    aiir mergeFrom(MessageLite messageLite);

    aiir mergeFrom(byte[] bArr);

    aiir mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite);
}
