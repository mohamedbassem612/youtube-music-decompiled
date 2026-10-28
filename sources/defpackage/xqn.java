package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.blocks.Container;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xqn implements xqm {
    public final xmr a;
    public final hed b;
    private final vxe c;
    private final vxz d;

    static {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.getClass();
        aihl aihlVar = apkg.b;
        aihlVar.getClass();
        aihf aihfVarCreateBuilder = apkg.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((apkg) aihfVarCreateBuilder.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
        aihf aihfVarCreateBuilder2 = amyi.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = amyj.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        amyh amyhVar = amyh.MDX_POLLING_FREQUENCY_ACTIVE;
        aihfVarCreateBuilder3.copyOnWrite();
        amyj amyjVar = (amyj) aihfVarCreateBuilder3.instance;
        amyjVar.c = amyhVar.f;
        amyjVar.b |= 1;
        aihn aihnVarBuild = aihfVarCreateBuilder3.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        amyi amyiVar = (amyi) aihfVarCreateBuilder2.instance;
        amyiVar.d = (amyj) aihnVarBuild;
        amyiVar.b |= 2;
        amyg amygVar = amyg.MDX_DEVICE_DISCOVERY_STRATEGY_REMOTE;
        aihfVarCreateBuilder2.copyOnWrite();
        amyi amyiVar2 = (amyi) aihfVarCreateBuilder2.instance;
        amyiVar2.c = amygVar.f;
        amyiVar2.b |= 1;
        aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
        aihnVarBuild2.getClass();
        amyi amyiVar3 = (amyi) aihnVarBuild2;
        aihfVarCreateBuilder.copyOnWrite();
        apkg apkgVar = (apkg) aihfVarCreateBuilder.instance;
        aiie aiieVar = apkgVar.c;
        if (!aiieVar.c()) {
            apkgVar.c = aihn.mutableCopy(aiieVar);
        }
        apkgVar.c.add(amyiVar3);
        aihn aihnVarBuild3 = aihfVarCreateBuilder.build();
        aihnVarBuild3.getClass();
        aihhVar.e(aihlVar, (apkg) aihnVarBuild3);
        atqp.W(aihhVar);
        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
        aihhVar2.getClass();
        aihl aihlVar2 = ajoa.c;
        aihlVar2.getClass();
        aihf aihfVarCreateBuilder4 = ajoa.b.createBuilder();
        aihfVarCreateBuilder4.getClass();
        new aikl(new aihx(((ajoa) aihfVarCreateBuilder4.instance).d, ajoa.a));
        amyg amygVar2 = amyg.MDX_DEVICE_DISCOVERY_STRATEGY_REMOTE;
        aihfVarCreateBuilder4.copyOnWrite();
        ajoa ajoaVar = (ajoa) aihfVarCreateBuilder4.instance;
        aihv aihvVar = ajoaVar.d;
        if (!aihvVar.c()) {
            ajoaVar.d = aihn.mutableCopy(aihvVar);
        }
        ajoaVar.d.h(amygVar2.f);
        aihn aihnVarBuild4 = aihfVarCreateBuilder4.build();
        aihnVarBuild4.getClass();
        aihhVar2.e(aihlVar2, (ajoa) aihnVarBuild4);
        atqp.W(aihhVar2);
    }

    public xqn(Context context, Container container, vxe vxeVar, xql xqlVar, hed hedVar, vxz vxzVar, xmr xmrVar) {
        context.getClass();
        container.getClass();
        vxeVar.getClass();
        xqlVar.getClass();
        hedVar.getClass();
        vxzVar.getClass();
        xmrVar.getClass();
        this.c = vxeVar;
        this.b = hedVar;
        this.d = vxzVar;
        this.a = xmrVar;
    }

    private static final akud c(String str) {
        aihf aihfVarCreateBuilder = akud.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        afyd.P(str, aihfVarCreateBuilder);
        akuc akucVar = akuc.ENGAGEMENT_PANEL_SURFACE_NATIVE_ALL;
        aihfVarCreateBuilder.copyOnWrite();
        akud akudVar = (akud) aihfVarCreateBuilder.instance;
        akudVar.c = akucVar.i;
        akudVar.b |= 1;
        return afyd.O(aihfVarCreateBuilder);
    }

    public final void a(String str) {
        aihf aihfVarCreateBuilder = apxs.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        acfz.aT(c(str), aihfVarCreateBuilder);
        aihf aihfVarCreateBuilder2 = apxr.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = akuf.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        aihf aihfVarCreateBuilder4 = akuj.b.createBuilder();
        aihfVarCreateBuilder4.getClass();
        akud akudVarC = c(str);
        aihfVarCreateBuilder4.copyOnWrite();
        akuj akujVar = (akuj) aihfVarCreateBuilder4.instance;
        akujVar.f = akudVarC;
        akujVar.e = 18;
        int iHashCode = str.hashCode();
        Integer num = null;
        if (iHashCode != -1946931000) {
            if (iHashCode != -584307281) {
                if (iHashCode == 721946278 && str.equals("PAmedia_hub_watch_companion")) {
                    num = 301116;
                }
            } else if (str.equals("PAmedia_hub_music")) {
                num = 301121;
            }
        } else if (str.equals("PAmedia_hub_multitask")) {
            num = 293041;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            aihfVarCreateBuilder4.copyOnWrite();
            akuj akujVar2 = (akuj) aihfVarCreateBuilder4.instance;
            akujVar2.c |= 16777216;
            akujVar2.D = iIntValue;
        }
        aktz aktzVar = aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP;
        aihfVarCreateBuilder4.copyOnWrite();
        akuj akujVar3 = (akuj) aihfVarCreateBuilder4.instance;
        akujVar3.K = aktzVar.e;
        akujVar3.d |= 1;
        if (awrc.c(str, "PAmedia_hub_watch_companion")) {
            if (this.d.l(225, 45793718L, false)) {
                afyd.N(aihfVarCreateBuilder4);
                aihfVarCreateBuilder4.aU(akua.ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT);
            } else {
                aihfVarCreateBuilder4.copyOnWrite();
                akuj akujVar4 = (akuj) aihfVarCreateBuilder4.instance;
                akujVar4.c |= Integer.MIN_VALUE;
                akujVar4.J = true;
                aihfVarCreateBuilder4.copyOnWrite();
                akuj akujVar5 = (akuj) aihfVarCreateBuilder4.instance;
                akujVar5.c |= 134217728;
                akujVar5.F = 0.25d;
            }
        } else if (awrc.c(str, "PAmedia_hub_music")) {
            afyd.N(aihfVarCreateBuilder4);
            aihfVarCreateBuilder4.aU(akua.ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT);
            aihfVarCreateBuilder4.copyOnWrite();
            akuj akujVar6 = (akuj) aihfVarCreateBuilder4.instance;
            akujVar6.n = 2;
            akujVar6.c |= SemanticState.Hidden;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder4.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder3.copyOnWrite();
        akuf akufVar = (akuf) aihfVarCreateBuilder3.instance;
        akufVar.c = (akuj) aihnVarBuild;
        akufVar.b = 138681066;
        aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
        aihnVarBuild2.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        apxr apxrVar = (apxr) aihfVarCreateBuilder2.instance;
        apxrVar.c = (akuf) aihnVarBuild2;
        apxrVar.b |= 1;
        aihn aihnVarBuild3 = aihfVarCreateBuilder2.build();
        aihnVarBuild3.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        apxs apxsVar = (apxs) aihfVarCreateBuilder.instance;
        apxsVar.f = (apxr) aihnVarBuild3;
        apxsVar.c |= 1;
        apxs apxsVarAS = acfz.aS(aihfVarCreateBuilder);
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.getClass();
        aihl aihlVar = apxs.b;
        aihlVar.getClass();
        aihhVar.e(aihlVar, apxsVarAS);
        this.c.a(atqp.W(aihhVar));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, vob] */
    public final boolean b(vor vorVar, String str) {
        akuj akujVarU;
        if (vorVar.I()) {
            ?? r2 = vorVar.w.d;
            String str2 = null;
            if (r2 != 0 && (akujVarU = r2.u()) != null) {
                akud akudVar = akujVarU.e == 18 ? (akud) akujVarU.f : akud.a;
                if (akudVar != null) {
                    str2 = akudVar.d;
                }
            }
            if (awrc.c(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
