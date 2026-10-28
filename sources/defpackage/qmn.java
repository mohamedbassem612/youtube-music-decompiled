package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmn {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final ahnm b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public qmn(Context context, qmo qmoVar) {
        this.a = qmoVar.c ? qke.e(context, qmoVar.b) : qmoVar.b;
        ahnm ahnmVarA = ahnm.a(qmoVar.d);
        this.b = ahnmVarA == null ? ahnm.UNKNOWN : ahnmVarA;
        this.c = qmoVar.g;
        this.d = qmoVar.e;
        this.e = qmoVar.f;
    }

    public static Map a(Context context) {
        Map map = g;
        if (map == null) {
            synchronized (f) {
                map = g;
                if (map == null) {
                    agkh agkhVar = new agkh(4);
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        InputStream inputStreamOpen = context.getAssets().open(a.ce(str, "phenotype/"));
                                        try {
                                            qmn qmnVar = new qmn(context, (qmo) aihn.parseFrom(qmo.a, inputStreamOpen, ExtensionRegistryLite.a));
                                            agkhVar.e(qmnVar.a, qmnVar);
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } catch (Throwable th) {
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (aiik e) {
                                        Log.e("PackageInfo", a.ce(str, "Unable to read Phenotype PackageMetadata for "), e);
                                    }
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    agkj agkjVarD = agkhVar.d(true);
                    g = agkjVarD;
                    map = agkjVarD;
                }
            }
        }
        return map;
    }
}
