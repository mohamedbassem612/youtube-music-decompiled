package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class diy extends Handler {
    public final WeakReference a;

    public diy(diw diwVar) {
        this.a = new WeakReference(diwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        diw diwVar = (diw) this.a.get();
        if (diwVar != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle bundlePeekData = message.peekData();
            if (i == 0) {
                if (i2 == diwVar.f) {
                    diwVar.f = 0;
                    djc djcVar = diwVar.h;
                    if (djcVar.d == diwVar) {
                        djcVar.p();
                    }
                }
                SparseArray sparseArray = diwVar.g;
                vy vyVar = (vy) sparseArray.get(i2);
                if (vyVar != null) {
                    sparseArray.remove(i2);
                    vyVar.l(null, null);
                    return;
                }
                return;
            }
            switch (i) {
                case 2:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    Bundle bundle = (Bundle) obj;
                    if (diwVar.e == 0 && i2 == diwVar.f && i3 > 0) {
                        diwVar.f = 0;
                        diwVar.e = i3;
                        djc djcVar2 = diwVar.h;
                        djcVar2.h(diwVar, dhq.a(bundle));
                        if (djcVar2.d == diwVar) {
                            djcVar2.e = true;
                            ArrayList arrayList = djcVar2.b;
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((dix) arrayList.get(i4)).m(djcVar2.d);
                            }
                            dhh dhhVar = djcVar2.h;
                            if (dhhVar != null) {
                                djcVar2.d.c(dhhVar);
                            }
                        }
                        break;
                    }
                    break;
                case 3:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    SparseArray sparseArray2 = diwVar.g;
                    Bundle bundle2 = (Bundle) obj;
                    vy vyVar2 = (vy) sparseArray2.get(i2);
                    if (vyVar2 != null) {
                        sparseArray2.remove(i2);
                        vyVar2.m(bundle2);
                    }
                    break;
                case 4:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                    Bundle bundle3 = (Bundle) obj;
                    SparseArray sparseArray3 = diwVar.g;
                    vy vyVar3 = (vy) sparseArray3.get(i2);
                    if (vyVar3 != null) {
                        sparseArray3.remove(i2);
                        vyVar3.l(string, bundle3);
                    }
                    break;
                case 5:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    Bundle bundle4 = (Bundle) obj;
                    if (diwVar.e != 0) {
                        diwVar.h.h(diwVar, dhq.a(bundle4));
                    }
                    break;
                case 6:
                    if (obj instanceof Bundle) {
                        Bundle bundle5 = (Bundle) obj;
                        SparseArray sparseArray4 = diwVar.g;
                        vy vyVar4 = (vy) sparseArray4.get(i2);
                        if (vyVar4 != null) {
                            sparseArray4.remove(i2);
                            if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                vyVar4.l("DynamicGroupRouteController is created without valid route id.", bundle5);
                            } else {
                                vyVar4.m(bundle5);
                            }
                        }
                    } else {
                        Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    }
                    break;
                case 7:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    Bundle bundle6 = (Bundle) obj;
                    if (diwVar.e != 0 && bundle6 != null) {
                        Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                        dhg dhgVarN = bundle7 != null ? dhg.n(bundle7) : null;
                        ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                        if (parcelableArrayList != null) {
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = parcelableArrayList.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                Bundle bundle8 = (Bundle) parcelableArrayList.get(i5);
                                arrayList2.add(bundle8 == null ? null : new dhi(dhg.n(bundle8.getBundle("mrDescriptor")), bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false)));
                            }
                            djc djcVar3 = diwVar.h;
                            if (djcVar3.d == diwVar) {
                                dix dixVarA = djcVar3.a(i3);
                                if (dixVarA instanceof dja) {
                                    ((dja) dixVarA).r(dhgVarN, arrayList2);
                                }
                            }
                        }
                        break;
                    }
                    break;
                case 8:
                    djc djcVar4 = diwVar.h;
                    if (djcVar4.d == diwVar) {
                        dix dixVarA2 = djcVar4.a(i3);
                        hhb hhbVar = djcVar4.n;
                        if (hhbVar != null && (dixVarA2 instanceof dhn)) {
                            dhn dhnVar = (dhn) dixVarA2;
                            dgr dgrVar = (dgr) ((dje) hhbVar.a).h;
                            if (dgrVar.f == dhnVar) {
                                dgrVar.m(dgrVar.d(), 2, 3, true);
                            }
                        }
                        if (dixVarA2 != 0) {
                            djcVar4.n(dixVarA2);
                        }
                    }
                    break;
            }
        }
    }
}
