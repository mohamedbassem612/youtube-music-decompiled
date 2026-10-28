package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdr implements spr {
    public static final long a;
    private final sds b;
    private final tqj c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 600000L;
    }

    public sdr(sds sdsVar, tqj tqjVar) {
        this.b = sdsVar;
        this.c = tqjVar;
    }

    @Override // defpackage.spr
    public final ListenableFuture a() {
        int i = tqr.a;
        return this.b.a(this.c.k(1073808297));
    }

    @Override // defpackage.spr
    public final ListenableFuture b() {
        return ahng.o(this.b.b());
    }

    @Override // defpackage.spr
    public final Optional c() {
        return (Build.VERSION.SDK_INT < 33 || SdkExtensions.getExtensionVersion(1000000) < 5) ? Optional.empty() : Optional.of(String.valueOf(SdkExtensions.getExtensionVersion(1000000)));
    }

    public final String d() {
        return "sdkv=" + this.b.f() + "&output=xml_vast2";
    }

    @Override // defpackage.spr
    public final String e() {
        String str;
        int i = tqr.a;
        ListenableFuture listenableFutureA = this.b.a(this.c.k(1073808297));
        if (!listenableFutureA.isDone()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        try {
            ahno.R(listenableFutureA.isDone(), "Future was expected to be done: %s", listenableFutureA);
            Optional optional = (Optional) a.i(listenableFutureA);
            return (optional.isEmpty() || (str = ((jwa) optional.get()).a) == null) ? "00000000-0000-0000-0000-000000000000" : str;
        } catch (Exception e) {
            e.printStackTrace();
            return "00000000-0000-0000-0000-000000000000";
        }
    }

    @Override // defpackage.spr
    public final String f(Optional optional) {
        String str = optional.isEmpty() ? null : ((jwa) optional.get()).a;
        return str == null ? "00000000-0000-0000-0000-000000000000" : str;
    }

    @Override // defpackage.spr
    public final String g(String str) {
        return this.b.c(str);
    }

    @Override // defpackage.spr
    public final String h() {
        return this.b.d();
    }

    @Override // defpackage.spr
    public final String i() {
        return this.b.e();
    }

    @Override // defpackage.spr
    public final boolean j() {
        int i = tqr.a;
        ListenableFuture listenableFutureA = this.b.a(this.c.k(1073808297));
        if (listenableFutureA == null || !listenableFutureA.isDone()) {
            return true;
        }
        try {
            ahno.R(listenableFutureA.isDone(), "Future was expected to be done: %s", listenableFutureA);
            Optional optional = (Optional) a.i(listenableFutureA);
            return optional.isEmpty() || ((jwa) optional.get()).b;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // defpackage.spr
    public final boolean k(Optional optional) {
        return optional.isEmpty() || ((jwa) optional.get()).b;
    }
}
