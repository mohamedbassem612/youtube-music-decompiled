package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrp implements qrh {
    public final Context a;
    public final String b;
    public final Set c;
    public final boolean d;
    public SharedPreferences e;
    private final Executor f;
    private final agfr g;
    private final hwe h;

    public qrp(qrn qrnVar) {
        this.a = qrnVar.a;
        this.f = qrnVar.b;
        this.b = qrnVar.c;
        this.c = qrnVar.d;
        this.h = qrnVar.g;
        this.d = qrnVar.e;
        this.g = qrnVar.f;
    }

    public static qrn d(Context context, Executor executor) {
        return new qrn(context.getApplicationContext(), executor);
    }

    @Override // defpackage.qrh
    public final ListenableFuture a() {
        return ((Boolean) this.g.io()).booleanValue() ? aher.a : ahng.r(new qoh(this, 3), this.f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qro] */
    @Override // defpackage.qrh
    public final ListenableFuture b(MessageLite messageLite) {
        return ahng.n(this.h.a.a(new tld(this.e, this.c), messageLite));
    }

    @Override // defpackage.qrh
    public final ListenableFuture c() {
        ahfo ahfoVar = new ahfo(new ebs(this, 16));
        this.f.execute(ahfoVar);
        return ahfoVar;
    }
}
