package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpg extends fkx {
    public static final /* synthetic */ int H = 0;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Executor A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public avmb B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public zpw C;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public vxz D;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public aeod E;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public aesp F;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public zik G;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Activity a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public adsa b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nry c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nsl d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public long e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public wbz g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public zwb q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public aduv r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public xgn s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nuc t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public assy y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nxl z;

    public zpg() {
        super("SuggestEditableText");
    }

    protected static void aE(fhd fhdVar) {
        if (fhdVar.c != null) {
            fhdVar.x(new aero(1, new Object[0]), "updateState:SuggestEditableText.forceComponentRemount");
        }
    }

    private static final zpf aF(fhd fhdVar) {
        return (zpf) fhdVar.i().c;
    }

    private static final zpe aG(fhd fhdVar) {
        return (zpe) fkx.al(fhdVar);
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        int i = zpk.a;
        zoz zozVar = new zoz(context);
        zozVar.setPadding(0, 0, 0, 0);
        return zozVar;
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        zpd zpdVar = (zpd) fizVar;
        zpd zpdVar2 = (zpd) fizVar2;
        zpdVar.a = zpdVar2.a;
        zpdVar.b = zpdVar2.b;
        zpdVar.c = zpdVar2.c;
        zpdVar.d = zpdVar2.d;
    }

    @Override // defpackage.fgy
    protected final void F(fko fkoVar, fko fkoVar2) {
        zpe zpeVar = (zpe) fkoVar;
        zpe zpeVar2 = (zpe) fkoVar2;
        zpeVar.a = zpeVar2.a;
        zpeVar.b = zpeVar2.b;
        zpeVar.c = zpeVar2.c;
        zpeVar.d = zpeVar2.d;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        zpf zpfVarAF = aF(fhdVar);
        assy assyVar = this.y;
        int i = zpk.a;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(41);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference(assyVar);
        zpfVarAF.b = atomicBoolean;
        zpfVarAF.e = atomicInteger;
        zpfVarAF.d = atomicInteger2;
        zpfVarAF.a = atomicInteger3;
        zpfVarAF.c = atomicBoolean2;
        zpfVarAF.f = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.fgy
    protected final void L(defpackage.fhd r43, java.lang.Object r44, defpackage.fiz r45) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpg.L(fhd, java.lang.Object, fiz):void");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5 A[EDGE_INSN: B:71:0x00d5->B:50:0x00d5 BREAK  A[LOOP:1: B:45:0x00c3->B:72:0x00c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3 A[SYNTHETIC] */
    @Override // defpackage.fgy
    public final void M(fhd fhdVar) {
        SpannableString spannableString;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        askp askpVar;
        askp askpVar2;
        int i;
        Float fValueOf;
        SpannableStringBuilder spannableStringBuilder2;
        Float f;
        SpannableStringBuilder spannableStringBuilder3;
        Context context;
        Boolean bool;
        int iOrElse;
        View viewA;
        float measuredWidth;
        int length;
        zpf zpfVarAF = aF(fhdVar);
        assy assyVar = this.y;
        boolean z2 = this.f;
        long j = this.e;
        nxl nxlVar = this.z;
        nuc nucVar = this.t;
        nry nryVar = this.c;
        nsl nslVar = this.d;
        AtomicBoolean atomicBoolean = zpfVarAF.c;
        AtomicInteger atomicInteger = zpfVarAF.a;
        int i2 = zpk.a;
        Boolean bool2 = Boolean.FALSE;
        askp askpVar3 = assyVar.f;
        if (askpVar3 == null) {
            askpVar3 = askp.a;
        }
        askp askpVar4 = askpVar3;
        SpannableString spannableStringValueOf = askpVar4.c.length() > 0 ? SpannableString.valueOf(zoy.c(nslVar, fhdVar.a, askpVar4, nryVar, nxlVar, nucVar)) : null;
        boolean z3 = atomicBoolean.get();
        boolean z4 = assyVar.y;
        if (j > 0) {
            spannableString = spannableStringValueOf;
            if (atomicInteger.get() >= j) {
                z = false;
            }
            if ((assyVar.F && z) || z3 != z4) {
                aE(fhdVar);
            }
            if (z2) {
                f = null;
                spannableStringBuilder3 = null;
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
                askpVar = assyVar.e;
                if (askpVar == null) {
                    askpVar = askp.a;
                }
                askpVar2 = askpVar;
                i = 0;
                while (true) {
                    if (i < askpVar2.h.size()) {
                        asku askuVar = (asku) askpVar2.h.get(i);
                        if (askpVar2.h.size() <= i && askuVar.e == 0) {
                            float f2 = askuVar.h;
                            if (f2 != 0.0f) {
                                fValueOf = Float.valueOf(f2);
                                break;
                            }
                        } else {
                            i++;
                        }
                    }
                    fValueOf = null;
                    break;
                }
                if ((askpVar2.b & 1) != 0) {
                    context = fhdVar.a;
                    spannableStringBuilder2 = new SpannableStringBuilder(zoy.c(nslVar, context, askpVar2, nryVar, nxlVar, nucVar));
                    if ((assyVar.c & SemanticState.ReadOnly) != 0 && assyVar.n) {
                        length = spannableStringBuilder2.length();
                        while (true) {
                            length--;
                            if (length >= 0) {
                                break;
                            } else if (spannableStringBuilder2.charAt(length) == '\n') {
                                spannableStringBuilder2.delete(length, length + 1);
                            }
                        }
                    }
                    if (zpk.a(assyVar)) {
                        iOrElse = tzk.n(context, R.attr.ytBadgeChipBackground).orElse(0);
                        viewA = nslVar.a();
                        if (viewA != null) {
                            measuredWidth = viewA.getMeasuredWidth() * 0.85f;
                        } else {
                            measuredWidth = 0.0f;
                        }
                        if (measuredWidth > 0.0f) {
                            zoy.e(spannableStringBuilder2, measuredWidth, iOrElse, assyVar);
                            bool = Boolean.TRUE;
                        } else {
                            aE(fhdVar);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                } else {
                    bool2 = Boolean.TRUE;
                    spannableStringBuilder2 = spannableStringBuilder;
                }
                f = fValueOf;
                spannableStringBuilder3 = spannableStringBuilder2;
            }
            aG(fhdVar).a = bool2;
            aG(fhdVar).b = spannableStringBuilder3;
            aG(fhdVar).d = spannableString;
            aG(fhdVar).c = f;
        }
        spannableString = spannableStringValueOf;
        z = true;
        if (assyVar.F) {
            aE(fhdVar);
        } else {
            aE(fhdVar);
        }
        if (z2) {
            f = null;
            spannableStringBuilder3 = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            askpVar = assyVar.e;
            if (askpVar == null) {
                askpVar = askp.a;
            }
            askpVar2 = askpVar;
            i = 0;
            while (true) {
                if (i < askpVar2.h.size()) {
                    asku askuVar2 = (asku) askpVar2.h.get(i);
                    if (askpVar2.h.size() <= i) {
                    }
                    i++;
                }
                fValueOf = null;
                break;
            }
            if ((askpVar2.b & 1) != 0) {
                context = fhdVar.a;
                spannableStringBuilder2 = new SpannableStringBuilder(zoy.c(nslVar, context, askpVar2, nryVar, nxlVar, nucVar));
                if ((assyVar.c & SemanticState.ReadOnly) != 0) {
                    length = spannableStringBuilder2.length();
                    while (true) {
                        length--;
                        if (length >= 0) {
                            break;
                            break;
                        } else if (spannableStringBuilder2.charAt(length) == '\n') {
                            spannableStringBuilder2.delete(length, length + 1);
                        }
                    }
                }
                if (zpk.a(assyVar)) {
                    iOrElse = tzk.n(context, R.attr.ytBadgeChipBackground).orElse(0);
                    viewA = nslVar.a();
                    if (viewA != null) {
                        measuredWidth = viewA.getMeasuredWidth() * 0.85f;
                    } else {
                        measuredWidth = 0.0f;
                    }
                    if (measuredWidth > 0.0f) {
                        zoy.e(spannableStringBuilder2, measuredWidth, iOrElse, assyVar);
                        bool = Boolean.TRUE;
                    } else {
                        aE(fhdVar);
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                bool2 = bool;
            } else {
                bool2 = Boolean.TRUE;
                spannableStringBuilder2 = spannableStringBuilder;
            }
            f = fValueOf;
            spannableStringBuilder3 = spannableStringBuilder2;
        }
        aG(fhdVar).a = bool2;
        aG(fhdVar).b = spannableStringBuilder3;
        aG(fhdVar).d = spannableString;
        aG(fhdVar).c = f;
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        zpf zpfVar = (zpf) fkyVar;
        zpf zpfVar2 = (zpf) fkyVar2;
        zpfVar2.a = zpfVar.a;
        zpfVar2.b = zpfVar.b;
        zpfVar2.c = zpfVar.c;
        zpfVar2.d = zpfVar.d;
        zpfVar2.e = zpfVar.e;
        zpfVar2.f = zpfVar.f;
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
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        zpg zpgVar = (zpg) fgyVar;
        zpg zpgVar2 = (zpg) fgyVar2;
        fif fifVar = new fif(zpgVar == null ? null : zpgVar.y, zpgVar2 == null ? null : zpgVar2.y);
        fif fifVar2 = new fif(zpgVar == null ? null : ((zpf) fkyVar).b, zpgVar2 == null ? null : ((zpf) fkyVar2).b);
        fif fifVar3 = new fif(zpgVar == null ? null : ((zpf) fkyVar).e, zpgVar2 == null ? null : ((zpf) fkyVar2).e);
        fif fifVar4 = new fif(zpgVar == null ? null : ((zpf) fkyVar).a, zpgVar2 != null ? ((zpf) fkyVar2).a : null);
        int i = zpk.a;
        return (((AtomicInteger) fifVar3.b).get() == ((AtomicInteger) fifVar3.a).get() && ((AtomicBoolean) fifVar2.a).get() && Objects.equals(fifVar4.a, fifVar4.b) && !zpk.b((assy) fifVar.a, (assy) fifVar.b)) ? false : true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        Boolean bool;
        zpf zpfVarAF = aF(fhdVar);
        boolean z = this.f;
        assy assyVar = this.y;
        nxl nxlVar = this.z;
        nuc nucVar = this.t;
        nry nryVar = this.c;
        nsl nslVar = this.d;
        AtomicReference atomicReference = zpfVarAF.f;
        int i = zpk.a;
        Boolean bool2 = Boolean.FALSE;
        Float fValueOf = null;
        Boolean boolValueOf = Boolean.valueOf(zpk.b(atomicReference != null ? (assy) atomicReference.get() : null, assyVar));
        atomicReference.set(assyVar);
        if (z) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            askp askpVar = assyVar.e;
            if (askpVar == null) {
                askpVar = askp.a;
            }
            askp askpVar2 = askpVar;
            for (int i2 = 0; i2 < askpVar2.h.size(); i2++) {
                asku askuVar = (asku) askpVar2.h.get(i2);
                if (askpVar2.h.size() > i2 && askuVar.e == 0) {
                    float f = askuVar.h;
                    if (f == 0.0f) {
                        break;
                    }
                    fValueOf = Float.valueOf(f);
                    break;
                }
            }
            Float f2 = fValueOf;
            if ((askpVar2.b & 1) != 0) {
                Context context = fhdVar.a;
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(zoy.c(nslVar, context, askpVar2, nryVar, nxlVar, nucVar));
                if ((assyVar.c & SemanticState.ReadOnly) != 0 && assyVar.n) {
                    int length = spannableStringBuilder4.length();
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else if (spannableStringBuilder4.charAt(length) == '\n') {
                            spannableStringBuilder4.delete(length, length + 1);
                        }
                    }
                }
                if (zpk.a(assyVar)) {
                    int iOrElse = tzk.n(context, R.attr.ytBadgeChipBackground).orElse(0);
                    float fG = fjiVar.g() * 0.85f;
                    if (fG > 0.0f) {
                        zoy.e(spannableStringBuilder4, fG, iOrElse, assyVar);
                        bool = Boolean.TRUE;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                } else {
                    bool = Boolean.TRUE;
                }
                bool2 = bool;
                spannableStringBuilder = spannableStringBuilder4;
            } else {
                bool2 = Boolean.TRUE;
                spannableStringBuilder = spannableStringBuilder3;
            }
            spannableStringBuilder2 = spannableStringBuilder;
            fValueOf = f2;
        } else {
            spannableStringBuilder2 = null;
        }
        zpd zpdVar = (zpd) fizVar;
        zpdVar.a = bool2;
        zpdVar.c = fValueOf;
        zpdVar.b = spannableStringBuilder2;
        zpdVar.d = boolValueOf;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        zpf zpfVarAF = aF(fhdVar);
        AtomicInteger atomicInteger = zpfVarAF.e;
        AtomicInteger atomicInteger2 = zpfVarAF.d;
        int i3 = zpk.a;
        fkwVar.a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        int i4 = atomicInteger.get() == 0 ? atomicInteger2.get() << 1 : atomicInteger2.get() * (atomicInteger.get() + 1);
        if (View.MeasureSpec.getMode(i2) == 0) {
            fkwVar.b = i4;
        } else {
            fkwVar.b = Math.min(i4, size);
        }
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        zoz zozVar = (zoz) obj;
        int i = zpk.a;
        zozVar.i();
        wek wekVar = zozVar.d;
        if (wekVar != null) {
            wer werVarE = wekVar.e();
            werVarE.j("suggest-editable-text-selection-state-entity-key");
            werVarE.c(wem.LEGACY_API_ALLOWLIST_TOKEN);
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        wbz wbzVar;
        zwb zwbVar;
        aduv aduvVar;
        xgn xgnVar;
        nuc nucVar;
        zik zikVar;
        CommandOuterClass$Command commandOuterClass$Command;
        CommandOuterClass$Command commandOuterClass$Command2;
        CommandOuterClass$Command commandOuterClass$Command3;
        CommandOuterClass$Command commandOuterClass$Command4;
        aesp aespVar;
        vxz vxzVar;
        zpw zpwVar;
        assy assyVar;
        aeod aeodVar;
        nxl nxlVar;
        Executor executor;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            zpg zpgVar = (zpg) fgyVar;
            Activity activity = this.a;
            if (activity == null ? zpgVar.a == null : activity.equals(zpgVar.a)) {
                adsa adsaVar = this.b;
                if (adsaVar == null ? zpgVar.b == null : adsaVar.equals(zpgVar.b)) {
                    nry nryVar = this.c;
                    if (nryVar == null ? zpgVar.c == null : nryVar.equals(zpgVar.c)) {
                        nsl nslVar = this.d;
                        if (nslVar == null ? zpgVar.d == null : nslVar.equals(zpgVar.d)) {
                            if (this.e == zpgVar.e && this.f == zpgVar.f && ((wbzVar = this.g) == null ? zpgVar.g == null : wbzVar.equals(zpgVar.g)) && ((zwbVar = this.q) == null ? zpgVar.q == null : zwbVar.equals(zpgVar.q)) && ((aduvVar = this.r) == null ? zpgVar.r == null : aduvVar.equals(zpgVar.r)) && ((xgnVar = this.s) == null ? zpgVar.s == null : xgnVar.equals(zpgVar.s)) && ((nucVar = this.t) == null ? zpgVar.t == null : nucVar.equals(zpgVar.t)) && ((zikVar = this.G) == null ? zpgVar.G == null : zikVar.equals(zpgVar.G)) && ((commandOuterClass$Command = this.u) == null ? zpgVar.u == null : commandOuterClass$Command.equals(zpgVar.u)) && ((commandOuterClass$Command2 = this.v) == null ? zpgVar.v == null : commandOuterClass$Command2.equals(zpgVar.v)) && ((commandOuterClass$Command3 = this.w) == null ? zpgVar.w == null : commandOuterClass$Command3.equals(zpgVar.w)) && ((commandOuterClass$Command4 = this.x) == null ? zpgVar.x == null : commandOuterClass$Command4.equals(zpgVar.x)) && ((aespVar = this.F) == null ? zpgVar.F == null : aespVar.equals(zpgVar.F)) && ((vxzVar = this.D) == null ? zpgVar.D == null : vxzVar.equals(zpgVar.D)) && ((zpwVar = this.C) == null ? zpgVar.C == null : zpwVar.equals(zpgVar.C)) && ((assyVar = this.y) == null ? zpgVar.y == null : assyVar.equals(zpgVar.y)) && ((aeodVar = this.E) == null ? zpgVar.E == null : aeodVar.equals(zpgVar.E)) && ((nxlVar = this.z) == null ? zpgVar.z == null : nxlVar.equals(zpgVar.z)) && ((executor = this.A) == null ? zpgVar.A == null : executor.equals(zpgVar.A))) {
                                avmb avmbVar = this.B;
                                if (avmbVar != null) {
                                    if (avmbVar.equals(zpgVar.B)) {
                                        return true;
                                    }
                                } else if (zpgVar.B == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (zpg) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new zpd();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fko t() {
        return new zpe();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new zpf();
    }
}
