package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imw extends imf {
    private final awmd a;
    private final Context b;
    private agkj c;
    private imi d;

    public imw(Context context, awmd awmdVar) {
        super(hcg.class, almj.class);
        this.b = context;
        this.a = awmdVar;
    }

    @Override // defpackage.iml
    public final /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        int i;
        imi imiVar;
        hcg hcgVar = (hcg) obj;
        this.c = agkjVar;
        this.d = (imi) agkjVar.get("container_context");
        aihf aihfVarCreateBuilder = almg.a.createBuilder();
        agke agkeVar = hcgVar.c;
        agke agkeVar2 = hcgVar.e;
        aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
        imi imiVar2 = this.d;
        int i2 = 0;
        if (imiVar2 == null || imiVar2.d != 2) {
            aihf aihfVarCreateBuilder3 = anwt.a.createBuilder();
            imi imiVar3 = this.d;
            if (imiVar3 == null || imiVar3.d != 3) {
                i = 262144;
            } else {
                Context context = this.b;
                String str = imiVar3.a;
                aliz alizVar = aliz.SHUFFLE;
                ajwo ajwoVarO = hef.o("", str, -1, true);
                aihf aihfVarCreateBuilder4 = anpo.a.createBuilder();
                aihh aihhVar = (aihh) alja.a.createBuilder();
                aihhVar.copyOnWrite();
                alja aljaVar = (alja) aihhVar.instance;
                aljaVar.c = alizVar.yN;
                aljaVar.b |= 1;
                aihfVarCreateBuilder4.copyOnWrite();
                anpo anpoVar = (anpo) aihfVarCreateBuilder4.instance;
                alja aljaVar2 = (alja) aihhVar.build();
                aljaVar2.getClass();
                anpoVar.d = aljaVar2;
                anpoVar.c = 3;
                anpo anpoVar2 = (anpo) aihfVarCreateBuilder4.build();
                aihf aihfVarCreateBuilder5 = anpz.a.createBuilder();
                aihf aihfVarCreateBuilder6 = anld.a.createBuilder();
                aihf aihfVarCreateBuilder7 = anlc.a.createBuilder();
                i = 262144;
                aihfVarCreateBuilder7.bM(context.getColor(R.color.ytm_color_grey_10));
                aihfVarCreateBuilder6.copyOnWrite();
                anld anldVar = (anld) aihfVarCreateBuilder6.instance;
                anlc anlcVar = (anlc) aihfVarCreateBuilder7.build();
                anlcVar.getClass();
                anldVar.c = anlcVar;
                anldVar.b = 1;
                aihfVarCreateBuilder5.copyOnWrite();
                anpz anpzVar = (anpz) aihfVarCreateBuilder5.instance;
                anld anldVar2 = (anld) aihfVarCreateBuilder6.build();
                anldVar2.getClass();
                anpzVar.c = anldVar2;
                anpzVar.b |= 1;
                apji apjiVar = apji.a;
                aihh aihhVar2 = (aihh) apjiVar.createBuilder();
                aihhVar2.e(anpp.a, anpoVar2);
                aihfVarCreateBuilder5.copyOnWrite();
                anpz anpzVar2 = (anpz) aihfVarCreateBuilder5.instance;
                apji apjiVar2 = (apji) aihhVar2.build();
                apjiVar2.getClass();
                anpzVar2.d = apjiVar2;
                anpzVar2.b |= 2;
                aihfVarCreateBuilder5.copyOnWrite();
                anpz anpzVar3 = (anpz) aihfVarCreateBuilder5.instance;
                anpzVar3.f = 1;
                anpzVar3.b |= 8;
                aihfVarCreateBuilder5.copyOnWrite();
                anpz anpzVar4 = (anpz) aihfVarCreateBuilder5.instance;
                anpzVar4.e = 1;
                anpzVar4.b |= 4;
                anpz anpzVar5 = (anpz) aihfVarCreateBuilder5.build();
                aihh aihhVar3 = (aihh) anzi.a.createBuilder();
                alay alayVarC = ackj.c(context.getString(R.string.shuffle_all));
                aihhVar3.copyOnWrite();
                anzi anziVar = (anzi) aihhVar3.instance;
                alayVarC.getClass();
                anziVar.g = alayVarC;
                anziVar.b |= 16;
                aihhVar3.copyOnWrite();
                anzi anziVar2 = (anzi) aihhVar3.instance;
                ajwoVarO.getClass();
                anziVar2.i = ajwoVarO;
                anziVar2.b |= 64;
                aihh aihhVar4 = (aihh) apjiVar.createBuilder();
                aihhVar4.e(anqa.a, anpzVar5);
                aihhVar3.copyOnWrite();
                anzi anziVar3 = (anzi) aihhVar3.instance;
                apji apjiVar3 = (apji) aihhVar4.build();
                apjiVar3.getClass();
                anziVar3.d();
                anziVar3.u.add(apjiVar3);
                anzi anziVar4 = (anzi) aihhVar3.build();
                aihf aihfVarCreateBuilder8 = anwv.a.createBuilder();
                aihfVarCreateBuilder8.copyOnWrite();
                anwv anwvVar = (anwv) aihfVarCreateBuilder8.instance;
                anziVar4.getClass();
                anwvVar.d = anziVar4;
                anwvVar.b |= 262144;
                aihfVarCreateBuilder3.bP((anwv) aihfVarCreateBuilder8.build());
            }
            while (i2 < agkeVar.size()) {
                anzi anziVar5 = (anzi) ((hfn) this.a.io()).ap(anyx.class, anzi.class, (anyx) agkeVar.get(i2), this.c);
                aihf aihfVarCreateBuilder9 = anwv.a.createBuilder();
                aihfVarCreateBuilder9.copyOnWrite();
                anwv anwvVar2 = (anwv) aihfVarCreateBuilder9.instance;
                anziVar5.getClass();
                anwvVar2.d = anziVar5;
                anwvVar2.b |= i;
                aihfVarCreateBuilder3.bP((anwv) aihfVarCreateBuilder9.build());
                i2++;
            }
            anwt anwtVar = (anwt) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            apox apoxVar = (apox) aihfVarCreateBuilder2.instance;
            anwtVar.getClass();
            apoxVar.aq = anwtVar;
            apoxVar.c |= 536870912;
        } else {
            aihf aihfVarCreateBuilder10 = anuz.a.createBuilder();
            imi imiVar4 = this.d;
            imiVar4.getClass();
            String str2 = imiVar4.a;
            aihfVarCreateBuilder10.copyOnWrite();
            anuz anuzVar = (anuz) aihfVarCreateBuilder10.instance;
            str2.getClass();
            anuzVar.c |= 1;
            anuzVar.d = str2;
            if (agkeVar.isEmpty()) {
                aihh aihhVar5 = (aihh) apji.a.createBuilder();
                aihl aihlVar = angu.a;
                aihf aihfVarCreateBuilder11 = angn.a.createBuilder();
                alay alayVarD = ackj.d(this.b.getString(R.string.sideloaded_playlists_no_tracks));
                aihfVarCreateBuilder11.copyOnWrite();
                angn angnVar = (angn) aihfVarCreateBuilder11.instance;
                alayVarD.getClass();
                angnVar.e = alayVarD;
                angnVar.b |= 1;
                aihhVar5.e(aihlVar, (angn) aihfVarCreateBuilder11.build());
                aihfVarCreateBuilder10.copyOnWrite();
                anuz anuzVar2 = (anuz) aihfVarCreateBuilder10.instance;
                apji apjiVar4 = (apji) aihhVar5.build();
                apjiVar4.getClass();
                anuzVar2.g = apjiVar4;
                anuzVar2.c |= 4;
            }
            while (i2 < agkeVar.size()) {
                agkj agkjVarH = this.c;
                if (agkeVar2 != null && !agkeVar2.isEmpty() && (imiVar = this.d) != null) {
                    agkj agkjVar2 = this.c;
                    String str3 = (String) agkeVar2.get(i2);
                    HashMap map = new HashMap(agkjVar2);
                    acb acbVar = new acb((byte[]) null, (byte[]) null);
                    acbVar.c(imiVar.a);
                    acbVar.d(imiVar.d);
                    acbVar.d = str3;
                    map.put("container_context", acbVar.b());
                    agkjVarH = agkj.h(map);
                }
                anzi anziVar6 = (anzi) ((hfn) this.a.io()).ap(anyx.class, anzi.class, (anyx) agkeVar.get(i2), agkjVarH);
                aihh aihhVar6 = (aihh) apji.a.createBuilder();
                aihhVar6.e(anzj.a, anziVar6);
                aihfVarCreateBuilder10.copyOnWrite();
                anuz anuzVar3 = (anuz) aihfVarCreateBuilder10.instance;
                apji apjiVar5 = (apji) aihhVar6.build();
                apjiVar5.getClass();
                aiie aiieVar = anuzVar3.f;
                if (!aiieVar.c()) {
                    anuzVar3.f = aihn.mutableCopy(aiieVar);
                }
                anuzVar3.f.add(apjiVar5);
                i2++;
            }
            anuz anuzVar4 = (anuz) aihfVarCreateBuilder10.build();
            aihfVarCreateBuilder2.copyOnWrite();
            apox apoxVar2 = (apox) aihfVarCreateBuilder2.instance;
            anuzVar4.getClass();
            apoxVar2.br = anuzVar4;
            apoxVar2.e |= 262144;
        }
        aihf aihfVarCreateBuilder12 = apoq.a.createBuilder();
        aihfVarCreateBuilder12.ck(aihfVarCreateBuilder2);
        apoq apoqVar = (apoq) aihfVarCreateBuilder12.build();
        aihf aihfVarCreateBuilder13 = aqjj.a.createBuilder();
        aihfVarCreateBuilder13.copyOnWrite();
        aqjj aqjjVar = (aqjj) aihfVarCreateBuilder13.instance;
        aqjjVar.b |= 16;
        aqjjVar.f = true;
        aihf aihfVarCreateBuilder14 = aqjg.a.createBuilder();
        aihfVarCreateBuilder14.copyOnWrite();
        aqjg aqjgVar = (aqjg) aihfVarCreateBuilder14.instance;
        apoqVar.getClass();
        aqjgVar.c = apoqVar;
        aqjgVar.b |= 1;
        aihfVarCreateBuilder13.copyOnWrite();
        aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder13.instance;
        aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder14.build();
        aqjgVar2.getClass();
        aqjjVar2.i = aqjgVar2;
        aqjjVar2.b |= 16384;
        aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder13.build();
        aihfVarCreateBuilder.copyOnWrite();
        almg almgVar = (almg) aihfVarCreateBuilder.instance;
        aqjjVar3.getClass();
        almgVar.c = aqjjVar3;
        almgVar.b = 58174010;
        almg almgVar2 = (almg) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder15 = almj.a.createBuilder();
        aihfVarCreateBuilder15.copyOnWrite();
        almj almjVar = (almj) aihfVarCreateBuilder15.instance;
        almgVar2.getClass();
        almjVar.a();
        almjVar.b.add(almgVar2);
        return (almj) aihfVarCreateBuilder15.build();
    }
}
