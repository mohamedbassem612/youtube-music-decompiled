package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mge implements nrw {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;

    public mge(acxx acxxVar, nuc nucVar, int i) {
        this.$cid = i;
        this.b = acxxVar;
        this.a = nucVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        int i = this.$cid;
        if (i == 0) {
            return asqr.b;
        }
        if (i == 1) {
            return akly.b;
        }
        if (i == 2) {
            return asss.b;
        }
        if (i != 3) {
            return i != 4 ? asny.b : asmr.b;
        }
        return astc.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        int i = this.$cid;
        if (i == 0) {
            return rpi.A();
        }
        if (i == 1) {
            return a.r();
        }
        if (i == 2) {
            return a.r();
        }
        if (i != 3) {
            return i != 4 ? a.r() : a.r();
        }
        return a.r();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r11v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [aunn, java.lang.Object] */
    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, final nrv nrvVar) {
        int i;
        int i2 = this.$cid;
        int i3 = 4;
        if (i2 == 0) {
            asqr asqrVar = (asqr) obj;
            if (asqrVar == null || (asqrVar.c & 1) == 0 || !((i = asqrVar.d) == 4 || i == 5)) {
                return avlb.m(new nud("Invalid DisplaySyncCommand."));
            }
            View viewB = nrvVar.b();
            if (viewB == null) {
                return avlb.m(new nud("No view is available."));
            }
            hed hedVar = (hed) this.b;
            ?? Io = hedVar.a.io();
            Io.getClass();
            ?? Io2 = hedVar.b.io();
            Io2.getClass();
            agev agevVar = (agev) hedVar.c.io();
            agevVar.getClass();
            return avlb.n(new mgd(this, new aamo(asqrVar, (aunn) Io, (aunn) Io2, agevVar), viewB, 2, (short[]) null)).v(avmh.a());
        }
        if (i2 == 1) {
            akly aklyVar = (akly) obj;
            avlb avlbVarV = avlb.n(new hoi(this.a, 6)).v(avmh.a());
            if ((aklyVar.c & 2) == 0) {
                return avlbVarV;
            }
            nry nryVar = (nry) this.b.io();
            CommandOuterClass$Command defaultInstance = aklyVar.d;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            return avlbVarV.c(nryVar.a(defaultInstance, null));
        }
        if (i2 == 2) {
            final asss asssVar = (asss) obj;
            if (asssVar.f.size() == 0) {
                int i4 = asssVar.c;
                if ((i4 & 4) == 0 && (i4 & 8) == 0) {
                    this.a.c(aslh.LOG_TYPE_MISSING_FIELD, nrvVar.i, "ShowActionSheetCommand needs to have at least one list option if there is no sheet id.", new Object[0]);
                    return avlb.e();
                }
            }
            return avlb.n(new avnd() { // from class: mgo
                @Override // defpackage.avnd
                public final void a() {
                    apxi apxiVar;
                    Object obj2 = this.c.b;
                    nrv nrvVar2 = nrvVar;
                    asss asssVar2 = asssVar;
                    if (asssVar2 == null) {
                        ((acxx) obj2).c.c(aslh.LOG_TYPE_MISSING_FIELD, nrvVar2.i, "ShowActionSheetCommand needs to provided.", new Object[0]);
                        return;
                    }
                    if (asssVar2.f.size() == 0) {
                        int i5 = asssVar2.c;
                        if ((i5 & 8) == 0 && (i5 & 4) == 0) {
                            ((acxx) obj2).c.c(aslh.LOG_TYPE_MISSING_FIELD, nrvVar2.i, "ShowActionSheetCommand needs to have at least one list option when there is not sheet id.", new Object[0]);
                            return;
                        }
                    }
                    xgn xgnVarJ = acxx.j(nrvVar2);
                    if (xgnVarJ == null) {
                        ntq ntqVar = nrvVar2.f().d;
                        xgnVarJ = ntqVar instanceof adau ? ((adau) ntqVar).a : null;
                    }
                    acxx acxxVar = (acxx) obj2;
                    ajwo ajwoVarB = acxxVar.b(nrvVar2);
                    aihf aihfVarCreateBuilder = acxd.a.createBuilder();
                    if ((asssVar2.c & 8) != 0) {
                        String str = asssVar2.h;
                        aihfVarCreateBuilder.copyOnWrite();
                        acxd acxdVar = (acxd) aihfVarCreateBuilder.instance;
                        str.getClass();
                        acxdVar.b |= 1;
                        acxdVar.c = str;
                    }
                    if ((asssVar2.c & 1) != 0) {
                        asmv asmvVar = asssVar2.d;
                        if (asmvVar == null) {
                            asmvVar = asmv.a;
                        }
                        aigj byteString = asmvVar.toByteString();
                        aihfVarCreateBuilder.copyOnWrite();
                        acxd acxdVar2 = (acxd) aihfVarCreateBuilder.instance;
                        acxdVar2.b |= 4;
                        acxdVar2.e = byteString;
                    }
                    if (asssVar2.f.size() > 0) {
                        aihfVarCreateBuilder.ai((Iterable) Collection.EL.stream(asssVar2.f).map(new accu(6)).collect(aghu.a));
                    } else if ((asssVar2.c & 4) != 0) {
                        asmv asmvVar2 = asssVar2.g;
                        if (asmvVar2 == null) {
                            asmvVar2 = asmv.a;
                        }
                        aigj byteString2 = asmvVar2.toByteString();
                        aihfVarCreateBuilder.copyOnWrite();
                        acxd acxdVar3 = (acxd) aihfVarCreateBuilder.instance;
                        acxdVar3.b |= 16;
                        acxdVar3.h = byteString2;
                    }
                    if ((asssVar2.c & 2) != 0) {
                        asmv asmvVar3 = asssVar2.e;
                        if (asmvVar3 == null) {
                            asmvVar3 = asmv.a;
                        }
                        aigj byteString3 = asmvVar3.toByteString();
                        aihfVarCreateBuilder.copyOnWrite();
                        acxd acxdVar4 = (acxd) aihfVarCreateBuilder.instance;
                        acxdVar4.b |= 8;
                        acxdVar4.g = byteString3;
                    }
                    int i6 = asssVar2.k;
                    if (i6 > 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        acxd acxdVar5 = (acxd) aihfVarCreateBuilder.instance;
                        acxdVar5.b |= 2;
                        acxdVar5.d = i6;
                    }
                    acxd acxdVar6 = (acxd) aihfVarCreateBuilder.build();
                    aihl aihlVar = apxi.b;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    asssVar2.c(aihlVarCheckIsLite);
                    if (asssVar2.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        asssVar2.c(aihlVarCheckIsLite2);
                        Object objK = asssVar2.j.k(aihlVarCheckIsLite2.d);
                        apxiVar = (apxi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    } else {
                        apxiVar = null;
                    }
                    Optional optionalOfNullable = Optional.ofNullable(apxiVar);
                    if (true == optionalOfNullable.isPresent() && (((apxi) optionalOfNullable.get()).c & 1) == 0) {
                        optionalOfNullable = Optional.empty();
                    }
                    if (true == optionalOfNullable.isPresent()) {
                        apmn apmnVar = ((apxi) optionalOfNullable.get()).d;
                        if (apmnVar == null) {
                            apmnVar = apmn.a;
                        }
                        optionalOfNullable = Optional.ofNullable(apmnVar);
                    }
                    Optional optionalOfNullable2 = Optional.ofNullable(xgnVarJ);
                    Optional optionalOfNullable3 = Optional.ofNullable(nrvVar2);
                    if (true == optionalOfNullable3.isPresent()) {
                        optionalOfNullable3 = Optional.ofNullable(((nrv) optionalOfNullable3.get()).b());
                    }
                    Optional optionalC = acxx.c(nrvVar2);
                    Optional optionalOfNullable4 = Optional.ofNullable(nrvVar2);
                    if (true == optionalOfNullable4.isPresent()) {
                        optionalOfNullable4 = Optional.ofNullable(((nrv) optionalOfNullable4.get()).e);
                    }
                    Optional optionalOfNullable5 = Optional.ofNullable(ajwoVarB);
                    Optional optionalEmpty = Optional.empty();
                    Optional optionalOf = (asssVar2.c & SemanticState.LiveRegion) != 0 ? Optional.of(Boolean.valueOf(asssVar2.l)) : Optional.empty();
                    Optional optionalOf2 = (asssVar2.c & SemanticState.Modal) != 0 ? Optional.of(Boolean.valueOf(asssVar2.m)) : Optional.empty();
                    int iAV = a.aV(asssVar2.n);
                    acxxVar.k(acxdVar6, optionalOfNullable, optionalOfNullable2, optionalOfNullable3, optionalC, optionalOfNullable4, optionalOfNullable5, optionalEmpty, optionalOf, optionalOf2, iAV == 0 ? 1 : iAV, new adzc(false, 1, null));
                    if ((asssVar2.c & 16) != 0) {
                        nry nryVar2 = (nry) acxxVar.d.io();
                        CommandOuterClass$Command defaultInstance2 = asssVar2.i;
                        if (defaultInstance2 == null) {
                            defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
                        }
                        nryVar2.a(defaultInstance2, nrvVar2).D();
                    }
                }
            }).v(avmh.a());
        }
        int i5 = 3;
        if (i2 == 3) {
            astc astcVar = (astc) obj;
            if ((astcVar.c & 8) != 0) {
                return avlb.n(new mgd((Object) this, (Object) astcVar, (Object) nrvVar, 7, (byte[]) null)).v(avmh.a());
            }
            this.a.c(aslh.LOG_TYPE_MISSING_FIELD, nrvVar.i, "UpdateActionSheetCommand needs to have a sheet id.", new Object[0]);
            return avlb.e();
        }
        if (i2 == 4) {
            asmr asmrVar = (asmr) obj;
            return avmc.t(asmrVar).c(new mkc((Object) this, (Object) asmrVar, (Object) nrvVar, i5));
        }
        asny asnyVar = (asny) obj;
        nry nryVar2 = (nry) this.a.io();
        if ((asnyVar.c & 1) != 0) {
            CommandOuterClass$Command defaultInstance2 = asnyVar.d;
            if (defaultInstance2 == null) {
                defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
            }
            nryVar2.a(defaultInstance2, nrvVar).D();
        }
        if ((asnyVar.c & 2) == 0) {
            return avlb.e();
        }
        CommandOuterClass$Command defaultInstance3 = asnyVar.e;
        if (defaultInstance3 == null) {
            defaultInstance3 = CommandOuterClass$Command.getDefaultInstance();
        }
        awdm awdmVar = new awdm(nryVar2.c(defaultInstance3, nrvVar, 1).v((avmb) this.b).A());
        avnn avnnVar = atqp.l;
        awcp awcpVar = new awcp(awdmVar, new mkc(asnyVar, nryVar2, nrvVar, i3));
        avnn avnnVar2 = atqp.p;
        return awcpVar;
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        int i = this.$cid;
        if (i == 0) {
            return nqw.a(this, mewVar, nrvVar);
        }
        if (i == 1) {
            return nqw.a(this, mewVar, nrvVar);
        }
        if (i == 2) {
            return nqw.a(this, mewVar, nrvVar);
        }
        if (i != 3) {
            return i != 4 ? nqw.a(this, mewVar, nrvVar) : nqw.a(this, mewVar, nrvVar);
        }
        return nqw.a(this, mewVar, nrvVar);
    }

    public mge(aunn aunnVar, avmb avmbVar, int i) {
        this.$cid = i;
        this.a = aunnVar;
        this.b = avmbVar;
    }

    public mge(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
