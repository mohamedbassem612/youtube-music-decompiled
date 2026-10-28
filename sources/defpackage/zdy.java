package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zdy implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zdy(abpd abpdVar, abnl abnlVar, abnp abnpVar, String str, String str2, int i) {
        this.$cid = i;
        this.a = abpdVar;
        this.b = abnlVar;
        this.e = abnpVar;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r0v21, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r2v13, types: [abwo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zlm] */
    /* JADX WARN: Type inference failed for: r4v18, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                Object obj = this.c;
                Object obj2 = this.b;
                Object obj3 = this.a;
                zea zeaVar = (zea) obj3;
                wiu wiuVar = (wiu) obj2;
                zhz zhzVar = (zhz) obj;
                zeaVar.t(wiuVar, zhzVar, zhu.NEW_SURFACE);
                this.d.H();
                Object obj4 = this.e;
                ywy ywyVar = (ywy) obj4;
                ywyVar.i = wiuVar;
                ywyVar.e = new yvw(zhzVar.a(), 0L, 0L);
                ywyVar.y(2);
                ywk ywkVar = (ywk) obj4;
                ywkVar.c = zeaVar.c;
                zdl zdlVar = (zdl) obj3;
                zdlVar.a.C();
                zdlVar.a.Y(ywkVar);
                break;
            case 1:
                ?? r0 = this.c;
                Object obj5 = this.d;
                Object obj6 = this.b;
                Object obj7 = this.a;
                Object obj8 = this.e;
                agrf agrfVar = xez.b;
                yno.dt((xev) obj8, (xic) obj7, (xdz) obj6, (alox) obj5, r0);
                break;
            case 2:
                Object obj9 = this.d;
                Object obj10 = this.b;
                Object obj11 = this.c;
                zea zeaVar2 = (zea) obj11;
                wiu wiuVar2 = (wiu) obj10;
                zhz zhzVar2 = (zhz) obj9;
                zeaVar2.t(wiuVar2, zhzVar2, zhu.CACHE_PURGE);
                String str = ((wja) this.e).g;
                if (!TextUtils.isEmpty(str)) {
                    yha yhaVar = zeaVar2.I;
                    jsk jskVar = (jsk) yhaVar.a.io();
                    if (jskVar != null) {
                        ArrayList arrayList = new ArrayList();
                        if ((jskVar instanceof ygu) && yhaVar.e.aT()) {
                            agke agkeVarU = ((ygu) jskVar).u(str);
                            int size = agkeVarU.size();
                            for (int i = 0; i < size; i++) {
                                arrayList.add(((ygt) agkeVarU.get(i)).b());
                            }
                        } else {
                            for (String str2 : jskVar.h()) {
                                if (str.equals(zik.bx(str2))) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            hna.ae(jskVar, (String) it.next());
                        }
                    }
                }
                Object obj12 = this.a;
                ywy ywyVar2 = (ywy) obj12;
                ywyVar2.i = wiuVar2;
                ywyVar2.e = new yvw(zhzVar2.a(), 0L, 0L);
                ywyVar2.y(2);
                ywk ywkVar2 = (ywk) obj12;
                ywkVar2.c = zeaVar2.c;
                ((zdl) obj11).a.Y(ywkVar2);
                break;
            case 3:
                Object obj13 = this.c;
                Object obj14 = this.d;
                Object obj15 = this.b;
                Object obj16 = this.a;
                zea zeaVar3 = (zea) obj16;
                wiu wiuVar3 = (wiu) obj15;
                zhz zhzVar3 = (zhz) obj14;
                zeaVar3.t(wiuVar3, zhzVar3, (zhu) obj13);
                ywk ywkVar3 = zeaVar3.f;
                ywkVar3.i = wiuVar3;
                ywkVar3.d = (wja) this.e;
                ywkVar3.e = new yvw(zhzVar3.a(), 0L, 0L);
                ywkVar3.y(2);
                ywkVar3.c = zeaVar3.c;
                ((zdl) obj16).a.Y(zeaVar3.f);
                break;
            case 4:
                Object obj17 = this.a;
                Object obj18 = this.b;
                Object obj19 = this.e;
                String str3 = (String) this.c;
                abnp abnpVar = (abnp) obj19;
                abnl abnlVar = (abnl) obj18;
                abpd abpdVar = (abpd) obj17;
                yrr yrrVarE = abpdVar.e(abnlVar, abnpVar, str3, null);
                if (yrrVarE != null) {
                    ?? r13 = this.d;
                    if (!TextUtils.isEmpty(r13)) {
                        String str4 = (String) r13;
                        yrrVarE.b(str4);
                        yrrVarE.x = 4;
                        abrg abrgVar = abpdVar.c;
                        Set set = abpdVar.e;
                        xir xirVar = abnpVar.b;
                        abpdVar.j(str4, str3, abrgVar.c(abnlVar, -1, null, set, xirVar, str3), yrrVarE, true, false, xirVar, abnlVar, false);
                    }
                }
                break;
            case 5:
                ?? r1 = this.b;
                Object obj20 = this.d;
                Object obj21 = this.c;
                ((abpd) this.e).u((String) this.a, (String) obj21, (byte[]) obj20, r1);
                break;
            case 6:
                abwn abwnVar = (abwn) this.a;
                abwp abwpVar = abwnVar.e;
                ?? r2 = this.c;
                ?? r4 = this.d;
                ?? r3 = this.b;
                if (!abwpVar.f(r3, r4, r2)) {
                    abwpVar.c.execute(afwl.i(new aasv(abwnVar, (wjf) r3, (absh) this.e, (acey) r4, 10)));
                }
                break;
            default:
                ?? r5 = this.d;
                if (r5.ad()) {
                    ?? r6 = this.e;
                    Object obj22 = this.a;
                    ((abwn) this.c).e.d(this.b, (abnl) obj22, r6, r5);
                }
                break;
        }
    }

    public /* synthetic */ zdy(abpd abpdVar, String str, String str2, byte[] bArr, sxu sxuVar, int i) {
        this.$cid = i;
        this.e = abpdVar;
        this.a = str;
        this.c = str2;
        this.d = bArr;
        this.b = sxuVar;
    }

    public /* synthetic */ zdy(abwn abwnVar, acey aceyVar, wjf wjfVar, abnl abnlVar, xir xirVar, int i) {
        this.$cid = i;
        this.c = abwnVar;
        this.d = aceyVar;
        this.b = wjfVar;
        this.a = abnlVar;
        this.e = xirVar;
    }

    public /* synthetic */ zdy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
        this.e = obj5;
    }

    public /* synthetic */ zdy(xev xevVar, xic xicVar, xdz xdzVar, alox aloxVar, zwa zwaVar, int i) {
        this.$cid = i;
        this.e = xevVar;
        this.a = xicVar;
        this.b = xdzVar;
        this.d = aloxVar;
        this.c = zwaVar;
    }

    public /* synthetic */ zdy(zea zeaVar, wiu wiuVar, zhz zhzVar, wja wjaVar, ywk ywkVar, int i) {
        this.$cid = i;
        this.c = zeaVar;
        this.b = wiuVar;
        this.d = zhzVar;
        this.e = wjaVar;
        this.a = ywkVar;
    }

    public /* synthetic */ zdy(zea zeaVar, wiu wiuVar, zhz zhzVar, zlm zlmVar, ywk ywkVar, int i) {
        this.$cid = i;
        this.a = zeaVar;
        this.b = wiuVar;
        this.c = zhzVar;
        this.d = zlmVar;
        this.e = ywkVar;
    }
}
