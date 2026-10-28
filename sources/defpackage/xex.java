package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xex implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xex(abmo abmoVar, acip acipVar, abnl abnlVar, abnp abnpVar, abmj abmjVar, int i) {
        this.$cid = i;
        this.d = abmoVar;
        this.e = acipVar;
        this.b = abnlVar;
        this.c = abnpVar;
        this.a = abmjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [abmj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, tag] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, xzc] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            alox aloxVar = (alox) obj;
            agrf agrfVar = xez.b;
            ?? r5 = this.e;
            Object obj2 = this.d;
            this.a.b(tai.b, new zdy((xev) this.b, (xic) this.c, (xdz) obj2, aloxVar, (zwa) r5, 1));
            return;
        }
        if (i == 1) {
            ((gug) this.a).f((amlg) this.c, (ajwo) this.b, this.e, obj);
            return;
        }
        if (i != 2) {
            Object obj3 = this.e;
            wjf wjfVar = (wjf) obj;
            if (obj3 != null) {
                abmo abmoVar = (abmo) this.d;
                if (Objects.equals(obj3, abmoVar.f)) {
                    abmoVar.e((abnl) this.b, (abnp) this.c, wjfVar, this.a);
                    return;
                }
                return;
            }
            return;
        }
        Optional optional = (Optional) obj;
        boolean zIsEmpty = optional.isEmpty();
        Object obj4 = this.e;
        Object obj5 = this.a;
        if (zIsEmpty) {
            ((agrc) ((agrc) xpc.a.b().i(agso.a, "MdxConnectCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver", "resolve", 152, "MdxConnectCommandResolver.java")).t("Cannot get valid RouteInfo. Skip connect.");
            ((xpc) obj5).e((amyb) obj4);
            return;
        }
        xpc xpcVar = (xpc) obj5;
        ycp ycpVar = xpcVar.l;
        amyb amybVar = (amyb) obj4;
        amye amyeVar = amybVar.e;
        if (amyeVar == null) {
            amyeVar = amye.a;
        }
        amyv amyvVarA = amyv.a(amyeVar.b);
        if (amyvVarA == null) {
            amyvVarA = amyv.MDX_SESSION_SOURCE_UNKNOWN;
        }
        ycpVar.f(amyvVarA);
        aihf builder = ((aihn) obj4).toBuilder();
        if ((amybVar.c & 16) != 0) {
            ajwo ajwoVar = amybVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            Object obj6 = this.c;
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            ajwo ajwoVar2 = (ajwo) obj6;
            if ((ajwoVar2.b & 1) != 0) {
                aigj aigjVar = ajwoVar2.c;
                aihhVar.copyOnWrite();
                ajwo ajwoVar3 = (ajwo) aihhVar.instance;
                aigjVar.getClass();
                ajwoVar3.b |= 1;
                ajwoVar3.c = aigjVar;
            }
            aihl aihlVar = aoaq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            aihi aihiVar = (aihi) obj6;
            aihiVar.c(aihlVarCheckIsLite);
            if (aihiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                aihiVar.c(aihlVarCheckIsLite2);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite2.d);
                aihhVar.e(aihlVar, (aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
            builder.copyOnWrite();
            amyb amybVar2 = (amyb) builder.instance;
            ajwo ajwoVar4 = (ajwo) aihhVar.build();
            ajwoVar4.getClass();
            amybVar2.g = ajwoVar4;
            amybVar2.c |= 16;
        }
        xpcVar.f.execute(afwl.i(new oox(xpcVar, amybVar, optional, (xvr) this.d, builder, (xzc) this.b, 2)));
    }

    public /* synthetic */ xex(gug gugVar, amlg amlgVar, ajwo ajwoVar, Map map, zwa zwaVar, int i) {
        this.$cid = i;
        this.a = gugVar;
        this.c = amlgVar;
        this.b = ajwoVar;
        this.e = map;
        this.d = zwaVar;
    }

    public /* synthetic */ xex(tag tagVar, xev xevVar, xic xicVar, xdz xdzVar, zwa zwaVar, int i) {
        this.$cid = i;
        this.a = tagVar;
        this.b = xevVar;
        this.c = xicVar;
        this.d = xdzVar;
        this.e = zwaVar;
    }

    public /* synthetic */ xex(xpc xpcVar, amyb amybVar, ajwo ajwoVar, xvr xvrVar, xzc xzcVar, int i) {
        this.$cid = i;
        this.a = xpcVar;
        this.e = amybVar;
        this.c = ajwoVar;
        this.d = xvrVar;
        this.b = xzcVar;
    }
}
