package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpp extends qqw {
    private final Context a;
    private final qqv b;
    private final qqv c;
    private final Object d = new Object();
    private volatile String e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qqv] */
    public qpp(afwv afwvVar) {
        this.b = new qpt((qqa) afwvVar.a);
        this.a = (Context) afwvVar.c;
        this.c = afwvVar.b;
    }

    private final void r() throws qpx {
        if (this.c == null) {
            throw new qpx("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean s(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.qqw, defpackage.qqv
    public final File c(Uri uri) throws IOException {
        if (s(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        File fileV = new omj((Object) context, (byte[]) null).V(uri);
        if (!mef.h(context)) {
            String str = this.e;
            if (str == null) {
                synchronized (this.d) {
                    str = this.e;
                    if (str == null) {
                        String absolutePath = rmp.H(context).getAbsolutePath();
                        this.e = absolutePath;
                        str = absolutePath;
                    }
                }
            }
            if (!fileV.getAbsolutePath().startsWith(str)) {
                throw new qpx("Cannot access credential-protected data from direct boot");
            }
        }
        return fileV;
    }

    @Override // defpackage.qqw, defpackage.qqv
    public final InputStream d(Uri uri) throws qpx {
        if (!s(uri)) {
            return this.b.d(p(uri));
        }
        r();
        return this.c.d(uri);
    }

    @Override // defpackage.qqv
    public final String h() {
        return "android";
    }

    @Override // defpackage.qqw, defpackage.qqv
    public final boolean m(Uri uri) throws qpx {
        if (!s(uri)) {
            return this.b.m(p(uri));
        }
        r();
        return this.c.m(uri);
    }

    @Override // defpackage.qqw
    protected final Uri o(Uri uri) throws qqb {
        try {
            Context context = this.a;
            Pattern pattern = qpr.a;
            qpq qpqVar = new qpq(context);
            qpqVar.b(uri.getPath());
            return qpqVar.a();
        } catch (IllegalArgumentException e) {
            throw new qqb(e);
        }
    }

    @Override // defpackage.qqw
    protected final Uri p(Uri uri) throws qqb {
        if (s(uri)) {
            throw new qqb("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        agjz agjzVar = new agjz(4);
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(qql.a(agjzVar.g())).build();
    }

    @Override // defpackage.qqw
    protected final qqv q() {
        return this.b;
    }
}
