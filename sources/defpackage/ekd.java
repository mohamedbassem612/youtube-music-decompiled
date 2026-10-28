package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekd implements ekk {
    public final List a;

    public ekd(List list) {
        this.a = list;
    }

    @Override // defpackage.ekk
    public final eix a() {
        List list = this.a;
        return ((enn) list.get(0)).f() ? new ejh(list) : new ejg(list);
    }

    @Override // defpackage.ekk
    public final List b() {
        return this.a;
    }

    @Override // defpackage.ekk
    public final boolean c() {
        List list = this.a;
        return list.size() == 1 && ((enn) list.get(0)).f();
    }
}
