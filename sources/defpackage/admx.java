package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class admx extends ho {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public admx(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ho
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.ho
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.ho
    public final boolean c(int i, int i2) {
        return awrc.c(this.a.get(i), this.b.get(i2));
    }

    @Override // defpackage.ho
    public final boolean d(int i, int i2) {
        return this.a.get(i) == this.b.get(i2);
    }
}
