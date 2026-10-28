package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sc {
    private final String d;
    private final String e;
    public String a = "";
    private int f = 2;
    public boolean b = false;
    public final Set c = new afx(0);

    public sc(String str, String str2) {
        azs.l(str);
        this.d = str;
        azs.l(str2);
        this.e = str2;
    }

    public final sd a() {
        boolean z = this.b;
        if (z && !this.c.isEmpty()) {
            throw new IllegalArgumentException("DocumentIndexingConfig#shouldIndexNestedProperties is required to be false when one or more indexableNestedProperties are provided.");
        }
        String str = this.d;
        String str2 = this.a;
        int i = this.f;
        String str3 = this.e;
        vb vbVar = new vb(z, new ArrayList(this.c));
        str2.getClass();
        return new sd(new vg(str, 6, i, str3, null, vbVar, null, null, str2, null, false));
    }

    public final void b(int i) {
        azs.i(i, 1, 3, "cardinality");
        this.f = i;
    }
}
