package defpackage;

import android.content.SharedPreferences;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwg extends gut {
    public final tbt a;
    private final jkx b;
    private final SharedPreferences c;

    public gwg(jkx jkxVar, SharedPreferences sharedPreferences, tbt tbtVar) {
        jkxVar.getClass();
        this.b = jkxVar;
        this.c = sharedPreferences;
        this.a = tbtVar;
    }

    private final void d() {
        this.c.edit().putBoolean(true != awk.c() ? "sideloaded_permission_requested_via_mealbar" : "sideloaded_permission_requested_via_mealbar_api_33", true).apply();
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aomo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aomo.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aomr aomrVar = ((aomo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
        if (aomrVar == null) {
            aomrVar = aomr.a;
        }
        aomq aomqVarA = aomq.a(aomrVar.c);
        if (aomqVarA == null) {
            aomqVarA = aomq.INVALID;
        }
        if (aomqVarA == aomq.WRITE_EXTERNAL_STORAGE) {
            this.b.e(Optional.of(new gwf(this, 1)));
            d();
        } else if (aomqVarA == aomq.READ_MEDIA_AUDIO) {
            this.b.f(Optional.of(new gwf(this, 0)));
            d();
        }
    }
}
