package defpackage;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpc implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver");
    public final xsa b;
    public final xru c;
    public final vxe d;
    public final Context e;
    public final Executor f;
    public final xwv g;
    public final aeez h;
    public final ycp i;
    public final yar k;
    public final ycp l;
    public final vwt m;
    private final xla n;
    private Optional o = Optional.empty();

    public xpc(xsa xsaVar, xru xruVar, ycp ycpVar, yar yarVar, vxe vxeVar, Context context, ycp ycpVar2, Executor executor, xla xlaVar, xwv xwvVar, aeez aeezVar, vwt vwtVar) {
        this.b = xsaVar;
        this.c = xruVar;
        this.i = ycpVar;
        this.k = yarVar;
        this.d = vxeVar;
        this.e = context;
        this.l = ycpVar2;
        this.f = executor;
        this.n = xlaVar;
        this.g = xwvVar;
        this.h = aeezVar;
        this.m = vwtVar;
    }

    public static boolean f(xzc xzcVar, xvr xvrVar, xzc xzcVar2) {
        if (Objects.equals(xzcVar, xzcVar2)) {
            return false;
        }
        xvr xvrVarJ = xzcVar.j();
        return xvrVarJ == null || xvrVarJ.g(xvrVar);
    }

    public static final Optional g(dii diiVar) {
        Optional optionalOfNullable = Optional.ofNullable(xrx.k(diiVar));
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(new xvj((CastDevice) optionalOfNullable.get())) : optionalOfNullable;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        Optional optionalEmpty;
        xvz xvzVarB;
        agrx agrxVar = agso.a;
        aihl aihlVar = amyb.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        amyb amybVar = (amyb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        yco ycoVar = this.i.e;
        if (ycoVar != null && (xvzVarB = ycoVar.j().b()) != null) {
            algt algtVar = amybVar.d;
            if (algtVar == null) {
                algtVar = algt.a;
            }
            if (xvzVarB.b.equals(algtVar.c)) {
                if ((amybVar.c & 16) != 0) {
                    ajwo ajwoVar2 = amybVar.g;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    aihh aihhVar = (aihh) ajwoVar2.toBuilder();
                    if ((ajwoVar.b & 1) != 0) {
                        aigj aigjVar = ajwoVar.c;
                        aihhVar.copyOnWrite();
                        ajwo ajwoVar3 = (ajwo) aihhVar.instance;
                        aigjVar.getClass();
                        ajwoVar3.b |= 1;
                        ajwoVar3.c = aigjVar;
                    }
                    aihl aihlVar2 = aoaq.b;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                        ajwoVar.c(aihlVarCheckIsLite4);
                        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                        aihhVar.e(aihlVar2, (aoar) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
                    }
                    this.d.a((ajwo) aihhVar.build());
                    return;
                }
                return;
            }
        }
        this.c.P();
        algt algtVar2 = amybVar.d;
        if (algtVar2 == null) {
            algtVar2 = algt.a;
        }
        Object obj = null;
        if (algtVar2.b.isEmpty()) {
            ((agrc) ((agrc) a.b().i(agrxVar, "MdxConnectCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver", "getOrCreateMdxScreen", 220, "MdxConnectCommandResolver.java")).w("Invalid MdxConnectCommand. Missing required fields: DiscoveryDeviceId()%s", algtVar2.b);
        } else if (amybVar.f) {
            obj = (xvr) this.k.e(algtVar2.b).or(new uqq(this, algtVar2, 4)).or(new uqq(this, algtVar2, 5)).orElse(null);
        } else {
            boolean zIsEmpty = algtVar2.c.isEmpty();
            boolean z = (algtVar2.d.isEmpty() || yno.D(algtVar2.d)) ? false : true;
            if (!zIsEmpty || z) {
                yar yarVar = this.k;
                String str = algtVar2.b;
                Iterator it = yarVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        optionalEmpty = Optional.empty();
                        break;
                    }
                    xvr xvrVar = (xvr) it.next();
                    if ((xvrVar instanceof xvk) || (xvrVar instanceof xvi)) {
                        if (str.equals(xvrVar.d().b)) {
                            optionalEmpty = Optional.of(xvrVar);
                            break;
                        }
                    }
                }
                if (optionalEmpty.isPresent()) {
                    obj = optionalEmpty.get();
                } else {
                    String str2 = (amybVar.c & 64) != 0 ? amybVar.i : "YouTube on TV";
                    int i = xve.i;
                    xvb xvbVar = new xvb();
                    String str3 = algtVar2.b;
                    xvbVar.g((String) this.b.a(str3, this.e).or(new uqq(this, str3, 6)).orElse(str2));
                    xvbVar.b(new xvg(algtVar2.b));
                    xvbVar.f(new xvz(algtVar2.c));
                    xvbVar.e(new xvv(1, false));
                    if (z) {
                        xvbVar.c(new xvh(algtVar2.d, 1));
                    }
                    this.o = Optional.of(new xvk(xvbVar.a(), true));
                    boolean zAE = this.n.aE();
                    Optional optional = this.o;
                    if (zAE) {
                        xvk xvkVar = (xvk) optional.get();
                        ((xwm) ((aesp) yarVar.g.io()).h).c(xvkVar);
                        yarVar.g(xvkVar);
                    } else {
                        yarVar.g((xvk) optional.get());
                    }
                    obj = this.o.get();
                }
            } else {
                ((agrc) ((agrc) a.b().i(agrxVar, "MdxConnectCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver", "getOrCreateMdxScreen", 241, "MdxConnectCommandResolver.java")).t("Invalid MdxConnectCommand for MdxCloudScreen. Missing required fields: ScreenId and LoungeToken");
            }
        }
        if (obj == null) {
            e(amybVar);
            return;
        }
        xsa xsaVar = this.b;
        boolean z2 = amybVar.f;
        xvr xvrVar2 = (xvr) obj;
        String str4 = xvrVar2.d().b;
        Context context = this.e;
        abxv abxvVar = xsaVar.d;
        taf.g(abxvVar == null ? ahng.n(Optional.empty()) : ahcs.e(ahcs.f(ahng.r(afwl.j(new wko(abxvVar, 9)), abxvVar.a), afwl.d(new uzh(abxvVar, 15)), abxvVar.d), afwl.a(new roy(xsaVar, z2, str4, context, 2)), xsaVar.b), new xex(this, amybVar, ajwoVar, xvrVar2, ycoVar, 2));
    }

    public final void d(amyb amybVar) {
        ((agrc) ((agrc) a.b().i(agso.a, "MdxConnectCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver", "handleInvalidRoute", 452, "MdxConnectCommandResolver.java")).t("Not a valid YouTube media route.");
        e(amybVar);
    }

    public final void e(amyb amybVar) {
        if ((amybVar.c & 32) != 0) {
            this.f.execute(afwl.i(new xoy(this, amybVar, 0)));
        }
    }
}
