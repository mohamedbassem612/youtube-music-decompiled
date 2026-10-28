package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyb extends gut {
    private final SharedPreferences a;

    public gyb(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.e);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        this.a.edit().putBoolean("sideloaded_limitations_banner_dismissed", true).apply();
    }
}
