package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.LivePlayerConfigOuterClass$LivePlayerConfig;
import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aazy {
    public final acip a;
    public ashq b;
    public final agal c;
    public final agap d;
    public final acag e;
    private final avmm f;

    public aazy(may mayVar, acip acipVar, abvn abvnVar) {
        int i;
        ajwo ajwoVar;
        avmm avmmVar = new avmm();
        this.f = avmmVar;
        acipVar.getClass();
        this.a = acipVar;
        acag acagVarV = abvnVar.v();
        acagVarV.getClass();
        this.e = acagVarV;
        aihf aihfVarCreateBuilder = ashq.a.createBuilder();
        String strAu = acipVar.au();
        aihfVarCreateBuilder.copyOnWrite();
        ashq ashqVar = (ashq) aihfVarCreateBuilder.instance;
        strAu.getClass();
        ashqVar.b |= 1;
        ashqVar.c = strAu;
        int iA = acipVar.a();
        int i2 = 2;
        if (iA != 0) {
            i = 3;
            if (iA != 1) {
                i = iA != 3 ? 1 : 4;
            }
        } else {
            i = 2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ashq ashqVar2 = (ashq) aihfVarCreateBuilder.instance;
        ashqVar2.d = i - 1;
        ashqVar2.b |= 2;
        aihf aihfVarCreateBuilder2 = asgo.a.createBuilder();
        abnl abnlVarN = acipVar.n();
        if (abnlVarN != null && (ajwoVar = abnlVarN.b) != null) {
            String strG = abnn.g(ajwoVar);
            if (strG.length() > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                asgo asgoVar = (asgo) aihfVarCreateBuilder2.instance;
                strG.getClass();
                asgoVar.b |= 1;
                asgoVar.c = strG;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ashq ashqVar3 = (ashq) aihfVarCreateBuilder.instance;
            asgo asgoVar2 = (asgo) aihfVarCreateBuilder2.build();
            asgoVar2.getClass();
            ashqVar3.f = asgoVar2;
            ashqVar3.b |= 8;
        }
        wjf wjfVarF = acipVar.f();
        alvt alvtVarU = wjfVarF == null ? null : wjfVarF.u();
        if (alvtVarU != null) {
            b(aihfVarCreateBuilder, alvtVarU);
        } else {
            avmmVar.c(acipVar.Z().al(new mnt(this, aihfVarCreateBuilder, 19), new xuk(9)));
        }
        this.b = (ashq) aihfVarCreateBuilder.build();
        this.d = (agap) mayVar.b(new afzb(4), new aazx(acipVar, abvnVar, 0));
        this.c = (agal) mayVar.b(new afzb(2), new aazx(acipVar, abvnVar, i2));
    }

    public static final ajoj a(acca accaVar) {
        aihf aihfVarCreateBuilder = ajoj.a.createBuilder();
        String string = typ.b(accaVar.p).toString();
        aihfVarCreateBuilder.copyOnWrite();
        ajoj ajojVar = (ajoj) aihfVarCreateBuilder.instance;
        string.getClass();
        ajojVar.b |= 1;
        ajojVar.c = string;
        aihfVarCreateBuilder.copyOnWrite();
        ajoj ajojVar2 = (ajoj) aihfVarCreateBuilder.instance;
        String str = accaVar.a;
        str.getClass();
        ajojVar2.b |= 4;
        ajojVar2.e = str;
        aihfVarCreateBuilder.copyOnWrite();
        ajoj ajojVar3 = (ajoj) aihfVarCreateBuilder.instance;
        String str2 = accaVar.k;
        str2.getClass();
        ajojVar3.b |= 2;
        ajojVar3.d = str2;
        return (ajoj) aihfVarCreateBuilder.build();
    }

    public static void b(aihf aihfVar, alvt alvtVar) {
        aihf aihfVarCreateBuilder = asgn.a.createBuilder();
        aoqd aoqdVar = alvtVar.e;
        if (aoqdVar == null) {
            aoqdVar = aoqd.a;
        }
        LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance = aoqdVar.D;
        if (defaultInstance == null) {
            defaultInstance = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
        }
        if ((defaultInstance.b & SemanticState.Focused) != 0) {
            aoqd aoqdVar2 = alvtVar.e;
            if (aoqdVar2 == null) {
                aoqdVar2 = aoqd.a;
            }
            LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance2 = aoqdVar2.D;
            if (defaultInstance2 == null) {
                defaultInstance2 = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
            }
            boolean z = defaultInstance2.g;
            aihfVarCreateBuilder.copyOnWrite();
            asgn asgnVar = (asgn) aihfVarCreateBuilder.instance;
            asgnVar.b |= 1;
            asgnVar.c = z;
        }
        aoqd aoqdVar3 = alvtVar.e;
        if (((aoqdVar3 == null ? aoqd.a : aoqdVar3).c & 4194304) != 0) {
            if (aoqdVar3 == null) {
                aoqdVar3 = aoqd.a;
            }
            ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance3 = aoqdVar3.G;
            if (defaultInstance3 == null) {
                defaultInstance3 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
            }
            aihfVarCreateBuilder.copyOnWrite();
            asgn asgnVar2 = (asgn) aihfVarCreateBuilder.instance;
            defaultInstance3.getClass();
            asgnVar2.d = defaultInstance3;
            asgnVar2.b |= 2;
        }
        alvw alvwVar = alvtVar.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        if ((alvwVar.b & 16) != 0) {
            alvw alvwVar2 = alvtVar.g;
            if (alvwVar2 == null) {
                alvwVar2 = alvw.a;
            }
            boolean z2 = alvwVar2.g;
            aihfVarCreateBuilder.copyOnWrite();
            asgn asgnVar3 = (asgn) aihfVarCreateBuilder.instance;
            asgnVar3.b |= 4;
            asgnVar3.e = z2;
        }
        alvw alvwVar3 = alvtVar.g;
        if (((alvwVar3 == null ? alvw.a : alvwVar3).b & 4) != 0) {
            if (alvwVar3 == null) {
                alvwVar3 = alvw.a;
            }
            long j = alvwVar3.e;
            aihfVarCreateBuilder.copyOnWrite();
            asgn asgnVar4 = (asgn) aihfVarCreateBuilder.instance;
            asgnVar4.b |= 8;
            asgnVar4.f = j;
        }
        aihfVar.copyOnWrite();
        ashq ashqVar = (ashq) aihfVar.instance;
        asgn asgnVar5 = (asgn) aihfVarCreateBuilder.build();
        ashq ashqVar2 = ashq.a;
        asgnVar5.getClass();
        ashqVar.e = asgnVar5;
        ashqVar.b |= 4;
    }
}
