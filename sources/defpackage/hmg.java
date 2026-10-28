package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hmg implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hmg(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mfy] */
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
    public final void a() throws IOException {
        ameb amebVar;
        View decorView = null;
        switch (this.$cid) {
            case 0:
                this.b.a(Boolean.FALSE);
                ((hmi) this.a).a(false);
                return;
            case 1:
                apbq apbqVar = (apbq) this.b;
                if ((apbqVar.c & 1) != 0) {
                    Object obj = this.a;
                    String str = apbqVar.d;
                    alvy alvyVar = apbqVar.e;
                    if (alvyVar == null) {
                        alvyVar = alvy.a;
                    }
                    rku rkuVar = (rku) obj;
                    ((tbt) rkuVar.a).c(new wsp(str, alvyVar, aotd.ACTION_SET_CUSTOM_THUMBNAIL));
                    if (((vxz) rkuVar.c).l(240, 45794845L, false)) {
                        hef hefVar = (hef) rkuVar.b;
                        ((AtomicBoolean) hefVar.b).set(true);
                        ((awkv) hefVar.a).kk(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.b.a(Boolean.TRUE);
                ((hmi) this.a).a(true);
                return;
            case 3:
                addp addpVar = (addp) this.a;
                addpVar.b.a();
                anng anngVar = (anng) this.b;
                if ((anngVar.b & 1) != 0) {
                    ?? r0 = addpVar.a;
                    ajwo ajwoVar = anngVar.c;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    r0.a(ajwoVar);
                    return;
                }
                return;
            case 4:
                String str2 = ((asqn) this.b).d;
                View view = (View) this.a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    throw new IllegalStateException("Unable to locate the root View.");
                }
                if (mfz.d(str2, rootView)) {
                    return;
                }
                for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        decorView = ((Activity) context).getWindow().getDecorView();
                        if (decorView != null || !mfz.d(str2, decorView)) {
                            throw new IllegalArgumentException("Unable to locate view with accessibility id: ".concat(String.valueOf(str2)));
                        }
                        return;
                    }
                }
                if (decorView != null) {
                }
                throw new IllegalArgumentException("Unable to locate view with accessibility id: ".concat(String.valueOf(str2)));
            case 5:
                amtv amtvVar = (amtv) this.b;
                int iBi = a.bi(amtvVar.d);
                int i = iBi != 0 ? iBi : 1;
                Object obj2 = this.a;
                aigj aigjVar = amtvVar.e;
                agev agevVarA = aecm.A((nwf) obj2);
                if (agevVarA.g()) {
                    int i2 = i - 1;
                    ameb amebVar2 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_UNKNOWN;
                    switch (i2) {
                        case 1:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                            break;
                        case 2:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_LONG_PRESS;
                            break;
                        case 3:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_PINCH;
                            break;
                        case 4:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE;
                            break;
                        case 5:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_FORWARD_SWIPE;
                            break;
                        case 6:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_BACK_SWIPE;
                            break;
                        case 7:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SCROLL_DID_STOP;
                            break;
                        case 8:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SCROLL_BEGAN_DRAGGING;
                            break;
                        case 9:
                            amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_DOUBLE_CLICK;
                            break;
                        default:
                            amebVar = amebVar2;
                            break;
                    }
                    if (amebVar != amebVar2) {
                        ((xgn) agevVarA.c()).o(amebVar, new xgj(aigjVar, (amud) null), null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                amty amtyVar = (amty) this.b;
                amdd amddVar = amtyVar.d;
                if (amddVar == null) {
                    amddVar = amdd.a;
                }
                amud amudVar = amtyVar.e;
                if (amudVar == null) {
                    amudVar = amud.b;
                }
                agev agevVarA2 = aecm.A((nwf) this.a);
                if (agevVarA2.g()) {
                    ((xgn) agevVarA2.c()).A(new xgj(amudVar), amddVar);
                    return;
                }
                return;
            case 7:
                ((kjc) ((mgp) this.a).a).r(((asqy) this.b).d);
                return;
            case 8:
                ((axfd) ((mgp) this.a).a).X(((asqz) this.b).c);
                return;
            case 9:
                AtomicInteger atomicInteger = mgs.a;
                ((acyw) this.b).e((mgr) this.a);
                return;
            case 10:
                ((svk) this.b).a.c((Intent) this.a);
                return;
            case 11:
                ((vrh) this.a).c(((aifs) this.b).toByteArray());
                return;
            case 12:
                ?? r1 = this.b;
                boolean zIsEmpty = ((ArrayList) r1).isEmpty();
                Object obj3 = this.a;
                if (zIsEmpty) {
                    return;
                }
                try {
                    ((aaeu) obj3).e.b(r1);
                    return;
                } catch (aaob e) {
                    ((agrc) ((agrc) ((agrc) aaeu.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineCleanupHelper", "cleanupEntityStore", (char) 163, "OfflineCleanupHelper.java")).t("Error enqueuing redownload actions after entity store cleanup.");
                    return;
                }
            case 13:
                File file = (File) this.a;
                agyo.b(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                try {
                    fileOutputStream.write((byte[]) this.b);
                    fileOutputStream.close();
                    return;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 14:
                ((abrj) this.a).a.dispose();
                ((avmn) ((AtomicReference) this.b).get()).dispose();
                return;
            case 15:
                actx actxVar = (actx) this.b;
                if (actxVar.i == this.a) {
                    actxVar.i = null;
                    return;
                }
                return;
            case 16:
                ((addt) this.a).e((asra) this.b);
                return;
            case 17:
                Object obj4 = this.b;
                aeic aeicVar = (aeic) this.a;
                aeicVar.c.a(aeicVar.c((ajwo) obj4));
                return;
            case 18:
                Object obj5 = this.b;
                aeic aeicVar2 = (aeic) this.a;
                aeicVar2.c.a(aeicVar2.c((ajwo) obj5));
                return;
            default:
                ajfk ajfkVar = (ajfk) this.b;
                String str3 = ajfkVar.d;
                ajmm ajmmVar = ajfkVar.c;
                if (ajmmVar == null) {
                    ajmmVar = ajmm.a;
                }
                ((awlo) ((ahud) ((mgc) this.a).a).b).kk(new aeoy(str3, ajmmVar));
                return;
        }
    }

    public /* synthetic */ hmg(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
