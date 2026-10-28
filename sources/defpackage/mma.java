package defpackage;

import com.google.android.libraries.elements.interfaces.MaterializationResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mma {
    public final nay a;
    public final MaterializationResult b;
    public final npg c;

    public mma(nay nayVar, MaterializationResult materializationResult, npg npgVar) {
        this.a = nayVar;
        this.b = materializationResult;
        this.c = npgVar;
    }

    public final boolean equals(Object obj) {
        MaterializationResult materializationResult;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mma) {
            mma mmaVar = (mma) obj;
            if (this.a.equals(mmaVar.a) && ((materializationResult = this.b) != null ? materializationResult.equals(mmaVar.b) : mmaVar.b == null)) {
                npg npgVar = this.c;
                if (npgVar == null) {
                    if (mmaVar.c == null) {
                        return true;
                    }
                } else if (npgVar.equals(mmaVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        MaterializationResult materializationResult = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (materializationResult == null ? 0 : materializationResult.hashCode())) * 1000003;
        npg npgVar = this.c;
        return iHashCode2 ^ (npgVar != null ? npgVar.hashCode() : 0);
    }

    public final String toString() {
        npg npgVar = this.c;
        MaterializationResult materializationResult = this.b;
        return "ResolvedElement{element=" + this.a.toString() + ", materializationResult=" + String.valueOf(materializationResult) + ", debuggerInfo=" + String.valueOf(npgVar) + '}';
    }

    public mma() {
        throw null;
    }
}
