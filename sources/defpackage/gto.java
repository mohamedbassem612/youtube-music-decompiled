package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gto implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gto(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [avni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, wby] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v42, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, nse] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, nse] */
    /* JADX WARN: Type inference failed for: r2v47, types: [aunn, java.lang.Object] */
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
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = 16;
        int i2 = 4;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                ajwk ajwkVar = (ajwk) obj;
                if (ajwkVar == null || !ajwkVar.g()) {
                    return;
                }
                Object obj2 = this.c;
                ajwo command = ajwkVar.getCommand();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akwh.b);
                aihi aihiVar = (aihi) obj2;
                aihiVar.c(aihlVarCheckIsLite);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
                akwh akwhVar = (akwh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                if (akwhVar.e) {
                    aihh aihhVar = (aihh) command.toBuilder();
                    aihl aihlVar = aoaq.b;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    aihiVar.c(aihlVarCheckIsLite2);
                    Object objK2 = aihiVar.j.k(aihlVarCheckIsLite2.d);
                    aihhVar.e(aihlVar, (aoar) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2)));
                    command = (ajwo) aihhVar.build();
                }
                if (akwhVar.f) {
                    aihh aihhVar2 = (aihh) command.toBuilder();
                    aigj aigjVar = ((ajwo) obj2).c;
                    aihhVar2.copyOnWrite();
                    ajwo ajwoVar = (ajwo) aihhVar2.instance;
                    aigjVar.getClass();
                    ajwoVar.b |= 1;
                    ajwoVar.c = aigjVar;
                    command = (ajwo) aihhVar2.build();
                }
                ((gtp) this.a).b.c(command, this.b);
                return;
            case 1:
                Object obj3 = this.c;
                gsw gswVar = (gsw) this.a;
                xvr xvrVar = (xvr) obj3;
                Optional optionalD = gswVar.d(xvrVar);
                if (!optionalD.isEmpty()) {
                    gswVar.f((dii) optionalD.get(), (amyv) this.b, xvrVar);
                    return;
                } else {
                    ((agrc) ((agrc) gsw.a.c()).k("com/google/android/apps/youtube/music/command/AutoconnectGateCommandResolver", "connectToDesignatedScreenOnceScreenIsAvailable", 395, "AutoconnectGateCommandResolver.java")).t("Couldn't find the designated route to connect to.");
                    gswVar.g.l((xvi) obj3);
                    return;
                }
            case 2:
                ((hgq) this.a).w((hjy) this.c, "onPlayFromMediaId()", (anaf) obj, (znf) this.b);
                return;
            case 3:
                List list = (List) obj;
                boolean zIsEmpty = list.isEmpty();
                ?? r14 = this.c;
                if (zIsEmpty) {
                    r14.c(new huj());
                    return;
                }
                Object obj4 = this.b;
                hoj hojVar = (hoj) this.a;
                afxd afxdVarG = afxd.f(hojVar.b.b(list)).g(new hoh(i3), hojVar.c);
                String str = (String) obj4;
                ListenableFuture listenableFutureA = str.equals("PPSE") ? hojVar.a(afxdVarG) : ahng.n(agpi.a);
                taf.j(ahno.av(afxdVarG, listenableFutureA).k(new hni(hojVar, (ListenableFuture) afxdVarG, str, listenableFutureA, (mbb) r14, 3), hojVar.g), new gtq(r14, i));
                return;
            case 4:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                ?? r15 = this.c;
                if (!zIsPresent) {
                    r15.c(new huj());
                    return;
                }
                Object obj5 = this.b;
                Object obj6 = this.a;
                Object obj7 = optional.get();
                if (obj7 instanceof anjx) {
                    anjx anjxVar = (anjx) obj7;
                    hoj hojVar2 = (hoj) obj6;
                    afxd afxdVarG2 = afxd.f(hojVar2.b.a(kro.an((String) obj5))).g(new hoh(1 == true ? 1 : 0), hojVar2.c);
                    ListenableFuture listenableFutureC = hojVar2.c(anjxVar.e());
                    ListenableFuture listenableFutureB = hojVar2.k.l(36, 45717578L, false) ? hojVar2.b(anjxVar.getAudioPlaylistId()) : ahng.n(Optional.empty());
                    taf.j(ahno.av(afxdVarG2, listenableFutureC, listenableFutureB).k(new hog(hojVar2, anjxVar, listenableFutureC, afxdVarG2, listenableFutureB, (mbb) r15, 0), hojVar2.g), new gtq(r15, i));
                    return;
                }
                Object obj8 = optional.get();
                if (obj8 instanceof anuk) {
                    anuk anukVar = (anuk) obj8;
                    hoj hojVar3 = (hoj) obj6;
                    afxd afxdVarF = afxd.f(hojVar3.b.a(kro.az((String) obj5)));
                    hoh hohVar = new hoh(i2);
                    Executor executor = hojVar3.c;
                    afxd afxdVarG3 = afxdVarF.g(hohVar, executor);
                    afxd afxdVarH = afxd.f(anukVar.k() ? hojVar3.h.f(anukVar.j()) : ahng.n(anukVar.j())).h(new hba(obj6, 15), executor);
                    ListenableFuture listenableFutureA2 = anukVar.k() ? hojVar3.a(afxdVarH) : ahng.n(agpi.a);
                    ListenableFuture listenableFutureB2 = hojVar3.k.l(36, 45717578L, false) ? hojVar3.b(anukVar.getPlaylistId()) : ahng.n(Optional.empty());
                    taf.j(ahno.av(afxdVarG3, afxdVarH, listenableFutureA2, listenableFutureB2).k(new iuh(hojVar3, anukVar, afxdVarH, listenableFutureA2, afxdVarG3, listenableFutureB2, (mbb) r15, 1), hojVar3.g), new gtq(r15, i));
                    return;
                }
                return;
            case 5:
                Optional optional2 = (Optional) obj;
                if (((Instant) this.b).isAfter(Instant.ofEpochSecond(optional2.isPresent() ? ((aphh) optional2.get()).getRefreshTime().longValue() : 0L))) {
                    Object obj9 = this.a;
                    Object obj10 = this.c;
                    aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                    aofhVar.c = 3;
                    aofhVar.b |= 1;
                    huu huuVar = (huu) obj9;
                    String str2 = huuVar.a;
                    String strAy = kro.ay(str2);
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                    strAy.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strAy;
                    aihh aihhVar3 = (aihh) aofg.b.createBuilder();
                    hvb hvbVar = (hvb) obj10;
                    int iK = hmy.k(4, hvbVar.d.intValue(), aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE);
                    aihhVar3.copyOnWrite();
                    aofg aofgVar = (aofg) aihhVar3.instance;
                    aofgVar.c |= 1;
                    aofgVar.d = iK;
                    aihl aihlVar2 = anue.b;
                    aihf aihfVarCreateBuilder2 = anue.a.createBuilder();
                    int iIntValue = ((Integer) huuVar.b.orElse(0)).intValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar = (anue) aihfVarCreateBuilder2.instance;
                    anueVar.c |= 4;
                    anueVar.h = iIntValue;
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar2 = (anue) aihfVarCreateBuilder2.instance;
                    anueVar2.c |= 64;
                    anueVar2.l = 1 == hvbVar.c.b;
                    int i4 = aamn.OFFLINE_IMMEDIATELY.h;
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar3 = (anue) aihfVarCreateBuilder2.instance;
                    anueVar3.c |= 8;
                    anueVar3.i = i4;
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar4 = (anue) aihfVarCreateBuilder2.instance;
                    anueVar4.c |= SemanticState.Focused;
                    anueVar4.m = false;
                    aihhVar3.e(aihlVar2, (anue) aihfVarCreateBuilder2.build());
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                    aofg aofgVar2 = (aofg) aihhVar3.build();
                    aofgVar2.getClass();
                    aofhVar3.e = aofgVar2;
                    aofhVar3.b |= 4;
                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
                    ListenableFuture listenableFutureK = hpb.k((hpy) hvbVar.f.io(), str2, false);
                    hqt hqtVar = new hqt(12);
                    Executor executor2 = hvbVar.e;
                    ahno.at(ahno.ar(listenableFutureK, hqtVar, executor2), new hqd(obj10, aofhVar4, obj9, 3, null), executor2);
                    return;
                }
                return;
            case 6:
                ((jfr) this.c).f(((Integer) obj).intValue(), (Integer) this.b, (jfq) this.a);
                return;
            case 7:
                ((jgt) this.c).d((adly) this.b, (hzg) this.a);
                return;
            case 8:
                ((jgt) this.c).d((adly) this.b, (hzg) this.a);
                return;
            case 9:
                axfd axfdVar = (axfd) this.c;
                nry nryVar = (nry) axfdVar.e.io();
                CommandOuterClass$Command defaultInstance = ((asqv) ((mgk) this.a).a).f;
                if (defaultInstance == null) {
                    defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                }
                nryVar.a(defaultInstance, (nrv) this.b).v((avmb) axfdVar.a).D();
                return;
            case 10:
                ((isi) this.a).x((assc) this.b, this.c, (Throwable) obj);
                return;
            case 11:
                ((isi) this.a).x((assc) this.b, this.c, (Throwable) obj);
                return;
            case 12:
                anim animVar = ((ajvu) obj).n;
                if (animVar == null) {
                    animVar = anim.a;
                }
                if (animVar.h) {
                    ((avlh) this.c.io()).L((avmb) this.b).ak(new rlb(this.a, 6));
                    return;
                }
                return;
            case 13:
                afuu afuuVarB = afwt.b(58, qci.a(((tsa) this.c).ag, (qci) this.a));
                try {
                    this.b.a(obj);
                    afuuVarB.close();
                    return;
                } catch (Throwable th) {
                    try {
                        afuuVarB.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            default:
                ajfu ajfuVar = (ajfu) obj;
                String assetId = ajfuVar.getAssetId();
                Object obj11 = this.c;
                if (assetId.equals(obj11)) {
                    xsc.H(this.a, (String) this.b, ajfuVar, (String) obj11, "", agpi.a, ajwo.a, ajga.ASSET_ITEM_SELECTED_STATE_UNSELECTED);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gto(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gto(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gto(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public gto(trz trzVar, qci qciVar, avni avniVar, int i) {
        this.$cid = i;
        this.c = trzVar;
        this.a = qciVar;
        this.b = avniVar;
    }
}
