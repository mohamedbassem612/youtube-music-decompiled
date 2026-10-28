package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.player.widget.base.PendingIntentReceiver;
import com.google.research.xeno.effect.Effect;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usm implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ usm(aele aeleVar, akzq akzqVar, adhf adhfVar, wek wekVar, int i) {
        this.$cid = i;
        this.b = aeleVar;
        this.a = akzqVar;
        this.c = adhfVar;
        this.d = wekVar;
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [absr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qvm] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            Optional optionalFindFirst = Collection.EL.stream((agke) obj).filter(new uso(this.a, i2)).findFirst();
            if (optionalFindFirst.isPresent()) {
                Object obj2 = this.d;
                Effect effect = ((uzj) optionalFindFirst.get()).a;
                if (effect == null) {
                    ((aqi) obj2).d(new NullPointerException("Applied effect has null XenoEffect"));
                    return;
                }
                ?? r2 = this.c;
                aufd aufdVar = (aufd) this.b;
                ((aqi) obj2).b(Optional.of(new usr(aufdVar, yno.gs(effect, aufdVar, ((uzj) optionalFindFirst.get()).b, r2))));
                return;
            }
            return;
        }
        if (i == 1) {
            boolean zG = ((idd) obj).g();
            Object obj3 = this.c;
            if (!zG) {
                ((ihm) ((PendingIntentReceiver) obj3).c.io()).a();
                return;
            }
            String str = (String) this.b;
            if (!str.equals("com.google.android.youtube.music.pendingintent.controller_widget_play") && !str.equals("com.google.android.youtube.music.pendingintent.controller_widget_replay")) {
                ((ihm) ((PendingIntentReceiver) obj3).c.io()).d();
                return;
            }
            PendingIntentReceiver pendingIntentReceiver = (PendingIntentReceiver) obj3;
            pendingIntentReceiver.a((Context) this.d, str, (String) this.a);
            pendingIntentReceiver.g.b(xhb.a(79610), null, null);
            return;
        }
        if (i == 2) {
            wjf wjfVar = (wjf) obj;
            Object obj4 = this.d;
            if (obj4 != null) {
                zgj zgjVar = (zgj) obj4;
                zgjVar.f(wjfVar.h().e, (String) this.a, "", null, ((abnl) this.c).w(), wjfVar.g(), wjfVar.f(), wjfVar.h().b(), wjfVar.Z());
            }
            this.b.a(wjfVar);
            return;
        }
        ArrayList arrayList = new ArrayList(((akzz) ((weh) obj)).getStepIdStack());
        if (arrayList.size() <= 1) {
            akzq akzqVar = (akzq) this.a;
            if ((akzqVar.c & 2) != 0) {
                Object obj5 = this.b;
                ajwo ajwoVar = akzqVar.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((aele) obj5).a.a(ajwoVar);
                return;
            }
            return;
        }
        Object obj6 = this.c;
        ?? r13 = this.d;
        arrayList.remove(arrayList.size() - 1);
        String str2 = ((adhf) obj6).g;
        akzx akzxVarE = akzz.e(str2);
        akzxVarE.an((String) aguu.K(arrayList));
        akzxVarE.am(arrayList);
        akzz akzzVarAo = akzxVarE.ao();
        aihf aihfVarCreateBuilder = akvd.a.createBuilder();
        aikh aikhVar = aikh.a;
        aikg aikgVar = new aikg();
        aikgVar.d(1, 2, 3);
        affc affcVarA = aikgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
        affcVarA.getClass();
        akvdVar.d = affcVarA;
        akvdVar.b |= 2;
        akvd akvdVar2 = (akvd) aihfVarCreateBuilder.build();
        wer werVarE = r13.e();
        werVarE.k(str2, akvdVar2, akzzVarAo.c());
        werVarE.b().D();
    }

    public /* synthetic */ usm(PendingIntentReceiver pendingIntentReceiver, Context context, String str, String str2, int i) {
        this.$cid = i;
        this.c = pendingIntentReceiver;
        this.d = context;
        this.b = str;
        this.a = str2;
    }

    public /* synthetic */ usm(String str, aufd aufdVar, qvm qvmVar, aqi aqiVar, int i) {
        this.$cid = i;
        this.a = str;
        this.b = aufdVar;
        this.c = qvmVar;
        this.d = aqiVar;
    }

    public /* synthetic */ usm(zgj zgjVar, String str, abnl abnlVar, absr absrVar, int i) {
        this.$cid = i;
        this.d = zgjVar;
        this.a = str;
        this.c = abnlVar;
        this.b = absrVar;
    }
}
