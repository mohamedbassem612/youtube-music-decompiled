package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwi extends jwm {
    public jwi(String str, Integer num, Integer num2) {
        super(1, str, num, num2);
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.b, ((Integer) e()).intValue()));
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str))) : (Integer) e();
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.b, ((Integer) e()).intValue()));
    }
}
