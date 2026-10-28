package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkk extends qkm {
    @Override // defpackage.qkm
    public final Object a(Object obj) {
        try {
            return (aulm) aihn.parseFrom(aulm.a, Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
