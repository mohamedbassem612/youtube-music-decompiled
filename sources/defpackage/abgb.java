package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgb {
    final /* synthetic */ Object a;

    public abgb(Object obj) {
        this.a = obj;
    }

    public final avmn[] a(abvn abvnVar) {
        return new avmn[]{abvnVar.C().y(new xee(15)).ak(new abgd(this, 7)), abvnVar.L().ak(new abgd(this, 8))};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(Object obj) {
        this.a.add(obj);
    }

    public final esq c(Context context) {
        try {
            if (context != null) {
                return erj.b(context).c.a(context);
            }
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        } catch (IllegalArgumentException | IllegalStateException e) {
            if (((ajbm) ((adiz) this.a).g.io()).b) {
                StringBuilder sb = new StringBuilder("Failed to get RequestManager: ");
                if (context instanceof cf) {
                    sb.append("FA");
                } else if (context instanceof Activity) {
                    sb.append('A');
                } else if (context instanceof ContextWrapper) {
                    sb.append("CW");
                }
                sb.append(" : ");
                sb.append(context.getClass().getName());
                zvp.b(zvn.b, zvm.q, sb.toString(), e);
                ((agrc) ((agrc) ((agrc) adiz.b.b()).j(e)).k("com/google/android/libraries/youtube/rendering/image/glide/GlideImageManager$1", "getRequestManager", (char) 213, "GlideImageManager.java")).w("%s", sb.toString());
            }
            return null;
        }
    }

    @tcc
    void handleTimelineMarkerChangeEvent(abhu abhuVar) {
        abge abgeVar = (abge) this.a;
        if (abgeVar.L == null) {
            abgeVar.L = new HashMap();
        }
        abgeVar.L.put(abhuVar.a, abhuVar.b);
        abgeVar.y.y(abgeVar.L);
    }
}
