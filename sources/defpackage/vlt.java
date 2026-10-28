package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vlt extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public aunn a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public ntx b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public assr e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public adrj f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int g;

    public vlt() {
        super("RiveAnimationComponent");
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return new vlr(context);
        }
        Log.w("ElementsRive", "Rive animations are only supported on Android Q (API 29) and above. Falling back to transparent drawable.");
        return new ColorDrawable(0);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        adrj adriVar;
        adrj adrjVar;
        int iK;
        amiu amiuVar;
        boolean z;
        zs zsVar;
        Drawable drawable = (Drawable) obj;
        assr assrVar = this.e;
        adrj adrjVar2 = this.f;
        int i = this.g;
        CommandOuterClass$Command commandOuterClass$Command = this.d;
        CommandOuterClass$Command commandOuterClass$Command2 = this.c;
        aunn aunnVar = this.a;
        ntx ntxVar = this.b;
        fhdVar.getClass();
        drawable.getClass();
        assrVar.getClass();
        if (drawable instanceof vlr) {
            if (adrjVar2 == null) {
                String str = assrVar.c == 1 ? (String) assrVar.d : "";
                str.getClass();
                if (str.length() <= 0) {
                    str = null;
                }
                adriVar = str != null ? new adri(str) : null;
            } else {
                adriVar = adrjVar2;
            }
            nrt nrtVarD = nrv.d();
            nrtVarD.g = ntxVar;
            nrv nrvVarA = nrtVarD.a();
            vlr vlrVar = (vlr) drawable;
            vlrVar.f(commandOuterClass$Command != null ? new mrh((Object) drawable, (Object) aunnVar, (Object) commandOuterClass$Command, (Object) nrvVarA, 18, (byte[]) null) : null);
            vlrVar.g(commandOuterClass$Command2 != null ? new mrh((Object) drawable, (Object) aunnVar, (Object) commandOuterClass$Command2, (Object) nrvVarA, 19, (byte[]) null) : null);
            if (adriVar != null) {
                adrjVar = adriVar;
            } else {
                String str2 = assrVar.c == 1 ? (String) assrVar.d : "";
                str2.getClass();
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    adriVar = new adri(str2);
                    adrjVar = adriVar;
                } else {
                    adrjVar = null;
                }
            }
            if (adrjVar == null) {
                vlrVar.b.m();
                vlrVar.invalidateSelf();
                return;
            }
            adrf adrfVar = vlrVar.b;
            adrfVar.m = new pbm(vlrVar, 11);
            String strA = vlrVar.d;
            if (strA == null || strA.length() == 0) {
                strA = null;
            }
            if (strA == null) {
                strA = adrjVar.a();
            }
            String str3 = strA;
            aihl aihlVar = aplp.c;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            assrVar.c(aihlVarCheckIsLite);
            assr assrVar2 = true != assrVar.j.n(aihlVarCheckIsLite.d) ? null : assrVar;
            if (assrVar2 != null) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                assrVar2.c(aihlVarCheckIsLite2);
                Object objK = assrVar2.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                objC.getClass();
                iK = atqp.K(((Number) objC).intValue());
            } else {
                iK = 0;
            }
            aihl aihlVar2 = aplp.d;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
            assrVar.c(aihlVarCheckIsLite3);
            assr assrVar3 = true != assrVar.j.n(aihlVarCheckIsLite3.d) ? null : assrVar;
            if (assrVar3 != null) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                assrVar3.c(aihlVarCheckIsLite4);
                Object objK2 = assrVar3.j.k(aihlVarCheckIsLite4.d);
                amiuVar = (amiu) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            } else {
                amiuVar = null;
            }
            boolean z2 = (assrVar.b & 2) != 0 ? assrVar.e : true;
            if (i == 0 || i == 1) {
                z = z2;
            } else {
                z = i == 2;
            }
            adrfVar.o(vlrVar.c, str3, adrjVar, iK, amiuVar, z, new vlq(assrVar, null));
            String str4 = vlrVar.d;
            if (str4 != null) {
                String str5 = str4.length() > 0 ? str4 : null;
                if (str5 == null || (zsVar = vlrVar.a) == null) {
                    return;
                }
                if (str5.length() <= 0) {
                    throw new IllegalArgumentException("Key cannot be empty");
                }
                zsVar.a.put(str5, new WeakReference(vlrVar));
            }
        }
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        bog bogVar;
        Drawable drawable = (Drawable) obj;
        fhdVar.getClass();
        drawable.getClass();
        if (drawable instanceof vlr) {
            vlr vlrVar = (vlr) drawable;
            Context context = fhdVar.a;
            context.getClass();
            Object baseContext = context;
            while (true) {
                if (baseContext == null) {
                    bogVar = null;
                    break;
                } else if (baseContext instanceof bog) {
                    bogVar = (bog) baseContext;
                    break;
                } else {
                    ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                    baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                }
            }
            vlrVar.c = bogVar != null ? bogVar.getLifecycle() : null;
            String strM = fhdVar.m();
            if (strM == null) {
                strM = "";
            }
            vlrVar.d = strM;
            try {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                vlrVar.a = ((vlx) atqq.a(applicationContext, vlx.class)).gJ();
            } catch (IllegalArgumentException e) {
                Log.w("ElementsRive", "Invalid context for RiveAnimationEntryPoint", e);
            } catch (IllegalStateException e2) {
                Log.w("ElementsRive", "RiveAnimationEntryPoint missing from application context", e2);
            }
        }
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 2;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        fkwVar.a = gzj.aU(i, 150);
        fkwVar.b = gzj.aU(i2, 150);
    }

    @Override // defpackage.fgy
    protected final void aq(fhd fhdVar, Object obj) {
        Drawable drawable = (Drawable) obj;
        fhdVar.getClass();
        drawable.getClass();
        if (drawable instanceof vlr) {
            vlr vlrVar = (vlr) drawable;
            vlrVar.f(null);
            vlrVar.g(null);
            vlrVar.c();
        }
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        zs zsVar;
        zs zsVar2;
        Drawable drawable = (Drawable) obj;
        fhdVar.getClass();
        drawable.getClass();
        if (drawable instanceof vlr) {
            vlr vlrVar = (vlr) drawable;
            boc bocVar = vlrVar.c;
            if (bocVar == null || bocVar.a() == bob.a) {
                String str = vlrVar.d;
                if (str != null && str.length() > 0 && (zsVar = vlrVar.a) != null) {
                    zsVar.D(str, vlrVar);
                }
                adrf adrfVar = vlrVar.b;
                adrfVar.k(new acoo(vlrVar, 7));
                adrfVar.m();
            } else {
                String str2 = vlrVar.d;
                if (str2 != null && str2.length() != 0 && (zsVar2 = vlrVar.a) != null) {
                    zsVar2.D(str2, vlrVar);
                }
                vlrVar.c();
            }
            vlrVar.c = null;
            vlrVar.d = null;
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            vlt vltVar = (vlt) fgyVar;
            aunn aunnVar = this.a;
            if (aunnVar == null ? vltVar.a == null : aunnVar.equals(vltVar.a)) {
                ntx ntxVar = this.b;
                if (ntxVar == null ? vltVar.b == null : ntxVar.equals(vltVar.b)) {
                    CommandOuterClass$Command commandOuterClass$Command = this.c;
                    if (commandOuterClass$Command == null ? vltVar.c == null : commandOuterClass$Command.equals(vltVar.c)) {
                        CommandOuterClass$Command commandOuterClass$Command2 = this.d;
                        if (commandOuterClass$Command2 == null ? vltVar.d == null : commandOuterClass$Command2.equals(vltVar.d)) {
                            int i = this.g;
                            if (i == 0 ? vltVar.g == 0 : i == vltVar.g) {
                                assr assrVar = this.e;
                                if (assrVar == null ? vltVar.e == null : assrVar.equals(vltVar.e)) {
                                    adrj adrjVar = this.f;
                                    if (adrjVar != null) {
                                        if (adrjVar.equals(vltVar.f)) {
                                            return true;
                                        }
                                    } else if (vltVar.f == null) {
                                        return true;
                                    }
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
}
