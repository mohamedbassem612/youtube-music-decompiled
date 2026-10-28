package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wej {
    public static final wej a = new vwt((byte[]) null).b();
    public final akvf b;

    public wej(akvf akvfVar) {
        akvfVar.getClass();
        this.b = akvfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, aeox aeoxVar) {
        akvf akvfVar = this.b;
        if (!akvfVar.a(str)) {
            return null;
        }
        try {
            aigj aigjVar = aigj.d;
            aigj aigjVar2 = (aigj) akvfVar.b.get(str);
            if (aigjVar2 != null) {
                aigjVar = aigjVar2;
            }
            return aeoxVar.a(aigjVar.G());
        } catch (IOException e) {
            throw new IllegalStateException(String.format("You might have accessed value with wrong marshaller for key %s", str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b(String str) {
        akvf akvfVar = this.b;
        if (!akvfVar.a(str)) {
            return null;
        }
        aigj aigjVar = aigj.d;
        aigj aigjVar2 = (aigj) akvfVar.b.get(str);
        if (aigjVar2 != null) {
            aigjVar = aigjVar2;
        }
        return aigjVar.B();
    }

    public final vwt c() {
        return new vwt(this.b.toBuilder());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wej) {
            return Objects.equals(this.b, ((wej) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "EntityMetadata{" + String.valueOf(DesugarCollections.unmodifiableMap(this.b.b)) + '}';
    }
}
