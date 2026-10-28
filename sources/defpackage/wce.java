package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wce implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wce(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid != 0) {
            return new qjw((ContentResolver) this.a, (Uri) this.b);
        }
        wcf wcfVar = (wcf) this.a;
        Throwable th = wcfVar.b;
        ?? r7 = this.b;
        if (th != null) {
            throw new RuntimeException("EntityStore failed loading from .so", th);
        }
        try {
            wcd wcdVar = (wcd) r7.io();
            wcdVar.getClass();
            return wcdVar;
        } catch (Throwable th2) {
            ((agrc) ((agrc) ((agrc) wcf.a.b()).j(th2)).k("com/google/android/libraries/youtube/innertube/entities/inmemory/impl/InMemoryEntityStoreWeakRefFactoryImpl", "<init>", '9', "InMemoryEntityStoreWeakRefFactoryImpl.java")).t("Error loading store");
            wcfVar.b = th2;
            throw th2;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
