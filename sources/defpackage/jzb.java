package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzb extends kmz implements jyq {
    private static final khn a;
    private static final kro b;
    private static final kro c;

    static {
        kro kroVar = new kro();
        c = kroVar;
        jyy jyyVar = new jyy();
        b = jyyVar;
        a = new khn("GoogleAuth.API", jyyVar, kroVar);
    }

    public jzb(Context context) {
        super(context, null, a, kms.f, kmy.a);
    }

    public static final void d(Status status, Object obj, kjc kjcVar) {
        if (status.c()) {
            kjcVar.x(obj);
        } else if (f(status)) {
            kjcVar.w(new IOException(status.b()));
        } else {
            kjcVar.w(status.h == null ? new jyj(status) : new jyt(status));
        }
    }

    public static final void e(Status status, Object obj, kjc kjcVar) {
        if (status.c()) {
            kjcVar.x(obj);
        } else if (f(status)) {
            kjcVar.w(new IOException(status.b()));
        } else {
            PendingIntent pendingIntent = status.h;
            kjcVar.w(pendingIntent == null ? new jxr(status.b()) : UserRecoverableAuthException.a(status.b(), hna.S(pendingIntent)));
        }
    }

    private static final boolean f(Status status) {
        switch (status.f) {
            case 8:
            case 49500:
            case 49508:
            case 49528:
            case 49531:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.jyq
    public final lpa a(String str) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{jxo.b};
        kpjVar.a = new jyx((Object) this, str, 0);
        kpjVar.c = 1681;
        return super.A(0, kpjVar.a());
    }

    @Override // defpackage.jyq
    public final lpa b(jyk jykVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{jxo.b};
        kpjVar.a = new jyx(this, jykVar, 1);
        kpjVar.c = 1676;
        return super.A(0, kpjVar.a());
    }

    @Override // defpackage.jyq
    public final lpa c(jyn jynVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{new klq("google_auth_api", -1, 1L, false)};
        kpjVar.a = new jyx(this, jynVar, 2);
        kpjVar.c = 1680;
        return super.A(0, kpjVar.a());
    }
}
