package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjc {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final ExtensionRegistryLite b;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.b(asoy.b);
        extensionRegistryLite.b(asma.b);
        b = extensionRegistryLite;
    }

    public static void a(mkx mkxVar, final fhd fhdVar, final nsl nslVar, mjb mjbVar, avlr avlrVar, final nuc nucVar, final boolean z, final boolean z2, final boolean z3) {
        mkxVar.g(avlrVar, avlrVar.Q(new avnn() { // from class: miz
            @Override // defpackage.avnn
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                Handler handler = mjc.a;
                nucVar.f(aslh.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, nslVar, th, "Error materializing Component", new Object[0]);
                if (z2) {
                    mjc.a.post(new lfa(fhdVar, th, 14, (byte[]) null));
                } else if (z && !mej.c(z3, th)) {
                    Log.e("Elements DEBUG", "NOT A PRODUCTION CRASH BELOW. Review ElementsException message for details");
                    throw awkh.b(th);
                }
                return mja.a;
            }
        }), nslVar, fhdVar, mjbVar);
        mkxVar.b();
    }
}
