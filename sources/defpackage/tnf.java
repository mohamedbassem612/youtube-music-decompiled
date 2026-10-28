package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class tnf extends tmn {
    private final JSONObject l;
    private final tnh m;
    private final boolean n;
    private final mbc o;

    @Deprecated
    public tnf(String str, JSONObject jSONObject, tnh tnhVar, tng tngVar, boolean z, mbc mbcVar) {
        super(2, str, tngVar);
        this.l = jSONObject;
        this.m = tnhVar;
        this.n = z;
        this.o = mbcVar;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        String str;
        try {
            byte[] bArrE = tnmVar.e();
            Map map = tnmVar.e;
            String str2 = "utf-8";
            if (map != null && (str = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str2 = strArrSplit2[1];
                        break;
                    }
                }
            }
            return tnx.f(new JSONObject(new String(bArrE, str2)), tym.aG(tnmVar, this.o, 0));
        } catch (UnsupportedEncodingException | JSONException e) {
            return tnx.d(new tnp(e));
        }
    }

    @Override // defpackage.tns
    public final Class ab() {
        return JSONObject.class;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final String ac() {
        return this.n ? "application/json" : "application/json; charset=utf-8";
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        tnh tnhVar = this.m;
        JSONObject jSONObject = (JSONObject) obj;
        if (tnhVar != null) {
            tnhVar.a(jSONObject);
        }
    }

    @Override // defpackage.tmn, defpackage.tns
    public final byte[] ae() {
        return this.l.toString().getBytes(StandardCharsets.UTF_8);
    }
}
