package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aazn {
    public final int a;
    public final String b;

    public aazn(int i, String str) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                this.a = i;
                this.b = str;
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a() {
        int i = this.a;
        return i == 5 || i == 6;
    }

    public final boolean b() {
        int i = this.a;
        return i == 3 || i == 6 || i == 10;
    }

    public final boolean c() {
        int i = this.a;
        return i == 2 || i == 5 || i == 9;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aazn) && this.a == ((aazn) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public final String toString() {
        return "YouTubePlayerStateEvent{state=" + aajg.k(this.a) + ", cpn=" + this.b + '}';
    }

    public aazn(int i) {
        this(i, null);
    }
}
