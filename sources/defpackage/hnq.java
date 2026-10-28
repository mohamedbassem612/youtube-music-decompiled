package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnq implements SharedPreferences.OnSharedPreferenceChangeListener, zwg {
    public final jkp a;
    public final awlo b = new awlo();
    public final awlo c = new awlo();
    public final awlo d = new awlo();
    public final Context e;
    public final zwb f;
    public final Executor g;
    public final syn h;

    public hnq(SharedPreferences sharedPreferences, jkp jkpVar, Context context, syn synVar, zwb zwbVar, Executor executor) {
        this.a = jkpVar;
        this.e = context;
        this.h = synVar;
        this.f = zwbVar;
        this.g = executor;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public static int b(aohx aohxVar, aodp aodpVar, int i) {
        int iOrdinal = aohxVar.ordinal();
        int i2 = 8;
        int i3 = 4;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i2 = 26;
            } else if (iOrdinal == 4) {
                i2 = 0;
            }
        }
        int iOrdinal2 = aodpVar.ordinal();
        if (iOrdinal2 == 1) {
            i3 = 2;
        } else if (iOrdinal2 != 2 && iOrdinal2 == 3) {
            i3 = 7;
        }
        return (i2 + i3) * i;
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        jko jkoVarEdit = this.a.edit();
        jkoVarEdit.c(zwaVar, gzj.AUTO_OFFLINE_ENABLED);
        jkoVarEdit.c(zwaVar, gzj.AUTO_OFFLINE_MAX_NUM_SONGS);
        jkoVarEdit.c(zwaVar, "auto_offline_edu_shelf_dismissed");
        jkoVarEdit.commit();
    }

    public final int c() {
        return this.a.getInt(gzj.AUTO_OFFLINE_MAX_NUM_SONGS, 250);
    }

    public final void d(boolean z) {
        if (z != g()) {
            jko jkoVarEdit = this.a.edit();
            jkoVarEdit.a(gzj.AUTO_OFFLINE_ENABLED, z);
            jkoVarEdit.apply();
        }
    }

    public final void e(int i) {
        jko jkoVarEdit = this.a.edit();
        jkoVarEdit.b(gzj.AUTO_OFFLINE_MAX_NUM_SONGS, i);
        jkoVarEdit.apply();
    }

    public final boolean f() {
        return this.a.getBoolean("auto_offline_edu_shelf_dismissed", false);
    }

    public final boolean g() {
        return this.a.getBoolean(gzj.AUTO_OFFLINE_ENABLED, false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        jkp jkpVar = this.a;
        if (jkpVar.b(gzj.AUTO_OFFLINE_ENABLED).equals(str)) {
            this.b.kk(Boolean.valueOf(g()));
        } else if (jkpVar.b(gzj.AUTO_OFFLINE_MAX_NUM_SONGS).equals(str)) {
            this.c.kk(Integer.valueOf(c()));
        }
    }
}
