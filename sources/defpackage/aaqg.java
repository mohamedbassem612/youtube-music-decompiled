package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aaqg {
    public final SharedPreferences b;
    protected final vyo c;
    protected final aauk d;
    public final agke e;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final abfv g;
    private static final agrf h = agrf.h("com/google/android/libraries/youtube/offline/settings/DefaultOfflineSettings");
    static final aohx a = aohx.SD;

    public aaqg(SharedPreferences sharedPreferences, vyo vyoVar, int i, aauk aaukVar, abfv abfvVar) {
        this.b = sharedPreferences;
        this.c = vyoVar;
        this.d = aaukVar;
        this.g = abfvVar;
        ArrayList arrayList = new ArrayList();
        for (aohx aohxVar : aaus.c.keySet()) {
            if (aaus.a(aohxVar, 0) <= i) {
                arrayList.add(aohxVar);
            }
        }
        agke agkeVarN = agke.n(arrayList);
        this.e = agkeVarN;
        ArrayList arrayList2 = new ArrayList();
        aohx aohxVar2 = aohx.LD;
        if (agkeVarN.contains(aohxVar2)) {
            arrayList2.add(aohxVar2);
        }
        aohx aohxVar3 = aohx.SD;
        if (agkeVarN.contains(aohxVar3)) {
            arrayList2.add(aohxVar3);
        }
        aohx aohxVar4 = aohx.HD;
        if (agkeVarN.contains(aohxVar4)) {
            arrayList2.add(aohxVar4);
        }
        agke.n(arrayList2);
    }

    public final void A(String str, boolean z) {
        this.b.edit().putBoolean(tym.y("should_record_offline_playback_last_position_%s", str), z).apply();
    }

    public final boolean B(String str) {
        return this.b.getBoolean(tym.y("should_record_offline_playback_last_position_%s", str), true);
    }

    public final boolean C(String str, String str2) {
        SharedPreferences sharedPreferences = this.b;
        String strY = tym.y("offline_identity_nonce_mapping_%s", str);
        if (sharedPreferences.edit().putString(strY, str2).commit()) {
            return true;
        }
        sharedPreferences.edit().remove(strY).apply();
        return false;
    }

    public final String D(tqa tqaVar) {
        return this.b.getString("video_storage_location_on_sdcard", tqaVar.c(tqaVar.b()));
    }

    public float a(String str) {
        return 0.0f;
    }

    public aodp d(aohx aohxVar) {
        aoev aoevVar = this.c.b().i;
        if (aoevVar == null) {
            aoevVar = aoev.a;
        }
        if (aoevVar.m) {
            switch (aohxVar.ordinal()) {
                case 1:
                case 5:
                    return aodp.OFFLINE_AUDIO_QUALITY_LOW;
                case 2:
                case 6:
                    return aodp.OFFLINE_AUDIO_QUALITY_MEDIUM;
                case 3:
                case 7:
                case 8:
                case 9:
                case 10:
                    return aodp.OFFLINE_AUDIO_QUALITY_HIGH;
            }
        }
        return aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN;
    }

    public aohx e() {
        return r(a);
    }

    public boolean j() {
        return this.b.getBoolean("offline_policy", false);
    }

    public boolean n() {
        return this.b.getBoolean("offline_use_sd_card", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, tpq] */
    public final long o(String str) {
        atpt atptVar = (atpt) this.g.a.c();
        atps atpsVar = atps.a;
        str.getClass();
        atps atpsVar2 = (atps) atptVar.d.get(str);
        if (atpsVar2 != null) {
            atpsVar = atpsVar2;
        }
        return atpsVar.c;
    }

    public final long p(String str) {
        return this.b.getLong(tym.y("offline_auto_offline_interval_%s", str), 0L);
    }

    public final long q(String str) {
        long jD = this.d.b.d(24, 45765983L);
        return jD <= 0 ? this.b.getLong(tym.y("offline_resync_interval_%s", str), 0L) : jD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aohx r(aohx aohxVar) {
        String string = this.b.getString(gzj.OFFLINE_QUALITY, null);
        if (string == null) {
            return aohxVar;
        }
        try {
            int i = Integer.parseInt(string);
            agqs agqsVarListIterator = this.e.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                aohx aohxVar2 = (aohx) agqsVarListIterator.next();
                if (aaus.a(aohxVar2, -1) == i) {
                    return aohxVar2;
                }
            }
            return aohxVar;
        } catch (NumberFormatException unused) {
            return aohxVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tpq] */
    public final atpr s() {
        abfv abfvVar = this.g;
        if (!abfvVar.v()) {
            return j() ? atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE : atpr.ANY;
        }
        atpr atprVarA = atpr.a(((atpt) abfvVar.b.c()).c);
        if (atprVarA == null) {
            atprVarA = atpr.UNKNOWN;
        }
        return atprVarA == atpr.UNKNOWN ? atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE : atprVarA;
    }

    public final String t(String str) {
        return this.b.getString(tym.y("offline_identity_nonce_mapping_%s", str), str);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tpq] */
    public final void w(String str, boolean z) {
        taf.j(this.g.b.b(new ukt(str, z, 5)), new ztb(7));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tpq] */
    public final void x(String str, long j) {
        taf.j(this.g.a.b(new rwf(str, j, 3)), new ztb(6));
    }

    public final void y(String str, long j) {
        this.b.edit().putLong(tym.y("offline_auto_offline_interval_%s", str), j).apply();
    }

    public final void z(String str, long j) {
        this.b.edit().putLong(tym.y("offline_resync_interval_%s", str), j).apply();
    }
}
