package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class abxt extends awrb implements awqg {
    public abxt(Object obj) {
        super(1, obj, abxu.class, "handlePlayerSettingControlEvent", "handlePlayerSettingControlEvent(Lcom/google/android/libraries/youtube/player/settings/sticky/PlayerSettingsEventHandler$PlayerSettingControlEventWithActiveComponent;)V", 0);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [acey, java.lang.Object] */
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        acfw acfwVarK;
        abxs abxsVar = (abxs) obj;
        abxsVar.getClass();
        abxu abxuVar = (abxu) this.receiver;
        twu.c(4, "PlayerSettingsEventHandler:handlePlayerSettingControlEvent(" + abxsVar + ')', null);
        abxc abxcVar = abxsVar.a;
        if (!(abxcVar instanceof abxb)) {
            throw new awmj();
        }
        acip acipVar = abxsVar.b;
        Object objIo = abxuVar.f.io();
        objIo.getClass();
        abyh abyhVar = (abyh) objIo;
        Set<abxp> setO = atqq.o(((abxb) abxcVar).a);
        String strAu = acipVar.au();
        String str = abyh.a;
        twu.d(str, 4, "invoke(" + strAu + ", " + setO + ')', null);
        if (setO.isEmpty()) {
            twu.d(str, 4, "No changed settings, returning.", null);
        } else {
            ijt ijtVar = abyhVar.g;
            if (ijtVar.n().isEmpty()) {
                twu.d(str, 4, "No registered setting CPNs, returning.", null);
            } else {
                for (String str2 : ijtVar.n()) {
                    abyd abydVarM = ijtVar.m(str2);
                    if (abydVarM != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : setO) {
                            abxp abxpVar = (abxp) obj2;
                            abxpVar.getClass();
                            Map map = abydVarM.c;
                            int i = awrn.a;
                            if (!(map.get(new awqv(abxpVar.getClass())) instanceof abyb)) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new abya((abxp) it.next()));
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(arrayList2, 10)), 16));
                        for (Object obj3 : arrayList2) {
                            linkedHashMap.put(aasc.d(((abyc) obj3).a()), obj3);
                        }
                        ijtVar.o(str2, new abyd(atqq.A(abydVarM.c, linkedHashMap)));
                    }
                }
                if (abyhVar.f.b == abyhVar.d.f) {
                    strAu.getClass();
                    abyd abydVarM2 = ijtVar.m(strAu);
                    if (abydVarM2 == null) {
                        twu.d(str, 4, "No settings for active CPN, returning.", null);
                    } else {
                        ArrayList arrayList3 = new ArrayList(atqq.N(setO, 10));
                        Iterator it2 = setO.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(aasc.d((abxp) it2.next()));
                        }
                        Set setO2 = aavv.o(abydVarM2, atqq.aw(arrayList3));
                        abyhVar.c.a().a(strAu, acipVar.f(), setO2);
                        if (!setO.isEmpty()) {
                            for (abxp abxpVar2 : setO) {
                                abxpVar2.getClass();
                                int iH = a.H(abxpVar2);
                                if (iH != 0) {
                                    if (iH == 1) {
                                        twu.d(str, 4, "Changed settings require a medialib flush, syncing timeline to flush.", null);
                                        ?? r2 = abyhVar.b.d;
                                        acjb acjbVarD = (r2 == 0 || (acfwVarK = r2.k()) == null) ? null : acfwVarK.d();
                                        if (acjbVarD == null) {
                                            break;
                                        }
                                        acjbVarD.e(false, acjc.PLAYER_SETTING_QUEUE_FLUSH);
                                        break;
                                    }
                                    if (iH != 2 && iH != 3) {
                                        throw new awmj();
                                    }
                                }
                            }
                        }
                        axsp axspVar = abyhVar.e;
                        axspVar.kk(new abxf(acipVar, setO2));
                        axspVar.kk(new abxd(strAu, abydVarM2));
                    }
                } else {
                    twu.d(str, 4, "Cannot apply settings as this is not the last service to load, returning.", null);
                }
            }
        }
        return awmy.a;
    }
}
