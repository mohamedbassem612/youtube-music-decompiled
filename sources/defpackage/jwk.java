package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwk extends jwm {
    public jwk(String str, Float f, Float f2) {
        super(1, str, f, f2);
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.b, ((Float) e()).floatValue()));
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str))) : (Float) e();
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) e()).floatValue()));
    }
}
