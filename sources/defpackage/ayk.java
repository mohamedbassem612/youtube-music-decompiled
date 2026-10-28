package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayk {
    private final ayj a;

    public ayk(String str, int i, int i2) {
        this.a = new ayj(str, i, i2);
    }

    public static String a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            return "M0," + i8 + " A" + i7 + ',' + i8 + " 0 1,1 " + i + ',' + i8 + " A" + i7 + ',' + i8 + " 0 1,1 0," + i8 + " Z";
        }
        StringBuilder sb = new StringBuilder("M ");
        int iMin = Math.min(i / 2, i2 / 2);
        int iMin2 = Math.min(iMin, i3);
        int iMin3 = Math.min(iMin, i4);
        int iMin4 = Math.min(iMin, i5);
        int iMin5 = Math.min(iMin, i6);
        sb.append(iMin2);
        sb.append(",0 L ");
        sb.append(i - iMin3);
        sb.append(",0");
        if (iMin3 > 0) {
            sb.append(" A ");
            sb.append(iMin3);
            sb.append(',');
            sb.append(iMin3);
            sb.append(" 0 0,1 ");
            sb.append(i);
            sb.append(',');
            sb.append(iMin3);
        }
        sb.append(" L ");
        sb.append(i);
        sb.append(',');
        sb.append(i2 - iMin4);
        if (iMin4 > 0) {
            sb.append(" A ");
            sb.append(iMin4);
            sb.append(',');
            sb.append(iMin4);
            sb.append(" 0 0,1 ");
            sb.append(i - iMin4);
            sb.append(',');
            sb.append(i2);
        }
        sb.append(" L ");
        sb.append(iMin5);
        sb.append(',');
        sb.append(i2);
        if (iMin5 > 0) {
            sb.append(" A ");
            sb.append(iMin5);
            sb.append(',');
            sb.append(iMin5);
            sb.append(" 0 0,1 0,");
            sb.append(i2 - iMin5);
        }
        if (iMin2 > 0) {
            sb.append(" L 0,");
            sb.append(iMin2);
            sb.append(" A ");
            sb.append(iMin2);
            sb.append(',');
            sb.append(iMin2);
            sb.append(" 0 0,1 ");
            sb.append(iMin2);
            sb.append(",0");
        }
        sb.append(" Z");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ayk) {
            return Objects.equals(this.a, ((ayk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return this.a.toString();
    }
}
