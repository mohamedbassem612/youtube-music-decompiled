package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlo implements jkv {
    static final xgz a = new xgj(xhb.b(65799));
    static final xgz b = new xgj(xhb.b(65800));
    static final xgz c = new xgj(xhb.b(65812));
    public static final xgz d = new xgj(xhb.b(65813));
    public final xgn e;
    private final SharedPreferences f;
    private final jkx g;
    private final cf h;
    private jln i;

    public jlo(xgm xgmVar, SharedPreferences sharedPreferences, jkx jkxVar, cf cfVar) {
        this.e = xgmVar.hB();
        this.f = sharedPreferences;
        this.g = jkxVar;
        this.h = cfVar;
    }

    private final void d() {
        xgn xgnVar = this.e;
        xgnVar.p(a, null);
        xgnVar.p(b, null);
        xgnVar.p(c, null);
        xgnVar.p(d, null);
    }

    @Override // defpackage.jkv
    public final void a(String str, int i) {
        if (i == 104 && str.equals("android.permission.RECORD_AUDIO")) {
            this.f.edit().putBoolean("voice_search_permission_requested", true).apply();
            boolean zB = atb.b(this.h, str);
            xgn xgnVar = this.e;
            if (zB) {
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, b, null);
            } else {
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, c, null);
            }
            d();
        }
    }

    @Override // defpackage.jkv
    public final void b(String str, int i) {
        if (i == 104 && str.equals("android.permission.RECORD_AUDIO")) {
            this.f.edit().putBoolean("voice_search_permission_requested", true).apply();
            this.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, a, null);
            this.i.a();
            d();
        }
    }

    public final void c(jln jlnVar) {
        this.i = jlnVar;
        cf cfVar = this.h;
        if (atb.c(cfVar, "android.permission.RECORD_AUDIO") == 0) {
            this.i.a();
            return;
        }
        xgn xgnVar = this.e;
        xgz xgzVar = a;
        xgnVar.d(xgzVar);
        xgz xgzVar2 = b;
        xgnVar.d(xgzVar2);
        xgz xgzVar3 = c;
        xgnVar.d(xgzVar3);
        xgz xgzVar4 = d;
        xgnVar.d(xgzVar4);
        boolean z = false;
        boolean z2 = this.f.getBoolean("voice_search_permission_requested", false);
        boolean zB = atb.b(cfVar, "android.permission.RECORD_AUDIO");
        boolean z3 = z2 && !zB;
        if (z2 && zB) {
            z = true;
        }
        if (z3) {
            xgnVar.w(xgzVar4, null);
            aebs aebsVarI = aebs.i(R.string.enable_microphone_permissions);
            aebsVarI.k = new qcb(this, null);
            aebsVarI.gT(cfVar.getSupportFragmentManager(), "open_settings_dialog_fragment_tag");
            return;
        }
        xgnVar.w(xgzVar, null);
        xgnVar.w(xgzVar2, null);
        if (z) {
            xgnVar.w(xgzVar3, null);
        }
        this.g.d("android.permission.RECORD_AUDIO", 104, Optional.of(this));
    }
}
