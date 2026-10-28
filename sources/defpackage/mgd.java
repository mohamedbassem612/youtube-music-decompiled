package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import j$.util.Collection;
import j$.util.OptionalInt;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mgd implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mgd(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, nse] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, nse] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v24, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.lang.Object, wby] */
    /* JADX WARN: Type inference failed for: r14v47, types: [java.lang.Object, vri] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mfy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
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
    @Override // defpackage.avnd
    public final void a() {
        String strE;
        int i = 2;
        switch (this.$cid) {
            case 0:
                asmv asmvVar = ((akls) this.b).d;
                if (asmvVar == null) {
                    asmvVar = asmv.a;
                }
                ((mgl) this.a).a.c(asmvVar, ((mfv) this.c).a());
                return;
            case 1:
                ajwo ajwoVar = ((anzq) this.a).e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((gvp) this.c).a.c(ajwoVar, this.b);
                return;
            case 2:
                Object obj = this.b;
                Object obj2 = ((mge) this.a).a;
                synchronized (obj2) {
                    strE = ((aamo) obj).e();
                    ((kjc) obj2).r(strE);
                    ((kjc) obj2).a.put(strE, obj);
                    break;
                }
                ((View) this.c).addOnAttachStateChangeListener(new npu((kjc) obj2, (aamo) obj, strE, 1));
                return;
            case 3:
                Object obj3 = this.b;
                Object obj4 = ((mgl) this.c).a;
                if (obj3 != null) {
                    asqv asqvVar = (asqv) obj3;
                    int i2 = asqvVar.c;
                    if ((i2 & 1) != 0 && (i2 & 4) != 0) {
                        if (asqvVar.e < 0.1d) {
                            throw new nud("LoopCommand delay is too small");
                        }
                        View viewB = ((nrv) this.a).b();
                        if (viewB == null) {
                            throw new nud("No view is available, loop has not been registered");
                        }
                        axfd axfdVar = (axfd) obj4;
                        synchronized (axfdVar.b) {
                            ((axfd) obj4).X(((asqv) obj3).d);
                            ((axfd) obj4).c.put(((asqv) obj3).d, new mgk(obj3));
                            break;
                        }
                        viewB.addOnAttachStateChangeListener(new mgj(axfdVar, asqvVar, 0));
                        return;
                    }
                }
                throw new nud("Invalid LoopCommand");
            case 4:
                asmv asmvVar2 = ((aowo) this.b).d;
                if (asmvVar2 == null) {
                    asmvVar2 = asmv.a;
                }
                ((acyj) ((mgl) this.a).a).b(asmvVar2, (View) this.c, OptionalInt.empty(), OptionalInt.empty(), OptionalInt.empty());
                return;
            case 5:
                ((kjc) ((mgl) this.c).a).q(((asqw) this.b).d, (nrv) this.a);
                return;
            case 6:
                String str = ((asqx) this.b).c;
                Object obj5 = ((mgl) this.c).a;
                Object obj6 = ((axfd) obj5).b;
                Object obj7 = this.a;
                synchronized (obj6) {
                    mgk mgkVar = (mgk) ((axfd) obj5).c.get(str);
                    if (mgkVar == null) {
                        throw new nud("Cannot start a loop that has not been registered yet");
                    }
                    ?? r14 = mgkVar.b;
                    if (r14 == 0 || r14.f()) {
                        long j = (long) (((asqv) mgkVar.a).e * 1000.0f);
                        mgkVar.b = avlr.I(j, j, TimeUnit.MILLISECONDS, (avmb) ((axfd) obj5).d).af(new gto(obj5, mgkVar, obj7, 9, (short[]) null));
                        return;
                    }
                    return;
                }
            case 7:
                ajwo ajwoVarA = acxx.a((nrv) this.a);
                Object obj8 = this.b;
                Object obj9 = ((mge) this.c).b;
                if (ajwoVarA != null && (ajwoVarA.b & 1) != 0) {
                    ((acxx) obj9).g(ajwoVarA.c.G(), ((astc) obj8).h);
                }
                aihf aihfVarCreateBuilder = acxd.a.createBuilder();
                astc astcVar = (astc) obj8;
                if ((astcVar.c & 8) != 0) {
                    String str2 = astcVar.h;
                    aihfVarCreateBuilder.copyOnWrite();
                    acxd acxdVar = (acxd) aihfVarCreateBuilder.instance;
                    str2.getClass();
                    acxdVar.b |= 1;
                    acxdVar.c = str2;
                }
                if ((astcVar.c & 1) != 0) {
                    asmv asmvVar3 = astcVar.d;
                    if (asmvVar3 == null) {
                        asmvVar3 = asmv.a;
                    }
                    aigj byteString = asmvVar3.toByteString();
                    aihfVarCreateBuilder.copyOnWrite();
                    acxd acxdVar2 = (acxd) aihfVarCreateBuilder.instance;
                    acxdVar2.b |= 4;
                    acxdVar2.e = byteString;
                }
                if (astcVar.f.size() > 0) {
                    aihfVarCreateBuilder.ai((Iterable) Collection.EL.stream(astcVar.f).map(new accu(6)).collect(aghu.a));
                } else if ((astcVar.c & 4) != 0) {
                    asmv asmvVar4 = astcVar.g;
                    if (asmvVar4 == null) {
                        asmvVar4 = asmv.a;
                    }
                    aigj byteString2 = asmvVar4.toByteString();
                    aihfVarCreateBuilder.copyOnWrite();
                    acxd acxdVar3 = (acxd) aihfVarCreateBuilder.instance;
                    acxdVar3.b |= 16;
                    acxdVar3.h = byteString2;
                }
                if ((astcVar.c & 2) != 0) {
                    asmv asmvVar5 = astcVar.e;
                    if (asmvVar5 == null) {
                        asmvVar5 = asmv.a;
                    }
                    aigj byteString3 = asmvVar5.toByteString();
                    aihfVarCreateBuilder.copyOnWrite();
                    acxd acxdVar4 = (acxd) aihfVarCreateBuilder.instance;
                    acxdVar4.b |= 8;
                    acxdVar4.g = byteString3;
                }
                ((acxx) obj9).h((acxd) aihfVarCreateBuilder.build());
                return;
            case 8:
                ((isi) this.c).x((assc) this.b, this.a, null);
                return;
            case 9:
                ((isi) this.c).x((assc) this.b, this.a, null);
                return;
            case 10:
                apxk apxkVar = (apxk) this.b;
                asmv asmvVar6 = apxkVar.d;
                if (asmvVar6 == null) {
                    asmvVar6 = asmv.a;
                }
                asmv asmvVar7 = asmvVar6;
                xgn xgnVar = (xgn) aecm.A((nwf) this.c).f();
                alhq alhqVar = apxkVar.e;
                if (alhqVar == null) {
                    alhqVar = alhq.a;
                }
                ((sru) ((mgp) this.a).a).b(asmvVar7, xgnVar, alhqVar, apxkVar.f, apxkVar.g, apxkVar.h);
                return;
            case 11:
                avnr.b((AtomicReference) this.a);
                Object obj10 = this.b;
                if (obj10 != null) {
                    avnr.b((AtomicReference) obj10);
                }
                tqh tqhVarA = ((tqm) this.c).a();
                int i3 = tqr.a;
                tqhVarA.b(1073807464, 0L);
                tqhVarA.b(1073807465, 0L);
                tqhVarA.b(1074069599, 0L);
                tqhVarA.b(1074004068, 0L);
                tqhVarA.a();
                return;
            case 12:
                String str3 = ((ajgg) this.a).c;
                ajgc ajgcVarE = ajgd.e((String) this.b);
                ajgcVarE.am(str3);
                ajgcVarE.an(ajgf.ASSET_ITEM_USAGE_STATE_USED);
                xsc.al(ajgcVarE, this.c);
                return;
            case 13:
                Object obj11 = this.b;
                apxv apxvVar = (apxv) obj11;
                aoli aoliVar = apxvVar.f;
                if (aoliVar == null) {
                    aoliVar = aoli.a;
                }
                ((vqy) this.c).a.w(aoliVar, this.a, (obj11 == null || (apxvVar.c & 8) == 0) ? vzh.b : apxvVar.g.G(), null);
                return;
            case 14:
                ((aczb) this.a).h((ResourcePreloader) this.c, (HashSet) this.b);
                return;
            case 15:
                Object obj12 = this.b;
                Object obj13 = this.c;
                ((View) obj13).post(new adab(this.a, obj12, obj13, i));
                return;
            case 16:
                ((adan) this.a).d((alhq) this.b, (View) this.c);
                return;
            case 17:
                ((addi) this.a).d((aknp) this.b, (nrv) this.c);
                return;
            case 18:
                amtq amtqVar = (amtq) this.b;
                int iAS = a.aS(amtqVar.d);
                ((ci) ((addp) this.a).b).al(iAS == 0 ? 1 : iAS, amtqVar.e, amtqVar.f, amtqVar.h, amtqVar.i, (nwf) this.c);
                return;
            default:
                amtq amtqVar2 = (amtq) this.b;
                int iAS2 = a.aS(amtqVar2.d);
                ((ci) ((addp) this.a).b).al(iAS2 == 0 ? 1 : iAS2, amtqVar2.e, amtqVar2.f, amtqVar2.h, amtqVar2.i, (nwf) this.c);
                return;
        }
    }

    public /* synthetic */ mgd(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ mgd(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ mgd(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
