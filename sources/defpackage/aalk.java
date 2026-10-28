package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aalk {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/logging/OfflineClientStateLogger");
    public final SharedPreferences b;
    public final vyo c;
    public final aalm d;
    public final awmd e;
    public final awmd f;
    public final mbc g;
    public volatile long h = 0;

    public aalk(SharedPreferences sharedPreferences, vyo vyoVar, aalm aalmVar, awmd awmdVar, awmd awmdVar2, mbc mbcVar) {
        this.b = sharedPreferences;
        this.c = vyoVar;
        this.d = aalmVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = mbcVar;
    }
}
