package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afon implements bpl {
    public final cc a;
    private final bpl b;
    private final Set c;
    private final bpl d;

    public afon(cc ccVar, bpl bplVar, Set set, hil hilVar) {
        this.a = ccVar;
        this.b = bplVar;
        this.c = set;
        this.d = new afoq(hilVar, new gpd(this, 18));
    }

    @Override // defpackage.bpl
    public final bpi a(Class cls) {
        return this.c.contains(cls.getName()) ? bnz.h() : this.b.a(cls);
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        return this.c.contains(cls.getName()) ? this.d.b(cls, bptVar) : this.b.b(cls, bptVar);
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return bnz.g(this, awsdVar, bptVar);
    }
}
