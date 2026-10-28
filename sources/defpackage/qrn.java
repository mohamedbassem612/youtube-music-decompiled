package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrn {
    public final Context a;
    public final Executor b;
    public String c;
    public Set d;
    public hwe g;
    private boolean h = false;
    public boolean e = false;
    public agfr f = new jxp(14);

    public qrn(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final qrp a() {
        if (this.h || this.d != null) {
            return new qrp(this);
        }
        throw new IllegalArgumentException("Must specify either forKeys(...) or forAllKeys() before calling build().");
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.d = null;
        this.h = true;
    }

    public final void d(String... strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Cannot call forKeys() with null argument");
        }
        agkx agkxVar = new agkx();
        agkxVar.i(strArr);
        agkz agkzVarG = agkxVar.g();
        if (agkzVarG.size() != strArr.length) {
            throw new IllegalArgumentException("Duplicate keys specified");
        }
        this.d = agkzVarG;
        this.h = false;
    }

    public final void e(qro qroVar) {
        this.g = new hwe(qroVar, null);
    }
}
