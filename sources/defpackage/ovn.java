package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ovn implements oon {
    private final List a;

    public ovn(List list) {
        this.a = list;
    }

    @Override // defpackage.oon
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.oon
    public final atgg b(int i) {
        return (atgg) this.a.get(i);
    }
}
