package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class puz implements pum {
    private static final agsn a = agsn.h("GnpSdk");
    private final agev b;
    private final awmd c;
    private final omm d;

    public puz(pls plsVar, agev agevVar, omm ommVar, awmd awmdVar) {
        plsVar.getClass();
        ommVar.getClass();
        awmdVar.getClass();
        this.b = agevVar;
        this.d = ommVar;
        this.c = awmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[Catch: Exception -> 0x0094, TRY_ENTER, TryCatch #0 {Exception -> 0x0094, blocks: (B:21:0x0047, B:34:0x0086, B:30:0x0066, B:32:0x0076, B:37:0x008c, B:38:0x0093), top: B:43:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:21:0x0047, B:34:0x0086, B:30:0x0066, B:32:0x0076, B:37:0x008c, B:38:0x0093), top: B:43:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:21:0x0047, B:34:0x0086, B:30:0x0066, B:32:0x0076, B:37:0x008c, B:38:0x0093), top: B:43:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pum
    public final Object a(pxk pxkVar, awoq awoqVar) throws Throwable {
        puy puyVar;
        Object obj;
        agev agevVar;
        List list;
        if (awoqVar instanceof puy) {
            puyVar = (puy) awoqVar;
            int i = puyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                puyVar.d = i - Integer.MIN_VALUE;
            } else {
                puyVar = new puy(this, awoqVar);
            }
        } else {
            puyVar = new puy(this, awoqVar);
        }
        Object objK = puyVar.b;
        awox awoxVar = awox.a;
        int i2 = puyVar.d;
        try {
            if (i2 == 0) {
                atqp.j(objK);
                if (pxkVar != null) {
                    omm ommVar = this.d;
                    puyVar.a = pxkVar;
                    puyVar.d = 1;
                    objK = ommVar.k(puyVar);
                    if (objK == awoxVar) {
                        obj = pxkVar;
                        return awoxVar;
                    }
                    obj = pxkVar;
                    if (objK == pqk.GNP) {
                        agevVar = this.b;
                        if (!((Boolean) this.c.io()).booleanValue()) {
                            throw new IllegalStateException("GnpRegistrationDataProvider must be provided for unified registrations");
                        }
                        Object obj2 = ((agfa) agevVar).a;
                        puyVar.a = obj;
                        puyVar.d = 2;
                        objK = ((omm) obj2).c(puyVar);
                        if (objK == awoxVar) {
                            return awoxVar;
                        }
                        list = (List) objK;
                        if (list != null) {
                            return list;
                        }
                    }
                }
            } else if (i2 == 1) {
                Object obj3 = puyVar.a;
                atqp.j(objK);
                obj = obj3;
                obj = pxkVar;
                if (objK == pqk.GNP) {
                    agevVar = this.b;
                    if (!((Boolean) this.c.io()).booleanValue()) {
                        throw new IllegalStateException("GnpRegistrationDataProvider must be provided for unified registrations");
                    }
                    Object obj4 = ((agfa) agevVar).a;
                    puyVar.a = obj;
                    puyVar.d = 2;
                    objK = ((omm) obj4).c(puyVar);
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                    list = (List) objK;
                    if (list != null) {
                        return list;
                    }
                }
            } else if (i2 == 2) {
                atqp.j(objK);
                list = (List) objK;
                if (list != null) {
                    return list;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    atqp.j(objK);
                    List list2 = (List) objK;
                    if (list2 != null) {
                        return list2;
                    }
                } catch (Exception e) {
                    ((agsj) ((agsj) a.c()).j(e)).t("Failed getting selection tokens from DevicePayloadProvider");
                }
            }
        } catch (Exception e2) {
            ((agsj) ((agsj) a.c()).j(e2)).t("Failed getting selection tokens from GnpRegistrationDataProvider");
        }
        return null;
    }
}
