package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class imf implements iml {
    private final Class a;
    private final Class b;

    protected imf(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.iml
    public /* synthetic */ ListenableFuture a(Object obj, agkj agkjVar) {
        return ahng.n(d(obj, agkjVar));
    }

    @Override // defpackage.iml
    public final Class b() {
        return this.a;
    }

    @Override // defpackage.iml
    public final Class c() {
        return this.b;
    }
}
