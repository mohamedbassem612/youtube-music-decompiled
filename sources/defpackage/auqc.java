package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class auqc implements agek {
    private final /* synthetic */ int $cid;

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        String strE;
        String strE2;
        int i = this.$cid;
        if (i == 0) {
            Context context = (Context) obj;
            strE = auqd.a;
            if (strE == null) {
                synchronized (auqd.class) {
                    strE = auqd.a;
                    if (strE == null) {
                        strE = qke.e(context, "com.google.android.gms.clearcut_client");
                        auqd.a = strE;
                    }
                }
            }
        } else if (i == 1) {
            Context context2 = (Context) obj;
            strE = aupv.a;
            if (strE == null) {
                synchronized (aupv.class) {
                    strE = aupv.a;
                    if (strE == null) {
                        strE = qke.e(context2, "com.google.android.gms.auth_account_client");
                        aupv.a = strE;
                    }
                }
            }
        } else if (i == 2) {
            Context context3 = (Context) obj;
            strE = auqs.a;
            if (strE == null) {
                synchronized (auqs.class) {
                    strE = auqs.a;
                    if (strE == null) {
                        strE = qke.e(context3, "com.google.android.gms.device_performance");
                        auqs.a = strE;
                    }
                }
            }
        } else if (i == 3) {
            Context context4 = (Context) obj;
            strE = aurg.b;
            if (strE == null) {
                synchronized (aurg.class) {
                    strE = aurg.b;
                    if (strE == null) {
                        strE = qke.e(context4, "com.google.android.gms.measurement");
                        aurg.b = strE;
                    }
                }
            }
        } else if (i != 4) {
            Context context5 = (Context) obj;
            strE = auws.a;
            if (strE == null) {
                synchronized (auws.class) {
                    strE2 = auws.a;
                    if (strE2 == null) {
                        strE2 = qke.e(context5, "com.google.android.libraries.performance.primes");
                        auws.a = strE2;
                    }
                }
                return strE2;
            }
        } else {
            Context context6 = (Context) obj;
            strE = autz.b;
            if (strE == null) {
                synchronized (autz.class) {
                    strE = autz.b;
                    if (strE == null) {
                        strE = qke.e(context6, "com.google.android.libraries.notifications.platform");
                        autz.b = strE;
                    }
                }
            }
        }
        return strE;
    }
}
