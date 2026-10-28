package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdm {
    public static final /* synthetic */ int a = 0;

    static {
        new khn("CastDynamiteModule", (String) null);
    }

    public static kdo a(Context context) throws kcl {
        try {
            IBinder iBinderC = kvc.d(context, kvc.a, "com.google.android.gms.cast.framework.dynamite").c("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderC == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof kdo ? (kdo) iInterfaceQueryLocalInterface : new kdn(iBinderC);
        } catch (kuy e) {
            throw new kcl(e);
        }
    }
}
