package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avby {
    public final int a;
    protected final String b;
    public final List c;
    public final List d;

    public avby(int i, String str, List list, List list2) {
        this.a = i;
        this.b = str;
        this.c = agke.n(list);
        this.d = agke.n(list2);
    }

    public final String toString() {
        return getClass().getName() + '(' + this.b + ')';
    }
}
