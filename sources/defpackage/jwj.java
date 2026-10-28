package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwj extends jwm {
    public jwj(String str, Long l, Long l2) {
        super(1, str, l, l2);
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.b, ((Long) e()).longValue()));
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str))) : (Long) e();
    }

    @Override // defpackage.jwm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) e()).longValue()));
    }
}
