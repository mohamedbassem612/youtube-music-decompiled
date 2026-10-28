package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aihg extends aift {
    public static final /* synthetic */ int b = 0;
    public final aihn a;

    public aihg(aihn aihnVar) {
        this.a = aihnVar;
    }

    @Override // defpackage.aift
    public final /* bridge */ /* synthetic */ MessageLite c(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
        return aihn.parsePartialFrom(this.a, bArr, i, i2, extensionRegistryLite);
    }

    @Override // defpackage.aiix
    public final /* bridge */ /* synthetic */ Object j(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) {
        return aihn.parsePartialFrom(this.a, aigmVar, extensionRegistryLite);
    }
}
