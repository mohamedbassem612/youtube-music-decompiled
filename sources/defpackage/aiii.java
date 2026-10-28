package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aiii {
    public volatile aigj a;
    protected volatile MessageLite b;
    private final MessageLite c;
    private final ExtensionRegistryLite d;
    private volatile boolean e;

    public aiii(MessageLite messageLite) {
        if (messageLite == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.b = messageLite;
        this.c = messageLite.getDefaultInstanceForType();
        this.d = ExtensionRegistryLite.a;
        this.a = null;
        this.e = false;
    }

    final int a() {
        int iD = this.a != null ? this.a.d() : this.b.getSerializedSize();
        return ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    final MessageLite b() {
        try {
            return this.b;
        } catch (aiik unused) {
            byte b = this.d.b;
            int i = ExtensionRegistryLite.c;
            return this.c;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof aiii)) {
                return b().equals(obj);
            }
            aiii aiiiVar = (aiii) obj;
            if (this.a == null || aiiiVar.a == null || this.d != aiiiVar.d || !this.a.equals(aiiiVar.a)) {
                return b().equals(aiiiVar.b());
            }
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
