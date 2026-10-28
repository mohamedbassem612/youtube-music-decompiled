package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avob implements avno {
    final Class a;

    public avob(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.avno
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }
}
