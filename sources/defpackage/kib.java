package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kib implements kit {
    static final lle[] a = new lle[0];
    static final String[] b = new String[0];

    @Deprecated
    public static final khn l;
    private static volatile int m = -1;
    private static final kro n;
    private static final kro o;
    public final kiv c;
    public final String d;
    protected final Context e;
    public final kij f;
    protected final String g;
    protected final String h;
    protected final kja i;
    public final kio j;
    public final int k;

    static {
        kro kroVar = new kro();
        o = kroVar;
        khz khzVar = new khz();
        n = khzVar;
        l = new khn("ClearcutLogger.API", khzVar, kroVar);
    }

    public kib(Context context, String str, String str2, kja kjaVar, int i, kij kijVar, kiv kivVar, kio kioVar) {
        if (!kjaVar.a(kjb.ACCOUNT_NAME)) {
            kro.d(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        c(kjaVar);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = str;
        this.d = str2;
        this.i = kjaVar;
        this.k = i == 0 ? 1 : i;
        this.f = kijVar == null ? new kjn(context) : kijVar;
        this.c = kivVar == null ? new kju(context) : kivVar;
        this.j = kioVar;
    }

    static final int a(Context context) {
        if (m == -1) {
            synchronized (kib.class) {
                if (m == -1) {
                    try {
                        m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return m;
    }

    static final String b(Iterable iterable) {
        return new ager(", ").b(iterable);
    }

    static final void c(kja kjaVar) {
        if (!kjaVar.equals(kja.c) && !kjaVar.equals(kja.a) && !kjaVar.equals(kja.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    static final int[] e(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.kit
    public final boolean d() {
        return this.i.equals(kja.b);
    }
}
