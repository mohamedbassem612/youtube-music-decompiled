package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyg implements eyv {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public eyg(Context context, eyf eyfVar, int i) {
        this.$cid = i;
        this.a = context.getApplicationContext();
        this.b = eyfVar;
    }

    private final Uri c(Integer num) {
        try {
            return Uri.parse("android.resource://" + ((Resources) this.a).getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            }
            return null;
        }
    }

    @Override // defpackage.eyv
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                return true;
            }
        } else {
            if (i == 2) {
                return true;
            }
            Uri uri2 = (Uri) obj;
            if ("android.resource".equals(uri2.getScheme()) && ((Context) this.a).getPackageName().equals(uri2.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [eyf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [eyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [eyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [eyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [ext, java.lang.Object] */
    @Override // defpackage.eyv
    public final /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        int i3 = this.$cid;
        if (i3 == 0) {
            Integer num = (Integer) obj;
            Resources.Theme theme = (Resources.Theme) etyVar.b(fca.a);
            return new hed(new ffd(num), new eye(theme, theme != null ? theme.getResources() : ((Context) this.a).getResources(), this.b, num.intValue()));
        }
        if (i3 == 1) {
            Uri uri = (Uri) obj;
            return new hed(new ffd(uri), this.b.a((AssetManager) this.a, uri.toString().substring(22)));
        }
        if (i3 == 2) {
            Uri uriC = c((Integer) obj);
            if (uriC != null) {
                return this.b.b(uriC, i, i2, etyVar);
            }
            return null;
        }
        Uri uri2 = (Uri) obj;
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i4 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i4 != 0) {
                    return this.b.b(Integer.valueOf(i4), i, i2, etyVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", a.cp(uri2, "Failed to parse a valid non-0 resource id from: "));
                return null;
            } catch (NumberFormatException e) {
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri2))), e);
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri2))));
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = (Context) this.a;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.b.b(Integer.valueOf(identifier), i, i2, etyVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri2))));
        return null;
    }

    public eyg(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public eyg(Context context, eyv eyvVar, int i) {
        this.$cid = i;
        this.a = context.getApplicationContext();
        this.b = eyvVar;
    }
}
