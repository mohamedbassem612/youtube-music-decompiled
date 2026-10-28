package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qsc {
    public final MessageLite a;
    private final ExtensionRegistryLite b;

    public qsc(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = messageLite;
        if (extensionRegistryLite == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = extensionRegistryLite;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final MessageLite a(InputStream inputStream) {
        return this.a.getParserForType().g(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qsc) {
            qsc qscVar = (qsc) obj;
            if (this.a.equals(qscVar.a) && this.b.equals(qscVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ExtensionRegistryLite extensionRegistryLite = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + extensionRegistryLite.toString() + '}';
    }

    public qsc() {
        throw null;
    }
}
