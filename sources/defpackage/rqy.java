package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rqy implements zwb {
    private final zwh a;
    private final zwb b;

    public rqy(zwh zwhVar, zwb zwbVar) {
        this.a = zwhVar;
        this.b = zwbVar;
    }

    @Override // defpackage.zwb
    public final zwa e() {
        return this.a.hw();
    }

    @Override // defpackage.zwb
    public final zwa f(String str) {
        return this.b.f(str);
    }

    @Override // defpackage.zwb
    public final boolean u() {
        return !this.a.hw().h();
    }
}
