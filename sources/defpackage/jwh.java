package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwh extends jwm {
    public jwh(int i, String str, Boolean bool, Boolean bool2) {
        super(i, str, bool, bool2);
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.b, ((Boolean) e()).booleanValue()));
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) e();
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.b, ((Boolean) e()).booleanValue()));
    }
}
