package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/KazooEffectsLoader");
    public final vca f;
    private final Context g;
    private final tgg h;
    private byte[] j;
    private volatile uxt l;
    private final vxz n;
    public final ArrayList b = new ArrayList();
    private final ArrayList i = new ArrayList();
    public final Map c = new HashMap();
    public final Set d = EnumSet.noneOf(ardk.class);
    public final Object e = new Object();
    private final Object k = new Object();
    private final Object m = new Object();

    public uyv(Context context, tgg tggVar, vca vcaVar, vxz vxzVar) {
        this.g = context;
        this.h = tggVar;
        this.f = vcaVar;
        this.n = vxzVar;
    }

    private final zf d() {
        zf zfVar = new zf((short[]) null);
        uxp uxpVarA = uxp.a(this.b, "NORMAL");
        if (uxpVarA != null) {
            zfVar.N(uxpVarA);
        }
        return zfVar;
    }

    public final uxt a() {
        if (this.l == null) {
            synchronized (this.m) {
                if (this.l == null) {
                    this.l = new uxt(this.g, this.h, this, this.n);
                }
            }
        }
        uxt uxtVar = this.l;
        uxtVar.getClass();
        return uxtVar;
    }

    public final boolean b(ardq ardqVar, boolean z) {
        ArrayList arrayList = this.b;
        ahno.F(arrayList.isEmpty());
        Map map = this.c;
        ahno.F(map.isEmpty());
        Set set = this.d;
        ahno.F(set.isEmpty());
        ardqVar.getClass();
        this.j = ardqVar.d.G();
        HashSet hashSet = new HashSet();
        boolean z2 = false;
        boolean zC = false;
        for (ardo ardoVar : ardqVar.c) {
            alay alayVar = ardoVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, z2);
            String string = spannedK != null ? spannedK.toString() : null;
            String str = ardoVar.b;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string)) {
                zvp.b(zvn.b, zvm.j, "Invalid effect from server: ".concat(String.valueOf(ardoVar.toString().replace('\"', '`'))), new Exception());
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/KazooEffectsLoader", "setVideoEffectsSettingsInternal", 280, "KazooEffectsLoader.java")).w("Invalid effect from server: %s", ardoVar);
                map = map;
                z2 = false;
            } else {
                boolean z3 = ardoVar.e.size() != 0 ? true : z2;
                uxp uxpVar = new uxp(str, string, z3, z);
                uxpVar.b = ardoVar.c;
                arrayList.add(uxpVar);
                if (z3) {
                    map.put(str, new HashSet(ardoVar.e));
                    hashSet.addAll(ardoVar.e);
                }
                zC |= uxp.c(str);
            }
        }
        if (ardqVar.h.isEmpty()) {
            zf zfVarD = d();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                uxp uxpVar2 = (uxp) arrayList.get(i);
                if (!uxp.c(uxpVar2.a)) {
                    zfVarD.N(uxpVar2);
                }
            }
            this.i.add(zfVarD);
        } else {
            for (ardn ardnVar : ardqVar.h) {
                int i2 = ardnVar.b;
                zf zfVarD2 = d();
                for (String str2 : ardnVar.c) {
                    if (uxp.c(str2)) {
                        int i3 = ardnVar.b;
                    } else {
                        uxp uxpVarA = uxp.a(arrayList, str2);
                        if (uxpVarA != null) {
                            zfVarD2.N(uxpVarA);
                        } else {
                            agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/KazooEffectsLoader", "setVideoEffectsSettingsInternal", 322, "KazooEffectsLoader.java");
                            ardj ardjVarA = ardj.a(ardnVar.b);
                            if (ardjVarA == null) {
                                ardjVarA = ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                            }
                            agrcVar.A("Invalid Effect ID %s in subpackage %d", str2, ardjVarA.d);
                            arrayList = arrayList;
                        }
                    }
                }
                this.i.add(zfVarD2);
                arrayList = arrayList;
            }
        }
        hashSet.addAll(ardqVar.e);
        if ((ardqVar.b & 2) != 0) {
            ardp ardpVar = ardqVar.g;
            if (ardpVar == null) {
                ardpVar = ardp.b;
            }
            set.addAll(new aihx(ardpVar.c, ardp.a));
        }
        new uyu(a(), ardqVar, hashSet).execute(new Void[0]);
        byte[] bArr = this.j;
        return bArr != null && bArr.length > 0 && zC;
    }

    public final void c(String str) {
        for (Map.Entry entry : this.c.entrySet()) {
            String str2 = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set.contains(str)) {
                set.remove(str);
                if (set.isEmpty()) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        uxp uxpVar = (uxp) arrayList.get(i);
                        i++;
                        if (uxpVar.a.equals(str2)) {
                            uxpVar.b();
                            break;
                        }
                    }
                }
            }
        }
        synchronized (this.k) {
        }
    }
}
