package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ampw implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ampw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        String strE;
        String strE2;
        switch (this.$cid) {
            case 0:
                return new ampv((amqa) ((amqa) obj).toBuilder().build());
            case 1:
                aheu aheuVar = ahdm.a;
                return ((ahdm) obj).c.c;
            case 2:
                return ((MessageDigest) obj).getAlgorithm();
            case 3:
                Context context = (Context) obj;
                String str = auqn.a;
                if (str != null) {
                    return str;
                }
                synchronized (auqn.class) {
                    strE = auqn.a;
                    if (strE == null) {
                        strE = qke.e(context, "com.google.android.libraries.consentverifier");
                        auqn.a = strE;
                    }
                    break;
                }
                return strE;
            case 4:
                return auqw.a((Context) obj);
            case 5:
                Context context2 = (Context) obj;
                String str2 = auwk.a;
                if (str2 != null) {
                    return str2;
                }
                synchronized (auwk.class) {
                    strE2 = auwk.a;
                    if (strE2 == null) {
                        strE2 = qke.e(context2, "com.google.android.libraries.user.profile.photopicker");
                        auwk.a = strE2;
                    }
                    break;
                }
                return strE2;
            case 6:
                return auwo.a((Context) obj);
            default:
                Logger logger = avie.f;
                return ((avid) obj).a;
        }
    }
}
