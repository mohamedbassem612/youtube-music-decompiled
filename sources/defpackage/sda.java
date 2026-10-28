package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import internal.org.jni_zero.CommonApis;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sda implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sda(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, rbi] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, vob] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, yco] */
    /* JADX WARN: Type inference failed for: r14v50, types: [acjy, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        boolean zC;
        boolean zC2;
        switch (this.$cid) {
            case 0:
                ((sdb) this.a).a.put(((aizs) this.b).d, (String) obj);
                return;
            case 1:
                ((scv) this.a).a.put(((aizs) this.b).d, (String) obj);
                return;
            case 2:
                Object obj2 = this.a;
                UUID uuid = (UUID) obj;
                sda sdaVar = new sda(obj2, uuid, 3);
                Optional optional = ((ufr) obj2).g;
                if (true == optional.isPresent()) {
                    ?? r0 = optional.get();
                    Object obj3 = sdaVar.a;
                    Object obj4 = sdaVar.b;
                    askh askhVar = ((ufr) obj3).h;
                    anck anckVarA = anck.a((askhVar.b == 2 ? (aske) askhVar.c : aske.a).c);
                    if (anckVarA == null) {
                        anckVarA = anck.MEDIA_ENGINE_SERVICE_TYPE_UNKNOWN;
                    }
                    r0.a((UUID) obj4, anckVarA);
                }
                Object obj5 = this.b;
                long leastSignificantBits = uuid.getLeastSignificantBits();
                aihf aihfVar = (aihf) obj5;
                aihfVar.copyOnWrite();
                askg askgVar = (askg) aihfVar.instance;
                askg askgVar2 = askg.a;
                askgVar.b |= 64;
                askgVar.i = leastSignificantBits;
                return;
            case 3:
                askh askhVar2 = ((ufr) this.a).h;
                rbi rbiVar = (rbi) obj;
                anck anckVarA2 = anck.a((askhVar2.b == 2 ? (aske) askhVar2.c : aske.a).c);
                if (anckVarA2 == null) {
                    anckVarA2 = anck.MEDIA_ENGINE_SERVICE_TYPE_UNKNOWN;
                }
                rbiVar.a((UUID) this.b, anckVarA2);
                return;
            case 4:
                unr unrVar = (unr) obj;
                Object obj6 = unrVar.e;
                Object obj7 = this.b;
                synchronized (obj6) {
                    if (((Optional) obj7).isEmpty()) {
                        unrVar.b = false;
                    } else {
                        unrVar.b = ((auhs) ((Optional) obj7).get()).d.size() > 1 || ((auhs) ((Optional) obj7).get()).g.size() > 0;
                    }
                    zC = unrVar.c();
                    break;
                }
                ((uoa) this.a).e(zC);
                return;
            case 5:
                unr unrVar2 = (unr) obj;
                Object obj8 = unrVar2.e;
                uoa uoaVar = (uoa) this.b;
                uns unsVar = uoaVar.a;
                Object obj9 = this.a;
                Context context = unsVar.getContext();
                synchronized (obj8) {
                    unrVar2.a = !nuo.m(context, (Uri) obj9) && ("image/png".equals(nuo.k(context, (Uri) obj9)) || "image/jpeg".equals(nuo.k(context, (Uri) obj9)));
                    unrVar2.b = true;
                    unrVar2.c = false;
                    unrVar2.d = true;
                    zC2 = unrVar2.c();
                    break;
                }
                uoaVar.e(zC2);
                return;
            case 6:
                ((uoa) this.b).e(((unr) obj).b((ugb) this.a));
                return;
            case 7:
                upn upnVar = (upn) obj;
                Optional optional2 = (Optional) this.a;
                boolean zIsPresent = optional2.isPresent();
                Object objTrim = this.b;
                if (!zIsPresent) {
                    objTrim = ((String) objTrim).trim();
                }
                upnVar.a((String) objTrim, optional2);
                return;
            case 8:
                usd usdVar = (usd) this.a;
                usdVar.j((augy) obj);
                augi augiVar = (augi) this.b;
                long j = augiVar.c;
                String str = augiVar.e;
                float f = augiVar.d;
                int iD = CommonApis.d(augiVar.f);
                int i = iD == 0 ? 1 : iD;
                int iBc = a.bc(augiVar.g);
                int i2 = iBc == 0 ? 1 : iBc;
                String str2 = augiVar.h;
                int iAV = a.aV(augiVar.i);
                usdVar.i(new uts(j, str, f, i, i2, str2, iAV == 0 ? 1 : iAV, augiVar.j));
                return;
            case 9:
                utq utqVar = (utq) obj;
                long j2 = utqVar.a;
                Optional optionalOfNullable = utqVar.c;
                Optional optionalOfNullable2 = true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((uto) optionalOfNullable.get()).a);
                augy augyVar = (augy) this.b;
                auhc auhcVar = augyVar.c == 108 ? (auhc) augyVar.d : auhc.a;
                Uri uri = Uri.parse((String) optionalOfNullable2.orElse((auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a).c));
                aigu aiguVar = augyVar.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                Duration durationAw = ahng.aw(aiguVar);
                aigu aiguVar2 = augyVar.j;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                Duration durationAw2 = ahng.aw(aiguVar2);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((uto) optionalOfNullable.get()).b);
                }
                aigu aiguVar3 = (augyVar.c == 108 ? (auhc) augyVar.d : auhc.a).e;
                if (aiguVar3 == null) {
                    aiguVar3 = aigu.a;
                }
                Object obj10 = this.a;
                Duration durationAw3 = ahng.aw((aigu) optionalOfNullable.orElse(aiguVar3));
                float f2 = utqVar.b;
                aihf aihfVarCreateBuilder = aufa.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar = (aufa) aihfVarCreateBuilder.instance;
                aufaVar.b |= 1;
                aufaVar.e = j2;
                aigu aiguVarAu = ahng.au(durationAw);
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar2 = (aufa) aihfVarCreateBuilder.instance;
                aiguVarAu.getClass();
                aufaVar2.f = aiguVarAu;
                aufaVar2.b |= 2;
                aigu aiguVarAu2 = ahng.au(durationAw2);
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar3 = (aufa) aihfVarCreateBuilder.instance;
                aiguVarAu2.getClass();
                aufaVar3.g = aiguVarAu2;
                aufaVar3.b |= 4;
                aigu aiguVarAu3 = ahng.au(durationAw3);
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar4 = (aufa) aihfVarCreateBuilder.instance;
                aiguVarAu3.getClass();
                aufaVar4.h = aiguVarAu3;
                aufaVar4.b |= 8;
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar5 = (aufa) aihfVarCreateBuilder.instance;
                aufaVar5.b |= 16;
                aufaVar5.i = f2;
                aihf aihfVarCreateBuilder2 = aufb.a.createBuilder();
                String string = uri.toString();
                aihfVarCreateBuilder2.copyOnWrite();
                aufb aufbVar = (aufb) aihfVarCreateBuilder2.instance;
                string.getClass();
                aufbVar.b |= 1;
                aufbVar.c = string;
                aufb aufbVar2 = (aufb) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar6 = (aufa) aihfVarCreateBuilder.instance;
                aufbVar2.getClass();
                aufaVar6.d = aufbVar2;
                aufaVar6.c = 100;
                aihfVarCreateBuilder.copyOnWrite();
                aufa aufaVar7 = (aufa) aihfVarCreateBuilder.instance;
                aufaVar7.b |= 32;
                aufaVar7.j = false;
                ((agjz) obj10).h(new uus((aufa) aihfVarCreateBuilder.build(), 0));
                return;
            case 10:
                auhp auhpVar = (auhp) obj;
                aihf builder = auhpVar.toBuilder();
                int i3 = auhpVar.b & 1;
                Object obj11 = this.b;
                if (i3 == 0) {
                    auhp auhpVar2 = ((augy) obj11).k;
                    if (auhpVar2 == null) {
                        auhpVar2 = auhp.a;
                    }
                    float f3 = auhpVar2.c;
                    builder.copyOnWrite();
                    auhp auhpVar3 = (auhp) builder.instance;
                    auhpVar3.b |= 1;
                    auhpVar3.c = f3;
                }
                if ((auhpVar.b & 2) == 0) {
                    auhp auhpVar4 = ((augy) obj11).k;
                    if (auhpVar4 == null) {
                        auhpVar4 = auhp.a;
                    }
                    float f4 = auhpVar4.d;
                    builder.copyOnWrite();
                    auhp auhpVar5 = (auhp) builder.instance;
                    auhpVar5.b |= 2;
                    auhpVar5.d = f4;
                }
                Object obj12 = this.a;
                ((aihf) obj12).copyOnWrite();
                augy augyVar2 = (augy) ((jrr) obj12).instance;
                auhp auhpVar6 = (auhp) builder.build();
                auhpVar6.getClass();
                augyVar2.k = auhpVar6;
                augyVar2.b |= 64;
                return;
            case 11:
                ((uxk) this.a).c = Collection.EL.stream(((augj) obj).c).filter(new uso(this.b, 9)).findFirst();
                return;
            case 12:
                ((ahgb) obj).ak((alrm) this.b, (ajwo) this.a, new HashMap());
                return;
            case 13:
                ((ahgb) obj).aj((alrk) this.b, (ajwo) this.a, new HashMap());
                return;
            case 14:
                ((ahgb) obj).ah((alri) this.b, (ajwo) this.a, new HashMap());
                return;
            case 15:
                vpo.a((ViewGroup) obj, this.a.T());
                ((vot) this.b).a();
                return;
            case 16:
                ((adtp) obj).q(this.b, (acjw) this.a);
                return;
            case 17:
                ((xir) obj).f(tau.LIVE_CHAT_FIRST_RESPONSE_RECEIVED);
                ((wwn) this.a).n.g().d(309, String.valueOf(this.b.hashCode()));
                return;
            case 18:
                amby ambyVar = (amby) obj;
                int i4 = ambyVar.b;
                if ((i4 & 2) == 0 || (i4 & 1) == 0) {
                    return;
                }
                aihf aihfVarCreateBuilder3 = amcb.a.createBuilder();
                String str3 = ambyVar.d;
                aihfVarCreateBuilder3.copyOnWrite();
                amcb amcbVar = (amcb) aihfVarCreateBuilder3.instance;
                str3.getClass();
                amcbVar.b |= 1;
                amcbVar.c = str3;
                argn argnVar = ambyVar.c;
                if (argnVar == null) {
                    argnVar = argn.a;
                }
                Object obj13 = this.b;
                Object obj14 = this.a;
                aihfVarCreateBuilder3.copyOnWrite();
                amcb amcbVar2 = (amcb) aihfVarCreateBuilder3.instance;
                argnVar.getClass();
                amcbVar2.d = argnVar;
                amcbVar2.b |= 2;
                amcb amcbVar3 = (amcb) aihfVarCreateBuilder3.build();
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                amcbVar3.getClass();
                alouVar.d = amcbVar3;
                alouVar.c = 78;
                ((wjr) ((xgo) obj14).g.io()).A(alosVar, (xie) obj13);
                return;
            case 19:
                ((xiv) this.b).c.a((amiu) obj, ((xiu) this.a).c);
                return;
            default:
                Integer num = (Integer) obj;
                if (this.a.aT()) {
                    ((agrc) ((agrc) ych.a.c().i(agso.a, "MDX.EventLogger")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionEventLogger", "logMdxSessionDisconnected", 341, "MdxSessionEventLogger.java")).w("status error code set: %d", num);
                } else {
                    agrx agrxVar = agso.a;
                }
                Object obj15 = this.b;
                int iIntValue = num.intValue();
                aihf aihfVar2 = (aihf) obj15;
                aihfVar2.copyOnWrite();
                amxn amxnVar = (amxn) aihfVar2.instance;
                amxn amxnVar2 = amxn.a;
                amxnVar.b |= SemanticState.LiveRegion;
                amxnVar.j = iIntValue;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ sda(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
