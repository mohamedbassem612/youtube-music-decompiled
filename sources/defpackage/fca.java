package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fca implements eua {
    public static final etx a = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, etx.a);
    private final Context b;

    public fca(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        return c((Uri) obj, etyVar);
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final ewf c(Uri uri, ety etyVar) {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException(enb.b(uri, "Package name for ", " is null or empty"));
        }
        Context contextCreatePackageContext = this.b;
        if (!authority.equals(contextCreatePackageContext.getPackageName())) {
            try {
                contextCreatePackageContext = contextCreatePackageContext.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                Context context = this.b;
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        gzj.bM(authority);
        Context context2 = this.b;
        Resources.Theme theme = authority.equals(context2.getPackageName()) ? (Resources.Theme) etyVar.b(a) : null;
        return fbz.g(theme == null ? fbw.a(context2, contextCreatePackageContext, identifier, null) : fbw.a(context2, context2, identifier, theme));
    }
}
