package defpackage;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.Pair;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aapp implements aapr {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/refresh/DefaultOfflineRefreshController");
    private final aaps b;
    private final aapz c;
    private final mbc d;
    private final SharedPreferences e;
    private final vyo f;
    private final aaei g;
    private final tbt h;
    private final vxz i;

    public aapp(aaps aapsVar, aapz aapzVar, mbc mbcVar, SharedPreferences sharedPreferences, vyo vyoVar, aaei aaeiVar, tbt tbtVar, vxz vxzVar) {
        this.b = aapsVar;
        this.c = aapzVar;
        this.d = mbcVar;
        this.e = sharedPreferences;
        this.f = vyoVar;
        this.g = aaeiVar;
        this.h = tbtVar;
        this.i = vxzVar;
    }

    private static int h(long j) {
        return j < 0 ? Alert.DURATION_SHOW_INDEFINITELY : Math.max(1, (int) j);
    }

    private final int i(String str, aaqn aaqnVar, aogd aogdVar, long j) {
        aogdVar.getClass();
        axmq axmqVar = new axmq(aogdVar, j);
        this.e.edit().putString(tym.y("offline_refresh_continuation_token_%s", str), (String) axmqVar.b).putLong(tym.y("offline_refresh_continuation_expiration_%s", str), axmqVar.a).apply();
        int i = aogdVar.c;
        if (i > this.g.a()) {
            this.b.e(str, i);
            return 0;
        }
        if (i > 0) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(i));
            } catch (InterruptedException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/refresh/DefaultOfflineRefreshController", "processOrScheduleContinuation", (char) 577, "DefaultOfflineRefreshController.java")).t("[Offline] Thread.sleep interrupted: ");
                return 1;
            }
        }
        return j(str, aaqnVar, aogdVar.b, j);
    }

    private final int j(String str, aaqn aaqnVar, String str2, long j) {
        aapp aappVar;
        String str3;
        aaqn aaqnVar2;
        long j2;
        typ.f(str2);
        aapz aapzVar = this.c;
        aapy aapyVarA = aapzVar.a();
        aapyVarA.r(str2);
        try {
            aluu aluuVarB = aapzVar.b(aapyVarA);
            aluuVarB.d.size();
            if ((aluuVarB.b & 2) != 0 && aluuVarB.e == null) {
                aluv aluvVar = aluv.a;
            }
            if (aluuVarB.d.size() > 0) {
                aappVar = this;
                str3 = str;
                aaqnVar2 = aaqnVar;
                aappVar.f(str3, aaqnVar2, aluuVarB.d, aluuVarB.f, j);
                j2 = j;
            } else {
                aappVar = this;
                str3 = str;
                aaqnVar2 = aaqnVar;
                j2 = j;
            }
            aluv aluvVar2 = aluuVarB.e;
            if (aluvVar2 == null) {
                aluvVar2 = aluv.a;
            }
            if ((aluvVar2.b & 1) == 0) {
                aappVar.m(str3);
                return 2;
            }
            aluv aluvVar3 = aluuVarB.e;
            if (aluvVar3 == null) {
                aluvVar3 = aluv.a;
            }
            aogd aogdVar = aluvVar3.c;
            if (aogdVar == null) {
                aogdVar = aogd.a;
            }
            return aappVar.i(str3, aaqnVar2, aogdVar, j2);
        } catch (wno unused) {
            this.h.c(new aaii());
            return 1;
        }
    }

    private final aluu k(Collection collection, boolean z) {
        taq.c();
        aapz aapzVar = this.c;
        aapy aapyVarA = aapzVar.a();
        collection.getClass();
        aapyVarA.a = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aapyVarA.a.add((alux) ((aihf) it.next()).build());
        }
        aapyVarA.b = z;
        aluu aluuVarB = aapzVar.b(aapyVarA);
        aluuVarB.d.size();
        if ((aluuVarB.b & 2) != 0 && aluuVarB.e == null) {
            aluv aluvVar = aluv.a;
        }
        return aluuVarB;
    }

    private final Collection l(aaqn aaqnVar, Set set, long j) {
        int i;
        int iH;
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aamt aamtVarA = aaqnVar.l().a((String) it.next());
            if (aamtVarA != null && aamtVarA.u(this.i)) {
                aams aamsVar = aamtVarA.m;
                String strB = aamtVarA.b();
                long j2 = aamsVar != null ? aamsVar.d : 0L;
                int iH2 = 0;
                boolean z = !aamtVarA.q() && aamtVarA.a() && aamtVarA.c();
                long j3 = aamtVarA.h;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int iH3 = h((j - j2) / 1000);
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                int iH4 = h((j - j3) / 1000);
                aaew aaewVarD = aaqnVar.d();
                if (aaewVarD != null) {
                    long jAe = aaewVarD.ae(strB);
                    if (jAe > 0) {
                        TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                        iH = h((j - jAe) / 1000);
                    } else {
                        iH = 0;
                    }
                    typ.f(strB);
                    Cursor cursorQuery = aaewVarD.j.aa().query("videosV2", new String[]{"streams_timestamp"}, "id = ?", new String[]{strB}, null, null, null, null);
                    try {
                        long j4 = cursorQuery.moveToNext() ? cursorQuery.getLong(0) : 0L;
                        cursorQuery.close();
                        if (j4 > 0) {
                            TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
                            iH2 = h((j - j4) / 1000);
                        }
                        i = iH2;
                        iH2 = iH;
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                } else {
                    i = 0;
                }
                aihf aihfVarCreateBuilder = aluw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aluw aluwVar = (aluw) aihfVarCreateBuilder.instance;
                strB.getClass();
                aluwVar.b |= 1;
                aluwVar.c = strB;
                aihfVarCreateBuilder.copyOnWrite();
                aluw aluwVar2 = (aluw) aihfVarCreateBuilder.instance;
                aluwVar2.b |= 2;
                aluwVar2.d = iH3;
                aihfVarCreateBuilder.copyOnWrite();
                aluw aluwVar3 = (aluw) aihfVarCreateBuilder.instance;
                aluwVar3.b |= 4;
                aluwVar3.e = iH4;
                aihfVarCreateBuilder.copyOnWrite();
                aluw aluwVar4 = (aluw) aihfVarCreateBuilder.instance;
                aluwVar4.b |= 8;
                aluwVar4.f = iH2;
                aihfVarCreateBuilder.copyOnWrite();
                aluw aluwVar5 = (aluw) aihfVarCreateBuilder.instance;
                aluwVar5.b |= 16;
                aluwVar5.g = i;
                aihfVarCreateBuilder.copyOnWrite();
                aluw aluwVar6 = (aluw) aihfVarCreateBuilder.instance;
                aluwVar6.b |= 64;
                aluwVar6.h = z;
                aamm aammVar = aamtVarA.p;
                if (aammVar != null) {
                    aaml aamlVar = aammVar.a;
                    if (aamlVar != null) {
                        aihf aihfVarCreateBuilder2 = FormatIdOuterClass$FormatId.a.createBuilder();
                        int iA = aamlVar.a();
                        aihfVarCreateBuilder2.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                        formatIdOuterClass$FormatId.b |= 1;
                        formatIdOuterClass$FormatId.c = iA;
                        long jK = aamlVar.c.k();
                        aihfVarCreateBuilder2.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                        formatIdOuterClass$FormatId2.b |= 2;
                        formatIdOuterClass$FormatId2.d = jK;
                        String strH = aamlVar.h();
                        aihfVarCreateBuilder2.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId3 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                        strH.getClass();
                        formatIdOuterClass$FormatId3.b |= 4;
                        formatIdOuterClass$FormatId3.e = strH;
                        aihfVarCreateBuilder.bf((FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.build());
                    }
                    aaml aamlVar2 = aammVar.b;
                    if (aamlVar2 != null) {
                        aihf aihfVarCreateBuilder3 = FormatIdOuterClass$FormatId.a.createBuilder();
                        int iA2 = aamlVar2.a();
                        aihfVarCreateBuilder3.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId4 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder3.instance;
                        formatIdOuterClass$FormatId4.b |= 1;
                        formatIdOuterClass$FormatId4.c = iA2;
                        long jK2 = aamlVar2.c.k();
                        aihfVarCreateBuilder3.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId5 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder3.instance;
                        formatIdOuterClass$FormatId5.b |= 2;
                        formatIdOuterClass$FormatId5.d = jK2;
                        String strH2 = aamlVar2.h();
                        aihfVarCreateBuilder3.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId6 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder3.instance;
                        strH2.getClass();
                        formatIdOuterClass$FormatId6.b |= 4;
                        formatIdOuterClass$FormatId6.e = strH2;
                        aihfVarCreateBuilder.bf((FormatIdOuterClass$FormatId) aihfVarCreateBuilder3.build());
                    }
                }
                if (aamsVar != null) {
                    String strC = aamsVar.c();
                    if (map.containsKey(strC)) {
                        ((aihf) map.get(strC)).bs(aihfVarCreateBuilder);
                    } else {
                        aihf aihfVarCreateBuilder4 = alux.a.createBuilder();
                        aihfVarCreateBuilder4.bs(aihfVarCreateBuilder);
                        if (strC != null) {
                            aihfVarCreateBuilder4.copyOnWrite();
                            alux aluxVar = (alux) aihfVarCreateBuilder4.instance;
                            aluxVar.b |= 1;
                            aluxVar.c = strC;
                        }
                        map.put(strC, aihfVarCreateBuilder4);
                    }
                }
            }
        }
        return map.values();
    }

    private final void m(String str) {
        this.e.edit().remove(tym.y("offline_refresh_continuation_token_%s", str)).remove(tym.y("offline_refresh_continuation_expiration_%s", str)).apply();
    }

    private final void n() {
        this.h.c(new aaik());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0104 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0108 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010f A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0113 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0119 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0124 A[PHI: r5
      0x0124: PHI (r5v9 aapp) = (r5v7 aapp), (r5v12 aapp) binds: [B:76:0x0122, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0126 A[PHI: r5 r12
      0x0126: PHI (r5v6 aapp) = (r5v7 aapp), (r5v12 aapp) binds: [B:75:0x0120, B:32:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r12v1 int) = (r12v16 int), (r12v20 int) binds: [B:75:0x0120, B:32:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x012f A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0135 A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #3 {all -> 0x013f, blocks: (B:31:0x0085, B:36:0x0092, B:38:0x0098, B:40:0x00ac, B:41:0x00ae, B:43:0x00b2, B:45:0x00b8, B:46:0x00bd, B:48:0x00c3, B:50:0x00cd, B:52:0x00d4, B:51:0x00d1, B:54:0x00da, B:56:0x00e4, B:61:0x00ff, B:63:0x0104, B:65:0x0108, B:66:0x010a, B:68:0x010f, B:70:0x0113, B:71:0x0115, B:73:0x0119, B:74:0x011b, B:58:0x00f2, B:53:0x00d7, B:80:0x0129, B:82:0x012f, B:83:0x0135, B:89:0x013d), top: B:98:0x0085, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.aapr
    public final synchronized int a(String str, aaqn aaqnVar) throws Throwable {
        aapp aappVar;
        Throwable th;
        axmq axmqVar;
        String str2;
        aaqn aaqnVar2;
        int i;
        HashSet hashSet;
        aoev aoevVar;
        int i2;
        Collection collectionL;
        aluv aluvVar;
        aluv aluvVar2;
        aogd aogdVar;
        try {
            taq.c();
            String strY = tym.y("offline_refresh_video_ids_%s", str);
            HashSet hashSet2 = new HashSet();
            SharedPreferences sharedPreferences = this.e;
            Set<String> stringSet = sharedPreferences.getStringSet(strY, hashSet2);
            aluu aluuVarK = null;
            String string = sharedPreferences.getString(tym.y("offline_refresh_continuation_token_%s", str), null);
            long j = sharedPreferences.getLong(tym.y("offline_refresh_continuation_expiration_%s", str), -1L);
            if (string == null || j <= 0) {
                axmqVar = null;
            } else {
                try {
                    axmqVar = new axmq(string, j);
                } catch (Throwable th2) {
                    th = th2;
                    aappVar = this;
                }
            }
            Pair pair = new Pair(stringSet, axmqVar);
            Set<String> set = (Set) pair.first;
            axmq axmqVar2 = (axmq) pair.second;
            int i3 = 0;
            if (set.isEmpty() && axmqVar2 == null) {
                n();
                return 0;
            }
            long epochMilli = this.d.f().toEpochMilli();
            if (axmqVar2 == null) {
                aappVar = this;
                str2 = str;
                aaqnVar2 = aaqnVar;
                if (!set.isEmpty()) {
                    hashSet = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    aoevVar = aappVar.f.b().i;
                    if (aoevVar == null) {
                        aoevVar = aoev.a;
                    }
                    i2 = aoevVar.e;
                    if (i2 > 0 || i2 >= set.size()) {
                        hashSet.addAll(set);
                    } else {
                        int i4 = 0;
                        for (String str3 : set) {
                            if (i4 < aoevVar.e) {
                                hashSet.add(str3);
                            } else {
                                hashSet3.add(str3);
                            }
                            i4++;
                        }
                    }
                    collectionL = aappVar.l(aaqnVar2, hashSet, epochMilli);
                    if (!collectionL.isEmpty()) {
                        try {
                            aluuVarK = aappVar.k(collectionL, false);
                            aappVar.f(str2, aaqnVar2, aluuVarK.d, aluuVarK.f, epochMilli);
                            epochMilli = epochMilli;
                        } catch (wno unused) {
                            aappVar.h.c(new aaii());
                            return 1;
                        }
                    }
                    aappVar.d(str2, hashSet3);
                    if (aluuVarK != null) {
                        aluvVar = aluuVarK.e;
                        if (aluvVar == null) {
                            aluvVar = aluv.a;
                        }
                        if ((aluvVar.b & 1) != 0) {
                            aluvVar2 = aluuVarK.e;
                            if (aluvVar2 == null) {
                                aluvVar2 = aluv.a;
                            }
                            aogdVar = aluvVar2.c;
                            if (aogdVar == null) {
                                aogdVar = aogd.a;
                            }
                            i = aappVar.i(str2, aaqnVar2, aogdVar, epochMilli);
                            if (i == 0) {
                                i3 = i;
                            } else if (i == 1) {
                                i3 = 1;
                            }
                        }
                    }
                    set = hashSet3;
                }
                if (set.isEmpty()) {
                    aappVar.n();
                } else {
                    aappVar.b.d(str2);
                }
            } else if (epochMilli > axmqVar2.a) {
                if (this.g.b()) {
                    this.b.c(str);
                    return 0;
                }
                aappVar = this;
                str2 = str;
                aaqnVar2 = aaqnVar;
                if (!set.isEmpty()) {
                    hashSet = new HashSet();
                    HashSet hashSet4 = new HashSet();
                    aoevVar = aappVar.f.b().i;
                    if (aoevVar == null) {
                        aoevVar = aoev.a;
                    }
                    i2 = aoevVar.e;
                    if (i2 > 0) {
                        hashSet.addAll(set);
                    } else {
                        hashSet.addAll(set);
                    }
                    collectionL = aappVar.l(aaqnVar2, hashSet, epochMilli);
                    if (!collectionL.isEmpty()) {
                        aluuVarK = aappVar.k(collectionL, false);
                        aappVar.f(str2, aaqnVar2, aluuVarK.d, aluuVarK.f, epochMilli);
                        epochMilli = epochMilli;
                    }
                    aappVar.d(str2, hashSet4);
                    if (aluuVarK != null) {
                        aluvVar = aluuVarK.e;
                        if (aluvVar == null) {
                            aluvVar = aluv.a;
                        }
                        if ((aluvVar.b & 1) != 0) {
                            aluvVar2 = aluuVarK.e;
                            if (aluvVar2 == null) {
                                aluvVar2 = aluv.a;
                            }
                            aogdVar = aluvVar2.c;
                            if (aogdVar == null) {
                                aogdVar = aogd.a;
                            }
                            i = aappVar.i(str2, aaqnVar2, aogdVar, epochMilli);
                            if (i == 0) {
                                i3 = i;
                            } else if (i == 1) {
                                i3 = 1;
                            }
                        }
                    }
                    set = hashSet4;
                }
                if (set.isEmpty()) {
                    aappVar.b.d(str2);
                } else {
                    aappVar.n();
                }
            } else {
                aappVar = this;
                str2 = str;
                aaqnVar2 = aaqnVar;
                try {
                    i = aappVar.j(str2, aaqnVar2, (String) axmqVar2.b, epochMilli);
                    if (i == 0) {
                        i3 = i;
                    } else {
                        if (i != 1) {
                            if (!set.isEmpty()) {
                                hashSet = new HashSet();
                                HashSet hashSet5 = new HashSet();
                                aoevVar = aappVar.f.b().i;
                                if (aoevVar == null) {
                                    aoevVar = aoev.a;
                                }
                                i2 = aoevVar.e;
                                if (i2 > 0) {
                                    hashSet.addAll(set);
                                } else {
                                    hashSet.addAll(set);
                                }
                                collectionL = aappVar.l(aaqnVar2, hashSet, epochMilli);
                                if (!collectionL.isEmpty()) {
                                    aluuVarK = aappVar.k(collectionL, false);
                                    aappVar.f(str2, aaqnVar2, aluuVarK.d, aluuVarK.f, epochMilli);
                                    epochMilli = epochMilli;
                                }
                                aappVar.d(str2, hashSet5);
                                if (aluuVarK != null) {
                                    aluvVar = aluuVarK.e;
                                    if (aluvVar == null) {
                                        aluvVar = aluv.a;
                                    }
                                    if ((aluvVar.b & 1) != 0) {
                                        aluvVar2 = aluuVarK.e;
                                        if (aluvVar2 == null) {
                                            aluvVar2 = aluv.a;
                                        }
                                        aogdVar = aluvVar2.c;
                                        if (aogdVar == null) {
                                            aogdVar = aogd.a;
                                        }
                                        i = aappVar.i(str2, aaqnVar2, aogdVar, epochMilli);
                                        if (i == 0) {
                                            i3 = i;
                                        } else if (i == 1) {
                                        }
                                    }
                                }
                                set = hashSet5;
                            }
                            if (set.isEmpty()) {
                                aappVar.b.d(str2);
                            } else {
                                aappVar.n();
                            }
                        }
                        i3 = 1;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            return i3;
        } catch (Throwable th4) {
            th = th4;
            aappVar = this;
        }
        th = th;
        throw th;
    }

    @Override // defpackage.aapr
    public final aluu b(aaqn aaqnVar, Set set, long j, boolean z) {
        try {
            return k(l(aaqnVar, set, j), z);
        } catch (wno unused) {
            return null;
        }
    }

    @Override // defpackage.aapr
    public final synchronized void c(String str, aaqn aaqnVar) {
        taq.c();
        m(str);
        this.e.edit().remove(tym.y("offline_refresh_video_ids_%s", str)).apply();
        aaps aapsVar = this.b;
        aapsVar.h();
        HashSet hashSet = new HashSet();
        for (aamt aamtVar : aaqnVar.l().h()) {
            if (aamtVar.u(this.i)) {
                hashSet.add(aamtVar.b());
            }
        }
        if (hashSet.isEmpty()) {
            n();
        } else {
            d(str, hashSet);
            aapsVar.d(str);
        }
    }

    final void d(String str, Set set) {
        this.e.edit().putStringSet(tym.y("offline_refresh_video_ids_%s", str), set).apply();
    }

    protected void e(aluz aluzVar, aluy aluyVar, aaqn aaqnVar, long j, aams aamsVar) {
        if (aamsVar != null) {
            aogq aogqVar = aluyVar.c;
            if (aogqVar == null) {
                aogqVar = aogq.a;
            }
            aogq aogqVar2 = aogqVar;
            aogp aogpVarA = aogp.a(aogqVar2.h);
            if (aogpVarA == null) {
                aogpVarA = aogp.UNKNOWN;
            }
            String str = aamsVar.b;
            int iOrdinal = aogpVarA.ordinal();
            if (iOrdinal == 1) {
                g(aaqnVar, j, aogqVar2, aamsVar);
                Iterator<E> it = new aihx(aluzVar.c, aluz.a).iterator();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                while (it.hasNext()) {
                    int iOrdinal2 = ((aogc) it.next()).ordinal();
                    if (iOrdinal2 == 1) {
                        z = true;
                        z4 = true;
                    } else if (iOrdinal2 == 2) {
                        z = true;
                        z3 = true;
                    } else if (iOrdinal2 == 4) {
                        z = true;
                        z2 = true;
                    } else if (iOrdinal2 == 5) {
                        z = true;
                    }
                    if (z) {
                        aaqnVar.k().i(str);
                    }
                    if (z2) {
                        aaqnVar.k().h(str);
                    } else if (z3) {
                        aaqnVar.k().f(str);
                    } else if (z4) {
                        aaqnVar.k().g(str);
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    g(aaqnVar, j, aogqVar2, aamsVar);
                    return;
                }
                agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/refresh/DefaultOfflineRefreshController", "updateOrDeleteOfflineVideo", 756, "DefaultOfflineRefreshController.java");
                aogp aogpVarA2 = aogp.a(aogqVar2.h);
                if (aogpVarA2 == null) {
                    aogpVarA2 = aogp.UNKNOWN;
                }
                agrcVar.w("[Offline] Unrecognized OfflineState action: %s", aogpVarA2);
                aaqt aaqtVarL = aaqnVar.l();
                aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                aoenVar.b |= 1;
                aoenVar.c = str;
                aaqtVarL.t(str, (aoen) aihfVarCreateBuilder.build());
                return;
            }
            aaqt aaqtVarL2 = aaqnVar.l();
            aihf aihfVarCreateBuilder2 = aoen.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aoen aoenVar2 = (aoen) aihfVarCreateBuilder2.instance;
            aoenVar2.b |= 1;
            aoenVar2.c = str;
            aofa aofaVar = aluyVar.e;
            if (aofaVar == null) {
                aofaVar = aofa.a;
            }
            int iBf = a.bf(aofaVar.c);
            int i = iBf != 0 ? iBf : 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aoen aoenVar3 = (aoen) aihfVarCreateBuilder2.instance;
            aoenVar3.e = i - 1;
            aoenVar3.b |= 4;
            aaqtVarL2.t(str, (aoen) aihfVarCreateBuilder2.build());
        }
    }

    final void f(String str, aaqn aaqnVar, List list, int i, long j) {
        taq.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aluy aluyVar = (aluy) it.next();
            aogq aogqVar = aluyVar.c;
            if (aogqVar == null) {
                aogqVar = aogq.a;
            }
            aogq aogqVar2 = aogqVar;
            for (aluz aluzVar : aluyVar.d) {
                String str2 = aluzVar.d;
                int i2 = aogqVar2.h;
                aogp aogpVarA = aogp.a(i2);
                if (aogpVarA == null) {
                    aogpVarA = aogp.UNKNOWN;
                }
                if (aogpVarA != aogp.OK) {
                    aogp aogpVarA2 = aogp.a(i2);
                    if (aogpVarA2 == null) {
                        aogpVarA2 = aogp.UNKNOWN;
                    }
                    int iOrdinal = aogpVarA2.ordinal();
                    if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 6) {
                        int i3 = aogqVar2.h;
                    }
                }
                e(aluzVar, aluyVar, aaqnVar, j, aaqnVar.k().b(str2));
            }
        }
        if (i > 0) {
            this.b.f(str, i);
        }
    }

    protected final void g(aaqn aaqnVar, long j, aogq aogqVar, aams aamsVar) {
        aaqr aaqrVarK = aaqnVar.k();
        aamr aamrVarB = aamsVar.b();
        aamrVarB.b = aogqVar;
        aamrVarB.d = j;
        if (aaqrVarK.j(aamrVarB.a())) {
            this.h.c(new aaie(aamsVar.b));
        } else {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/refresh/DefaultOfflineRefreshController", "updateVideoPolicy", 788, "DefaultOfflineRefreshController.java")).w("[Offline] UpdateVideoPolicy failed for video %s", aamsVar.b);
        }
    }
}
