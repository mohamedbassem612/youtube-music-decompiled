package defpackage;

import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdt extends azs {
    private static final khn a = new khn("MediaRouterCallback", (String) null);
    private final kds b;
    private final kdx c;
    private final kdz d;

    public kdt(kds kdsVar, kdx kdxVar, kdz kdzVar) {
        if (kdsVar == null) {
            throw new NullPointerException("null reference");
        }
        this.b = kdsVar;
        this.c = kdxVar;
        this.d = kdzVar;
    }

    private final void H() {
        kdz kdzVar = this.d;
        if (kdzVar == null || !kdzVar.b()) {
            return;
        }
        kcr kcrVar = kdzVar.e;
        if ((kcrVar != null ? kcrVar.a() : null) == null) {
            dij.m(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (dii diiVar : dij.i()) {
            if (CastDevice.c(diiVar.s) != null) {
                arrayList.add(new djg(new auzc(diiVar.d)));
            }
        }
        arrayList.size();
        khn.e();
        yu yuVar = new yu();
        yuVar.a(arrayList);
        dij.m(new djh(yuVar));
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
    @Override // defpackage.azs
    public final void B(dii diiVar, int i) {
        int i2 = diiVar.m;
        khn khnVar = a;
        if (i2 != 1) {
            khnVar.a("ignore onRouteUnselected for non-remote routeId: %s", diiVar.d);
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        String str = diiVar.d;
        khnVar.a("onRouteUnselected with reason = %d, routeId = %s", numValueOf, str);
        try {
            this.b.m(str, diiVar.s, i);
        } catch (RemoteException unused) {
            khn.e();
        }
        H();
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
    @Override // defpackage.azs
    public final void n(dij dijVar, dii diiVar, int i, dii diiVar2) {
        int i2 = diiVar.m;
        khn khnVar = a;
        if (i2 != 1) {
            khnVar.a("ignore onRouteSelected for non-remote selected routeId: %s", diiVar.d);
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        String str = diiVar.d;
        khnVar.a("onRouteSelected with reason = %d, routeId = %s", numValueOf, str);
        try {
            kds kdsVar = this.b;
            if (kdsVar.a() >= 220400000) {
                kdsVar.l(diiVar2.d, str, diiVar.s);
            } else {
                kdsVar.k(diiVar2.d, diiVar.s);
            }
        } catch (RemoteException unused) {
            khn.e();
        }
        H();
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
    @Override // defpackage.azs
    public final void p(dii diiVar, dii diiVar2) {
        int i = diiVar.m;
        khn khnVar = a;
        if (i != 1) {
            khnVar.a("ignore onRouteConnected for non-remote connected routeId: %s", diiVar.d);
            return;
        }
        String str = diiVar.d;
        khnVar.a("onRouteConnected with connectedRouteId = %s", str);
        this.c.i = true;
        try {
            kds kdsVar = this.b;
            if (kdsVar.a() >= 251600000) {
                kdsVar.h(diiVar2.d, str, diiVar.s);
            } else {
                kdsVar.l(diiVar2.d, str, diiVar.s);
            }
        } catch (RemoteException unused) {
            khn.e();
        }
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
    @Override // defpackage.azs
    public final void q(dii diiVar, dii diiVar2, int i) {
        if (diiVar == null || diiVar.m != 1) {
            a.a("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]);
            return;
        }
        String str = diiVar.d;
        khn khnVar = a;
        String str2 = diiVar2.d;
        khnVar.a("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str, str2, Integer.valueOf(i));
        this.c.i = false;
        try {
            kds kdsVar = this.b;
            if (kdsVar.a() >= 251600000) {
                kdsVar.i(str2, str, diiVar.s, i);
            } else {
                kdsVar.m(str, diiVar.s, i);
            }
        } catch (RemoteException unused) {
            khn.e();
        }
    }

    @Override // defpackage.azs
    public final void x(dii diiVar) {
        try {
            this.b.b(diiVar.d, diiVar.s);
        } catch (RemoteException unused) {
            khn.e();
        }
        H();
    }

    @Override // defpackage.azs
    public final void y(dii diiVar) {
        if (diiVar.o()) {
            try {
                this.b.g(diiVar.d, diiVar.s);
            } catch (RemoteException unused) {
                khn.e();
            }
            H();
        }
    }

    @Override // defpackage.azs
    public final void z(dii diiVar) {
        try {
            this.b.j(diiVar.d, diiVar.s);
        } catch (RemoteException unused) {
            khn.e();
        }
        H();
    }
}
