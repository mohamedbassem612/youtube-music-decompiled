package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psz {
    private static final agsn a = agsn.h("GnpSdk");
    private final agev b;

    public psz(agev agevVar) {
        this.b = agevVar;
    }

    public final Object a(pqo pqoVar, awoq awoqVar) {
        pqo pqoVar2 = pqo.UNKNOWN;
        int iOrdinal = pqoVar.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? new pla(null) : b(awoqVar);
        }
        return c(awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(awoq awoqVar) throws Throwable {
        psx psxVar;
        if (awoqVar instanceof psx) {
            psxVar = (psx) awoqVar;
            int i = psxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                psxVar.c = i - Integer.MIN_VALUE;
            } else {
                psxVar = new psx(this, awoqVar);
            }
        } else {
            psxVar = new psx(this, awoqVar);
        }
        Object obj = psxVar.a;
        int i2 = psxVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            ((agsj) a.b()).t("YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie");
            return new pkv(new IllegalStateException("YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie"), pkx.l);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            atqp.j(obj);
            return new pla(obj);
        } catch (Exception e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed getting YouTube visitor data cookie");
            return new pkv(e, pkx.m);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(awoq awoqVar) throws Throwable {
        psy psyVar;
        if (awoqVar instanceof psy) {
            psyVar = (psy) awoqVar;
            int i = psyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                psyVar.c = i - Integer.MIN_VALUE;
            } else {
                psyVar = new psy(this, awoqVar);
            }
        } else {
            psyVar = new psy(this, awoqVar);
        }
        Object objI = psyVar.a;
        awox awoxVar = awox.a;
        int i2 = psyVar.c;
        if (i2 == 0) {
            atqp.j(objI);
            agev agevVar = this.b;
            psyVar.c = 1;
            objI = ((kjc) ((agfa) agevVar).a).I(psyVar);
            if (objI == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objI);
        }
        String str = ((lmn) objI).a;
        if (str != null) {
            return new pla(str);
        }
        ((agsj) a.b()).t("Failed to get Zwieback ID");
        return new pkw(new IllegalStateException("Failed to get Zwieback ID"), pkx.j);
    }
}
