package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class miy implements mkz {
    private final boolean A;
    public final agev a;
    public final nuc b;
    public final mrl c;
    public final ComponentConfig d;
    public volatile agev e;
    public final boolean f;
    public final awmd g;
    public final nsu h;
    public final boolean i;
    public final aunn j;
    public final nso k;
    public final boolean l;
    public final agev m;
    public final boolean n;
    public final boolean o;
    public volatile agev p;
    public final awmd q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final avmb z;

    public miy(agev agevVar, nuc nucVar, mrl mrlVar, awmd awmdVar, nsu nsuVar, avmb avmbVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, aunn aunnVar, agev agevVar7, agev agevVar8, agev agevVar9, agev agevVar10, Context context, agev agevVar11, agev agevVar12, agev agevVar13, agev agevVar14, agev agevVar15, agev agevVar16, agev agevVar17, agev agevVar18, agev agevVar19, agev agevVar20, agev agevVar21, agev agevVar22, agev agevVar23, agev agevVar24, awmd awmdVar2) {
        Application applicationB;
        Activity activityA;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) agevVar12.e(bool)).booleanValue()) {
            UpbArena.jniEnableDirectByteBufferAllocator();
        }
        this.a = agevVar;
        this.b = nucVar;
        this.c = mrlVar;
        this.u = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.v = ((Boolean) agevVar3.e(bool)).booleanValue();
        this.w = ((Boolean) agevVar14.e(bool)).booleanValue();
        this.d = (ComponentConfig) agevVar11.d(new jxp(5));
        this.g = awmdVar;
        this.h = nsuVar;
        boolean zBooleanValue = ((Boolean) agevVar23.e(bool)).booleanValue();
        this.A = zBooleanValue;
        this.e = agevVar4;
        this.p = agevVar18;
        if (zBooleanValue && (applicationB = b(context)) != null && (activityA = a(context)) != null) {
            if (activityA.isDestroyed() || activityA.isFinishing()) {
                agdf agdfVar = agdf.a;
                this.e = agdfVar;
                this.p = agdfVar;
            } else {
                applicationB.registerActivityLifecycleCallbacks(new mmu(this, activityA, applicationB, 1));
            }
        }
        this.f = ((Boolean) agevVar5.e(bool)).booleanValue();
        this.i = ((Boolean) agevVar6.e(bool)).booleanValue();
        this.j = aunnVar;
        this.x = ((Boolean) agevVar7.e(bool)).booleanValue();
        this.y = ((Boolean) agevVar8.e(bool)).booleanValue();
        this.z = avmbVar;
        if (((Boolean) agevVar9.e(bool)).booleanValue()) {
            ((nze) ((agfa) agevVar10).a).a(context);
        }
        this.k = nxz.d(((Boolean) agevVar24.e(bool)).booleanValue());
        this.l = ((Boolean) agevVar13.e(bool)).booleanValue();
        this.m = agevVar15;
        this.n = ((Boolean) agevVar16.e(bool)).booleanValue();
        this.o = ((Boolean) agevVar17.e(bool)).booleanValue();
        ((Boolean) agevVar19.e(bool)).booleanValue();
        this.r = ((Boolean) agevVar20.e(bool)).booleanValue();
        this.s = ((Boolean) agevVar21.e(bool)).booleanValue();
        this.t = ((Boolean) agevVar22.e(bool)).booleanValue();
        this.q = awmdVar2;
    }

    static Activity a(Context context) {
        Context baseContext;
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && baseContext != context) {
            context = baseContext;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    static Application b(Context context) {
        Context baseContext;
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && baseContext != context) {
            context = baseContext;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        if (context == null || !(context.getApplicationContext() instanceof Application)) {
            return null;
        }
        return (Application) context.getApplicationContext();
    }

    public final void c(nxa nxaVar, assc asscVar, Component component, nay nayVar, nsl nslVar) {
        asrl asrlVarC;
        nxaVar.c();
        if (asscVar != null) {
            aihf aihfVarCreateBuilder = assf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            assf assfVar = (assf) aihfVarCreateBuilder.instance;
            assfVar.c = asscVar;
            assfVar.b |= 1;
            if (nayVar != null && (asrlVarC = npi.c(nayVar, nwl.a(component.debugLatestModel()), component.latestSubscriptionConfig(), nslVar.u, this.k)) != null) {
                aihfVarCreateBuilder.copyOnWrite();
                assf assfVar2 = (assf) aihfVarCreateBuilder.instance;
                assfVar2.d = asrlVarC;
                assfVar2.b |= 2;
            }
            DebuggerClient debuggerClient = (DebuggerClient) this.g.io();
            aihf aihfVarCreateBuilder2 = assh.a.createBuilder();
            aijp aijpVarB = npi.b();
            aihfVarCreateBuilder2.copyOnWrite();
            assh asshVar = (assh) aihfVarCreateBuilder2.instance;
            aijpVarB.getClass();
            asshVar.e = aijpVarB;
            asshVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            assh asshVar2 = (assh) aihfVarCreateBuilder2.instance;
            assf assfVar3 = (assf) aihfVarCreateBuilder.build();
            assfVar3.getClass();
            asshVar2.d = assfVar3;
            asshVar2.c = 3;
            debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder2.build()).toByteArray());
        }
    }

    @Override // defpackage.mkz
    public final fgv d(final fhd fhdVar, final nsl nslVar, final nay nayVar) {
        nff nffVarJ = nayVar.j();
        mep mepVar = mzq.J;
        if (!nffVarJ.e(mepVar)) {
            throw new nud("Missing ComponentType extension");
        }
        final mzq mzqVar = (mzq) nayVar.j().d(mepVar);
        final nds ndsVarI = nayVar.m() ? nayVar.i() : nnb.a;
        nwy nwyVar = nslVar.h;
        nwy nwyVar2 = nwy.a;
        if (nwyVar == null) {
            nwyVar = nwyVar2;
        }
        final nxa nxaVarA = nwyVar.a();
        avlr avlrVarQ = avlr.q(new Callable() { // from class: miw
            /* JADX WARN: Failed to calculate best type for var: r10v16 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r10v16 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r11v10 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: mlg
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r11v10 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: mlg
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r12v0 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: com.google.android.libraries.elements.interfaces.EnvironmentDataSource
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r12v0 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: com.google.android.libraries.elements.interfaces.EnvironmentDataSource
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r12v1 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: com.google.android.libraries.elements.interfaces.EnvironmentDataSource
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r12v1 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: com.google.android.libraries.elements.interfaces.EnvironmentDataSource
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r12v19 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v19 ??, new type: com.google.android.libraries.elements.interfaces.EnvironmentDataSource
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r15v0 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r15v0 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r15v1 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r15v1 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r15v8 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v8 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r15v8 ??
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v8 ??, new type: java.lang.Integer
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
            Caused by: java.lang.NullPointerException
             */
            /*  JADX ERROR: Types fix failed
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: com.google.android.libraries.elements.interfaces.EnvironmentDataSource
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 739
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miw.call():java.lang.Object");
            }
        });
        miq miqVarAE = mis.aE(fhdVar);
        miqVarAE.c(nslVar);
        miqVarAE.Z(avlrVarQ);
        miqVarAE.aa(this.b);
        miqVarAE.ab(nxaVarA);
        miqVarAE.d(this.v);
        miqVarAE.ac(new mjb(mzqVar, ndsVarI));
        miqVarAE.g(this.u);
        miqVarAE.f(this.h);
        miqVarAE.e(this.g);
        miqVarAE.i(this.x);
        miqVarAE.j(this.y);
        miqVarAE.b(this.z);
        miqVarAE.h(this.w);
        return miqVarAE;
    }
}
