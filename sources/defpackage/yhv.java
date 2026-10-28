package defpackage;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yhv extends yno {
    public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata a;

    public yhv(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
        this.a = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof yhv) && awrc.c(this.a, ((yhv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateFromSabrSegmentMap(metadata=" + this.a + ')';
    }
}
