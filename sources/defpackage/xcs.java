package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public xcs(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xcs) {
            xcs xcsVar = (xcs) obj;
            if (this.a == xcsVar.a && this.b == xcsVar.b && this.c == xcsVar.c && this.d == xcsVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "PollActionPanelColors(backgroundDrawable=" + this.a + ", questionTextColor=" + this.b + ", pollMetadataColor=" + this.c + ", contextMenuButtonColor=" + this.d + ')';
    }
}
