package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utr implements utv {
    private final augy a;
    private final boolean b;

    private utr(augy augyVar, boolean z) {
        this.a = augyVar;
        this.b = z;
    }

    public static utv d(Context context, augy augyVar, Optional optional, boolean z, boolean z2) {
        agjz agjzVar = new agjz(4);
        agjzVar.h(new utp(augyVar.e, true != optional.isPresent() ? optional : Optional.ofNullable(Long.valueOf(((utq) optional.get()).a)), z2));
        agjzVar.h(new utr(augyVar, z));
        sda sdaVar = new sda(agjzVar, augyVar, 9);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = sdaVar.a;
            Object obj3 = sdaVar.b;
            utq utqVar = (utq) obj;
            long j = utqVar.a;
            Optional optionalOfNullable = utqVar.c;
            Optional optionalOfNullable2 = true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((uto) optionalOfNullable.get()).a);
            augy augyVar2 = (augy) obj3;
            auhc auhcVar = augyVar2.c == 108 ? (auhc) augyVar2.d : auhc.a;
            Uri uri = Uri.parse((String) optionalOfNullable2.orElse((auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a).c));
            aigu aiguVar = augyVar2.i;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            Duration durationAw = ahng.aw(aiguVar);
            aigu aiguVar2 = augyVar2.j;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            Duration durationAw2 = ahng.aw(aiguVar2);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((uto) optionalOfNullable.get()).b);
            }
            aigu aiguVar3 = (augyVar2.c == 108 ? (auhc) augyVar2.d : auhc.a).e;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            Duration durationAw3 = ahng.aw((aigu) optionalOfNullable.orElse(aiguVar3));
            float f = utqVar.b;
            aihf aihfVarCreateBuilder = aufa.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aufa aufaVar = (aufa) aihfVarCreateBuilder.instance;
            aufaVar.b |= 1;
            aufaVar.e = j;
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
            aufaVar5.i = f;
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
            ((agjz) obj2).h(new uus((aufa) aihfVarCreateBuilder.build(), 0));
        }
        for (aufd aufdVar : augyVar.u) {
            if (aufdVar.c == 3) {
                aufh aufhVar = aufdVar.h;
                if (aufhVar == null) {
                    aufhVar = aufh.a;
                }
                int iAW = a.aW(aufhVar.c);
                if (iAW == 0) {
                    iAW = 1;
                }
                int i = iAW - 2;
                if (i == 2) {
                    agjzVar.h(new uuq(aufdVar, null, Long.valueOf(augyVar.e), context));
                } else if (i == 3) {
                    agjzVar.h(new uuq(aufdVar, Long.valueOf(augyVar.e), null, context));
                }
            }
        }
        return new utt(agjzVar.g());
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) throws utw {
        augy augyVar = this.a;
        if ((augyVar.b & 1) == 0) {
            throw new utw(new IllegalArgumentException("Tried to add CreationGraphicalSegment with no ID as a primary video segment"), this);
        }
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        if (this.b) {
            auhc auhcVar = augyVar.c == 108 ? (auhc) augyVar.d : auhc.a;
            String str = (auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a).c;
            auhqVar.copyOnWrite();
            auhs auhsVar2 = (auhs) auhqVar.instance;
            str.getClass();
            auhsVar2.b |= 1;
            auhsVar2.c = str;
        }
        auhqVar.d(augyVar);
        aigu aiguVarAu = ahng.au(usj.l((auhs) auhqVar.build()));
        auhqVar.copyOnWrite();
        auhs auhsVar3 = (auhs) auhqVar.instance;
        aiguVarAu.getClass();
        auhsVar3.h = aiguVarAu;
        auhsVar3.b |= 2;
        return (auhs) auhqVar.build();
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
