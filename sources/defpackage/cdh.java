package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cdh implements cdd {
    public final cnh a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public cdh(cno cnoVar, boolean z) {
        this.a = new cnh(cnoVar, z);
    }

    @Override // defpackage.cdd
    public final btn a() {
        return this.a.a;
    }

    @Override // defpackage.cdd
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
