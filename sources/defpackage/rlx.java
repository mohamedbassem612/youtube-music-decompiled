package defpackage;

import android.accounts.Account;
import android.content.Context;
import j$.util.Collection;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rlx {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/account/identity/AccountsChangedHandler");
    public final rmu a;
    public final rre b;
    public final rqa c;
    public final omj d;
    private final rmw f;
    private final rly g;
    private final tbt h;
    private final awmd i;
    private final aunn j;

    public rlx(rmu rmuVar, rmw rmwVar, rly rlyVar, rre rreVar, omj omjVar, rqa rqaVar, awmd awmdVar, tbt tbtVar, aunn aunnVar) {
        this.a = rmuVar;
        this.f = rmwVar;
        this.g = rlyVar;
        this.b = rreVar;
        this.c = rqaVar;
        this.d = omjVar;
        this.h = tbtVar;
        this.i = awmdVar;
        this.j = aunnVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(List list) {
        Account[] accountArr = (Account[]) list.toArray(new Account[0]);
        rmu rmuVar = this.a;
        agkz agkzVar = (agkz) Collection.EL.stream(rmuVar.l(accountArr)).map(new ris(11)).collect(aghu.b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                String str = ((Account) it.next()).name;
                if (!rmuVar.u() || !(rmuVar.e() instanceof rlt) || !((rlt) rmuVar.e()).b.equals(str)) {
                    Context context = this.b.e;
                    String str2 = jxs.a;
                    kro.j(str, "accountName must be provided");
                    kro.g("Calling this from your main thread can lead to deadlock");
                    jxz.e(context);
                    jxm jxmVar = new jxm();
                    jxmVar.c = str;
                    jxmVar.b = 0;
                    for (jxl jxlVar : (List) jxz.d(context, jxz.d, new jxx(jxmVar))) {
                        if (jxlVar.d == 3) {
                            String str3 = jxlVar.f;
                            if (!str3.isEmpty() && !str3.equals(str) && agkzVar.contains(str3)) {
                                rmuVar.q(str3, str);
                                break;
                            }
                        }
                    }
                }
            } catch (IOException | jxr e2) {
                ((agrc) ((agrc) ((agrc) e.c()).j(e2)).k("com/google/android/libraries/youtube/account/identity/AccountsChangedHandler", "handleAccountsRename", (char) 172, "AccountsChangedHandler.java")).t("Error getting Account rename information, continuing regardless.");
            }
        }
    }

    public final void b(List list, boolean z) {
        taq.c();
        if (list.isEmpty()) {
            return;
        }
        this.g.h(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rlt rltVar = (rlt) it.next();
            this.f.n(rltVar);
            this.h.c(new zwf(rltVar));
            Iterator it2 = ((Set) this.i.io()).iterator();
            while (it2.hasNext()) {
                ((zwg) it2.next()).a(rltVar);
            }
        }
        this.a.p(list);
        ((qtf) ((aerv) this.j.io()).g.io()).b(list.size(), Boolean.valueOf(z));
    }
}
