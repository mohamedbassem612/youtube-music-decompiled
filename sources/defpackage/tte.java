package defpackage;

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import java.io.IOException;
import java.net.SocketException;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tte implements ttm {
    private final Context a;
    private final axg b;
    private final tfq c;
    private final vxz d;

    public tte(Context context, tfq tfqVar, vxz vxzVar) {
        context.getClass();
        this.a = context;
        tfqVar.getClass();
        this.c = tfqVar;
        axh axhVar = axg.a;
        this.b = aie.g(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1, axg.a);
        this.d = vxzVar;
    }

    private final twp f(Object... objArr) {
        if (this.c.h()) {
            int length = objArr.length;
            Context context = this.a;
            if (length <= 0) {
                return twp.a(context, 0, R.string.common_error_network, new Object[0]);
            }
            return new twp(context.getString(R.string.common_error_network), twp.b(context, R.string.common_error_network, objArr), 0);
        }
        int length2 = objArr.length;
        Context context2 = this.a;
        if (length2 <= 0) {
            return twp.a(context2, 1, R.string.common_no_network, new Object[0]);
        }
        return new twp(context2.getString(R.string.common_no_network), twp.b(context2, R.string.common_no_network, objArr), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ttm
    public final twp a(Throwable th) {
        twp twpVar;
        int i;
        twp twpVar2;
        if (th == 0) {
            return twp.a(this.a, 0, R.string.common_error_generic, new Object[0]);
        }
        if (th instanceof twt) {
            return ((twt) th).a(this.a);
        }
        if (th instanceof AuthenticatorException) {
            return twp.a(this.a, 0, R.string.common_error_authenticating, new Object[0]);
        }
        if (th instanceof SocketException) {
            return f(new Object[0]);
        }
        if (!(th instanceof tgp)) {
            if (th instanceof toe) {
                toe toeVar = (toe) th;
                tnm tnmVar = toeVar.b;
                if (tnmVar != null && (i = tnmVar.d) > 0) {
                    if (i == 403) {
                        Context context = this.a;
                        twpVar2 = new twp(context.getString(R.string.common_error_forbidden_action), twp.b(context, R.string.common_error_http, 403), 0);
                    } else if (i == 401) {
                        Context context2 = this.a;
                        twpVar2 = new twp(context2.getString(R.string.common_error_unauthorized), twp.b(context2, R.string.common_error_http, 401), 0);
                    } else {
                        if (i != 500) {
                            String str = String.format(Locale.US, "%d", Integer.valueOf(i));
                            Context context3 = this.a;
                            return new twp(context3.getString(R.string.common_error_http, this.b.b(str)), twp.b(context3, R.string.common_error_http, str), 0);
                        }
                        Context context4 = this.a;
                        twpVar2 = new twp(context4.getString(R.string.common_error_generic), twp.b(context4, R.string.common_error_http, 500), 0);
                    }
                    return twpVar2;
                }
                if ((th instanceof tmg) || (th instanceof tnc)) {
                    if (th.getCause() instanceof IOException) {
                        vxz vxzVar = this.d;
                        if (vxzVar != null && vxzVar.l(5, 45355319L, false)) {
                            return f("AuthFailureError");
                        }
                    } else {
                        String message = th.getMessage();
                        if (message == null || message.isEmpty()) {
                            return twp.a(this.a, 0, R.string.common_error_authenticating, new Object[0]);
                        }
                        Context context5 = this.a;
                        twpVar = new twp(context5.getString(R.string.common_error_authenticating), twp.b(context5, R.string.common_error_authenticating, message.replace(' ', '_')), 0);
                    }
                }
                if (toeVar instanceof tod) {
                    return twp.a(this.a, 0, R.string.common_error_timeout, new Object[0]);
                }
            }
            return th instanceof IOException ? f(new Object[0]) : a(th.getCause());
        }
        Context context6 = this.a;
        int i2 = ((tgp) th).a;
        if (i2 == 403) {
            return new twp(context6.getString(R.string.common_error_forbidden_action), twp.b(context6, R.string.common_error_http, 403), 0);
        }
        if (i2 == 500) {
            return new twp(context6.getString(R.string.common_error_generic), twp.b(context6, R.string.common_error_http, 500), 0);
        }
        if (i2 == 401) {
            return new twp(context6.getString(R.string.common_error_unauthorized), twp.b(context6, R.string.common_error_http, 401), 0);
        }
        String str2 = String.format(Locale.US, "%d", Integer.valueOf(i2));
        twpVar = new twp(context6.getString(R.string.common_error_http, this.b.b(str2)), twp.b(context6, R.string.common_error_http, str2), 0);
        return twpVar;
    }

    @Override // defpackage.ttm
    public final String b(Throwable th) {
        return (String) a(th).b;
    }

    @Override // defpackage.ttm
    public final void c(int i) {
        d(this.a.getString(i));
    }

    @Override // defpackage.ttm
    public final void d(String str) {
        if (str == null) {
            tuk.o(this.a, "", 1);
        }
        tuk.o(this.a, str, 1);
    }

    @Override // defpackage.ttm
    public final void e(Throwable th) {
        d(b(th));
    }
}
