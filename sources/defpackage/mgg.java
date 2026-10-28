package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgg {
    public final int a;
    public final int b;

    public mgg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgg) {
            mgg mggVar = (mgg) obj;
            if (this.a == mggVar.a && this.b == mggVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "HapticFeedback{hapticFeedbackConstant=" + this.a + ", versionCode=" + this.b + '}';
    }

    public mgg() {
        throw null;
    }
}
