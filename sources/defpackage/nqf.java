package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqf extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    CommandOuterClass$Command A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nds B;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean C;

    @fmt(a = 13)
    @fmu(a = fmv.g)
    public Integer D;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float E;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float F;

    @fmt(a = 3)
    @fmu(a = fmv.i)
    public int G;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int H;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int I;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    hed J;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj K;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Boolean a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxs b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nci f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nub g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nci r;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nci t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuv u;

    @fmt(a = 0)
    @fmu(a = fmv.a)
    float v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ncq w;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    CommandOuterClass$Command z;

    public nqf() {
        super("GlideImage");
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        agfr agfrVar = nqm.a;
        ImageView imageView = new ImageView(context);
        imageView.setTag(R.id.elements_image_ready, new AtomicBoolean(false));
        return imageView;
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        nqd nqdVar = (nqd) fizVar;
        nqd nqdVar2 = (nqd) fizVar2;
        nqdVar.a = nqdVar2.a;
        nqdVar.b = nqdVar2.b;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        nxs nxsVarBN;
        nqe nqeVar = (nqe) fhdVar.i().c;
        boolean z = this.x;
        ncq ncqVar = this.w;
        nuc nucVar = this.y;
        nry nryVar = this.d;
        nsl nslVar = this.e;
        agfr agfrVar = nqm.a;
        if (!z || (nxsVarBN = qnl.bN(ncqVar, new omj(nucVar), nslVar, nryVar)) == null) {
            nxsVarBN = null;
        }
        nqeVar.b = null;
        nqeVar.a = nxsVarBN;
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        boolean z;
        nqe nqeVar = (nqe) fhdVar.i().c;
        ImageView imageView = (ImageView) obj;
        nci nciVar = this.t;
        nci nciVar2 = this.f;
        nci nciVar3 = this.r;
        nuv nuvVar = this.u;
        Boolean bool = this.a;
        nsl nslVar = this.e;
        boolean z2 = this.x;
        nxs nxsVar = this.b;
        nxs nxsVar2 = nqeVar.a;
        int i = this.I;
        nub nubVar = this.g;
        nry nryVar = this.d;
        CommandOuterClass$Command commandOuterClass$Command = this.z;
        CommandOuterClass$Command commandOuterClass$Command2 = this.A;
        nqd nqdVar = (nqd) fizVar;
        nqn nqnVar = nqdVar.a;
        fkw fkwVar = nqdVar.b;
        nuc nucVar = this.y;
        hed hedVar = this.J;
        boolean z3 = this.q;
        int i2 = this.G;
        boolean z4 = this.C;
        nqo nqoVar = (nqo) fhdVar.k(nqo.class);
        agfr agfrVar = nqm.a;
        nslVar.f("null");
        byte[] bArr = UnifiedTemplateResolver.a;
        if (bArr != null) {
            z = true;
            bArr[0] = (byte) (bArr[0] + 1);
        } else {
            z = true;
        }
        if (nqnVar == null) {
            if (!z4 || qnl.bG(fhdVar.a)) {
                return;
            }
            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
            aslh aslhVar = aslh.LOG_TYPE_MISSING_FIELD;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
            asncVar.d = aslhVar.I;
            asncVar.b |= 2;
            aihf aihfVarCreateBuilder2 = asmz.a.createBuilder();
            for (int i3 = 0; i3 < nciVar.g(); i3++) {
                asna asnaVar = asna.a;
                aihfVarCreateBuilder2.copyOnWrite();
                asmz asmzVar = (asmz) aihfVarCreateBuilder2.instance;
                asnaVar.getClass();
                aiie aiieVar = asmzVar.b;
                if (!aiieVar.c()) {
                    asmzVar.b = aihn.mutableCopy(aiieVar);
                }
                asmzVar.b.add(asnaVar);
            }
            asmz asmzVar2 = (asmz) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
            asmzVar2.getClass();
            asncVar2.k = asmzVar2;
            asncVar2.b |= SemanticState.Focused;
            nucVar.d((asnc) aihfVarCreateBuilder.build(), nslVar, "Failed to find a valid source for the image. Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.", new Object[0]);
            return;
        }
        if (nuvVar != null) {
            nuvVar.b(imageView.hashCode());
        }
        esn esnVar = nqnVar.a;
        nqj nqjVar = new nqj(fkwVar, r28, nciVar, z3, i2, nuvVar, nqnVar.b, nciVar2, nciVar3, z != z2 ? nxsVar : nxsVar2, nucVar, hedVar, nryVar, commandOuterClass$Command, commandOuterClass$Command2, i, nslVar, nubVar, nqoVar);
        esnVar.a(new nqk(r28.hashCode(), nslVar.i(), nuvVar, nqjVar, z3));
        if (r21 != 0 && bool.booleanValue()) {
            aihf aihfVarCreateBuilder3 = asnm.a.createBuilder();
            for (int i4 = 0; i4 < nciVar.g(); i4++) {
                ncl nclVarI = nciVar.i(i4);
                aihf aihfVarCreateBuilder4 = asno.a.createBuilder();
                int iH = nclVarI.h();
                aihfVarCreateBuilder4.copyOnWrite();
                asno asnoVar = (asno) aihfVarCreateBuilder4.instance;
                asnoVar.b |= 1;
                asnoVar.e = iH;
                int iG = nclVarI.g();
                aihfVarCreateBuilder4.copyOnWrite();
                asno asnoVar2 = (asno) aihfVarCreateBuilder4.instance;
                asnoVar2.b |= 2;
                asnoVar2.f = iG;
                if (nclVarI.p()) {
                    String strK = nclVarI.k();
                    aihfVarCreateBuilder4.copyOnWrite();
                    asno asnoVar3 = (asno) aihfVarCreateBuilder4.instance;
                    strK.getClass();
                    asnoVar3.c = 1;
                    asnoVar3.d = strK;
                }
                aihfVarCreateBuilder3.copyOnWrite();
                asnm asnmVar = (asnm) aihfVarCreateBuilder3.instance;
                asno asnoVar4 = (asno) aihfVarCreateBuilder4.build();
                asnoVar4.getClass();
                asnmVar.a();
                asnmVar.c.add(asnoVar4);
            }
            imageView.setTag(R.id.elements_image, (asnm) aihfVarCreateBuilder3.build());
        }
        esnVar.q(nqjVar);
    }

    @Override // defpackage.fgy
    public final void M(fhd fhdVar) {
        agfr agfrVar = nqm.a;
        float f = this.v;
        if (f > 0.0f) {
            nyc nycVar = new nyc(f);
            fhdVar.m();
            as(fhdVar, nycVar);
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        nqe nqeVar = (nqe) fkyVar2;
        nqeVar.a = ((nqe) fkyVar).a;
        nqeVar.b = null;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean W(fhd fhdVar, fhd fhdVar2) {
        return fhdVar.k(nqo.class) == null ? fhdVar2.k(nqo.class) == null : ((nqo) fhdVar.k(nqo.class)).equals(fhdVar2.k(nqo.class));
    }

    @Override // defpackage.fgy
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        nqf nqfVar = (nqf) fgyVar;
        nqf nqfVar2 = (nqf) fgyVar2;
        fif fifVar = new fif(nqfVar == null ? null : Boolean.valueOf(nqfVar.x), nqfVar2 == null ? null : Boolean.valueOf(nqfVar2.x));
        fif fifVar2 = new fif(nqfVar == null ? null : nqfVar.w, nqfVar2 == null ? null : nqfVar2.w);
        fif fifVar3 = new fif(nqfVar == null ? null : nqfVar.B, nqfVar2 == null ? null : nqfVar2.B);
        fif fifVar4 = new fif(nqfVar == null ? null : ((nqe) fkyVar).a, nqfVar2 != null ? ((nqe) fkyVar2).a : null);
        agfr agfrVar = nqm.a;
        Boolean bool = (Boolean) fifVar.b;
        ncq ncqVar = (ncq) fifVar2.a;
        ncq ncqVar2 = (ncq) fifVar2.b;
        if (!Objects.equals(fifVar3.b, fifVar3.a)) {
            return true;
        }
        if (bool == null || bool.booleanValue()) {
            if (ncqVar2 != null && ncqVar != null && !Objects.equals(ncqVar2, ncqVar)) {
                if (fifVar4.a == null) {
                    return true;
                }
                try {
                    byte[] bArrF = ncqVar.f();
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    asnp asnpVar = asnp.a;
                    asnp asnpVar2 = (asnp) aihn.parseFrom(asnpVar, bArrF, generatedRegistry);
                    asnp asnpVar3 = (asnp) aihn.parseFrom(asnpVar, ncqVar2.f(), ExtensionRegistryLite.getGeneratedRegistry());
                    aihf builder = asnpVar2.toBuilder();
                    int iAS = a.aS(asnpVar2.c);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    if (iAS == 2) {
                        builder.copyOnWrite();
                        asnp asnpVar4 = (asnp) builder.instance;
                        asnpVar4.c = 2;
                        asnpVar4.b |= 16;
                    } else if (iAS == 3 || iAS == 1) {
                        builder.copyOnWrite();
                        asnp asnpVar5 = (asnp) builder.instance;
                        asnpVar5.c = 1;
                        asnpVar5.b |= 16;
                    }
                    if (!Objects.equals(asnpVar3, builder.build())) {
                        return true;
                    }
                } catch (aiik unused) {
                }
                nxs nxsVar = (nxs) fifVar4.a;
                if (nxsVar != null) {
                    if (ncqVar2.u() == 2) {
                        nxsVar.e();
                    } else {
                        nxsVar.f();
                    }
                }
            }
        } else if (!Objects.equals(ncqVar2, ncqVar)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        boolean z;
        nqn nqnVarBO;
        int i;
        ArrayList arrayList;
        Context context;
        esn esnVar;
        fam famVar;
        nqe nqeVar = (nqe) fhdVar.i().c;
        nci nciVar = this.t;
        int i2 = this.H;
        nuc nucVar = this.y;
        nci nciVar2 = this.f;
        nci nciVar3 = this.r;
        omj omjVar = this.K;
        nub nubVar = this.g;
        nsl nslVar = this.e;
        boolean z2 = this.s;
        boolean z3 = this.c;
        Integer num = this.D;
        int i3 = this.G;
        float f = this.E;
        float f2 = this.F;
        nds ndsVar = this.B;
        esq esqVar = nqeVar.b;
        agfr agfrVar = nqm.a;
        fkw fkwVar = new fkw(fjiVar.g(), fjiVar.b());
        Context context2 = fhdVar.a;
        if (qnl.bG(context2)) {
            nqnVarBO = null;
        } else {
            if (context2 == null) {
                throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            }
            esq esqVarA = erj.b(context2).c.a(context2);
            int iG = fjiVar.g();
            int iB = fjiVar.b();
            boolean z4 = nubVar != null && nubVar.d;
            boolean z5 = i3 > 0;
            if (nubVar == null) {
                z = false;
            } else if (nubVar.m) {
                esqVarA = esqVarA;
                z = true;
            } else {
                esqVarA = esqVarA;
                z = false;
            }
            nqnVarBO = qnl.bO(esqVarA, context2, nciVar, nciVar2, nciVar3, omjVar, iG, iB, z4, z5, z);
            if (nqnVarBO == null) {
                nqnVarBO = null;
            } else {
                esn esnVar2 = nqnVarBO.a;
                if (nubVar == null || !nubVar.k || r16 == 0) {
                    i = 0;
                } else {
                    String strE = nslVar.e("");
                    if (strE.isEmpty() || nciVar.g() <= 0) {
                        i = 0;
                    } else {
                        i = 0;
                        if (!ahno.aa(nciVar.i(0).k()) && ((strE.contains("|video_lockup.") && strE.contains("|thumbnail.")) || ((strE.contains("|video_with_context_slots.") && strE.contains("|thumbnail.")) || ((strE.contains("|active_view_display_container.") && strE.contains("|ad_image.")) || (strE.contains("|mini_game_card.") && strE.contains("|thumbnail.")))))) {
                            esnVar2 = (esn) esnVar2.I(true);
                        }
                    }
                }
                if (i2 != 0 && i2 - 1 == 1) {
                    esnVar2.k((esr) nqm.a.io());
                }
                ArrayList arrayList2 = new ArrayList();
                myh myhVarBD = qnl.bD(nciVar);
                if (myhVarBD == null || !myhVarBD.r()) {
                    arrayList = arrayList2;
                    context = context2;
                    esnVar = esnVar2;
                } else {
                    float fW = myhVarBD.k().W();
                    if (fW > 0.01f) {
                        int iO = nciVar.o();
                        float fApplyDimension = TypedValue.applyDimension(1, fW, context2.getResources().getDisplayMetrics());
                        context = context2;
                        esn esnVar3 = esnVar2;
                        arrayList = arrayList2;
                        arrayList.add(new npx(context, r16, nucVar, iO, fApplyDimension, (nubVar == null || !nubVar.b) ? i : 1, z3));
                        int iO2 = nciVar.o() - 1;
                        if (iO2 != 2) {
                            famVar = iO2 != 4 ? fam.d : fam.e;
                        } else {
                            famVar = fam.b;
                        }
                        esnVar = (esn) esnVar3.x(famVar);
                    } else {
                        arrayList = arrayList2;
                        context = context2;
                        esnVar = esnVar2;
                    }
                }
                nem nemVar = (nem) ndsVar.d(nem.ah);
                if (z2 && nemVar != null && nemVar.g() > 0.0f) {
                    arrayList.add(new nql((int) TypedValue.applyDimension(1, nemVar.g(), context.getResources().getDisplayMetrics())));
                }
                if (i3 > 0) {
                    arrayList.add(new nqp(qnl.bA(nciVar), i3, f, f2, num == null ? i : num.intValue()));
                }
                if (!arrayList.isEmpty()) {
                }
            }
        }
        nqd nqdVar = (nqd) fizVar;
        nqdVar.a = nqnVarBO;
        nqdVar.b = fkwVar;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        float fH;
        nci nciVar = this.t;
        agfr agfrVar = nqm.a;
        if (nciVar.g() == 0) {
            fH = 1.0f;
        } else {
            ncl nclVarI = nciVar.i(0);
            fH = nclVarI.h() / nclVarI.g();
        }
        fhz.q(i, i2, fH, fkwVar);
    }

    @Override // defpackage.fgy
    public final void ai() {
        agfr agfrVar = nqm.a;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        nqe nqeVar = (nqe) fhdVar.i().c;
        ImageView imageView = (ImageView) obj;
        nuv nuvVar = this.u;
        Boolean bool = this.a;
        nxs nxsVar = this.b;
        nxs nxsVar2 = nqeVar.a;
        nub nubVar = this.g;
        esq esqVar = nqeVar.b;
        agfr agfrVar = nqm.a;
        if (nuvVar != null) {
            nuvVar.a(imageView.hashCode());
        }
        Context context = fhdVar.a;
        if (qnl.bG(context)) {
            erj.d(context.getApplicationContext()).i(imageView);
        } else {
            erj.d(context).i(imageView);
        }
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, null);
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) imageView.getTag(R.id.elements_image_ready);
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        nqm.a(nxsVar);
        nqm.a(nxsVar2);
        if (nubVar != null && nubVar.c) {
            imageView.setImageDrawable(null);
        }
        int i = bac.a;
        imageView.setTransitionName(null);
    }

    @Override // defpackage.fgy
    public final void au(fiz fizVar) {
        nqd nqdVar = (nqd) fizVar;
        nqn nqnVar = nqdVar.a;
        fkw fkwVar = nqdVar.b;
        nci nciVar = this.t;
        agfr agfrVar = nqm.a;
        if (nqnVar == null || nciVar.g() == 0 || !nciVar.i(0).p()) {
            return;
        }
        String scheme = qnl.bC(nciVar.i(0).k()).getScheme();
        if (("http".equals(scheme) || "https".equals(scheme)) && fkwVar.a > 0 && fkwVar.b > 0) {
            ((esn) nqnVar.a.clone().v(evs.c)).o(fkwVar.a, fkwVar.b);
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        nry nryVar;
        nsl nslVar;
        nci nciVar;
        nub nubVar;
        nci nciVar2;
        nci nciVar3;
        nuv nuvVar;
        hed hedVar;
        omj omjVar;
        int i;
        ncq ncqVar;
        nuc nucVar;
        CommandOuterClass$Command commandOuterClass$Command;
        CommandOuterClass$Command commandOuterClass$Command2;
        int i2;
        nds ndsVar;
        Integer num;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            nqf nqfVar = (nqf) fgyVar;
            Boolean bool = this.a;
            if (bool == null ? nqfVar.a == null : bool.equals(nqfVar.a)) {
                nxs nxsVar = this.b;
                if (nxsVar == null ? nqfVar.b == null : nxsVar.equals(nqfVar.b)) {
                    if (this.c == nqfVar.c && ((nryVar = this.d) == null ? nqfVar.d == null : nryVar.equals(nqfVar.d)) && ((nslVar = this.e) == null ? nqfVar.e == null : nslVar.equals(nqfVar.e)) && ((nciVar = this.f) == null ? nqfVar.f == null : nciVar.equals(nqfVar.f)) && ((nubVar = this.g) == null ? nqfVar.g == null : nubVar.equals(nqfVar.g)) && this.q == nqfVar.q && ((nciVar2 = this.r) == null ? nqfVar.r == null : nciVar2.equals(nqfVar.r)) && this.s == nqfVar.s && ((nciVar3 = this.t) == null ? nqfVar.t == null : nciVar3.equals(nqfVar.t)) && ((nuvVar = this.u) == null ? nqfVar.u == null : nuvVar.equals(nqfVar.u)) && Float.compare(this.v, nqfVar.v) == 0 && ((hedVar = this.J) == null ? nqfVar.J == null : hedVar.equals(nqfVar.J)) && ((omjVar = this.K) == null ? nqfVar.K == null : omjVar.equals(nqfVar.K)) && ((i = this.H) == 0 ? nqfVar.H == 0 : i == nqfVar.H) && ((ncqVar = this.w) == null ? nqfVar.w == null : ncqVar.equals(nqfVar.w)) && this.x == nqfVar.x && ((nucVar = this.y) == null ? nqfVar.y == null : nucVar.equals(nqfVar.y)) && ((commandOuterClass$Command = this.z) == null ? nqfVar.z == null : commandOuterClass$Command.equals(nqfVar.z)) && ((commandOuterClass$Command2 = this.A) == null ? nqfVar.A == null : commandOuterClass$Command2.equals(nqfVar.A)) && ((i2 = this.I) == 0 ? nqfVar.I == 0 : i2 == nqfVar.I) && ((ndsVar = this.B) == null ? nqfVar.B == null : ndsVar.equals(nqfVar.B)) && this.C == nqfVar.C && ((num = this.D) == null ? nqfVar.D == null : num.equals(nqfVar.D)) && Float.compare(this.E, nqfVar.E) == 0 && Float.compare(this.F, nqfVar.F) == 0 && this.G == nqfVar.G) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 30;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (nqf) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new nqd();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new nqe();
    }
}
