package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ing extends imf {
    public ing() {
        super(hcj.class, aosu.class);
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        hcj hcjVar = (hcj) obj;
        Optional optionalAl = hmy.al("display_context", imk.class, agkjVar);
        aihh aihhVar = (aihh) aosu.a.createBuilder();
        anuk anukVar = hcjVar.a;
        alay alayVarD = ackj.d(anukVar.getTitle());
        aihhVar.copyOnWrite();
        aosu aosuVar = (aosu) aihhVar.instance;
        alayVarD.getClass();
        aosuVar.d = alayVarD;
        aosuVar.b |= 2;
        if (optionalAl.isPresent()) {
            int i = ((imk) optionalAl.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                String strP = hef.p(anukVar);
                aihhVar.copyOnWrite();
                aosu aosuVar2 = (aosu) aihhVar.instance;
                strP.getClass();
                aosuVar2.b |= 1;
                aosuVar2.c = strP;
                aihhVar.copyOnWrite();
                aosu aosuVar3 = (aosu) aihhVar.instance;
                aosuVar3.e = 0;
                aosuVar3.b |= 4;
                aihh aihhVar2 = (aihh) alja.a.createBuilder();
                aliz alizVar = aliz.PRIVACY_PRIVATE;
                aihhVar2.copyOnWrite();
                alja aljaVar = (alja) aihhVar2.instance;
                aljaVar.c = alizVar.yN;
                aljaVar.b |= 1;
                aihhVar.copyOnWrite();
                aosu aosuVar4 = (aosu) aihhVar.instance;
                alja aljaVar2 = (alja) aihhVar2.build();
                aljaVar2.getClass();
                aosuVar4.g = aljaVar2;
                aosuVar4.b |= 32;
                ArrayList arrayList = new ArrayList();
                for (String str : hcjVar.b) {
                    aihf aihfVarCreateBuilder = apyx.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = apyv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    apyv apyvVar = (apyv) aihfVarCreateBuilder2.instance;
                    str.getClass();
                    apyvVar.b |= 1;
                    apyvVar.c = str;
                    aihfVarCreateBuilder.copyOnWrite();
                    apyx apyxVar = (apyx) aihfVarCreateBuilder.instance;
                    apyv apyvVar2 = (apyv) aihfVarCreateBuilder2.build();
                    apyvVar2.getClass();
                    apyxVar.c = apyvVar2;
                    apyxVar.b = 1;
                    arrayList.add((apyx) aihfVarCreateBuilder.build());
                }
                aihf aihfVarCreateBuilder3 = apzb.a.createBuilder();
                String strP2 = hef.p(anukVar);
                aihfVarCreateBuilder3.copyOnWrite();
                apzb apzbVar = (apzb) aihfVarCreateBuilder3.instance;
                strP2.getClass();
                apzbVar.c |= 1;
                apzbVar.d = strP2;
                aihfVarCreateBuilder3.copyOnWrite();
                apzb apzbVar2 = (apzb) aihfVarCreateBuilder3.instance;
                apzbVar2.a();
                aifs.addAll(arrayList, apzbVar2.e);
                apzb apzbVar3 = (apzb) aihfVarCreateBuilder3.build();
                aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
                aihhVar3.e(apzb.b, apzbVar3);
                ajwo ajwoVar = (ajwo) aihhVar3.build();
                aihhVar.copyOnWrite();
                aosu aosuVar5 = (aosu) aihhVar.instance;
                ajwoVar.getClass();
                aosuVar5.h = ajwoVar;
                aosuVar5.b |= SemanticState.Focused;
            }
        }
        return (aosu) aihhVar.build();
    }
}
