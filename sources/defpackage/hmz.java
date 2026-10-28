package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmz extends hmw {
    private final Object a;

    private hmz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hmw
    public final Object a() {
        return this.a;
    }

    public final String toString() {
        return "AppSearchAddEntityEvent{entity=" + this.a.toString() + '}';
    }

    public /* synthetic */ hmz(Object obj, hmy hmyVar) {
        this(obj);
    }
}
