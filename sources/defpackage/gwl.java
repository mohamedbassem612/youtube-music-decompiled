package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwl implements zza {
    public final cf a;
    public final tbt b;
    public final huf c;
    public final bp d;
    public final Executor e;
    public final ScheduledExecutorService f;
    private final ttm g;
    private final vxe h;
    private final ajwo i;
    private final hpy j;
    private final hpb k;
    private final xgm l;
    private final List m;
    private final Object n;
    private final ajwo o;
    private final jki p;
    private final jin q;
    private final vxz r;
    private final vxz s;
    private final grj t;
    private final hef u;
    private final jij v;

    public gwl(List list, ajwo ajwoVar, Object obj, ajwo ajwoVar2, cf cfVar, ttm ttmVar, vxe vxeVar, tbt tbtVar, hpy hpyVar, hpb hpbVar, jin jinVar, huf hufVar, grj grjVar, xgm xgmVar, bp bpVar, jki jkiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, hef hefVar, jij jijVar, vxz vxzVar, vxz vxzVar2) {
        this.m = list;
        this.i = ajwoVar;
        this.n = obj;
        this.o = ajwoVar2;
        this.a = cfVar;
        this.g = ttmVar;
        this.h = vxeVar;
        this.b = tbtVar;
        this.j = hpyVar;
        this.k = hpbVar;
        this.q = jinVar;
        this.c = hufVar;
        this.t = grjVar;
        this.l = xgmVar;
        this.d = bpVar;
        this.p = jkiVar;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.u = hefVar;
        this.v = jijVar;
        this.r = vxzVar;
        this.s = vxzVar2;
    }

    private final void f() {
        Object obj = this.n;
        if (obj instanceof anzi) {
            gwm.a.remove((anzi) obj);
        }
    }

    private final void g() {
        bp bpVar = this.d;
        if (bpVar != null) {
            bpVar.iQ(false, false, false);
        }
    }

    private final void h() {
        Object obj = this.n;
        if (obj instanceof anzi) {
            this.t.d((anzi) obj, this.o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.tnh
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(alvy alvyVar) {
        anzi anziVar;
        grj grjVar;
        ajwo ajwoVarA;
        if (alvyVar == null) {
            return;
        }
        ajwo ajwoVar = this.i;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aotf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aotf aotfVar = (aotf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        String str = aotfVar.d;
        if (gwm.d(aotfVar, this.s)) {
            this.v.m(alvyVar);
        }
        if ((alvyVar.b & SemanticState.Multiline) != 0) {
            this.l.hB().d(new xgj(alvyVar.l, (amud) null));
        }
        h();
        g();
        vxz vxzVar = this.r;
        int i = 1;
        if (vxzVar.m(202, 45730721L)) {
            for (ajwo ajwoVar2 : alvyVar.g) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                    aihh aihhVar = (aihh) ajwoVar2.toBuilder();
                    aihl aihlVar = aoaq.b;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                    aihhVar.e(aihlVar, (aoar) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2)));
                    aigj aigjVar = ajwoVar.c;
                    aihhVar.copyOnWrite();
                    ajwo ajwoVar3 = (ajwo) aihhVar.instance;
                    aigjVar.getClass();
                    ajwoVar3.b |= 1;
                    ajwoVar3.c = aigjVar;
                    ajwoVar2 = (ajwo) aihhVar.build();
                }
                this.h.a(ajwoVar2);
            }
        } else {
            this.h.e(alvyVar.g, this.n);
        }
        Iterator it = this.m.iterator();
        while (true) {
            int i2 = 5;
            if (!it.hasNext()) {
                this.u.l(i);
                if ((alvyVar.b & SemanticState.LiveRegion) != 0) {
                    HashMap map = new HashMap();
                    Object obj = this.n;
                    if (obj != null) {
                        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                    }
                    vxe vxeVar = this.h;
                    ajwo ajwoVar4 = alvyVar.i;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    vxeVar.c(ajwoVar4, map);
                }
                taf.k(this.a, this.k.o(this.j, str), new gnx(i2), new gyr(this, str, alvyVar, 1, (byte[]) null));
                f();
                return;
            }
            aote aoteVar = (aote) it.next();
            aotd aotdVarA = aotd.a(aoteVar.d);
            if (aotdVarA == null) {
                aotdVarA = aotd.ACTION_UNKNOWN;
            }
            int iOrdinal = aotdVarA.ordinal();
            if (iOrdinal == i || iOrdinal == 2) {
                Object obj2 = this.n;
                if ((obj2 instanceof anzi) && (ajwoVarA = (grjVar = this.t).a((anziVar = (anzi) obj2))) != null) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aotf.b);
                    ajwoVarA.c(aihlVarCheckIsLite4);
                    if (ajwoVarA.j.n(aihlVarCheckIsLite4.d)) {
                        cf cfVar = this.a;
                        alay alayVarD = ackj.d(cfVar.getString(R.string.add_to_playlist));
                        aihf aihfVarCreateBuilder = akdd.a.createBuilder();
                        alay alayVarD2 = ackj.d(cfVar.getString(R.string.are_you_sure));
                        aihfVarCreateBuilder.copyOnWrite();
                        akdd akddVar = (akdd) aihfVarCreateBuilder.instance;
                        alayVarD2.getClass();
                        akddVar.c = alayVarD2;
                        akddVar.b |= i;
                        aihfVarCreateBuilder.aR(ackj.d(cfVar.getString(R.string.already_saved_to_playlist)));
                        ajng ajngVar = ajng.a;
                        aihf aihfVarCreateBuilder2 = ajngVar.createBuilder();
                        ajnf ajnfVar = ajnf.a;
                        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
                        int i3 = i;
                        alay alayVarD3 = ackj.d(cfVar.getString(android.R.string.cancel));
                        aihhVar2.copyOnWrite();
                        ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
                        alayVarD3.getClass();
                        ajnfVar2.m = alayVarD3;
                        ajnfVar2.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ajng ajngVar2 = (ajng) aihfVarCreateBuilder2.instance;
                        ajnf ajnfVar3 = (ajnf) aihhVar2.build();
                        ajnfVar3.getClass();
                        ajngVar2.c = ajnfVar3;
                        ajngVar2.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        akdd akddVar2 = (akdd) aihfVarCreateBuilder.instance;
                        ajng ajngVar3 = (ajng) aihfVarCreateBuilder2.build();
                        ajngVar3.getClass();
                        akddVar2.h = ajngVar3;
                        akddVar2.b |= SemanticState.Focused;
                        aihf aihfVarCreateBuilder3 = ajngVar.createBuilder();
                        aihh aihhVar3 = (aihh) ajnfVar.createBuilder();
                        aihhVar3.copyOnWrite();
                        ajnf ajnfVar4 = (ajnf) aihhVar3.instance;
                        alayVarD.getClass();
                        ajnfVar4.m = alayVarD;
                        ajnfVar4.b |= 64;
                        aihhVar3.copyOnWrite();
                        ajnf ajnfVar5 = (ajnf) aihhVar3.instance;
                        ajwoVar.getClass();
                        ajnfVar5.s = ajwoVar;
                        ajnfVar5.b |= SemanticState.Multiline;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ajng ajngVar4 = (ajng) aihfVarCreateBuilder3.instance;
                        ajnf ajnfVar6 = (ajnf) aihhVar3.build();
                        ajnfVar6.getClass();
                        ajngVar4.c = ajnfVar6;
                        ajngVar4.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        akdd akddVar3 = (akdd) aihfVarCreateBuilder.instance;
                        ajng ajngVar5 = (ajng) aihfVarCreateBuilder3.build();
                        ajngVar5.getClass();
                        akddVar3.g = ajngVar5;
                        akddVar3.b |= 64;
                        if (ajwoVar != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            akdd akddVar4 = (akdd) aihfVarCreateBuilder.instance;
                            akddVar4.r = ajwoVar;
                            akddVar4.b |= 134217728;
                        }
                        aihf aihfVarCreateBuilder4 = akdb.a.createBuilder();
                        aihf aihfVarCreateBuilder5 = akdc.a.createBuilder();
                        aihfVarCreateBuilder5.copyOnWrite();
                        akdc akdcVar = (akdc) aihfVarCreateBuilder5.instance;
                        akdd akddVar5 = (akdd) aihfVarCreateBuilder.build();
                        akddVar5.getClass();
                        akdcVar.c = akddVar5;
                        akdcVar.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        akdb akdbVar = (akdb) aihfVarCreateBuilder4.instance;
                        akdc akdcVar2 = (akdc) aihfVarCreateBuilder5.build();
                        akdcVar2.getClass();
                        akdbVar.d = akdcVar2;
                        akdbVar.c |= 1;
                        akdb akdbVar2 = (akdb) aihfVarCreateBuilder4.build();
                        aihh aihhVar4 = (aihh) ajwo.a.createBuilder();
                        aihhVar4.e(akdb.b, akdbVar2);
                        grjVar.d(anziVar, (ajwo) aihhVar4.build());
                        i = i3;
                    }
                }
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 11 || iOrdinal == 12) {
                        if (!vxzVar.l(240, 45794845L, false)) {
                            CharSequence text = this.a.getText(R.string.edit_playlist_done);
                            jin jinVar = this.q;
                            jio jioVarE = jin.e();
                            ((jik) jioVarE).k(text);
                            jinVar.d(jioVarE.b());
                        }
                    } else if (iOrdinal != 23) {
                        switch (iOrdinal) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                                CharSequence text2 = this.a.getText(R.string.edit_playlist_done);
                                jin jinVar2 = this.q;
                                jio jioVarE2 = jin.e();
                                ((jik) jioVarE2).k(text2);
                                jinVar2.d(jioVarE2.b());
                                if (vxzVar.l(168, 45644282L, false)) {
                                    aotd aotdVarA2 = aotd.a(aoteVar.d);
                                    if (aotdVarA2 == null) {
                                        aotdVarA2 = aotd.ACTION_UNKNOWN;
                                    }
                                    if (aotdVarA2.equals(aotd.ACTION_REMOVE_CUSTOM_THUMBNAIL)) {
                                        jki jkiVar = this.p;
                                        if (jkiVar.b() instanceof gqj) {
                                            ((gqj) jkiVar.b()).r();
                                            break;
                                        }
                                    }
                                }
                                jki jkiVar2 = this.p;
                                if (jkiVar2.a(i) instanceof gqj) {
                                    cc ccVarB = jkiVar2.b();
                                    gqj gqjVar = (gqj) jkiVar2.a(i);
                                    jkiVar2.g(ccVarB);
                                    gqjVar.r();
                                } else if (jkiVar2.a(2) instanceof gqj) {
                                    cc ccVarB2 = jkiVar2.b();
                                    cc ccVarA = jkiVar2.a(i);
                                    gqj gqjVar2 = (gqj) jkiVar2.a(2);
                                    jkiVar2.g(ccVarB2);
                                    jkiVar2.g(ccVarA);
                                    gqjVar2.r();
                                }
                                break;
                            default:
                                CharSequence text3 = this.a.getText(R.string.edit_playlist_done);
                                jin jinVar3 = this.q;
                                jio jioVarE3 = jin.e();
                                ((jik) jioVarE3).k(text3);
                                jinVar3.d(jioVarE3.b());
                                break;
                        }
                    }
                }
                Object obj3 = this.n;
                if (obj3 instanceof anzi) {
                    this.b.c(new vvt(obj3));
                }
            }
        }
    }

    public final void e(Throwable th) {
        if (th instanceof toe) {
            jj((toe) th);
            return;
        }
        h();
        String strB = this.g.b(th);
        jin jinVar = this.q;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(strB);
        jinVar.d(jioVarE.b());
        f();
        g();
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        tnm tnmVar;
        h();
        String strB = (toeVar == null || (tnmVar = toeVar.b) == null || tnmVar.d != 401) ? this.g.b(toeVar) : this.a.getString(R.string.edit_playlist_unauthorized_error);
        jin jinVar = this.q;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(strB);
        jinVar.d(jioVarE.b());
        f();
        g();
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
