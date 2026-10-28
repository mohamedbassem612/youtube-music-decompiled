package defpackage;

import android.net.Uri;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utb implements usx {
    private final Uri a;
    private final aigu b;

    public utb(Uri uri, aigu aiguVar) {
        this.a = uri;
        this.b = aiguVar;
    }

    @Override // defpackage.usx
    public final auhs a(auhs auhsVar) {
        Duration durationAw = ahng.aw(this.b);
        agrf agrfVar = usj.a;
        if ((auhsVar.b & 1) == 0) {
            ((agrc) ((agrc) usj.a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositions", "updateSingleSourceVideoUri", 1703, "CreationMediaCompositions.java")).t("Composition does not have a source URI");
            return auhsVar;
        }
        aiie aiieVar = ((aufx) yno.gx(auhsVar, aufx.b)).c;
        if (aiieVar.size() > 1) {
            ((agrc) ((agrc) usj.a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositions", "updateSingleSourceVideoUri", 1711, "CreationMediaCompositions.java")).t("Composition has multiple primary content segments, so it should not have a source URI");
            return auhsVar;
        }
        Uri uri = this.a;
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        String string = uri.toString();
        auhqVar.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar.instance;
        string.getClass();
        auhsVar2.b |= 1;
        auhsVar2.c = string;
        aigu aiguVarAu = ahng.au(durationAw);
        auhqVar.copyOnWrite();
        auhs auhsVar3 = (auhs) auhqVar.instance;
        aiguVarAu.getClass();
        auhsVar3.h = aiguVarAu;
        auhsVar3.b |= 2;
        auhs auhsVar4 = (auhs) auhqVar.build();
        if (aiieVar.isEmpty()) {
            return auhsVar4;
        }
        aufw aufwVar = (aufw) aguu.M(aiieVar);
        Optional optionalM = (aufwVar.b & 2) != 0 ? usj.m(auhsVar4, aufwVar.d) : Optional.empty();
        hqb hqbVar = new hqb(uri, durationAw, 18);
        if (true == optionalM.isPresent()) {
            Object obj = optionalM.get();
            Object obj2 = hqbVar.a;
            Object obj3 = hqbVar.b;
            aufa aufaVar = (aufa) obj;
            aihf builder = aufaVar.toBuilder();
            aihf builder2 = (aufaVar.c == 100 ? (aufb) aufaVar.d : aufb.a).toBuilder();
            String string2 = ((Uri) obj2).toString();
            builder2.copyOnWrite();
            aufb aufbVar = (aufb) builder2.instance;
            string2.getClass();
            aufbVar.b |= 1;
            aufbVar.c = string2;
            builder.copyOnWrite();
            aufa aufaVar2 = (aufa) builder.instance;
            aufb aufbVar2 = (aufb) builder2.build();
            aufbVar2.getClass();
            aufaVar2.d = aufbVar2;
            aufaVar2.c = 100;
            aigu aiguVarAu2 = ahng.au((Duration) obj3);
            builder.copyOnWrite();
            aufa aufaVar3 = (aufa) builder.instance;
            aiguVarAu2.getClass();
            aufaVar3.g = aiguVarAu2;
            aufaVar3.b |= 4;
            optionalM = Optional.ofNullable((aufa) builder.build());
        }
        auhs auhsVarH = optionalM.isPresent() ? usj.h(auhsVar4, (aufa) optionalM.get()) : auhsVar4;
        Optional optionalN = (aufwVar.b & 1) != 0 ? usj.n(auhsVar4, aufwVar.c) : Optional.empty();
        if (true == optionalN.isPresent() && ((augy) optionalN.get()).c != 108) {
            optionalN = Optional.empty();
        }
        hqb hqbVar2 = new hqb(uri, durationAw, 19);
        if (true == optionalN.isPresent()) {
            Object obj4 = optionalN.get();
            Object obj5 = hqbVar2.a;
            Object obj6 = hqbVar2.b;
            augy augyVar = (augy) obj4;
            jrr jrrVar = (jrr) augyVar.toBuilder();
            aihf builder3 = (augyVar.c == 108 ? (auhc) augyVar.d : auhc.a).toBuilder();
            auhc auhcVar = augyVar.c == 108 ? (auhc) augyVar.d : auhc.a;
            aihf builder4 = (auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a).toBuilder();
            String string3 = ((Uri) obj5).toString();
            builder4.copyOnWrite();
            auhl auhlVar = (auhl) builder4.instance;
            string3.getClass();
            auhlVar.b |= 1;
            auhlVar.c = string3;
            builder3.copyOnWrite();
            auhc auhcVar2 = (auhc) builder3.instance;
            auhl auhlVar2 = (auhl) builder4.build();
            auhlVar2.getClass();
            auhcVar2.d = auhlVar2;
            auhcVar2.c = 1;
            jrrVar.copyOnWrite();
            augy augyVar2 = (augy) jrrVar.instance;
            auhc auhcVar3 = (auhc) builder3.build();
            auhcVar3.getClass();
            augyVar2.d = auhcVar3;
            augyVar2.c = 108;
            aigu aiguVarAu3 = ahng.au((Duration) obj6);
            jrrVar.copyOnWrite();
            augy augyVar3 = (augy) jrrVar.instance;
            aiguVarAu3.getClass();
            augyVar3.j = aiguVarAu3;
            augyVar3.b |= 32;
            optionalN = Optional.ofNullable((augy) jrrVar.build());
        }
        return optionalN.isPresent() ? usj.i(auhsVarH, (augy) optionalN.get()) : auhsVarH;
    }
}
