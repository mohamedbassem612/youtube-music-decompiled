package defpackage;

import android.content.Context;
import java.io.File;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sxd implements Supplier {
    public final /* synthetic */ awmd a;
    public final /* synthetic */ Context b;

    public /* synthetic */ sxd(awmd awmdVar, Context context) {
        this.a = awmdVar;
        this.b = context;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return ((hhb) this.a.io()).g(new File(this.b.getFilesDir(), tqg.a()));
    }
}
