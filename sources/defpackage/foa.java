package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foa {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public foa() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    public final foa a(foa foaVar) {
        int i = foaVar.h;
        int i2 = this.h;
        int i3 = foaVar.g;
        int i4 = this.g;
        int i5 = foaVar.f;
        int i6 = this.f;
        int i7 = foaVar.e;
        int i8 = this.e;
        int i9 = foaVar.d;
        int i10 = this.d;
        int i11 = foaVar.c;
        int i12 = this.c;
        return new foa(foaVar.a + this.a, foaVar.b + this.b, i11 + i12, i9 + i10, i7 + i8, i5 + i6, i3 + i4, i + i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            foa foaVar = (foa) obj;
            if (this.a == foaVar.a && this.b == foaVar.b && this.c == foaVar.c && this.d == foaVar.d && this.e == foaVar.e && this.f == foaVar.f && this.g == foaVar.g && this.h == foaVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "ChangeSetStats{mEffectiveChangesCount=" + this.a + ", mInsertSingleCount=" + this.b + ", mInsertRangeCount=" + this.c + ", mDeleteSingleCount=" + this.d + ", mDeleteRangeCount=" + this.e + ", mUpdateSingleCount=" + this.f + ", mUpdateRangeCount=" + this.g + ", mMoveCount=" + this.h + '}';
    }

    public foa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
