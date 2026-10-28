package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iaq {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/offline/MusicWatchNextResponseFactoryUtils");

    public static ajwo a(String str, String str2, int i, aohs aohsVar, aigj aigjVar) {
        aihf aihfVarCreateBuilder = aoht.a.createBuilder();
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar = (aoht) aihfVarCreateBuilder.instance;
            str2.getClass();
            aohtVar.b |= 1;
            aohtVar.c = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar2 = (aoht) aihfVarCreateBuilder.instance;
            str.getClass();
            aohtVar2.b |= 2;
            aohtVar2.d = str;
        }
        if (i != -1) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar3 = (aoht) aihfVarCreateBuilder.instance;
            aohtVar3.b |= 4;
            aohtVar3.e = i;
        }
        if (aohsVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar4 = (aoht) aihfVarCreateBuilder.instance;
            aohtVar4.h = aohsVar;
            aohtVar4.b |= 64;
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(aohu.a, (aoht) aihfVarCreateBuilder.build());
        if (!aigjVar.E()) {
            aihhVar.copyOnWrite();
            ajwo ajwoVar = (ajwo) aihhVar.instance;
            aigjVar.getClass();
            ajwoVar.b |= 1;
            ajwoVar.c = aigjVar;
        }
        return (ajwo) aihhVar.build();
    }

    static void b(aihh aihhVar, amah amahVar, Optional optional) {
        amaf amafVar = ((amae) aihhVar.instance).e;
        if (amafVar == null) {
            amafVar = amaf.a;
        }
        apji apjiVar = (amafVar.b == 125354411 ? (alzq) amafVar.c : alzq.a).d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amaj.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        aiie<amah> aiieVar = ((amai) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (amah amahVar2 : aiieVar) {
            aqjg aqjgVar = (amahVar2.b == 58174010 ? (aqjj) amahVar2.c : aqjj.a).i;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            if ((aqjgVar.b & 4194304) != 0) {
                arrayList.add(amahVar);
            } else {
                ajwo ajwoVar = (amahVar2.b == 58174010 ? (aqjj) amahVar2.c : aqjj.a).d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                ajmh ajmhVar = ((ajmf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).g;
                if (ajmhVar == null) {
                    ajmhVar = ajmh.a;
                }
                ajmg ajmgVar = ajmhVar.c;
                if (ajmgVar == null) {
                    ajmgVar = ajmg.a;
                }
                int iJ = atqp.J(ajmgVar.c);
                if (iJ == 0 || iJ != 7) {
                    arrayList.add(amahVar2);
                } else {
                    arrayList.add(amahVar2);
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(amahVar);
        }
        if (!z && optional.isPresent()) {
            arrayList.add(optional.get());
        }
        amaf amafVar2 = ((amae) aihhVar.instance).e;
        if (amafVar2 == null) {
            amafVar2 = amaf.a;
        }
        aihf builder = (amafVar2.b == 125354411 ? (alzq) amafVar2.c : alzq.a).toBuilder();
        aihh aihhVar2 = (aihh) apji.a.createBuilder();
        aihl aihlVar = amaj.a;
        aihf aihfVarCreateBuilder = amai.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amai amaiVar = (amai) aihfVarCreateBuilder.instance;
        amaiVar.a();
        aifs.addAll(arrayList, amaiVar.b);
        aihhVar2.e(aihlVar, (amai) aihfVarCreateBuilder.build());
        builder.copyOnWrite();
        alzq alzqVar = (alzq) builder.instance;
        apji apjiVar2 = (apji) aihhVar2.build();
        apjiVar2.getClass();
        alzqVar.d = apjiVar2;
        alzqVar.b |= 64;
        alzq alzqVar2 = (alzq) builder.build();
        amaf amafVar3 = ((amae) aihhVar.instance).e;
        if (amafVar3 == null) {
            amafVar3 = amaf.a;
        }
        aihf builder2 = amafVar3.toBuilder();
        builder2.copyOnWrite();
        amaf amafVar4 = (amaf) builder2.instance;
        alzqVar2.getClass();
        amafVar4.c = alzqVar2;
        amafVar4.b = 125354411;
        amaf amafVar5 = (amaf) builder2.build();
        aihhVar.copyOnWrite();
        amae amaeVar = (amae) aihhVar.instance;
        amafVar5.getClass();
        amaeVar.e = amafVar5;
        amaeVar.b |= 2;
    }
}
