package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eju {
    public final List a;
    public final double b;
    private final char c;
    private final String d;
    private final String e;

    public eju(List list, char c, double d, String str, String str2) {
        this.a = list;
        this.c = c;
        this.b = d;
        this.d = str;
        this.e = str2;
    }

    public final int hashCode() {
        return (((this.c * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }
}
