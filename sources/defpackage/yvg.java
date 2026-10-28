package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvg implements zgg {
    private final String a;

    public yvg(String str) {
        this.a = str;
    }

    @Override // defpackage.zgg
    public final String a(long j) {
        String str = this.a;
        if (str.length() <= 85000) {
            return this.a;
        }
        try {
            int i = yvq.a;
            return aaqc.c(Arrays.copyOf(Base64.decode(str, 11), 65000));
        } catch (IllegalArgumentException e) {
            zhr.c(zhq.DRM, e, "Error base64 decoding. Falling back to basic string trimming.", new Object[0]);
            return String.format("%.65000s", this.a);
        }
    }
}
