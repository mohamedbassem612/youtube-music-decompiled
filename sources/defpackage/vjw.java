package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vjw {
    public static final auga a;
    private static final auga b;
    private static final auga c;

    static {
        aihf aihfVarCreateBuilder = auga.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auga augaVar = (auga) aihfVarCreateBuilder.instance;
        augaVar.b |= 1;
        augaVar.c = 0.3f;
        aihfVarCreateBuilder.copyOnWrite();
        auga augaVar2 = (auga) aihfVarCreateBuilder.instance;
        augaVar2.b |= 2;
        augaVar2.d = 1.0f;
        a = (auga) aihfVarCreateBuilder.build();
        auga augaVar3 = auga.a;
        b = augaVar3;
        aihf aihfVarCreateBuilder2 = augaVar3.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        auga augaVar4 = (auga) aihfVarCreateBuilder2.instance;
        augaVar4.b |= 1;
        augaVar4.c = 0.12f;
        aihfVarCreateBuilder2.copyOnWrite();
        auga augaVar5 = (auga) aihfVarCreateBuilder2.instance;
        augaVar5.b |= 2;
        augaVar5.d = 0.35f;
        c = (auga) aihfVarCreateBuilder2.build();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040 A[PHI: r5
      0x0040: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:13:0x0027, B:16:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public static Optional a(augy augyVar) {
        Optional optionalOf = Optional.of(a);
        auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
        int i = 2;
        int i2 = (auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).c;
        if (i2 != 0) {
            int i3 = 1;
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = i3;
                    } else if (i2 != 5) {
                        switch (i2) {
                            case 8:
                                i = 5;
                                break;
                            case 9:
                                i = 6;
                                break;
                            case 10:
                                i = 7;
                                break;
                            case 11:
                                i = 8;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    } else {
                        i = 4;
                    }
                }
            } else {
                i = i3;
            }
        } else {
            i = 9;
        }
        if (i == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 != 4) {
            return (i4 == 5 || i4 == 6) ? Optional.of(b) : optionalOf;
        }
        return Optional.of(c);
    }
}
