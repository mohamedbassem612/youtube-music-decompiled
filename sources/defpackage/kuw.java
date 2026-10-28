package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kuw implements kvb {
    private final /* synthetic */ int $cid;

    public kuw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.kvb
    public final kva a(Context context, String str, kuz kuzVar) {
        kva kvaVar;
        int iB;
        int i = this.$cid;
        int i2 = -1;
        if (i == 0) {
            kvaVar = new kva();
            int iA = kuzVar.a(context, str);
            kvaVar.a = iA;
            if (iA != 0) {
                kvaVar.c = -1;
            } else {
                int iB2 = kuzVar.b(context, str, true);
                kvaVar.b = iB2;
                if (iB2 != 0) {
                    kvaVar.c = 1;
                }
            }
        } else if (i != 1) {
            int i3 = 0;
            if (i == 2) {
                kvaVar = new kva();
                kvaVar.a = kuzVar.a(context, str);
                int iB3 = kuzVar.b(context, str, true);
                kvaVar.b = iB3;
                int i4 = kvaVar.a;
                if (i4 == 0) {
                    if (iB3 == 0) {
                        i2 = 0;
                    }
                    kvaVar.c = i2;
                } else {
                    i3 = i4;
                }
                if (i3 < iB3) {
                    i2 = 1;
                }
                kvaVar.c = i2;
            } else if (i != 3) {
                kvaVar = new kva();
                kvaVar.a = kuzVar.a(context, str);
                int iB4 = kuzVar.b(context, str, true);
                kvaVar.b = iB4;
                int i5 = kvaVar.a;
                if (i5 == 0) {
                    if (iB4 == 0) {
                        i2 = 0;
                    }
                    kvaVar.c = i2;
                } else {
                    i3 = i5;
                }
                if (iB4 >= i3) {
                    i2 = 1;
                }
                kvaVar.c = i2;
            } else {
                kvaVar = new kva();
                int iA2 = kuzVar.a(context, str);
                kvaVar.a = iA2;
                if (iA2 != 0) {
                    iB = kuzVar.b(context, str, false);
                    kvaVar.b = iB;
                } else {
                    iB = kuzVar.b(context, str, true);
                    kvaVar.b = iB;
                }
                int i6 = kvaVar.a;
                if (i6 == 0) {
                    if (iB == 0) {
                        i2 = 0;
                    }
                    kvaVar.c = i2;
                } else {
                    i3 = i6;
                }
                if (i3 < iB) {
                    i2 = 1;
                }
                kvaVar.c = i2;
            }
        } else {
            kvaVar = new kva();
            int iB5 = kuzVar.b(context, str, true);
            kvaVar.b = iB5;
            if (iB5 != 0) {
                kvaVar.c = 1;
            } else {
                int iA3 = kuzVar.a(context, str);
                kvaVar.a = iA3;
                if (iA3 != 0) {
                    kvaVar.c = -1;
                }
            }
        }
        return kvaVar;
    }
}
