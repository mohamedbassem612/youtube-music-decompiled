package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwl extends jwm {
    public jwl(String str, String str2, String str3) {
        super(1, str, str2, str3);
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.b, (String) e());
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str)) : (String) e();
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, (String) e());
    }
}
