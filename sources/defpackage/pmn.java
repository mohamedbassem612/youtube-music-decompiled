package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pmn {
    public static final agsn a = agsn.h("GnpSdk");

    public static final /* synthetic */ aicw a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (aicw) aihn.parseFrom(aicw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed to parse AndroidPayload proto.");
            return null;
        }
    }
}
