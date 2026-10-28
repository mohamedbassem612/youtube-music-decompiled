package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oqb implements egr {
    final /* synthetic */ oqc a;

    public oqb(oqc oqcVar) {
        this.a = oqcVar;
    }

    @Override // defpackage.egr
    public final Bitmap a(ehn ehnVar) {
        Bitmap bitmap;
        String strZ = ahno.Z(ehnVar.e);
        String str = ehnVar.d;
        boolean zStartsWith = str.startsWith("data:image/");
        String strConcat = strZ.concat(str);
        String str2 = true != zStartsWith ? strConcat : str;
        Bitmap bitmap2 = (Bitmap) oqc.b.get(str2);
        if (bitmap2 != null) {
            return bitmap2;
        }
        String str3 = ehnVar.c;
        if (str.startsWith("data:image/")) {
            oqc oqcVar = this.a;
            try {
                int iIndexOf = str.indexOf(";base64,");
                if (iIndexOf == -1) {
                    oqcVar.d.a(aslh.LOG_TYPE_INVALID_FIELD, a.ce(str3, "Malformed base64 data URI for asset: "));
                    bitmap = null;
                } else {
                    byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 8), 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    if (bitmapDecodeByteArray == null) {
                        oqcVar.d.a(aslh.LOG_TYPE_INTERNAL_ERROR, "BitmapFactory.decodeByteArray returned null for base64 image on asset: ".concat(String.valueOf(str3)));
                    }
                    bitmap = bitmapDecodeByteArray;
                }
            } catch (IllegalArgumentException e) {
                oqcVar.d.c(aslh.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, "Error decoding base64 image for asset: ".concat(String.valueOf(str3)), e);
            }
            if (bitmap != null) {
                oqc.b.put(str2, bitmap);
                return bitmap;
            }
        } else {
            if (!ahno.aa(strConcat) && (strConcat.startsWith("http://") || strConcat.startsWith("https://"))) {
                oqc oqcVar2 = this.a;
                if (!oqcVar2.e.add(ehnVar.c)) {
                    return oqc.a;
                }
                oqcVar2.c.a();
                return oqc.a;
            }
            this.a.d.a(aslh.LOG_TYPE_INVALID_FIELD, a.ca(strConcat, str3, "Unsupported URL scheme or local file for Lottie asset ", ": "));
        }
        return null;
    }
}
