package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pst extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pst(pse pseVar, aier aierVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pseVar;
        this.a = aierVar;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            Object obj2 = this.b;
            return new pst((pse) obj2, (aier) this.a, (String) this.c, awoqVar, 1);
        }
        Object obj3 = this.a;
        return new pst((psw) obj3, (plv) this.b, (List) this.c, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((pst) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pst) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = false;
        char c = 1;
        if (this.$cid == 0) {
            atqp.j(obj);
            ?? r8 = this.c;
            plv plvVar = (plv) this.b;
            boolean zA = plvVar.a();
            boolean zB = plvVar.b();
            if ((r8 instanceof Collection) && r8.isEmpty()) {
                z = true;
            } else {
                Iterator it = r8.iterator();
                while (it.hasNext()) {
                    if (((pxk) it.next()).b()) {
                    }
                }
                z = true;
            }
            return ((psw) this.a).d.a(new pql(zA, zB, z));
        }
        atqp.j(obj);
        try {
            hlc hlcVar = (hlc) ((agfa) ((pse) this.b).b).a;
            Object obj2 = this.a;
            switch ((aier) obj2) {
                case REGISTRATION_REASON_UNSPECIFIED:
                case SERVER_SYNC_INSTRUCTION:
                case GUNS_MIGRATION:
                case REGISTRATION_ID_CHANGED:
                case GROWTHKIT_PERIODIC_REGISTRATION:
                case PERIODIC_REGISTRATION:
                case GMSCORE_DEBUG:
                    Object obj3 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false) && c == '\t' && awrc.c(obj3, "USER_CHANGE")) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case DEVICE_START:
                    c = 2;
                    Object obj4 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case APP_UPDATED:
                    c = 3;
                    Object obj5 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case ACCOUNT_CHANGED:
                    c = 4;
                    Object obj6 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case LOCALE_CHANGED:
                    c = 5;
                    Object obj7 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case TIMEZONE_CHANGED:
                    c = 6;
                    Object obj8 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case COLLABORATOR_API_CALL:
                    c = '\t';
                    Object obj9 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case APP_BLOCK_STATE_CHANGED:
                    c = 7;
                    Object obj10 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                case CHANNEL_BLOCK_STATE_CHANGED:
                    c = '\b';
                    Object obj11 = this.c;
                    if (hlcVar.c.l(245, 45803126L, false)) {
                        ((aabz) hlcVar.b.io()).d(aaby.a);
                    }
                    return awmy.a;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(obj2))));
            }
        } catch (Exception e) {
            ((agsj) ((agsj) pse.a.c()).j(e)).t("Failed to execute YT pre-registration callback.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pst(psw pswVar, plv plvVar, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = pswVar;
        this.b = plvVar;
        this.c = list;
    }
}
