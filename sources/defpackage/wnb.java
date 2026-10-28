package defpackage;

import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.util.Base64;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wnb {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/rollouttoken/RolloutTokenStoreImpl");
    private final tqj b;
    private String c;

    public wnb(tqj tqjVar) {
        this.b = tqjVar;
    }

    public final synchronized String a() {
        String strEncode;
        strEncode = this.c;
        if (strEncode == null) {
            tqj tqjVar = this.b;
            int i = tqr.a;
            int iA = tqjVar.a(400768);
            if (iA <= 0) {
                strEncode = "";
            } else {
                strEncode = URLEncoder.encode(Base64.getUrlEncoder().encodeToString(tym.aw(tqjVar.r(), iA)), StandardCharsets.UTF_8);
            }
            this.c = strEncode;
        }
        return strEncode;
    }

    public final synchronized void b(String str) {
        if (Objects.equals(this.c, str)) {
            return;
        }
        try {
            tqj tqjVar = this.b;
            int i = tqr.a;
            byte[] bArrDecode = Base64.getUrlDecoder().decode(URLDecoder.decode(str == null ? "" : str, StandardCharsets.UTF_8));
            long[] jArrAx = tym.ax(bArrDecode);
            int i2 = tqg.a;
            int length = jArrAx.length;
            if (length > 6) {
                throw new IllegalArgumentException("String is too long to be stored in BootstrapStore.");
            }
            tqh tqhVarD = tqjVar.d(7);
            tqhVarD.b(400768, bArrDecode.length);
            int iMin = Math.min(6, length);
            int i3 = 7168;
            for (int i4 = 0; i4 < iMin; i4++) {
                int[] iArr = tqhVarD.a;
                int i5 = tqhVarD.e;
                iArr[i5] = 4194304 | i3;
                long[] jArr = tqhVarD.b;
                tqhVarD.e = i5 + 1;
                jArr[i5] = jArrAx[i4];
                i3 += 64;
            }
            tqhVarD.a();
            this.c = str;
        } catch (IllegalArgumentException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/rollouttoken/RolloutTokenStoreImpl", "setRolloutToken", 47, "RolloutTokenStoreImpl.java")).B("Failed to set rollout token due to invalid token: %s. %s", str, e.getMessage());
        }
    }
}
