package defpackage;

import com.google.android.libraries.youtube.composition.api.C2paEmbedFileType;
import com.google.android.libraries.youtube.composition.api.TimestampOption;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import com.google.protos.youtube.client.composition.runtime.api.ClientDescriptorProto$ClientDescriptor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uha {
    public final CompositionProto$Composition a;
    public final String b;
    public final C2paEmbedFileType c;
    public final TimestampOption d;
    public final ClientDescriptorProto$ClientDescriptor e;
    public final boolean f;

    public uha(CompositionProto$Composition compositionProto$Composition, String str, C2paEmbedFileType c2paEmbedFileType, TimestampOption timestampOption, ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor, boolean z) {
        timestampOption.getClass();
        this.a = compositionProto$Composition;
        this.b = str;
        this.c = c2paEmbedFileType;
        this.d = timestampOption;
        this.e = clientDescriptorProto$ClientDescriptor;
        this.f = z;
        if (awrc.v(str)) {
            throw new IllegalArgumentException("filePath must not be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uha) {
            uha uhaVar = (uha) obj;
            if (awrc.c(this.a, uhaVar.a) && awrc.c(this.b, uhaVar.b) && this.c == uhaVar.c && this.d == uhaVar.d && awrc.c(this.e, uhaVar.e) && this.f == uhaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a.aj(this.f);
    }

    public final String toString() {
        return "SafeC2paEmbedRequest(composition=" + this.a + ", filePath=" + this.b + ", fileType=" + this.c + ", timestampOption=" + this.d + ", clientDescriptor=" + this.e + ", fileCopy=" + this.f + ')';
    }
}
