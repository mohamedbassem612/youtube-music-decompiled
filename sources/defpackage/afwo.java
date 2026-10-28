package defpackage;

import android.util.SparseArray;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwo {
    public final String a;
    public final UUID b;
    public final afwm c;
    public final SparseArray d;
    public final int e;

    public afwo(String str, UUID uuid, afwm afwmVar, SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = afwmVar;
        this.d = sparseArray;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afwo) {
            afwo afwoVar = (afwo) obj;
            if (this.a.equals(afwoVar.a) && this.b.equals(afwoVar.b) && this.c.equals(afwoVar.c) && this.d.equals(afwoVar.d) && this.e == afwoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        SparseArray sparseArray = this.d;
        afwm afwmVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + String.valueOf(this.b) + ", record=" + String.valueOf(afwmVar) + ", spanExtrasSparseArray=" + String.valueOf(sparseArray) + ", numUnfinishedSpans=" + this.e + '}';
    }

    public afwo() {
        throw null;
    }
}
