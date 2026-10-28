package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auoc implements bpl {
    public static final bps a = new afpb();
    private final Map b;
    private final bpl c;
    private final bpl d;

    public auoc(Map map, bpl bplVar, gjd gjdVar) {
        this.b = map;
        this.c = bplVar;
        this.d = new auoa(gjdVar, 0);
    }

    @Override // defpackage.bpl
    public final bpi a(Class cls) {
        return this.b.containsKey(cls) ? bnz.h() : this.c.a(cls);
    }

    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        return this.b.containsKey(cls) ? this.d.b(cls, bptVar) : this.c.b(cls, bptVar);
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return b(((awqv) awsdVar).b, bptVar);
    }
}
