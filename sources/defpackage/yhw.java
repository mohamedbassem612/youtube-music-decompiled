package defpackage;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yhw extends yno {
    public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata a;

    public yhw(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
        this.a = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof yhw) && awrc.c(this.a, ((yhw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DirectReadFromCache(metadata=" + this.a + ')';
    }
}
